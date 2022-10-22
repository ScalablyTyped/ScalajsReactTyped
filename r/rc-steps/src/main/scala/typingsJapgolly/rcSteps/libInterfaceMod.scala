package typingsJapgolly.rcSteps

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterfaceMod {
  
  trait Icons extends StObject {
    
    var error: Node
    
    var finish: Node
  }
  object Icons {
    
    inline def apply(): Icons = {
      val __obj = js.Dynamic.literal(error = null, finish = null)
      __obj.asInstanceOf[Icons]
    }
    
    extension [Self <: Icons](x: Self) {
      
      inline def setError(value: VdomNode): Self = StObject.set(x, "error", value.rawNode.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setErrorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "error", js.Array(value*))
      
      inline def setErrorVdomElement(value: VdomElement): Self = StObject.set(x, "error", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFinish(value: VdomNode): Self = StObject.set(x, "finish", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFinishNull: Self = StObject.set(x, "finish", null)
      
      inline def setFinishVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "finish", js.Array(value*))
      
      inline def setFinishVdomElement(value: VdomElement): Self = StObject.set(x, "finish", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcSteps.rcStepsStrings.error
    - typingsJapgolly.rcSteps.rcStepsStrings.process
    - typingsJapgolly.rcSteps.rcStepsStrings.finish
    - typingsJapgolly.rcSteps.rcStepsStrings.wait
  */
  trait Status extends StObject
  object Status {
    
    inline def error: typingsJapgolly.rcSteps.rcStepsStrings.error = "error".asInstanceOf[typingsJapgolly.rcSteps.rcStepsStrings.error]
    
    inline def finish: typingsJapgolly.rcSteps.rcStepsStrings.finish = "finish".asInstanceOf[typingsJapgolly.rcSteps.rcStepsStrings.finish]
    
    inline def process: typingsJapgolly.rcSteps.rcStepsStrings.process = "process".asInstanceOf[typingsJapgolly.rcSteps.rcStepsStrings.process]
  }
}
