package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geocoder extends StObject {
  
  def Geocoder(): Any
  
  var GeocoderStatus: OK
  
  def Map(): js.Object
  
  var places: AutocompleteService
}
object Geocoder {
  
  inline def apply(
    Geocoder: CallbackTo[Any],
    GeocoderStatus: OK,
    Map: CallbackTo[js.Object],
    places: AutocompleteService
  ): Geocoder = {
    val __obj = js.Dynamic.literal(Geocoder = Geocoder.toJsFn, GeocoderStatus = GeocoderStatus.asInstanceOf[js.Any], Map = Map.toJsFn, places = places.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geocoder]
  }
  
  extension [Self <: Geocoder](x: Self) {
    
    inline def setGeocoder(value: CallbackTo[Any]): Self = StObject.set(x, "Geocoder", value.toJsFn)
    
    inline def setGeocoderStatus(value: OK): Self = StObject.set(x, "GeocoderStatus", value.asInstanceOf[js.Any])
    
    inline def setMap(value: CallbackTo[js.Object]): Self = StObject.set(x, "Map", value.toJsFn)
    
    inline def setPlaces(value: AutocompleteService): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
  }
}
