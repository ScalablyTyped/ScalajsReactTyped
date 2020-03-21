package typingsJapgolly.puppeteer.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionTransport extends js.Object {
  var onclose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onmessage: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  def close(): Unit
  def send(message: String): Unit
}

object ConnectionTransport {
  @scala.inline
  def apply(
    close: Callback,
    send: String => Callback,
    onclose: js.UndefOr[Callback] = js.undefined,
    onmessage: /* message */ String => Callback = null
  ): ConnectionTransport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: java.lang.String) => send(t0).runNow()))
    onclose.foreach(p => __obj.updateDynamic("onclose")(p.toJsFn))
    if (onmessage != null) __obj.updateDynamic("onmessage")(js.Any.fromFunction1((t0: /* message */ java.lang.String) => onmessage(t0).runNow()))
    __obj.asInstanceOf[ConnectionTransport]
  }
}

