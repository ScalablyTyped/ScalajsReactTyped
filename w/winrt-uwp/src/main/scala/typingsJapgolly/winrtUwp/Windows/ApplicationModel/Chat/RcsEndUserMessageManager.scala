package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.messageavailablechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for handling message events. */
@JSGlobal("Windows.ApplicationModel.Chat.RcsEndUserMessageManager")
@js.native
abstract class RcsEndUserMessageManager () extends js.Object {
  /** Occurs when a new message is available. */
  @JSName("onmessageavailablechanged")
  var onmessageavailablechanged_Original: TypedEventHandler[RcsEndUserMessageManager, RcsEndUserMessageAvailableEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageavailablechanged(
    `type`: messageavailablechanged,
    listener: TypedEventHandler[RcsEndUserMessageManager, RcsEndUserMessageAvailableEventArgs]
  ): Unit = js.native
  /** Occurs when a new message is available. */
  def onmessageavailablechanged(ev: RcsEndUserMessageAvailableEventArgs with WinRTEvent[RcsEndUserMessageManager]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageavailablechanged(
    `type`: messageavailablechanged,
    listener: TypedEventHandler[RcsEndUserMessageManager, RcsEndUserMessageAvailableEventArgs]
  ): Unit = js.native
}

