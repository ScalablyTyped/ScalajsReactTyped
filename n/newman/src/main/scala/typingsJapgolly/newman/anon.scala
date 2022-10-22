package typingsJapgolly.newman

import typingsJapgolly.newman.mod.NewmanRunStat
import typingsJapgolly.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Assertions extends StObject {
    
    var assertions: NewmanRunStat
    
    var items: NewmanRunStat
    
    var iterations: NewmanRunStat
    
    var prerequestScripts: NewmanRunStat
    
    var prerequests: NewmanRunStat
    
    var requests: NewmanRunStat
    
    var scripts: NewmanRunStat
    
    var testScripts: NewmanRunStat
    
    var tests: NewmanRunStat
  }
  object Assertions {
    
    inline def apply(
      assertions: NewmanRunStat,
      items: NewmanRunStat,
      iterations: NewmanRunStat,
      prerequestScripts: NewmanRunStat,
      prerequests: NewmanRunStat,
      requests: NewmanRunStat,
      scripts: NewmanRunStat,
      testScripts: NewmanRunStat,
      tests: NewmanRunStat
    ): Assertions = {
      val __obj = js.Dynamic.literal(assertions = assertions.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], prerequestScripts = prerequestScripts.asInstanceOf[js.Any], prerequests = prerequests.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], testScripts = testScripts.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
      __obj.asInstanceOf[Assertions]
    }
    
    extension [Self <: Assertions](x: Self) {
      
      inline def setAssertions(value: NewmanRunStat): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
      
      inline def setItems(value: NewmanRunStat): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setIterations(value: NewmanRunStat): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setPrerequestScripts(value: NewmanRunStat): Self = StObject.set(x, "prerequestScripts", value.asInstanceOf[js.Any])
      
      inline def setPrerequests(value: NewmanRunStat): Self = StObject.set(x, "prerequests", value.asInstanceOf[js.Any])
      
      inline def setRequests(value: NewmanRunStat): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
      
      inline def setScripts(value: NewmanRunStat): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setTestScripts(value: NewmanRunStat): Self = StObject.set(x, "testScripts", value.asInstanceOf[js.Any])
      
      inline def setTests(value: NewmanRunStat): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
    }
  }
  
  trait Http extends StObject {
    
    var http: js.UndefOr[Agent] = js.undefined
    
    var https: js.UndefOr[Agent] = js.undefined
  }
  object Http {
    
    inline def apply(): Http = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Http]
    }
    
    extension [Self <: Http](x: Self) {
      
      inline def setHttp(value: Agent): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      inline def setHttps(value: Agent): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    }
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var value: String
  }
  object Key {
    
    inline def apply(key: String, value: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ref extends StObject {
    
    var ref: String
  }
  object Ref {
    
    inline def apply(ref: String): Ref = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ref]
    }
    
    extension [Self <: Ref](x: Self) {
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
}
