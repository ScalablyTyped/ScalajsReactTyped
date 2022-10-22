package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.latest
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.queued_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checkname extends StObject {
  
  /** Returns check runs with the specified `name`. */
  var check_name: js.UndefOr[String] = js.undefined
  
  /** Filters check runs by their `completed_at` timestamp. `latest` returns the most recent check runs. */
  var filter: js.UndefOr[latest | all] = js.undefined
  
  /** Page number of the results to fetch. */
  var page: js.UndefOr[Double] = js.undefined
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** Returns check runs with the specified `status`. */
  var status: js.UndefOr[queued_ | in_progress | completed] = js.undefined
}
object Checkname {
  
  inline def apply(): Checkname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Checkname]
  }
  
  extension [Self <: Checkname](x: Self) {
    
    inline def setCheck_name(value: String): Self = StObject.set(x, "check_name", value.asInstanceOf[js.Any])
    
    inline def setCheck_nameUndefined: Self = StObject.set(x, "check_name", js.undefined)
    
    inline def setFilter(value: latest | all): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setStatus(value: queued_ | in_progress | completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
