package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This WebVR API interface represents represents the event object of WebVR-related events (see the list of WebVR window extensions). */
@js.native
trait VRDisplayEvent extends Event_ {
  val display: VRDisplay = js.native
  val reason: VRDisplayEventReason | Null = js.native
}

@JSGlobal("VRDisplayEvent")
@js.native
object VRDisplayEvent
  extends Instantiable2[/* type */ java.lang.String, /* eventInitDict */ VRDisplayEventInit, VRDisplayEvent]

