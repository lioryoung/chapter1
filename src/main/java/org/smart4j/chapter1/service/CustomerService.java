package org.smart4j.chapter1.service;

import org.smart4j.chapter1.model.Customer;

import java.util.List;
import java.util.Map;

public class CustomerService {
    /*
     *获取用户数据
     */
    public List<Customer> getCustomerList(){
        //TODO
        return null;
    }
    /*
    * 获取客户
    * */
    public Customer getCustomer(long id){
        //TODO
        return null;
    }
    /*
    * 创建顾客
    * */
    public boolean createCustomer(Map<String,Object> fieldMap){
        //todo
        return true;
    }
    /*
    * 更新顾客
    * */
    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        //todo
        return false;
    }
    /*
    * 删除顾客
    * */
    public boolean deleteCustomer(long id){
        //todo
        return false;

    }
}
