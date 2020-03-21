package typingsJapgolly.xmlrpc.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xmlrpc.AnonProcessors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var cookies: js.UndefOr[Cookies] = js.undefined
  var headersProcessors: AnonProcessors
  var isSecure: Boolean
  var options: ClientOptions
  def getCookie(name: String): String
  def methodCall(
    method: String,
    params: js.Array[_],
    callback: js.Function2[/* error */ js.Object, /* value */ js.Any, Unit]
  ): Unit
  def setCookie(name: String, value: String): this.type
}

object Client {
  @scala.inline
  def apply(
    getCookie: String => CallbackTo[String],
    headersProcessors: AnonProcessors,
    isSecure: Boolean,
    methodCall: (String, js.Array[js.Any], js.Function2[/* error */ js.Object, /* value */ js.Any, Unit]) => Callback,
    options: ClientOptions,
    setCookie: (String, String) => CallbackTo[Client],
    cookies: Cookies = null
  ): Client = {
    val __obj = js.Dynamic.literal(headersProcessors = headersProcessors.asInstanceOf[js.Any], isSecure = isSecure.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("getCookie")(js.Any.fromFunction1((t0: java.lang.String) => getCookie(t0).runNow()))
    __obj.updateDynamic("methodCall")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Array[js.Any], t2: js.Function2[/* error */ js.Object, /* value */ js.Any, scala.Unit]) => methodCall(t0, t1, t2).runNow()))
    __obj.updateDynamic("setCookie")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setCookie(t0, t1).runNow()))
    if (cookies != null) __obj.updateDynamic("cookies")(cookies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
}

