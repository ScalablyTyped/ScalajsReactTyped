package typingsJapgolly.reactKeyHandler.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactKeyHandler.mod.ReactKeyHandlerProps
import typingsJapgolly.reactKeyHandler.mod._KEYDOWN
import typingsJapgolly.reactKeyHandler.mod._KEYPRESS
import typingsJapgolly.reactKeyHandler.mod._KEYUP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactKeyHandler {
  
  inline def apply(onKeyHandle: ReactKeyboardEventFrom[Element] => Callback): Builder = {
    val __props = js.Dynamic.literal(onKeyHandle = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element]) => onKeyHandle(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactKeyHandlerProps]))
  }
  
  @JSImport("react-key-handler", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def code(value: String | js.Array[String]): this.type = set("code", value.asInstanceOf[js.Any])
    
    inline def codeVarargs(value: String*): this.type = set("code", js.Array(value*))
    
    inline def keyCode(value: Double | js.Array[Double]): this.type = set("keyCode", value.asInstanceOf[js.Any])
    
    inline def keyCodeVarargs(value: Double*): this.type = set("keyCode", js.Array(value*))
    
    inline def keyEventName(value: _KEYDOWN | _KEYPRESS | _KEYUP): this.type = set("keyEventName", value.asInstanceOf[js.Any])
    
    inline def keyValue(value: String | js.Array[String]): this.type = set("keyValue", value.asInstanceOf[js.Any])
    
    inline def keyValueVarargs(value: String*): this.type = set("keyValue", js.Array(value*))
  }
  
  def withProps(p: ReactKeyHandlerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
