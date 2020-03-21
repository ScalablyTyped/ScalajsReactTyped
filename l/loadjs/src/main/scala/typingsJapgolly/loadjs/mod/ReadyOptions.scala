package typingsJapgolly.loadjs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadyOptions extends js.Object {
  var error: js.UndefOr[js.Function1[/* depsNotFound */ js.Array[String], Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ReadyOptions {
  @scala.inline
  def apply(
    error: /* depsNotFound */ js.Array[String] => Callback = null,
    success: js.UndefOr[Callback] = js.undefined
  ): ReadyOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* depsNotFound */ js.Array[java.lang.String]) => error(t0).runNow()))
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[ReadyOptions]
  }
}

