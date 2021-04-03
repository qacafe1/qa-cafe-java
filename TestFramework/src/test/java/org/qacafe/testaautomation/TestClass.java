package org.qacafe.testaautomation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

  @Test
  public void testMethod(){
    int x =1 ;
    int y = 2;
    Assert.assertEquals( x, 2, "Compare two numbers" );
  }

  @Test
  public void testMethod2(){
    int x =1 ;
    int y = 2;
    Assert.assertEquals( y, 2, "Compare two numbers" );
  }


}
