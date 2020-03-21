package typingsJapgolly.zipkinJavascriptOpentracing.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait zipkinJavascriptOpentracing extends js.Object {
  def extract(format: js.Any, carrier: js.Any): js.Any
  def inject(span: js.Any, format: js.Any, carrier: js.Any): Unit
  def startSpan(name: js.Any, args: js.Any*): js.Any
}

object zipkinJavascriptOpentracing {
  @scala.inline
  def apply(
    extract: (js.Any, js.Any) => CallbackTo[js.Any],
    inject: (js.Any, js.Any, js.Any) => Callback,
    startSpan: (js.Any, /* repeated */ js.Any) => CallbackTo[js.Any]
  ): zipkinJavascriptOpentracing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extract")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => extract(t0, t1).runNow()))
    __obj.updateDynamic("inject")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => inject(t0, t1, t2).runNow()))
    __obj.updateDynamic("startSpan")(js.Any.fromFunction2((t0: js.Any, t1: /* repeated */ js.Any) => startSpan(t0, t1).runNow()))
    __obj.asInstanceOf[zipkinJavascriptOpentracing]
  }
}

