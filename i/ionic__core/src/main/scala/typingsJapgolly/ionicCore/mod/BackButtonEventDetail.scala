package typingsJapgolly.ionicCore.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackButtonEventDetail extends js.Object {
  def register(priority: Double, handler: js.Function0[js.Promise[_] | Unit]): Unit
}

object BackButtonEventDetail {
  @scala.inline
  def apply(register: (Double, js.Function0[js.Promise[js.Any] | Unit]) => Callback): BackButtonEventDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("register")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function0[js.Promise[js.Any] | scala.Unit]) => register(t0, t1).runNow()))
    __obj.asInstanceOf[BackButtonEventDetail]
  }
}

