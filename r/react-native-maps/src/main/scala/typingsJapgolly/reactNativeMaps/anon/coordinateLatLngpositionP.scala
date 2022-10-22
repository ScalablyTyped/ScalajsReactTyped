package typingsJapgolly.reactNativeMaps.anon

import typingsJapgolly.reactNativeMaps.libSharedTypesMod.LatLng
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.`marker-deselect`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  coordinate :react-native-maps.react-native-maps/lib/sharedTypes.LatLng,   position :react-native-maps.react-native-maps/lib/sharedTypes.Point} & {  action :'marker-deselect',   id :string} */
trait coordinateLatLngpositionP extends StObject {
  
  var action: `marker-deselect`
  
  var coordinate: LatLng
  
  var id: String
  
  var position: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point
}
object coordinateLatLngpositionP {
  
  inline def apply(coordinate: LatLng, id: String, position: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point): coordinateLatLngpositionP = {
    val __obj = js.Dynamic.literal(action = "marker-deselect", coordinate = coordinate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[coordinateLatLngpositionP]
  }
  
  extension [Self <: coordinateLatLngpositionP](x: Self) {
    
    inline def setAction(value: `marker-deselect`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setCoordinate(value: LatLng): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
