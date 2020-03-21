package typingsJapgolly.googleMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GoogleMapsClientEndpoint[Request, Response] = js.Function2[
    /* query */ Request, 
    /* callback */ js.UndefOr[typingsJapgolly.googleMaps.mod.ResponseCallback[Response]], 
    typingsJapgolly.googleMaps.mod.RequestHandle[Response]
  ]
  type GoogleMapsClientEndpointWithPromise[Request, Response] = js.Function2[
    /* query */ Request, 
    /* callback */ js.UndefOr[typingsJapgolly.googleMaps.mod.ResponseCallback[Response]], 
    typingsJapgolly.googleMaps.mod.RequestHandleWithPromise[Response]
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.googleMaps.mod.LatLngArray
    - typingsJapgolly.googleMaps.mod.LatLngString
    - typingsJapgolly.googleMaps.mod.LatLngLiteral
    - typingsJapgolly.googleMaps.mod.LatLngLiteralVerbose
  */
  type LatLng = typingsJapgolly.googleMaps.mod._LatLng | typingsJapgolly.googleMaps.mod.LatLngArray | typingsJapgolly.googleMaps.mod.LatLngString
  type LatLngArray = js.Tuple2[scala.Double, scala.Double]
  type LatLngString = java.lang.String
  type PlacePhotoResponse = java.lang.String
  type ResponseCallback[T] = js.Function2[
    /* err */ typingsJapgolly.googleMaps.googleMapsStrings.timeout | typingsJapgolly.googleMaps.mod.ClientResponse[T], 
    /* response */ typingsJapgolly.googleMaps.mod.ClientResponse[T], 
    scala.Unit
  ]
  type ReverseGeocodingResponse = typingsJapgolly.googleMaps.mod.GeocodingResponse[typingsJapgolly.googleMaps.mod.ReverseGeocodingResponseStatus]
}
