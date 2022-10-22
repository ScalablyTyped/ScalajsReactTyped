package typingsJapgolly.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Geocoder response returned by the {@link google.maps.Geocoder}
  * containing the list of {@link google.maps.GeocoderResult}s.
  */
trait GeocoderResponse extends StObject {
  
  /**
    * The list of {@link google.maps.GeocoderResult}s.
    */
  var results: js.Array[GeocoderResult]
}
object GeocoderResponse {
  
  inline def apply(results: js.Array[GeocoderResult]): GeocoderResponse = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderResponse]
  }
  
  extension [Self <: GeocoderResponse](x: Self) {
    
    inline def setResults(value: js.Array[GeocoderResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: GeocoderResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
