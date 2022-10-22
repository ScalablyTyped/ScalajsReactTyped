package typingsJapgolly.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRolesData extends StObject {
  
  var name_filter: js.UndefOr[String] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
}
object GetRolesData {
  
  inline def apply(): GetRolesData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRolesData]
  }
  
  extension [Self <: GetRolesData](x: Self) {
    
    inline def setName_filter(value: String): Self = StObject.set(x, "name_filter", value.asInstanceOf[js.Any])
    
    inline def setName_filterUndefined: Self = StObject.set(x, "name_filter", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
  }
}
