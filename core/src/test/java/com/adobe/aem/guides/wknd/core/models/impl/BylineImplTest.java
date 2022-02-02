package com.adobe.aem.guides.wknd.core.models.impl;

import static org.junit.jupiter.api.Assertions.*;

import com.adobe.aem.guides.wknd.core.models.Byline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;

@ExtendWith(AemContextExtension.class)
public class BylineImplTest {

  private final AemContext ctx = new AemContext();

    @BeforeEach
    void setUp() throws Exception {
      ctx.addModelsForClasses(BylineImpl.class);
      ctx.load().json("/com/adobe/aem/guides/wknd/core/models/impl/BylineImplTest.json", "/content");
    }

    @Test 
    public void testGetName() {
      final String expected = "Jane Doe";
  
      ctx.currentResource("/content/byline");
      Byline byline = ctx.request().adaptTo(Byline.class);
  
      String actual = byline.getName();
  
      assertEquals(expected, actual);
  }
    
    @Test 
    void testGetOccupations() { 
        fail("Not yet implemented");
    }

    @Test 
    void testIsEmpty() { 
        fail("Not yet implemented");
    }
}
