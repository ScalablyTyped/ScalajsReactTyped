package typingsJapgolly.googleMaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status returned by the <code>DirectionsService</code> on the completion
  * of a call to <code>route()</code>. Specify these by value, or by using the
  * constant&#39;s name. For example, <code>'OK'</code> or
  * <code>google.maps.DirectionsStatus.OK</code>.
  */
@JSGlobal("google.maps.DirectionsStatus")
@js.native
object DirectionsStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.googleMaps.google.maps.DirectionsStatus & String] = js.native
  
  /* "INVALID_REQUEST" */ val INVALID_REQUEST: typingsJapgolly.googleMaps.google.maps.DirectionsStatus.INVALID_REQUEST & String = js.native
  
  /* "MAX_WAYPOINTS_EXCEEDED" */ val MAX_WAYPOINTS_EXCEEDED: typingsJapgolly.googleMaps.google.maps.DirectionsStatus.MAX_WAYPOINTS_EXCEEDED & String = js.native
  
  /* "NOT_FOUND" */ val NOT_FOUND: typingsJapgolly.googleMaps.google.maps.DirectionsStatus.NOT_FOUND & String = js.native
  
  /* "OK" */ val OK: typingsJapgolly.googleMaps.google.maps.DirectionsStatus.OK & String = js.native
  
  /* "OVER_QUERY_LIMIT" */ val OVER_QUERY_LIMIT: typingsJapgolly.googleMaps.google.maps.DirectionsStatus.OVER_QUERY_LIMIT & String = js.native
  
  /* "REQUEST_DENIED" */ val REQUEST_DENIED: typingsJapgolly.googleMaps.google.maps.DirectionsStatus.REQUEST_DENIED & String = js.native
  
  /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typingsJapgolly.googleMaps.google.maps.DirectionsStatus.UNKNOWN_ERROR & String = js.native
  
  /* "ZERO_RESULTS" */ val ZERO_RESULTS: typingsJapgolly.googleMaps.google.maps.DirectionsStatus.ZERO_RESULTS & String = js.native
}
