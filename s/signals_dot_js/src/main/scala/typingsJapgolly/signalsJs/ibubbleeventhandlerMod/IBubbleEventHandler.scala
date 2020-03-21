package typingsJapgolly.signalsJs.ibubbleeventhandlerMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.signalsJs.ieventMod.IEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBubbleEventHandler extends js.Object {
  /**
    * Handler for event bubbling.
    * It's left to the IBubbleEventHandler to decide what to do with the event.
    * @param    event The event that bubbled up.
    * @return whether to continue bubbling this event
    */
  def onEventBubbled(event: IEvent): Boolean
}

object IBubbleEventHandler {
  @scala.inline
  def apply(onEventBubbled: IEvent => CallbackTo[Boolean]): IBubbleEventHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onEventBubbled")(js.Any.fromFunction1((t0: typingsJapgolly.signalsJs.ieventMod.IEvent) => onEventBubbled(t0).runNow()))
    __obj.asInstanceOf[IBubbleEventHandler]
  }
}

