package typingsJapgolly.rmcInputNumber.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rmcInputNumber.libInputHandlerMod.PropsType
import typingsJapgolly.rmcInputNumber.libInputHandlerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InputHandler {
  
  inline def apply(onTouchEnd: Any => Callback, onTouchStart: Any => Callback, prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(onTouchEnd = js.Any.fromFunction1((t0: Any) => onTouchEnd(t0).runNow()), onTouchStart = js.Any.fromFunction1((t0: Any) => onTouchStart(t0).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsType]))
  }
  
  @JSImport("rmc-input-number/lib/InputHandler", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def unselectable(value: Boolean): this.type = set("unselectable", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsType): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
