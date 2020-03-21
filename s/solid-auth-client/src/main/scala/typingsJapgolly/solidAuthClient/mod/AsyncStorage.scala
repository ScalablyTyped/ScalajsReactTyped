package typingsJapgolly.solidAuthClient.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncStorage extends js.Object {
  def getItem(key: String): js.Promise[js.UndefOr[String]]
  def removeItem(key: String): js.Promise[Unit]
  def setItem(key: String, value: String): js.Promise[Unit]
}

object AsyncStorage {
  @scala.inline
  def apply(
    getItem: String => CallbackTo[js.Promise[js.UndefOr[String]]],
    removeItem: String => CallbackTo[js.Promise[Unit]],
    setItem: (String, String) => CallbackTo[js.Promise[Unit]]
  ): AsyncStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getItem")(js.Any.fromFunction1((t0: java.lang.String) => getItem(t0).runNow()))
    __obj.updateDynamic("removeItem")(js.Any.fromFunction1((t0: java.lang.String) => removeItem(t0).runNow()))
    __obj.updateDynamic("setItem")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setItem(t0, t1).runNow()))
    __obj.asInstanceOf[AsyncStorage]
  }
}

