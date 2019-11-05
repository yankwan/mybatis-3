package org.apache.ibatis.example.demo;

import org.apache.ibatis.example.demo.entity.Blog;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

public class Demo {
  public static void main(String[] args) {
    SqlSession sqlSession = null;
    try {
      InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

      // select
      sqlSession = sqlSessionFactory.openSession();
      Blog blog = sqlSession.selectOne("example.demo.mapper.BlogMapper.selectBlog", 1);
      System.out.println(blog);

      // insert
//      Blog b = new Blog();
//      b.setId(1);
//      b.setTitle("Insert Value" + new Random().nextInt(1000));
//      int row = sqlSession.insert("example.demo.mapper.BlogMapper.insertBlog", b);
//      System.out.println(row);
//      sqlSession.commit();

      // update
//      b.setId(2);
//      row = sqlSession.update("example.demo.mapper.BlogMapper.updateBlog", b);
//      System.out.println(row);
//      sqlSession.commit();

      // delete
//      row = sqlSession.delete("example.demo.mapper.BlogMapper.deleteBlog", 1);
//      System.out.println(row);
//      sqlSession.commit();

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (sqlSession != null) {
        sqlSession.close();
      }
    }
  }
}
