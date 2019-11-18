package typingsJapgolly.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapTypeId extends js.Object

/**
  * Identifiers for common MapTypes. Specify these by value, or by using the
  * constant's name. For example, 'satellite' or
  * google.maps.MapTypeId.SATELLITE.
  */
@JSGlobal("google.maps.MapTypeId")
@js.native
object MapTypeId extends js.Object {
  /** This map type displays a transparent layer of major streets on satellite images. */
  @js.native
  sealed trait HYBRID extends MapTypeId
  
  /** This map type displays a normal street map. */
  @js.native
  sealed trait ROADMAP extends MapTypeId
  
  /** This map type displays satellite images. */
  @js.native
  sealed trait SATELLITE extends MapTypeId
  
  /** This map type displays maps with physical features such as terrain and vegetation. */
  @js.native
  sealed trait TERRAIN extends MapTypeId
  
  /* "hybrid" */ val HYBRID: typingsJapgolly.googlemaps.google.maps.MapTypeId.HYBRID with String = js.native
  /* "roadmap" */ val ROADMAP: typingsJapgolly.googlemaps.google.maps.MapTypeId.ROADMAP with String = js.native
  /* "satellite" */ val SATELLITE: typingsJapgolly.googlemaps.google.maps.MapTypeId.SATELLITE with String = js.native
  /* "terrain" */ val TERRAIN: typingsJapgolly.googlemaps.google.maps.MapTypeId.TERRAIN with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MapTypeId with String] = js.native
}

