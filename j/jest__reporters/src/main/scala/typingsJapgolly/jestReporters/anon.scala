package typingsJapgolly.jestReporters

import typingsJapgolly.jestTestResult.mod.TestCaseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Basename extends StObject {
    
    var basename: String
    
    var dirname: String
  }
  object Basename {
    
    inline def apply(basename: String, dirname: String): Basename = {
      val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any])
      __obj.asInstanceOf[Basename]
    }
    
    extension [Self <: Basename](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
    }
  }
  
  trait Test extends StObject {
    
    var test: typingsJapgolly.jestTestResult.mod.Test
    
    var testCaseResult: TestCaseResult
  }
  object Test {
    
    inline def apply(test: typingsJapgolly.jestTestResult.mod.Test, testCaseResult: TestCaseResult): Test = {
      val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any], testCaseResult = testCaseResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[Test]
    }
    
    extension [Self <: Test](x: Self) {
      
      inline def setTest(value: typingsJapgolly.jestTestResult.mod.Test): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestCaseResult(value: TestCaseResult): Self = StObject.set(x, "testCaseResult", value.asInstanceOf[js.Any])
    }
  }
}
