package typingsJapgolly.naja

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.naja.mod.SnippetUpdateEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandleEvent extends js.Object {
  def handleEvent(event: SnippetUpdateEvent): js.Promise[Unit] | Unit
}

object AnonHandleEvent {
  @scala.inline
  def apply(handleEvent: SnippetUpdateEvent => CallbackTo[js.Promise[Unit] | Unit]): AnonHandleEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleEvent")(js.Any.fromFunction1((t0: typingsJapgolly.naja.mod.SnippetUpdateEvent) => handleEvent(t0).runNow()))
    __obj.asInstanceOf[AnonHandleEvent]
  }
}

