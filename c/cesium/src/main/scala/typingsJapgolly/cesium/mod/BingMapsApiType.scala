package typingsJapgolly.cesium.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BingMapsApiType extends js.Object {
  var defaultKey: String
  def getKey(providedKey: String): String
}

object BingMapsApiType {
  @scala.inline
  def apply(defaultKey: String, getKey: String => CallbackTo[String]): BingMapsApiType = {
    val __obj = js.Dynamic.literal(defaultKey = defaultKey.asInstanceOf[js.Any])
    __obj.updateDynamic("getKey")(js.Any.fromFunction1((t0: java.lang.String) => getKey(t0).runNow()))
    __obj.asInstanceOf[BingMapsApiType]
  }
}

