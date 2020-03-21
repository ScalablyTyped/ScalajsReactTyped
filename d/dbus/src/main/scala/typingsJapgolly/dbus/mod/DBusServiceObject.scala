package typingsJapgolly.dbus.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBusServiceObject extends js.Object {
  def createInterface(name: String): DBusServiceInterface
}

object DBusServiceObject {
  @scala.inline
  def apply(createInterface: String => CallbackTo[DBusServiceInterface]): DBusServiceObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createInterface")(js.Any.fromFunction1((t0: java.lang.String) => createInterface(t0).runNow()))
    __obj.asInstanceOf[DBusServiceObject]
  }
}

