package typingsJapgolly.dbus.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBusService extends js.Object {
  def createObject(path: String): DBusServiceObject
  def disconnect(): Unit
  def removeObject(service: DBusServiceObject): Unit
}

object DBusService {
  @scala.inline
  def apply(
    createObject: String => CallbackTo[DBusServiceObject],
    disconnect: Callback,
    removeObject: DBusServiceObject => Callback
  ): DBusService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createObject")(js.Any.fromFunction1((t0: java.lang.String) => createObject(t0).runNow()))
    __obj.updateDynamic("disconnect")(disconnect.toJsFn)
    __obj.updateDynamic("removeObject")(js.Any.fromFunction1((t0: typingsJapgolly.dbus.mod.DBusServiceObject) => removeObject(t0).runNow()))
    __obj.asInstanceOf[DBusService]
  }
}

