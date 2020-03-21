package typingsJapgolly.sharepoint.BrowserStorage

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Available only in SharePoint Online*/
trait CachedStorage extends js.Object {
  var length: Double
  def clead(): Unit
  def getItem(key: String): String
  def removeItem(key: String): Unit
  def setItem(key: String, value: String): Unit
}

object CachedStorage {
  @scala.inline
  def apply(
    clead: Callback,
    getItem: String => CallbackTo[String],
    length: Double,
    removeItem: String => Callback,
    setItem: (String, String) => Callback
  ): CachedStorage = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("clead")(clead.toJsFn)
    __obj.updateDynamic("getItem")(js.Any.fromFunction1((t0: java.lang.String) => getItem(t0).runNow()))
    __obj.updateDynamic("removeItem")(js.Any.fromFunction1((t0: java.lang.String) => removeItem(t0).runNow()))
    __obj.updateDynamic("setItem")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setItem(t0, t1).runNow()))
    __obj.asInstanceOf[CachedStorage]
  }
}

