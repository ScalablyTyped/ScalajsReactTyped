package typingsJapgolly.openlayers.mod.olx.interaction

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openlayers.mod.MapBrowserEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with config options for interactions.
  */
trait InteractionOptions extends js.Object {
  def handleEvent(event: MapBrowserEvent): Boolean
}

object InteractionOptions {
  @scala.inline
  def apply(handleEvent: MapBrowserEvent => CallbackTo[Boolean]): InteractionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleEvent")(js.Any.fromFunction1((t0: typingsJapgolly.openlayers.mod.MapBrowserEvent) => handleEvent(t0).runNow()))
    __obj.asInstanceOf[InteractionOptions]
  }
}

