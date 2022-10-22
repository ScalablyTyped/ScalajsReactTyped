package typingsJapgolly.semanticUiApi.anon

import typingsJapgolly.semanticUiApi.SemanticUI.Api.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ClassNameSettings._Impl, 'error'> & std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.ClassNameSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.ClassNameSettings._Impl>> */
trait PickImplerrorPartialPickIError
  extends StObject
     with Param {
  
  var error: String & js.UndefOr[String]
  
  var loading: js.UndefOr[String] = js.undefined
}
object PickImplerrorPartialPickIError {
  
  inline def apply(error: String & js.UndefOr[String]): PickImplerrorPartialPickIError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplerrorPartialPickIError]
  }
  
  extension [Self <: PickImplerrorPartialPickIError](x: Self) {
    
    inline def setError(value: String & js.UndefOr[String]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
  }
}
