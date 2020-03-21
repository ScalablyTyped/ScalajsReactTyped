package typingsJapgolly.openfin.transportMod

import typingsJapgolly.openfin.eventsBaseMod.RuntimeEvent
import typingsJapgolly.openfin.openfinStrings.`process-desktop-event`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/transport/transport", "EventMessage")
@js.native
class EventMessage () extends Message[RuntimeEvent[String, String]] {
  @JSName("action")
  var action_EventMessage: `process-desktop-event` = js.native
}

