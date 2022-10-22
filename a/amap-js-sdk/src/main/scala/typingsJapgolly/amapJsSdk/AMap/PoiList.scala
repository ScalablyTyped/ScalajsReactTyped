package typingsJapgolly.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoiList extends StObject {
  
  var count: Double
  
  var pageIndex: Double
  
  var pageSize: Double
  
  var pois: js.Array[Poi]
}
object PoiList {
  
  inline def apply(count: Double, pageIndex: Double, pageSize: Double, pois: js.Array[Poi]): PoiList = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pois = pois.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoiList]
  }
  
  extension [Self <: PoiList](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPois(value: js.Array[Poi]): Self = StObject.set(x, "pois", value.asInstanceOf[js.Any])
    
    inline def setPoisVarargs(value: Poi*): Self = StObject.set(x, "pois", js.Array(value*))
  }
}
