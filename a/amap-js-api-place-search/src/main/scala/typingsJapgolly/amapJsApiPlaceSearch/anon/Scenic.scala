package typingsJapgolly.amapJsApiPlaceSearch.anon

import typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.SCENIC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scenic extends StObject {
  
  var deep_type: SCENIC
  
  /**
    * @deprecated 景点类深度信息
    */
  var scenic: typingsJapgolly.amapJsApiPlaceSearch.AMap.PlaceSearch.Scenic
}
object Scenic {
  
  inline def apply(scenic: typingsJapgolly.amapJsApiPlaceSearch.AMap.PlaceSearch.Scenic): Scenic = {
    val __obj = js.Dynamic.literal(deep_type = "SCENIC", scenic = scenic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scenic]
  }
  
  extension [Self <: Scenic](x: Self) {
    
    inline def setDeep_type(value: SCENIC): Self = StObject.set(x, "deep_type", value.asInstanceOf[js.Any])
    
    inline def setScenic(value: typingsJapgolly.amapJsApiPlaceSearch.AMap.PlaceSearch.Scenic): Self = StObject.set(x, "scenic", value.asInstanceOf[js.Any])
  }
}
