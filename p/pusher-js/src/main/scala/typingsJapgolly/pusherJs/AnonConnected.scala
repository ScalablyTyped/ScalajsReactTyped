package typingsJapgolly.pusherJs

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnected extends js.Object {
  def backoff(): Unit
  def connected(handshake: js.Any): Unit
  def refused(): Unit
  def retry(): Unit
  def ssl_only(): Unit
}

object AnonConnected {
  @scala.inline
  def apply(
    backoff: Callback,
    connected: js.Any => Callback,
    refused: Callback,
    retry: Callback,
    ssl_only: Callback
  ): AnonConnected = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backoff")(backoff.toJsFn)
    __obj.updateDynamic("connected")(js.Any.fromFunction1((t0: js.Any) => connected(t0).runNow()))
    __obj.updateDynamic("refused")(refused.toJsFn)
    __obj.updateDynamic("retry")(retry.toJsFn)
    __obj.updateDynamic("ssl_only")(ssl_only.toJsFn)
    __obj.asInstanceOf[AnonConnected]
  }
}

