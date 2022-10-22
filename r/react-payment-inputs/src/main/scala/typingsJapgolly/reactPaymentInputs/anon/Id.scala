package typingsJapgolly.reactPaymentInputs.anon

import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var `aria-label`: String
  
  var autoComplete: String
  
  var id: String
  
  var name: String
  
  var onBlur: Any
  
  var onChange: Any
  
  var onFocus: Any
  
  var onKeyDown: Any
  
  var onKeyPress: Any
  
  var placeholder: String
  
  var ref: MutableRefObject[Any]
  
  var `type`: String
}
object Id {
  
  inline def apply(
    `aria-label`: String,
    autoComplete: String,
    id: String,
    name: String,
    onBlur: Any,
    onChange: Any,
    onFocus: Any,
    onKeyDown: Any,
    onKeyPress: Any,
    placeholder: String,
    ref: MutableRefObject[Any],
    `type`: String
  ): Id = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onFocus = onFocus.asInstanceOf[js.Any], onKeyDown = onKeyDown.asInstanceOf[js.Any], onKeyPress = onKeyPress.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: Any): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Any): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnFocus(value: Any): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    inline def setOnKeyDown(value: Any): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
    
    inline def setOnKeyPress(value: Any): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setRef(value: MutableRefObject[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
