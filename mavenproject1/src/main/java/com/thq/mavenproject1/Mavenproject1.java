/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.thq.mavenproject1;

import com.thq.pojo.Category;
import com.thq.reponsitory.ProductReponsitory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Map<String, String> params = new HashMap<>();
        params.put("kw", "Galaxy");
        
        
        ProductReponsitory r = new ProductReponsitory();
        r.getProducts(params).forEach(p -> System.out.printf("%d - %s - %.1f\n", p.getId(), p.getName(), p.getPrice()));
//        try(Session s = HibernateUtils.getFactory().openSession()){
//            Query q = s.createQuery("FROM Category");
//            List<Category> cates = q.getResultList();
//            cates.forEach(c -> System.out.println(c.getName()));
//        }
    }
}
