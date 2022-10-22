package typingsJapgolly.googleMaps.mod

import typingsJapgolly.googleMaps.googleMapsStrings.street_number
import typingsJapgolly.googleMaps.googleMapsStrings.timeout
import typingsJapgolly.googleMaps.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createClient(options: CreateClientOptions): GoogleMapsClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[GoogleMapsClient]
inline def createClient(options: CreateClientOptionsWithPromise): GoogleMapsClientWithPromise = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[GoogleMapsClientWithPromise]

type GoogleMapsClientEndpoint[Request, Response] = js.Function2[
/* query */ Request, 
/* callback */ js.UndefOr[ResponseCallback[Response]], 
RequestHandle[Response]]

type GoogleMapsClientEndpointWithPromise[Request, Response] = js.Function2[
/* query */ Request, 
/* callback */ js.UndefOr[ResponseCallback[Response]], 
RequestHandleWithPromise[Response]]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleMaps.mod.LatLngArray
  - typingsJapgolly.googleMaps.mod.LatLngString
  - typingsJapgolly.googleMaps.mod.LatLngLiteral
  - typingsJapgolly.googleMaps.mod.LatLngLiteralVerbose
*/
type LatLng = _LatLng | LatLngArray | LatLngString

type LatLngArray = js.Tuple2[Double, Double]

type LatLngString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleMaps.googleMapsStrings.geocode
  - typingsJapgolly.googleMaps.googleMapsStrings.address
  - typingsJapgolly.googleMaps.googleMapsStrings.establishment
  - / * (regions) * / java.lang.String
*/
type PlaceAutocompleteType = _PlaceAutocompleteType | (/* (regions) */ String)

type PlaceDetailsAddressComponentType = street_number

type PlacePhotoResponse = String

type ResponseCallback[T] = js.Function2[/* err */ timeout | ClientResponse[T], /* response */ ClientResponse[T], Unit]

type ReverseGeocodingResponse = GeocodingResponse[ReverseGeocodingResponseStatus]
