package typingsJapgolly.semanticUiApi.anon

import typingsJapgolly.semanticUiApi.SemanticUI.Api.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.SelectorSettings._Impl, 'form'> & std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.SelectorSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.SelectorSettings._Impl>> */
trait PickImplformPartialPickIm
  extends StObject
     with Param {
  
  var disabled: js.UndefOr[String] = js.undefined
  
  var form: String & js.UndefOr[String]
}
object PickImplformPartialPickIm {
  
  inline def apply(form: String & js.UndefOr[String]): PickImplformPartialPickIm = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplformPartialPickIm]
  }
  
  extension [Self <: PickImplformPartialPickIm](x: Self) {
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setForm(value: String & js.UndefOr[String]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
  }
}
