package typingsJapgolly.semanticUiForm.anon

import typingsJapgolly.semanticUiForm.SemanticUI.Form.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.SelectorSettings._Impl, 'group'> & std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.SelectorSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.SelectorSettings._Impl>> */
trait PickImplgroupPartialPickI
  extends StObject
     with Param {
  
  var field: js.UndefOr[String] = js.undefined
  
  var group: String & js.UndefOr[String]
  
  var input: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var prompt: js.UndefOr[String] = js.undefined
  
  var submit: js.UndefOr[String] = js.undefined
}
object PickImplgroupPartialPickI {
  
  inline def apply(group: String & js.UndefOr[String]): PickImplgroupPartialPickI = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplgroupPartialPickI]
  }
  
  extension [Self <: PickImplgroupPartialPickI](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setGroup(value: String & js.UndefOr[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setSubmit(value: String): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
    
    inline def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
  }
}
