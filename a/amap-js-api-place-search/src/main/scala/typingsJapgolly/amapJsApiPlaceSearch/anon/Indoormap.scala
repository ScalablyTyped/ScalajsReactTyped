package typingsJapgolly.amapJsApiPlaceSearch.anon

import typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indoormap extends StObject {
  
  var indoor_map: `false`
}
object Indoormap {
  
  inline def apply(): Indoormap = {
    val __obj = js.Dynamic.literal(indoor_map = false)
    __obj.asInstanceOf[Indoormap]
  }
  
  extension [Self <: Indoormap](x: Self) {
    
    inline def setIndoor_map(value: `false`): Self = StObject.set(x, "indoor_map", value.asInstanceOf[js.Any])
  }
}
