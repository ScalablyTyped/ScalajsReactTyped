package typingsJapgolly.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapTypeControlStyle extends js.Object

@JSGlobal("google.maps.MapTypeControlStyle")
@js.native
object MapTypeControlStyle extends js.Object {
  @js.native
  sealed trait DEFAULT extends MapTypeControlStyle
  
  @js.native
  sealed trait DROPDOWN_MENU extends MapTypeControlStyle
  
  @js.native
  sealed trait HORIZONTAL_BAR extends MapTypeControlStyle
  
  @js.native
  sealed trait INSET extends MapTypeControlStyle
  
  @js.native
  sealed trait INSET_LARGE extends MapTypeControlStyle
  
  /* 0 */ val DEFAULT: typingsJapgolly.googlemaps.google.maps.MapTypeControlStyle.DEFAULT with Double = js.native
  /* 2 */ val DROPDOWN_MENU: typingsJapgolly.googlemaps.google.maps.MapTypeControlStyle.DROPDOWN_MENU with Double = js.native
  /* 1 */ val HORIZONTAL_BAR: typingsJapgolly.googlemaps.google.maps.MapTypeControlStyle.HORIZONTAL_BAR with Double = js.native
  /* 3 */ val INSET: typingsJapgolly.googlemaps.google.maps.MapTypeControlStyle.INSET with Double = js.native
  /* 4 */ val INSET_LARGE: typingsJapgolly.googlemaps.google.maps.MapTypeControlStyle.INSET_LARGE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapTypeControlStyle with Double] = js.native
}

