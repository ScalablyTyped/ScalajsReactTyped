package typingsJapgolly.semanticUiForm.anon

import typingsJapgolly.semanticUiForm.JQuery
import typingsJapgolly.semanticUiForm.SemanticUI.Form.TemplatesSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.TemplatesSettings._Impl, 'error'> & std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.TemplatesSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.TemplatesSettings._Impl>> */
trait PickImplerrorPartialPickIError
  extends StObject
     with Param {
  
  def error(errors: js.Array[String]): JQuery
  @JSName("error")
  var error_Original: (js.Function1[/* errors */ js.Array[String], JQuery]) & (js.UndefOr[js.Function1[/* errors */ js.Array[String], JQuery]])
  
  var prompt: js.UndefOr[js.Function1[/* errors */ js.Array[String], JQuery]] = js.undefined
}
object PickImplerrorPartialPickIError {
  
  inline def apply(
    error: (js.Function1[/* errors */ js.Array[String], JQuery]) & (js.UndefOr[js.Function1[/* errors */ js.Array[String], JQuery]])
  ): PickImplerrorPartialPickIError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplerrorPartialPickIError]
  }
  
  extension [Self <: PickImplerrorPartialPickIError](x: Self) {
    
    inline def setError(
      value: (js.Function1[/* errors */ js.Array[String], JQuery]) & (js.UndefOr[js.Function1[/* errors */ js.Array[String], JQuery]])
    ): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setPrompt(value: /* errors */ js.Array[String] => JQuery): Self = StObject.set(x, "prompt", js.Any.fromFunction1(value))
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
  }
}
