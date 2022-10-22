package typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books

import typingsJapgolly.maximMazurokGapiClientBooks.anon.Boundary
import typingsJapgolly.maximMazurokGapiClientBooks.anon.Lang
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geolayerdata extends StObject {
  
  var common: js.UndefOr[Lang] = js.undefined
  
  var geo: js.UndefOr[Boundary] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
}
object Geolayerdata {
  
  inline def apply(): Geolayerdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Geolayerdata]
  }
  
  extension [Self <: Geolayerdata](x: Self) {
    
    inline def setCommon(value: Lang): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    inline def setGeo(value: Boundary): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
    
    inline def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
