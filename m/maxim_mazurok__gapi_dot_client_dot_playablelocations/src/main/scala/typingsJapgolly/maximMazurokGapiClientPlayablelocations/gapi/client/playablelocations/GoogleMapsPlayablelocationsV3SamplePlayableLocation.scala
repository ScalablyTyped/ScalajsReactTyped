package typingsJapgolly.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleMapsPlayablelocationsV3SamplePlayableLocation extends StObject {
  
  /**
    * Required. The latitude and longitude associated with the center of the playable location. By default, the set of playable locations returned from SamplePlayableLocations use
    * center-point coordinates.
    */
  var centerPoint: js.UndefOr[GoogleTypeLatLng] = js.undefined
  
  /** Required. The name of this playable location. */
  var name: js.UndefOr[String] = js.undefined
  
  /** A [place ID] (https://developers.google.com/places/place-id) */
  var placeId: js.UndefOr[String] = js.undefined
  
  /** A [plus code] (http://openlocationcode.com) */
  var plusCode: js.UndefOr[String] = js.undefined
  
  /** The playable location's coordinates, snapped to the sidewalk of the nearest road, if a nearby road exists. */
  var snappedPoint: js.UndefOr[GoogleTypeLatLng] = js.undefined
  
  /**
    * A collection of [Playable Location Types](/maps/documentation/gaming/tt/types) for this playable location. The first type in the collection is the primary type. Type information
    * might not be available for all playable locations.
    */
  var types: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleMapsPlayablelocationsV3SamplePlayableLocation {
  
  inline def apply(): GoogleMapsPlayablelocationsV3SamplePlayableLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsPlayablelocationsV3SamplePlayableLocation]
  }
  
  extension [Self <: GoogleMapsPlayablelocationsV3SamplePlayableLocation](x: Self) {
    
    inline def setCenterPoint(value: GoogleTypeLatLng): Self = StObject.set(x, "centerPoint", value.asInstanceOf[js.Any])
    
    inline def setCenterPointUndefined: Self = StObject.set(x, "centerPoint", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    inline def setPlusCode(value: String): Self = StObject.set(x, "plusCode", value.asInstanceOf[js.Any])
    
    inline def setPlusCodeUndefined: Self = StObject.set(x, "plusCode", js.undefined)
    
    inline def setSnappedPoint(value: GoogleTypeLatLng): Self = StObject.set(x, "snappedPoint", value.asInstanceOf[js.Any])
    
    inline def setSnappedPointUndefined: Self = StObject.set(x, "snappedPoint", js.undefined)
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
