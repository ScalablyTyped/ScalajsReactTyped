package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled extends StObject {
  
  var disabled: Boolean
  
  var id: String
  
  def value(): typingsJapgolly.react.mod.global.JSX.Element
}
object Disabled {
  
  inline def apply(disabled: Boolean, id: String, value: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], value = value.toJsFn)
    __obj.asInstanceOf[Disabled]
  }
  
  extension [Self <: Disabled](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setValue(value: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]): Self = StObject.set(x, "value", value.toJsFn)
  }
}
