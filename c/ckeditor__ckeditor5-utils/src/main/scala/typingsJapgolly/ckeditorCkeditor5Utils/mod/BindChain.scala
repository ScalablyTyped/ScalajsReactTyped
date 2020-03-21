package typingsJapgolly.ckeditorCkeditor5Utils.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindChain extends js.Object {
  def to(observable: Observable, bindProperties: (Observable | String | js.Function)*): Unit
  def toMany(observable: js.Array[Observable], bindProperties: (Observable | String | js.Function)*): Unit
}

object BindChain {
  @scala.inline
  def apply(
    to: (Observable, /* repeated */ Observable | String | js.Function) => Callback,
    toMany: (js.Array[Observable], /* repeated */ Observable | String | js.Function) => Callback
  ): BindChain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("to")(js.Any.fromFunction2((t0: typingsJapgolly.ckeditorCkeditor5Utils.mod.Observable, t1: /* repeated */ typingsJapgolly.ckeditorCkeditor5Utils.mod.Observable | java.lang.String | js.Function) => to(t0, t1).runNow()))
    __obj.updateDynamic("toMany")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.ckeditorCkeditor5Utils.mod.Observable], t1: /* repeated */ typingsJapgolly.ckeditorCkeditor5Utils.mod.Observable | java.lang.String | js.Function) => toMany(t0, t1).runNow()))
    __obj.asInstanceOf[BindChain]
  }
}

