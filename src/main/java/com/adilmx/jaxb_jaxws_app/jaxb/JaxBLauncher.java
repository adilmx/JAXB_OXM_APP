package com.adilmx.jaxb_jaxws_app.jaxb;

import com.adilmx.jaxb_jaxws_app.mappers.XMLMapper;
import com.adilmx.jaxb_jaxws_app.model.Account;
import com.adilmx.jaxb_jaxws_app.model.Bank;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.Date;

//FROM OBJECT TO XML
public class JaxBLauncher {


    public static void main(String[] args) throws JAXBException, InstantiationException, IllegalAccessException, IOException {
        XMLMapper<Account> xmlMapperAccount = new XMLMapper<Account>();
        Account account = new Account(1L,1000,new Date());
        Account account2 = new Account(2L,2000,new Date());
        xmlMapperAccount.fromObjectToXML(account,"account.xml");

        XMLMapper<Bank> xmlMapperBank = new XMLMapper<Bank>();
        Bank bank = new Bank();
        bank.getAccounts().add(account);
        bank.getAccounts().add(account2);
        xmlMapperBank.fromObjectToXML(bank,"bank.xml");

        Account accountGeneric = new Account();
        XMLMapper<Account> xmlMapperAccountReverse = new XMLMapper<Account>((Class<Account>) accountGeneric.getClass());
        Account accountGenerated = xmlMapperAccountReverse.fromXMLToObject("account.xml");
        System.out.println(accountGenerated.toString());

        xmlMapperAccountReverse.fromObjectToXMLSchema("account.xsd");
    }


}
