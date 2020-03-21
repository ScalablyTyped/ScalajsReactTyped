package typingsJapgolly.dbus.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.dbus.AnonGetter
import typingsJapgolly.dbus.AnonIn
import typingsJapgolly.dbus.AnonTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBusServiceInterface extends js.Object {
  def addMethod(
    method: String,
    opts: AnonIn,
    handler: js.Function3[
      /* name */ String, 
      /* quality */ js.Any, 
      /* callback */ js.Function1[/* res */ js.Any, Unit], 
      Unit
    ]
  ): Unit
  def addProperty(name: String, opts: AnonGetter): Unit
  def addSignal(name: String, opts: AnonTypes): Unit
  def emitSignal(name: String, values: js.Any*): Unit
  def update(): Unit
}

object DBusServiceInterface {
  @scala.inline
  def apply(
    addMethod: (String, AnonIn, js.Function3[
      /* name */ String, 
      /* quality */ js.Any, 
      /* callback */ js.Function1[/* res */ js.Any, Unit], 
      Unit
    ]) => Callback,
    addProperty: (String, AnonGetter) => Callback,
    addSignal: (String, AnonTypes) => Callback,
    emitSignal: (String, /* repeated */ js.Any) => Callback,
    update: Callback
  ): DBusServiceInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addMethod")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.dbus.AnonIn, t2: js.Function3[
  /* name */ java.lang.String, 
  /* quality */ js.Any, 
  /* callback */ js.Function1[/* res */ js.Any, scala.Unit], 
  scala.Unit]) => addMethod(t0, t1, t2).runNow()))
    __obj.updateDynamic("addProperty")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.dbus.AnonGetter) => addProperty(t0, t1).runNow()))
    __obj.updateDynamic("addSignal")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.dbus.AnonTypes) => addSignal(t0, t1).runNow()))
    __obj.updateDynamic("emitSignal")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => emitSignal(t0, t1).runNow()))
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[DBusServiceInterface]
  }
}

