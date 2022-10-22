package typingsJapgolly.googleMaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status returned by the <code>Geocoder</code> on the completion of a
  * call to <code>geocode()</code>. Specify these by value, or by using the
  * constant&#39;s name. For example, <code>'OK'</code> or
  * <code>google.maps.GeocoderStatus.OK</code>.
  */
@JSGlobal("google.maps.GeocoderStatus")
@js.native
object GeocoderStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.googleMaps.google.maps.GeocoderStatus & String] = js.native
  
  /* "ERROR" */ val ERROR: typingsJapgolly.googleMaps.google.maps.GeocoderStatus.ERROR & String = js.native
  
  /* "INVALID_REQUEST" */ val INVALID_REQUEST: typingsJapgolly.googleMaps.google.maps.GeocoderStatus.INVALID_REQUEST & String = js.native
  
  /* "OK" */ val OK: typingsJapgolly.googleMaps.google.maps.GeocoderStatus.OK & String = js.native
  
  /* "OVER_QUERY_LIMIT" */ val OVER_QUERY_LIMIT: typingsJapgolly.googleMaps.google.maps.GeocoderStatus.OVER_QUERY_LIMIT & String = js.native
  
  /* "REQUEST_DENIED" */ val REQUEST_DENIED: typingsJapgolly.googleMaps.google.maps.GeocoderStatus.REQUEST_DENIED & String = js.native
  
  /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typingsJapgolly.googleMaps.google.maps.GeocoderStatus.UNKNOWN_ERROR & String = js.native
  
  /* "ZERO_RESULTS" */ val ZERO_RESULTS: typingsJapgolly.googleMaps.google.maps.GeocoderStatus.ZERO_RESULTS & String = js.native
}
