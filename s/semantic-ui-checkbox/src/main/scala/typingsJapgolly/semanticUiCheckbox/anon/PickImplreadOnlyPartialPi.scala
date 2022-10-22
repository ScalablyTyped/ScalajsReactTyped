package typingsJapgolly.semanticUiCheckbox.anon

import typingsJapgolly.semanticUiCheckbox.SemanticUI.Checkbox.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ClassNameSettings._Impl, 'readOnly'> & std.Partial<std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ClassNameSettings._Impl, keyof semantic-ui-checkbox.SemanticUI.Checkbox.ClassNameSettings._Impl>> */
trait PickImplreadOnlyPartialPi
  extends StObject
     with Param {
  
  var checked: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[String] = js.undefined
  
  var radio: js.UndefOr[String] = js.undefined
  
  var readOnly: String & js.UndefOr[String]
}
object PickImplreadOnlyPartialPi {
  
  inline def apply(readOnly: String & js.UndefOr[String]): PickImplreadOnlyPartialPi = {
    val __obj = js.Dynamic.literal(readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplreadOnlyPartialPi]
  }
  
  extension [Self <: PickImplreadOnlyPartialPi](x: Self) {
    
    inline def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setRadio(value: String): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
    
    inline def setRadioUndefined: Self = StObject.set(x, "radio", js.undefined)
    
    inline def setReadOnly(value: String & js.UndefOr[String]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
  }
}
