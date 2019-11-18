package typingsJapgolly.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DistanceMatrixElementStatus extends js.Object

@JSGlobal("google.maps.DistanceMatrixElementStatus")
@js.native
object DistanceMatrixElementStatus extends js.Object {
  @js.native
  sealed trait NOT_FOUND extends DistanceMatrixElementStatus
  
  @js.native
  sealed trait OK extends DistanceMatrixElementStatus
  
  @js.native
  sealed trait ZERO_RESULTS extends DistanceMatrixElementStatus
  
  /* "NOT_FOUND" */ val NOT_FOUND: typingsJapgolly.googlemaps.google.maps.DistanceMatrixElementStatus.NOT_FOUND with String = js.native
  /* "OK" */ val OK: typingsJapgolly.googlemaps.google.maps.DistanceMatrixElementStatus.OK with String = js.native
  /* "ZERO_RESULTS" */ val ZERO_RESULTS: typingsJapgolly.googlemaps.google.maps.DistanceMatrixElementStatus.ZERO_RESULTS with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DistanceMatrixElementStatus with String] = js.native
}

