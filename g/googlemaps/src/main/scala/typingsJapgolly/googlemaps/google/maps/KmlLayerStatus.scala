package typingsJapgolly.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KmlLayerStatus extends js.Object

@JSGlobal("google.maps.KmlLayerStatus")
@js.native
object KmlLayerStatus extends js.Object {
  @js.native
  sealed trait DOCUMENT_NOT_FOUND extends KmlLayerStatus
  
  @js.native
  sealed trait DOCUMENT_TOO_LARGE extends KmlLayerStatus
  
  @js.native
  sealed trait FETCH_ERROR extends KmlLayerStatus
  
  @js.native
  sealed trait INVALID_DOCUMENT extends KmlLayerStatus
  
  @js.native
  sealed trait INVALID_REQUEST extends KmlLayerStatus
  
  @js.native
  sealed trait LIMITS_EXCEEDED extends KmlLayerStatus
  
  @js.native
  sealed trait OK extends KmlLayerStatus
  
  @js.native
  sealed trait TIMED_OUT extends KmlLayerStatus
  
  @js.native
  sealed trait UNKNOWN extends KmlLayerStatus
  
  /* "DOCUMENT_NOT_FOUND" */ val DOCUMENT_NOT_FOUND: typingsJapgolly.googlemaps.google.maps.KmlLayerStatus.DOCUMENT_NOT_FOUND with String = js.native
  /* "DOCUMENT_TOO_LARGE" */ val DOCUMENT_TOO_LARGE: typingsJapgolly.googlemaps.google.maps.KmlLayerStatus.DOCUMENT_TOO_LARGE with String = js.native
  /* "FETCH_ERROR" */ val FETCH_ERROR: typingsJapgolly.googlemaps.google.maps.KmlLayerStatus.FETCH_ERROR with String = js.native
  /* "INVALID_DOCUMENT" */ val INVALID_DOCUMENT: typingsJapgolly.googlemaps.google.maps.KmlLayerStatus.INVALID_DOCUMENT with String = js.native
  /* "INVALID_REQUEST" */ val INVALID_REQUEST: typingsJapgolly.googlemaps.google.maps.KmlLayerStatus.INVALID_REQUEST with String = js.native
  /* "LIMITS_EXCEEDED" */ val LIMITS_EXCEEDED: typingsJapgolly.googlemaps.google.maps.KmlLayerStatus.LIMITS_EXCEEDED with String = js.native
  /* "OK" */ val OK: typingsJapgolly.googlemaps.google.maps.KmlLayerStatus.OK with String = js.native
  /* "TIMED_OUT" */ val TIMED_OUT: typingsJapgolly.googlemaps.google.maps.KmlLayerStatus.TIMED_OUT with String = js.native
  /* "UNKNOWN" */ val UNKNOWN: typingsJapgolly.googlemaps.google.maps.KmlLayerStatus.UNKNOWN with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[KmlLayerStatus with String] = js.native
}

