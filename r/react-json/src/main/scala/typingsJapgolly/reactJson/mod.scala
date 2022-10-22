package typingsJapgolly.reactJson

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-json", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[JsonProperties, js.Object, Any]
  
  type Json = japgolly.scalajs.react.facade.React.Component[JsonProperties & js.Object, js.Object]
  
  trait JsonProperties extends StObject {
    
    var onChange: js.UndefOr[OnChangeHandler] = js.undefined
    
    var value: Any
  }
  object JsonProperties {
    
    inline def apply(value: Any): JsonProperties = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonProperties]
    }
    
    extension [Self <: JsonProperties](x: Self) {
      
      inline def setOnChange(value: /* value */ Any => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ Any) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type OnChangeHandler = js.Function1[/* value */ Any, Unit]
}
