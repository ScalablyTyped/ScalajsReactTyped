package typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books

import typingsJapgolly.maximMazurokGapiClientBooks.anon.BannerImageUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Series extends StObject {
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  
  var series: js.UndefOr[js.Array[BannerImageUrl]] = js.undefined
}
object Series {
  
  inline def apply(): Series = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Series]
  }
  
  extension [Self <: Series](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSeries(value: js.Array[BannerImageUrl]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: BannerImageUrl*): Self = StObject.set(x, "series", js.Array(value*))
  }
}
