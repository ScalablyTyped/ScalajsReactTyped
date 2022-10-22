package typingsJapgolly.semanticUiForm.anon

import typingsJapgolly.semanticUiForm.SemanticUI.Form.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.ClassNameSettings._Impl, 'placeholder'> & std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.ClassNameSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.ClassNameSettings._Impl>> */
trait PickImplplaceholderPartia
  extends StObject
     with Param {
  
  var active: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[String] = js.undefined
  
  var placeholder: String & js.UndefOr[String]
  
  var visible: js.UndefOr[String] = js.undefined
}
object PickImplplaceholderPartia {
  
  inline def apply(placeholder: String & js.UndefOr[String]): PickImplplaceholderPartia = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplplaceholderPartia]
  }
  
  extension [Self <: PickImplplaceholderPartia](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setPlaceholder(value: String & js.UndefOr[String]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
