package typingsJapgolly.stompit.channelMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSubscription extends js.Object {
  def cancel(): Unit
  def unsubscribe(): Unit
}

object ChannelSubscription {
  @scala.inline
  def apply(cancel: Callback, unsubscribe: Callback): ChannelSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("unsubscribe")(unsubscribe.toJsFn)
    __obj.asInstanceOf[ChannelSubscription]
  }
}

