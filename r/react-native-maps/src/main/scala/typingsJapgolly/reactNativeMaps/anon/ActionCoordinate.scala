package typingsJapgolly.reactNativeMaps.anon

import typingsJapgolly.reactNativeMaps.libSharedTypesMod.LatLng
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.`marker-press`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionCoordinate extends StObject {
  
  var action: `marker-press`
  
  var coordinate: LatLng
  
  var id: String
  
  /**
    * @platform Android
    */
  var position: js.UndefOr[typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point] = js.undefined
}
object ActionCoordinate {
  
  inline def apply(coordinate: LatLng, id: String): ActionCoordinate = {
    val __obj = js.Dynamic.literal(action = "marker-press", coordinate = coordinate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCoordinate]
  }
  
  extension [Self <: ActionCoordinate](x: Self) {
    
    inline def setAction(value: `marker-press`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setCoordinate(value: LatLng): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
