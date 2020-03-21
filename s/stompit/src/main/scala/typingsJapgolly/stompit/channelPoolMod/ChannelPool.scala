package typingsJapgolly.stompit.channelPoolMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelPool extends js.Object {
  def channel(
    callback: js.Function2[/* err */ js.Error | Null, /* channel */ typingsJapgolly.stompit.channelMod.^, Unit]
  ): Unit
  def close(): Unit
}

object ChannelPool {
  @scala.inline
  def apply(
    channel: js.Function2[/* err */ js.Error | Null, /* channel */ typingsJapgolly.stompit.channelMod.^, Unit] => Callback,
    close: Callback
  ): ChannelPool = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channel")(js.Any.fromFunction1((t0: js.Function2[
  /* err */ js.Error | scala.Null, 
  /* channel */ typingsJapgolly.stompit.channelMod.^, 
  scala.Unit]) => channel(t0).runNow()))
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[ChannelPool]
  }
}

