package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChecknamePage extends StObject {
  
  /** Filters check suites by GitHub App `id`. */
  var app_id: js.UndefOr[Double] = js.undefined
  
  /** Returns check runs with the specified `name`. */
  var check_name: js.UndefOr[String] = js.undefined
  
  /** Page number of the results to fetch. */
  var page: js.UndefOr[Double] = js.undefined
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[Double] = js.undefined
}
object ChecknamePage {
  
  inline def apply(): ChecknamePage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChecknamePage]
  }
  
  extension [Self <: ChecknamePage](x: Self) {
    
    inline def setApp_id(value: Double): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    inline def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
    
    inline def setCheck_name(value: String): Self = StObject.set(x, "check_name", value.asInstanceOf[js.Any])
    
    inline def setCheck_nameUndefined: Self = StObject.set(x, "check_name", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
  }
}
