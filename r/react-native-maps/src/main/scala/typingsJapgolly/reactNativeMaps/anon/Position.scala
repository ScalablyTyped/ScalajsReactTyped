package typingsJapgolly.reactNativeMaps.anon

import typingsJapgolly.reactNativeMaps.libSharedTypesMod.LatLng
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.`polyline-press`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  var action: `polyline-press`
  
  /**
    * @platform Android
    */
  var coordinate: js.UndefOr[LatLng] = js.undefined
  
  /**
    * @platform iOS: Google Maps
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * @platform Android
    */
  var position: js.UndefOr[typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point] = js.undefined
}
object Position {
  
  inline def apply(): Position = {
    val __obj = js.Dynamic.literal(action = "polyline-press")
    __obj.asInstanceOf[Position]
  }
  
  extension [Self <: Position](x: Self) {
    
    inline def setAction(value: `polyline-press`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setCoordinate(value: LatLng): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setCoordinateUndefined: Self = StObject.set(x, "coordinate", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPosition(value: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
