package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputElement extends StObject {
  
  var disableEditing: Boolean
  
  var inputElement: typingsJapgolly.react.mod.global.JSX.Element
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var value: Any
}
object InputElement {
  
  inline def apply(disableEditing: Boolean, inputElement: VdomElement, value: Any): InputElement = {
    val __obj = js.Dynamic.literal(disableEditing = disableEditing.asInstanceOf[js.Any], inputElement = inputElement.rawElement.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputElement]
  }
  
  extension [Self <: InputElement](x: Self) {
    
    inline def setDisableEditing(value: Boolean): Self = StObject.set(x, "disableEditing", value.asInstanceOf[js.Any])
    
    inline def setInputElement(value: VdomElement): Self = StObject.set(x, "inputElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
