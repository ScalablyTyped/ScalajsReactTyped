package typingsJapgolly.semanticUiApi.anon

import typingsJapgolly.semanticUiApi.SemanticUI.Api.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.SelectorSettings._Impl, 'disabled'> & std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.SelectorSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.SelectorSettings._Impl>> */
trait PickImpldisabledPartialPi
  extends StObject
     with Param {
  
  var disabled: String & js.UndefOr[String]
  
  var form: js.UndefOr[String] = js.undefined
}
object PickImpldisabledPartialPi {
  
  inline def apply(disabled: String & js.UndefOr[String]): PickImpldisabledPartialPi = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldisabledPartialPi]
  }
  
  extension [Self <: PickImpldisabledPartialPi](x: Self) {
    
    inline def setDisabled(value: String & js.UndefOr[String]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
  }
}
