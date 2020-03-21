package typingsJapgolly.amazonCognitoAuthJs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDomainRequest extends js.Object {
  val responseText: String
  var timeout: Double
  def abort(): Unit
  def onerror(): Unit
  def onload(): Unit
  def onprogress(): Unit
  def ontimeout(): Unit
  def open(method: String, url: String): Unit
  def send(data: String): Unit
}

object XDomainRequest {
  @scala.inline
  def apply(
    abort: Callback,
    onerror: Callback,
    onload: Callback,
    onprogress: Callback,
    ontimeout: Callback,
    open: (String, String) => Callback,
    responseText: String,
    send: String => Callback,
    timeout: Double
  ): XDomainRequest = {
    val __obj = js.Dynamic.literal(responseText = responseText.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.updateDynamic("onerror")(onerror.toJsFn)
    __obj.updateDynamic("onload")(onload.toJsFn)
    __obj.updateDynamic("onprogress")(onprogress.toJsFn)
    __obj.updateDynamic("ontimeout")(ontimeout.toJsFn)
    __obj.updateDynamic("open")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => open(t0, t1).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: java.lang.String) => send(t0).runNow()))
    __obj.asInstanceOf[XDomainRequest]
  }
}

