package typingsJapgolly.semanticUiDropdown.anon

import typingsJapgolly.semanticUiDropdown.SemanticUI.Dropdown.MetadataSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MetadataSettings._Impl, 'text'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MetadataSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.MetadataSettings._Impl>> */
trait PickImpltextPartialPickImDefaultText
  extends StObject
     with Param {
  
  var defaultText: js.UndefOr[String] = js.undefined
  
  var defaultValue: js.UndefOr[String] = js.undefined
  
  var placeholderText: js.UndefOr[String] = js.undefined
  
  var text: String & js.UndefOr[String]
  
  var value: js.UndefOr[String] = js.undefined
}
object PickImpltextPartialPickImDefaultText {
  
  inline def apply(text: String & js.UndefOr[String]): PickImpltextPartialPickImDefaultText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltextPartialPickImDefaultText]
  }
  
  extension [Self <: PickImpltextPartialPickImDefaultText](x: Self) {
    
    inline def setDefaultText(value: String): Self = StObject.set(x, "defaultText", value.asInstanceOf[js.Any])
    
    inline def setDefaultTextUndefined: Self = StObject.set(x, "defaultText", js.undefined)
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
    
    inline def setText(value: String & js.UndefOr[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
