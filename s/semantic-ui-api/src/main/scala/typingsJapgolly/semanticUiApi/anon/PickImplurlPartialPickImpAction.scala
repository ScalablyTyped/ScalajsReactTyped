package typingsJapgolly.semanticUiApi.anon

import typingsJapgolly.semanticUiApi.SemanticUI.Api.MetadataSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.MetadataSettings._Impl, 'url'> & std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.MetadataSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.MetadataSettings._Impl>> */
trait PickImplurlPartialPickImpAction
  extends StObject
     with Param {
  
  var action: js.UndefOr[String] = js.undefined
  
  var url: String & js.UndefOr[String]
}
object PickImplurlPartialPickImpAction {
  
  inline def apply(url: String & js.UndefOr[String]): PickImplurlPartialPickImpAction = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplurlPartialPickImpAction]
  }
  
  extension [Self <: PickImplurlPartialPickImpAction](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setUrl(value: String & js.UndefOr[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
