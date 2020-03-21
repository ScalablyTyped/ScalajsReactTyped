package typingsJapgolly.cesium.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonType extends js.Object {
  var defaultAccessToken: String
  var defaultServer: String | Resource
  def getDefaultTokenCredit(providedKey: String): Credit
}

object IonType {
  @scala.inline
  def apply(
    defaultAccessToken: String,
    defaultServer: String | Resource,
    getDefaultTokenCredit: String => CallbackTo[Credit]
  ): IonType = {
    val __obj = js.Dynamic.literal(defaultAccessToken = defaultAccessToken.asInstanceOf[js.Any], defaultServer = defaultServer.asInstanceOf[js.Any])
    __obj.updateDynamic("getDefaultTokenCredit")(js.Any.fromFunction1((t0: java.lang.String) => getDefaultTokenCredit(t0).runNow()))
    __obj.asInstanceOf[IonType]
  }
}

