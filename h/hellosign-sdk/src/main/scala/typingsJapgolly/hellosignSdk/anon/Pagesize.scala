package typingsJapgolly.hellosignSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pagesize extends StObject {
  
  var page: js.UndefOr[Double] = js.undefined
  
  var page_size: js.UndefOr[Double] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
}
object Pagesize {
  
  inline def apply(): Pagesize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pagesize]
  }
  
  extension [Self <: Pagesize](x: Self) {
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
    
    inline def setPage_sizeUndefined: Self = StObject.set(x, "page_size", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
