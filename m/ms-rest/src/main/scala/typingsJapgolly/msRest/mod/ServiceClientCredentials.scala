package typingsJapgolly.msRest.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceClientCredentials extends js.Object {
  /**
    * Signs a request with the Authentication header.
    *
    * @param {WebResource} The WebResource to be signed.
    * @param {function(error)}  callback  The callback function.
    */
  def signRequest(webResource: WebResource, callback: js.Function1[/* err */ js.Error, Unit]): Unit
}

object ServiceClientCredentials {
  @scala.inline
  def apply(signRequest: (WebResource, js.Function1[/* err */ js.Error, Unit]) => Callback): ServiceClientCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("signRequest")(js.Any.fromFunction2((t0: typingsJapgolly.msRest.mod.WebResource, t1: js.Function1[/* err */ js.Error, scala.Unit]) => signRequest(t0, t1).runNow()))
    __obj.asInstanceOf[ServiceClientCredentials]
  }
}

