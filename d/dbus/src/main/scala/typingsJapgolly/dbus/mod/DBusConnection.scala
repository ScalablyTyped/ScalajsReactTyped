package typingsJapgolly.dbus.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBusConnection extends js.Object {
  def disconnect(): Unit
  def getInterface(
    serviceName: String,
    objectPath: String,
    interfaceName: String,
    callback: js.Function2[/* err */ DBusError, /* iface */ DBusInterface, Unit]
  ): Unit
}

object DBusConnection {
  @scala.inline
  def apply(
    disconnect: Callback,
    getInterface: (String, String, String, js.Function2[/* err */ DBusError, /* iface */ DBusInterface, Unit]) => Callback
  ): DBusConnection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disconnect")(disconnect.toJsFn)
    __obj.updateDynamic("getInterface")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: js.Function2[
  /* err */ typingsJapgolly.dbus.mod.DBusError, 
  /* iface */ typingsJapgolly.dbus.mod.DBusInterface, 
  scala.Unit]) => getInterface(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[DBusConnection]
  }
}

