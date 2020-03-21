package typingsJapgolly.storybookReactNative.previewMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncStorage extends js.Object {
  def getItem[T](key: String): js.Promise[T]
  def setItem[T](key: String, value: T): js.Promise[Unit]
}

object AsyncStorage {
  @scala.inline
  def apply(
    getItem: String => CallbackTo[js.Promise[js.Any]],
    setItem: (String, js.Any) => CallbackTo[js.Promise[Unit]]
  ): AsyncStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getItem")(js.Any.fromFunction1((t0: java.lang.String) => getItem(t0).runNow()))
    __obj.updateDynamic("setItem")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => setItem(t0, t1).runNow()))
    __obj.asInstanceOf[AsyncStorage]
  }
}

