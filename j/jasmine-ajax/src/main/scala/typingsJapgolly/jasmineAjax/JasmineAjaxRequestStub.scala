package typingsJapgolly.jasmineAjax

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineAjaxRequestStub extends js.Object {
  var data: String
  var method: String
  var query: String
  var url: js.RegExp | String
  def andCallFunction(functionToCall: js.Function1[/* request */ JasmineAjaxRequest, Unit]): Unit
  def andError(options: JasmineAjaxRequestStubErrorOptions): Unit
  def andReturn(options: JasmineAjaxRequestStubReturnOptions): Unit
  def andTimeout(): Unit
  def matches(fullUrl: String, data: String, method: String): Boolean
}

object JasmineAjaxRequestStub {
  @scala.inline
  def apply(
    andCallFunction: js.Function1[/* request */ JasmineAjaxRequest, Unit] => Callback,
    andError: JasmineAjaxRequestStubErrorOptions => Callback,
    andReturn: JasmineAjaxRequestStubReturnOptions => Callback,
    andTimeout: Callback,
    data: String,
    matches: (String, String, String) => CallbackTo[Boolean],
    method: String,
    query: String,
    url: js.RegExp | String
  ): JasmineAjaxRequestStub = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("andCallFunction")(js.Any.fromFunction1((t0: js.Function1[/* request */ typingsJapgolly.jasmineAjax.JasmineAjaxRequest, scala.Unit]) => andCallFunction(t0).runNow()))
    __obj.updateDynamic("andError")(js.Any.fromFunction1((t0: typingsJapgolly.jasmineAjax.JasmineAjaxRequestStubErrorOptions) => andError(t0).runNow()))
    __obj.updateDynamic("andReturn")(js.Any.fromFunction1((t0: typingsJapgolly.jasmineAjax.JasmineAjaxRequestStubReturnOptions) => andReturn(t0).runNow()))
    __obj.updateDynamic("andTimeout")(andTimeout.toJsFn)
    __obj.updateDynamic("matches")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => matches(t0, t1, t2).runNow()))
    __obj.asInstanceOf[JasmineAjaxRequestStub]
  }
}

