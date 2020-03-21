package typingsJapgolly.saml.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyInfoProvider extends js.Object {
  def getKeyInfo(key: String, prefix: String): String
}

object KeyInfoProvider {
  @scala.inline
  def apply(getKeyInfo: (String, String) => CallbackTo[String]): KeyInfoProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getKeyInfo")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => getKeyInfo(t0, t1).runNow()))
    __obj.asInstanceOf[KeyInfoProvider]
  }
}

