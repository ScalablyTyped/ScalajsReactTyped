package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var label: String
  
  var value: typingsJapgolly.react.mod.global.JSX.Element
}
object Value {
  
  inline def apply(label: String, value: VdomElement): Value = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: VdomElement): Self = StObject.set(x, "value", value.rawElement.asInstanceOf[js.Any])
  }
}
