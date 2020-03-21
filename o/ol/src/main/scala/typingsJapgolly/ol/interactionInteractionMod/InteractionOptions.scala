package typingsJapgolly.ol.interactionInteractionMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionOptions extends js.Object {
  def handleEvent(p0: typingsJapgolly.ol.mapBrowserEventMod.default): Boolean
}

object InteractionOptions {
  @scala.inline
  def apply(handleEvent: typingsJapgolly.ol.mapBrowserEventMod.default => CallbackTo[Boolean]): InteractionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleEvent")(js.Any.fromFunction1((t0: typingsJapgolly.ol.mapBrowserEventMod.default) => handleEvent(t0).runNow()))
    __obj.asInstanceOf[InteractionOptions]
  }
}

