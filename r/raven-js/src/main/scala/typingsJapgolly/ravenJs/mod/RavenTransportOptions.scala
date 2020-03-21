package typingsJapgolly.ravenJs.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.ravenJs.AnonSentryclient
import typingsJapgolly.ravenJs.ErrorrequestXMLHttpReques
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RavenTransportOptions extends js.Object {
  var auth: AnonSentryclient
  var data: js.Any
  var url: String
  def onError(error: ErrorrequestXMLHttpReques): Unit
  def onSuccess(): Unit
}

object RavenTransportOptions {
  @scala.inline
  def apply(
    auth: AnonSentryclient,
    data: js.Any,
    onError: ErrorrequestXMLHttpReques => Callback,
    onSuccess: Callback,
    url: String
  ): RavenTransportOptions = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: typingsJapgolly.ravenJs.ErrorrequestXMLHttpReques) => onError(t0).runNow()))
    __obj.updateDynamic("onSuccess")(onSuccess.toJsFn)
    __obj.asInstanceOf[RavenTransportOptions]
  }
}

