package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Anon extends StObject {
  
  /** Set to `1` or `true` to include anonymous contributors in results. */
  var anon: js.UndefOr[String] = js.undefined
  
  /** Page number of the results to fetch. */
  var page: js.UndefOr[Double] = js.undefined
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[Double] = js.undefined
}
object Anon {
  
  inline def apply(): Anon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anon]
  }
  
  extension [Self <: Anon](x: Self) {
    
    inline def setAnon(value: String): Self = StObject.set(x, "anon", value.asInstanceOf[js.Any])
    
    inline def setAnonUndefined: Self = StObject.set(x, "anon", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
  }
}
