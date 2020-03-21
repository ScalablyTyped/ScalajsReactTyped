package typingsJapgolly.jenkins

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  def cancel(n: Double, callback: js.Function1[/* err */ js.Error, Unit]): Unit
  def item(n: Double, callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit
  def list(callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit
}

object AnonCancel {
  @scala.inline
  def apply(
    cancel: (Double, js.Function1[/* err */ js.Error, Unit]) => Callback,
    item: (Double, js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]) => Callback,
    list: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit] => Callback
  ): AnonCancel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function1[/* err */ js.Error, scala.Unit]) => cancel(t0, t1).runNow()))
    __obj.updateDynamic("item")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function2[/* err */ js.Error, /* data */ js.Any, scala.Unit]) => item(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: js.Function2[/* err */ js.Error, /* data */ js.Any, scala.Unit]) => list(t0).runNow()))
    __obj.asInstanceOf[AnonCancel]
  }
}

