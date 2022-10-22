package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.active
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `635` extends StObject {
  
  /** Page number of the results to fetch. */
  var page: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['page'] */ js.Any
  ] = js.undefined
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['per-page'] */ js.Any
  ] = js.undefined
  
  /** Indicates the state of the memberships to return. If not specified, the API returns both active and pending memberships. */
  var state: js.UndefOr[active | pending] = js.undefined
}
object `635` {
  
  inline def apply(): `635` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`635`]
  }
  
  extension [Self <: `635`](x: Self) {
    
    inline def setPage(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['page'] */ js.Any
    ): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['per-page'] */ js.Any
    ): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setState(value: active | pending): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
