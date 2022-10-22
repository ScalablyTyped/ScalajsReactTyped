package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverrideStyleValue extends StObject {
  
  var disabled: Any
  
  var id: Any
  
  var overrideOptionStyle: Any
  
  var overrideStyle: Unit
  
  def value(): typingsJapgolly.react.mod.global.JSX.Element
}
object OverrideStyleValue {
  
  inline def apply(
    disabled: Any,
    id: Any,
    overrideOptionStyle: Any,
    overrideStyle: Unit,
    value: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]
  ): OverrideStyleValue = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], overrideOptionStyle = overrideOptionStyle.asInstanceOf[js.Any], overrideStyle = overrideStyle.asInstanceOf[js.Any], value = value.toJsFn)
    __obj.asInstanceOf[OverrideStyleValue]
  }
  
  extension [Self <: OverrideStyleValue](x: Self) {
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOverrideOptionStyle(value: Any): Self = StObject.set(x, "overrideOptionStyle", value.asInstanceOf[js.Any])
    
    inline def setOverrideStyle(value: Unit): Self = StObject.set(x, "overrideStyle", value.asInstanceOf[js.Any])
    
    inline def setValue(value: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]): Self = StObject.set(x, "value", value.toJsFn)
  }
}
