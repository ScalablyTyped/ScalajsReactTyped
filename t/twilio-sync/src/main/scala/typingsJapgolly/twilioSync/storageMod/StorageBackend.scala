package typingsJapgolly.twilioSync.storageMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageBackend extends js.Object {
  def getItem(key: String): String
  def removeItem(key: String): Unit
  def setItem(key: String, value: String): Unit
}

object StorageBackend {
  @scala.inline
  def apply(
    getItem: String => CallbackTo[String],
    removeItem: String => Callback,
    setItem: (String, String) => Callback
  ): StorageBackend = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getItem")(js.Any.fromFunction1((t0: java.lang.String) => getItem(t0).runNow()))
    __obj.updateDynamic("removeItem")(js.Any.fromFunction1((t0: java.lang.String) => removeItem(t0).runNow()))
    __obj.updateDynamic("setItem")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setItem(t0, t1).runNow()))
    __obj.asInstanceOf[StorageBackend]
  }
}

