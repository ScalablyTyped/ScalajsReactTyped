package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.`private`
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.asc
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.created_
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.desc
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.forks
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.full_name
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.internal
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.member_
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.public
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.pushed
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.sources
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionPage extends StObject {
  
  /** The order to sort by. Default: `asc` when using `full_name`, otherwise `desc`. */
  var direction: js.UndefOr[asc | desc] = js.undefined
  
  /** Page number of the results to fetch. */
  var page: js.UndefOr[Double] = js.undefined
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** The property to sort the results by. */
  var sort: js.UndefOr[created_ | updated | pushed | full_name] = js.undefined
  
  /** Specifies the types of repositories you want returned. If your organization is associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+, `type` can also be `internal`. However, the `internal` value is not yet supported when a GitHub App calls this API with an installation access token. */
  var `type`: js.UndefOr[all | public | `private` | forks | sources | member_ | internal] = js.undefined
}
object DirectionPage {
  
  inline def apply(): DirectionPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionPage]
  }
  
  extension [Self <: DirectionPage](x: Self) {
    
    inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setSort(value: created_ | updated | pushed | full_name): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setType(value: all | public | `private` | forks | sources | member_ | internal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
