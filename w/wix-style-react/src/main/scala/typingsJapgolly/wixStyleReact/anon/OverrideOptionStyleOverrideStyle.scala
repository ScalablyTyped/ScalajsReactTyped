package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverrideOptionStyleOverrideStyle extends StObject {
  
  var disabled: Any
  
  var id: Any
  
  var overrideOptionStyle: Unit
  
  var overrideStyle: Any
  
  def value(): typingsJapgolly.react.mod.global.JSX.Element
}
object OverrideOptionStyleOverrideStyle {
  
  inline def apply(
    disabled: Any,
    id: Any,
    overrideOptionStyle: Unit,
    overrideStyle: Any,
    value: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]
  ): OverrideOptionStyleOverrideStyle = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], overrideOptionStyle = overrideOptionStyle.asInstanceOf[js.Any], overrideStyle = overrideStyle.asInstanceOf[js.Any], value = value.toJsFn)
    __obj.asInstanceOf[OverrideOptionStyleOverrideStyle]
  }
  
  extension [Self <: OverrideOptionStyleOverrideStyle](x: Self) {
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOverrideOptionStyle(value: Unit): Self = StObject.set(x, "overrideOptionStyle", value.asInstanceOf[js.Any])
    
    inline def setOverrideStyle(value: Any): Self = StObject.set(x, "overrideStyle", value.asInstanceOf[js.Any])
    
    inline def setValue(value: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]): Self = StObject.set(x, "value", value.toJsFn)
  }
}
