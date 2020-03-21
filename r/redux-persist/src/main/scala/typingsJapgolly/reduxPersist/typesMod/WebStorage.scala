package typingsJapgolly.reduxPersist.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebStorage extends Storage {
  /**
    * @desc Fetches key and returns item in a promise.
    */
  def getItem(key: String): js.Promise[String | Null]
  /**
    * @desc Removes value for key.
    */
  def removeItem(key: String): js.Promise[Unit]
  /**
    * @desc Sets value for key and returns item in a promise.
    */
  def setItem(key: String, item: String): js.Promise[Unit]
}

object WebStorage {
  @scala.inline
  def apply(
    getItem: String => CallbackTo[js.Promise[String | Null]],
    removeItem: String => CallbackTo[js.Promise[Unit]],
    setItem: (String, String) => CallbackTo[js.Promise[Unit]]
  ): WebStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getItem")(js.Any.fromFunction1((t0: java.lang.String) => getItem(t0).runNow()))
    __obj.updateDynamic("removeItem")(js.Any.fromFunction1((t0: java.lang.String) => removeItem(t0).runNow()))
    __obj.updateDynamic("setItem")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setItem(t0, t1).runNow()))
    __obj.asInstanceOf[WebStorage]
  }
}

