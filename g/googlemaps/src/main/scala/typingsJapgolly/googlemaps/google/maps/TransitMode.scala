package typingsJapgolly.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransitMode extends js.Object

@JSGlobal("google.maps.TransitMode")
@js.native
object TransitMode extends js.Object {
  @js.native
  sealed trait BUS extends TransitMode
  
  @js.native
  sealed trait RAIL extends TransitMode
  
  @js.native
  sealed trait SUBWAY extends TransitMode
  
  @js.native
  sealed trait TRAIN extends TransitMode
  
  @js.native
  sealed trait TRAM extends TransitMode
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TransitMode with String] = js.native
  /* "BUS" */ @js.native
  object BUS extends TopLevel[BUS with String]
  
  /* "RAIL" */ @js.native
  object RAIL extends TopLevel[RAIL with String]
  
  /* "SUBWAY" */ @js.native
  object SUBWAY extends TopLevel[SUBWAY with String]
  
  /* "TRAIN" */ @js.native
  object TRAIN extends TopLevel[TRAIN with String]
  
  /* "TRAM" */ @js.native
  object TRAM extends TopLevel[TRAM with String]
  
}

