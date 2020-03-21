package typingsJapgolly.uploadcare

import japgolly.scalajs.react.Callback
import typingsJapgolly.uploadcare.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemove extends js.Object {
  def remove(uuid: String, callback: js.Function2[/* err */ js.Error, /* res */ File, Unit]): Unit
  def store(uuid: String, callback: js.Function2[/* err */ js.Error, /* res */ File, Unit]): Unit
}

object AnonRemove {
  @scala.inline
  def apply(
    remove: (String, js.Function2[/* err */ js.Error, /* res */ File, Unit]) => Callback,
    store: (String, js.Function2[/* err */ js.Error, /* res */ File, Unit]) => Callback
  ): AnonRemove = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[/* err */ js.Error, /* res */ typingsJapgolly.uploadcare.mod.File, scala.Unit]) => remove(t0, t1).runNow()))
    __obj.updateDynamic("store")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[/* err */ js.Error, /* res */ typingsJapgolly.uploadcare.mod.File, scala.Unit]) => store(t0, t1).runNow()))
    __obj.asInstanceOf[AnonRemove]
  }
}

