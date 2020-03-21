package typingsJapgolly.dbus

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetter extends js.Object {
  var setter: js.UndefOr[js.Function2[/* value */ js.Any, /* done */ js.Function0[Unit], Unit]] = js.undefined
  var `type`: String
  def getter(cb: js.Function1[/* val */ String, Unit]): Unit
}

object AnonGetter {
  @scala.inline
  def apply(
    getter: js.Function1[/* val */ String, Unit] => Callback,
    `type`: String,
    setter: (/* value */ js.Any, /* done */ js.Function0[Unit]) => Callback = null
  ): AnonGetter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getter")(js.Any.fromFunction1((t0: js.Function1[/* val */ java.lang.String, scala.Unit]) => getter(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (setter != null) __obj.updateDynamic("setter")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: /* done */ js.Function0[scala.Unit]) => setter(t0, t1).runNow()))
    __obj.asInstanceOf[AnonGetter]
  }
}

