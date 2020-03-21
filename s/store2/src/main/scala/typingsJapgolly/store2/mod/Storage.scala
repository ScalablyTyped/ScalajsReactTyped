package typingsJapgolly.store2.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage extends js.Object {
  var length: Double
  def clear(): Unit
  def getItem(key: String): String
  def key(index: Double): String
  def removeItem(key: String): Unit
  def setItem(key: String, value: String): Unit
}

object Storage {
  @scala.inline
  def apply(
    clear: Callback,
    getItem: String => CallbackTo[String],
    key: Double => CallbackTo[String],
    length: Double,
    removeItem: String => Callback,
    setItem: (String, String) => Callback
  ): Storage = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("getItem")(js.Any.fromFunction1((t0: java.lang.String) => getItem(t0).runNow()))
    __obj.updateDynamic("key")(js.Any.fromFunction1((t0: scala.Double) => key(t0).runNow()))
    __obj.updateDynamic("removeItem")(js.Any.fromFunction1((t0: java.lang.String) => removeItem(t0).runNow()))
    __obj.updateDynamic("setItem")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setItem(t0, t1).runNow()))
    __obj.asInstanceOf[Storage]
  }
}

