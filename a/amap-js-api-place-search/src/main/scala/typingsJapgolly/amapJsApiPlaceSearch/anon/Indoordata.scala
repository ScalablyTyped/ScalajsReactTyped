package typingsJapgolly.amapJsApiPlaceSearch.anon

import typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indoordata extends StObject {
  
  var indoor_data: Cpid
  
  var indoor_map: `true`
}
object Indoordata {
  
  inline def apply(indoor_data: Cpid): Indoordata = {
    val __obj = js.Dynamic.literal(indoor_data = indoor_data.asInstanceOf[js.Any], indoor_map = true)
    __obj.asInstanceOf[Indoordata]
  }
  
  extension [Self <: Indoordata](x: Self) {
    
    inline def setIndoor_data(value: Cpid): Self = StObject.set(x, "indoor_data", value.asInstanceOf[js.Any])
    
    inline def setIndoor_map(value: `true`): Self = StObject.set(x, "indoor_map", value.asInstanceOf[js.Any])
  }
}
