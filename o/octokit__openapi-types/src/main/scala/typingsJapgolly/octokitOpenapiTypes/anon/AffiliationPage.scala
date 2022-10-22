package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.admin
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.direct
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.maintain
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.outside
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.pull
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.push
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.triage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AffiliationPage extends StObject {
  
  /** Filter collaborators returned by their affiliation. `outside` means all outside collaborators of an organization-owned repository. `direct` means all collaborators with permissions to an organization-owned repository, regardless of organization membership status. `all` means all collaborators the authenticated user can see. */
  var affiliation: js.UndefOr[outside | direct | all] = js.undefined
  
  /** Page number of the results to fetch. */
  var page: js.UndefOr[Double] = js.undefined
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** Filter collaborators by the permissions they have on the repository. If not specified, all collaborators will be returned. */
  var permission: js.UndefOr[pull | triage | push | maintain | admin] = js.undefined
}
object AffiliationPage {
  
  inline def apply(): AffiliationPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AffiliationPage]
  }
  
  extension [Self <: AffiliationPage](x: Self) {
    
    inline def setAffiliation(value: outside | direct | all): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
    
    inline def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setPermission(value: pull | triage | push | maintain | admin): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
