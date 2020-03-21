package typingsJapgolly.apostrophe

import japgolly.scalajs.react.Callback
import typingsJapgolly.apostrophe.mod.AposObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForm extends js.Object {
  def form(
    req: js.Any,
    data: js.Any,
    name: String,
    `object`: AposObject,
    field: js.Any,
    callback: js.Function0[_]
  ): Unit
  def string(
    req: js.Any,
    data: js.Any,
    name: String,
    `object`: AposObject,
    field: js.Any,
    callback: js.Function0[_]
  ): Unit
}

object AnonForm {
  @scala.inline
  def apply(
    form: (js.Any, js.Any, String, AposObject, js.Any, js.Function0[js.Any]) => Callback,
    string: (js.Any, js.Any, String, AposObject, js.Any, js.Function0[js.Any]) => Callback
  ): AnonForm = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("form")(js.Any.fromFunction6((t0: js.Any, t1: js.Any, t2: java.lang.String, t3: typingsJapgolly.apostrophe.mod.AposObject, t4: js.Any, t5: js.Function0[js.Any]) => form(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("string")(js.Any.fromFunction6((t0: js.Any, t1: js.Any, t2: java.lang.String, t3: typingsJapgolly.apostrophe.mod.AposObject, t4: js.Any, t5: js.Function0[js.Any]) => string(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.asInstanceOf[AnonForm]
  }
}

