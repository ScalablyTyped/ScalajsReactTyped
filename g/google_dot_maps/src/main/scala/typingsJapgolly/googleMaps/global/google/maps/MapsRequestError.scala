package typingsJapgolly.googleMaps.global.google.maps

import typingsJapgolly.googleMaps.google.maps.places.PlacesServiceStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a request error from a web service (i.e. the equivalent of a 4xx
  * code in HTTP).
  */
@JSGlobal("google.maps.MapsRequestError")
@js.native
/**
  * Represents a request error from a web service (i.e. the equivalent of a
  * 4xx code in HTTP).
  */
open class MapsRequestError ()
  extends StObject
     with typingsJapgolly.googleMaps.google.maps.MapsNetworkError {
  
  /**
    * Identifies the type of error produced by the API.
    */
  /* CompleteClass */
  var code: typingsJapgolly.googleMaps.google.maps.DirectionsStatus | typingsJapgolly.googleMaps.google.maps.DistanceMatrixStatus | typingsJapgolly.googleMaps.google.maps.ElevationStatus | typingsJapgolly.googleMaps.google.maps.GeocoderStatus | typingsJapgolly.googleMaps.google.maps.MaxZoomStatus | PlacesServiceStatus | typingsJapgolly.googleMaps.google.maps.StreetViewStatus = js.native
  
  /**
    * Represents the network service that responded with the error.
    */
  /* CompleteClass */
  var endpoint: typingsJapgolly.googleMaps.google.maps.MapsNetworkErrorEndpoint = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
