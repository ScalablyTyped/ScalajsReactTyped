package typingsJapgolly.googleMaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status returned by the <code>ElevationService</code> upon completion of
  * an elevation request. Specify these by value, or by using the
  * constant&#39;s name. For example, <code>'OK'</code> or
  * <code>google.maps.ElevationStatus.OK</code>.
  */
@JSGlobal("google.maps.ElevationStatus")
@js.native
object ElevationStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.googleMaps.google.maps.ElevationStatus & String] = js.native
  
  /* "INVALID_REQUEST" */ val INVALID_REQUEST: typingsJapgolly.googleMaps.google.maps.ElevationStatus.INVALID_REQUEST & String = js.native
  
  /* "OK" */ val OK: typingsJapgolly.googleMaps.google.maps.ElevationStatus.OK & String = js.native
  
  /* "OVER_QUERY_LIMIT" */ val OVER_QUERY_LIMIT: typingsJapgolly.googleMaps.google.maps.ElevationStatus.OVER_QUERY_LIMIT & String = js.native
  
  /* "REQUEST_DENIED" */ val REQUEST_DENIED: typingsJapgolly.googleMaps.google.maps.ElevationStatus.REQUEST_DENIED & String = js.native
  
  /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typingsJapgolly.googleMaps.google.maps.ElevationStatus.UNKNOWN_ERROR & String = js.native
}
