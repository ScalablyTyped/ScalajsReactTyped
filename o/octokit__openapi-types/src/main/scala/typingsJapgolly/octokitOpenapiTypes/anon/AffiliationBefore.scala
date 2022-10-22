package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.`private`
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.asc
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.created_
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.desc
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.full_name
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.member_
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.owner_
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.public
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.pushed
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AffiliationBefore extends StObject {
  
  /**
    * Comma-separated list of values. Can include:
    * \* `owner`: Repositories that are owned by the authenticated user.
    * \* `collaborator`: Repositories that the user has been added to as a collaborator.
    * \* `organization_member`: Repositories that the user has access to through being a member of an organization. This includes every repository on every team that the user is on.
    */
  var affiliation: js.UndefOr[String] = js.undefined
  
  /** Only show notifications updated before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. */
  var before: js.UndefOr[String] = js.undefined
  
  /** The order to sort by. Default: `asc` when using `full_name`, otherwise `desc`. */
  var direction: js.UndefOr[asc | desc] = js.undefined
  
  /** Page number of the results to fetch. */
  var page: js.UndefOr[Double] = js.undefined
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. */
  var since: js.UndefOr[String] = js.undefined
  
  /** The property to sort the results by. */
  var sort: js.UndefOr[created_ | updated | pushed | full_name] = js.undefined
  
  /** Limit results to repositories of the specified type. Will cause a `422` error if used in the same request as **visibility** or **affiliation**. */
  var `type`: js.UndefOr[all | owner_ | public | `private` | member_] = js.undefined
  
  /** Limit results to repositories with the specified visibility. */
  var visibility: js.UndefOr[all | public | `private`] = js.undefined
}
object AffiliationBefore {
  
  inline def apply(): AffiliationBefore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AffiliationBefore]
  }
  
  extension [Self <: AffiliationBefore](x: Self) {
    
    inline def setAffiliation(value: String): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
    
    inline def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    inline def setSort(value: created_ | updated | pushed | full_name): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setType(value: all | owner_ | public | `private` | member_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisibility(value: all | public | `private`): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
