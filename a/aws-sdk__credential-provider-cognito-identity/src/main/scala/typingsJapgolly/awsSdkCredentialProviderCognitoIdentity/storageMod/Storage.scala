package typingsJapgolly.awsSdkCredentialProviderCognitoIdentity.storageMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage extends js.Object {
  def getItem(key: String): String | Null | (js.Promise[String | Null])
  def removeItem(key: String): Unit | js.Promise[Unit]
  def setItem(key: String, data: String): Unit | js.Promise[Unit]
}

object Storage {
  @scala.inline
  def apply(
    getItem: String => CallbackTo[String | Null | (js.Promise[String | Null])],
    removeItem: String => CallbackTo[Unit | js.Promise[Unit]],
    setItem: (String, String) => CallbackTo[Unit | js.Promise[Unit]]
  ): Storage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getItem")(js.Any.fromFunction1((t0: java.lang.String) => getItem(t0).runNow()))
    __obj.updateDynamic("removeItem")(js.Any.fromFunction1((t0: java.lang.String) => removeItem(t0).runNow()))
    __obj.updateDynamic("setItem")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setItem(t0, t1).runNow()))
    __obj.asInstanceOf[Storage]
  }
}

