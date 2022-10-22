package typingsJapgolly.reactNativeMaps.anon

import typingsJapgolly.reactNativeMaps.libSharedTypesMod.LatLng
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.`image-overlay-press`
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.`overlay-press`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coordinate extends StObject {
  
  /**
    * @platform iOS: Apple Maps: `image-overlay-press`
    * @platform Android: `overlay-press`
    */
  var action: `overlay-press` | `image-overlay-press`
  
  /**
    * @platform iOS: Apple Maps
    * @platform Android
    */
  var coordinate: js.UndefOr[LatLng] = js.undefined
  
  /**
    * @platform iOS: Apple maps
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * @platform Android
    */
  var position: js.UndefOr[typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point] = js.undefined
}
object Coordinate {
  
  inline def apply(action: `overlay-press` | `image-overlay-press`): Coordinate = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinate]
  }
  
  extension [Self <: Coordinate](x: Self) {
    
    inline def setAction(value: `overlay-press` | `image-overlay-press`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setCoordinate(value: LatLng): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setCoordinateUndefined: Self = StObject.set(x, "coordinate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPosition(value: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
