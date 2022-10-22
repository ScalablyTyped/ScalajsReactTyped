package typingsJapgolly.reactNativeMaps.anon

import typingsJapgolly.reactNativeMaps.libSharedTypesMod.LatLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordinatePosition extends StObject {
  
  var coordinate: LatLng
  
  var position: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point
}
object CoordinatePosition {
  
  inline def apply(coordinate: LatLng, position: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point): CoordinatePosition = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinatePosition]
  }
  
  extension [Self <: CoordinatePosition](x: Self) {
    
    inline def setCoordinate(value: LatLng): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
