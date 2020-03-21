package typingsJapgolly.reactMapGl.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TRANSITION_EVENTS extends js.Object

@JSImport("react-map-gl", "TRANSITION_EVENTS")
@js.native
object TRANSITION_EVENTS extends js.Object {
  @js.native
  sealed trait BREAK extends TRANSITION_EVENTS
  
  @js.native
  sealed trait IGNORE extends TRANSITION_EVENTS
  
  @js.native
  sealed trait SNAP_TO_END extends TRANSITION_EVENTS
  
  @js.native
  sealed trait UPDATE extends TRANSITION_EVENTS
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TRANSITION_EVENTS with Double] = js.native
  /* 1 */ @js.native
  object BREAK extends TopLevel[BREAK with Double]
  
  /* 3 */ @js.native
  object IGNORE extends TopLevel[IGNORE with Double]
  
  /* 2 */ @js.native
  object SNAP_TO_END extends TopLevel[SNAP_TO_END with Double]
  
  /* 4 */ @js.native
  object UPDATE extends TopLevel[UPDATE with Double]
  
}

