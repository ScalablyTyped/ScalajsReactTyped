package typingsJapgolly.addMatchers

import typingsJapgolly.addMatchers.distMod.MatchersByName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BeforeEach extends StObject {
    
    var beforeEach: Any
    
    var jasmine: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jasmine.Env */ Any
  }
  object BeforeEach {
    
    inline def apply(
      beforeEach: Any,
      jasmine: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jasmine.Env */ Any
    ): BeforeEach = {
      val __obj = js.Dynamic.literal(beforeEach = beforeEach.asInstanceOf[js.Any], jasmine = jasmine.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeEach]
    }
    
    extension [Self <: BeforeEach](x: Self) {
      
      inline def setBeforeEach(value: Any): Self = StObject.set(x, "beforeEach", value.asInstanceOf[js.Any])
      
      inline def setJasmine(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jasmine.Env */ Any
      ): Self = StObject.set(x, "jasmine", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    def apply(matchersByName: MatchersByName): Unit = js.native
    
    def asymmetric(matchersByName: MatchersByName): Unit = js.native
  }
  
  trait Expect extends StObject {
    
    var expect: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Expect */ Any
  }
  object Expect {
    
    inline def apply(
      expect: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Expect */ Any
    ): Expect = {
      val __obj = js.Dynamic.literal(expect = expect.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expect]
    }
    
    extension [Self <: Expect](x: Self) {
      
      inline def setExpect(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Expect */ Any
      ): Self = StObject.set(x, "expect", value.asInstanceOf[js.Any])
    }
  }
}
