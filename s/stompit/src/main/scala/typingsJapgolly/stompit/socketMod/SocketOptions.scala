package typingsJapgolly.stompit.socketMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketOptions extends js.Object {
  var commandHandlers: js.UndefOr[CommandHandlers] = js.undefined
  var heartbeat: js.UndefOr[Heartbeat] = js.undefined
  var heartbeatDelayMargin: js.UndefOr[Double] = js.undefined
  var heartbeatOutputMargin: js.UndefOr[Double] = js.undefined
  var outgoingFrameStream: js.UndefOr[typingsJapgolly.stompit.outgoingFrameStreamMod.^] = js.undefined
  var resetDisconnect: js.UndefOr[Boolean] = js.undefined
  var unknownCommand: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SocketOptions {
  @scala.inline
  def apply(
    commandHandlers: CommandHandlers = null,
    heartbeat: Heartbeat = null,
    heartbeatDelayMargin: Int | Double = null,
    heartbeatOutputMargin: Int | Double = null,
    outgoingFrameStream: typingsJapgolly.stompit.outgoingFrameStreamMod.^ = null,
    resetDisconnect: js.UndefOr[Boolean] = js.undefined,
    unknownCommand: js.UndefOr[Callback] = js.undefined
  ): SocketOptions = {
    val __obj = js.Dynamic.literal()
    if (commandHandlers != null) __obj.updateDynamic("commandHandlers")(commandHandlers.asInstanceOf[js.Any])
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat.asInstanceOf[js.Any])
    if (heartbeatDelayMargin != null) __obj.updateDynamic("heartbeatDelayMargin")(heartbeatDelayMargin.asInstanceOf[js.Any])
    if (heartbeatOutputMargin != null) __obj.updateDynamic("heartbeatOutputMargin")(heartbeatOutputMargin.asInstanceOf[js.Any])
    if (outgoingFrameStream != null) __obj.updateDynamic("outgoingFrameStream")(outgoingFrameStream.asInstanceOf[js.Any])
    if (!js.isUndefined(resetDisconnect)) __obj.updateDynamic("resetDisconnect")(resetDisconnect.asInstanceOf[js.Any])
    unknownCommand.foreach(p => __obj.updateDynamic("unknownCommand")(p.toJsFn))
    __obj.asInstanceOf[SocketOptions]
  }
}

