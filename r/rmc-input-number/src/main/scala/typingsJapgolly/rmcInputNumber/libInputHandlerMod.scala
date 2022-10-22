package typingsJapgolly.rmcInputNumber

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputHandlerMod {
  
  @JSImport("rmc-input-number/lib/InputHandler", JSImport.Default)
  @js.native
  open class default () extends InputHandler
  
  @js.native
  trait InputHandler
    extends Component[PropsType, js.Object, Any]
  
  trait PropsType extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    def onTouchEnd(e: Any): Unit
    
    def onTouchStart(e: Any): Unit
    
    var prefixCls: String
    
    var role: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[Boolean] = js.undefined
  }
  object PropsType {
    
    inline def apply(onTouchEnd: Any => Callback, onTouchStart: Any => Callback, prefixCls: String): PropsType = {
      val __obj = js.Dynamic.literal(onTouchEnd = js.Any.fromFunction1((t0: Any) => onTouchEnd(t0).runNow()), onTouchStart = js.Any.fromFunction1((t0: Any) => onTouchStart(t0).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    extension [Self <: PropsType](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnTouchEnd(value: Any => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setOnTouchStart(value: Any => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setUnselectable(value: Boolean): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    }
  }
}
