package typingsJapgolly.xmlrpc.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadersProcessor extends js.Object {
  def composeRequest(headers: Headers): Unit
  def parseResponse(headers: Headers): Unit
}

object HeadersProcessor {
  @scala.inline
  def apply(composeRequest: Headers => Callback, parseResponse: Headers => Callback): HeadersProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("composeRequest")(js.Any.fromFunction1((t0: typingsJapgolly.xmlrpc.mod.Headers) => composeRequest(t0).runNow()))
    __obj.updateDynamic("parseResponse")(js.Any.fromFunction1((t0: typingsJapgolly.xmlrpc.mod.Headers) => parseResponse(t0).runNow()))
    __obj.asInstanceOf[HeadersProcessor]
  }
}

