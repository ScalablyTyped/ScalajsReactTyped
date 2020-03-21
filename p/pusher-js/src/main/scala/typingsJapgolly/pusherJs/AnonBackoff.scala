package typingsJapgolly.pusherJs

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackoff extends js.Object {
  def backoff(): Unit
  def refused(): Unit
  def retry(): Unit
  def ssl_only(): Unit
}

object AnonBackoff {
  @scala.inline
  def apply(backoff: Callback, refused: Callback, retry: Callback, ssl_only: Callback): AnonBackoff = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backoff")(backoff.toJsFn)
    __obj.updateDynamic("refused")(refused.toJsFn)
    __obj.updateDynamic("retry")(retry.toJsFn)
    __obj.updateDynamic("ssl_only")(ssl_only.toJsFn)
    __obj.asInstanceOf[AnonBackoff]
  }
}

