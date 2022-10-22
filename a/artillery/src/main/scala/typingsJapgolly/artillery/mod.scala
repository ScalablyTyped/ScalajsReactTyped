package typingsJapgolly.artillery

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type EventEmitter = typingsJapgolly.node.eventsMod.EventEmitter
  
  type Next = js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  
  type RequestResponse = typingsJapgolly.request.mod.RequestResponse
  
  type ResponseRequest = typingsJapgolly.request.mod.ResponseRequest
  
  trait ScenarioContext extends StObject {
    
    var vars: StringDictionary[Any]
  }
  object ScenarioContext {
    
    inline def apply(vars: StringDictionary[Any]): ScenarioContext = {
      val __obj = js.Dynamic.literal(vars = vars.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScenarioContext]
    }
    
    extension [Self <: ScenarioContext](x: Self) {
      
      inline def setVars(value: StringDictionary[Any]): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
    }
  }
}
