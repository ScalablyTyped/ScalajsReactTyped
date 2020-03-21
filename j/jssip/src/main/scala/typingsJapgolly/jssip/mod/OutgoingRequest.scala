package typingsJapgolly.jssip.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingRequest extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var call_id: String
  var cseq: Double
  var from: NameAddrHeader
  var method: String
  var ruri: URI
  var to: NameAddrHeader
  def getHeader(name: String): String
  def getHeaders(name: String): js.Array[String]
  def hasHeader(name: String): Boolean
  def setHeader(name: String, value: String): Unit
}

object OutgoingRequest {
  @scala.inline
  def apply(
    call_id: String,
    cseq: Double,
    from: NameAddrHeader,
    getHeader: String => CallbackTo[String],
    getHeaders: String => CallbackTo[js.Array[String]],
    hasHeader: String => CallbackTo[Boolean],
    method: String,
    ruri: URI,
    setHeader: (String, String) => Callback,
    to: NameAddrHeader,
    body: String = null
  ): OutgoingRequest = {
    val __obj = js.Dynamic.literal(call_id = call_id.asInstanceOf[js.Any], cseq = cseq.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], ruri = ruri.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("getHeader")(js.Any.fromFunction1((t0: java.lang.String) => getHeader(t0).runNow()))
    __obj.updateDynamic("getHeaders")(js.Any.fromFunction1((t0: java.lang.String) => getHeaders(t0).runNow()))
    __obj.updateDynamic("hasHeader")(js.Any.fromFunction1((t0: java.lang.String) => hasHeader(t0).runNow()))
    __obj.updateDynamic("setHeader")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setHeader(t0, t1).runNow()))
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingRequest]
  }
}

