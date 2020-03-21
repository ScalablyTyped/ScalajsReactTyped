package typingsJapgolly.figma.mod._Global_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientStorageAPI extends js.Object {
  def getAsync(key: String): js.Promise[_]
  def setAsync(key: String, value: js.Any): js.Promise[Unit]
}

object ClientStorageAPI {
  @scala.inline
  def apply(
    getAsync: String => CallbackTo[js.Promise[js.Any]],
    setAsync: (String, js.Any) => CallbackTo[js.Promise[Unit]]
  ): ClientStorageAPI = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAsync")(js.Any.fromFunction1((t0: java.lang.String) => getAsync(t0).runNow()))
    __obj.updateDynamic("setAsync")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => setAsync(t0, t1).runNow()))
    __obj.asInstanceOf[ClientStorageAPI]
  }
}

