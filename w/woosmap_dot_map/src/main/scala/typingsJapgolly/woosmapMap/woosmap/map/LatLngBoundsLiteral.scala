package typingsJapgolly.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatLngBoundsLiteral extends StObject {
  
  var east: Double
  
  var north: Double
  
  var south: Double
  
  var west: Double
}
object LatLngBoundsLiteral {
  
  inline def apply(east: Double, north: Double, south: Double, west: Double): LatLngBoundsLiteral = {
    val __obj = js.Dynamic.literal(east = east.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any], south = south.asInstanceOf[js.Any], west = west.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLngBoundsLiteral]
  }
  
  extension [Self <: LatLngBoundsLiteral](x: Self) {
    
    inline def setEast(value: Double): Self = StObject.set(x, "east", value.asInstanceOf[js.Any])
    
    inline def setNorth(value: Double): Self = StObject.set(x, "north", value.asInstanceOf[js.Any])
    
    inline def setSouth(value: Double): Self = StObject.set(x, "south", value.asInstanceOf[js.Any])
    
    inline def setWest(value: Double): Self = StObject.set(x, "west", value.asInstanceOf[js.Any])
  }
}
