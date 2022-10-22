package typingsJapgolly.yadda

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofScenarioLevelPlugin extends StObject {
    
    def init(options: Any): Unit
  }
  object TypeofScenarioLevelPlugin {
    
    inline def apply(init: Any => Callback): TypeofScenarioLevelPlugin = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction1((t0: Any) => init(t0).runNow()))
      __obj.asInstanceOf[TypeofScenarioLevelPlugin]
    }
    
    extension [Self <: TypeofScenarioLevelPlugin](x: Self) {
      
      inline def setInit(value: Any => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait TypeofStepLevelPlugin extends StObject {
    
    def init(): Unit = js.native
    def init(options: Any): Unit = js.native
  }
}
