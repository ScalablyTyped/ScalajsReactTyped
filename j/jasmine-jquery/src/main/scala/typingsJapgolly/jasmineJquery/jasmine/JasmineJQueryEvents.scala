package typingsJapgolly.jasmineJquery.jasmine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jasmine.jasmine.Env
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineJQueryEvents extends js.Object {
  def args(selector: String, eventName: String): js.Any
  def cleanUp(): Unit
  def spyOn(selector: String, eventName: String): JQueryEventSpy
  def wasPrevented(selector: String, eventName: String): Boolean
  def wasStopped(selector: String, eventName: String): Boolean
  def wasTriggered(selector: String, eventName: String): Boolean
  def wasTriggeredWith(selector: String, eventName: String, expectedArgs: js.Any, env: Env): Boolean
}

object JasmineJQueryEvents {
  @scala.inline
  def apply(
    args: (String, String) => CallbackTo[js.Any],
    cleanUp: Callback,
    spyOn: (String, String) => CallbackTo[JQueryEventSpy],
    wasPrevented: (String, String) => CallbackTo[Boolean],
    wasStopped: (String, String) => CallbackTo[Boolean],
    wasTriggered: (String, String) => CallbackTo[Boolean],
    wasTriggeredWith: (String, String, js.Any, Env) => CallbackTo[Boolean]
  ): JasmineJQueryEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => args(t0, t1).runNow()))
    __obj.updateDynamic("cleanUp")(cleanUp.toJsFn)
    __obj.updateDynamic("spyOn")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => spyOn(t0, t1).runNow()))
    __obj.updateDynamic("wasPrevented")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => wasPrevented(t0, t1).runNow()))
    __obj.updateDynamic("wasStopped")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => wasStopped(t0, t1).runNow()))
    __obj.updateDynamic("wasTriggered")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => wasTriggered(t0, t1).runNow()))
    __obj.updateDynamic("wasTriggeredWith")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: js.Any, t3: typingsJapgolly.jasmine.jasmine.Env) => wasTriggeredWith(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[JasmineJQueryEvents]
  }
}

