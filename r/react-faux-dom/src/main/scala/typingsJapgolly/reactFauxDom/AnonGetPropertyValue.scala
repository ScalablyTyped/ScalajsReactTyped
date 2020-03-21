package typingsJapgolly.reactFauxDom

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetPropertyValue extends js.Object {
  def getPropertyValue(name: String): String
}

object AnonGetPropertyValue {
  @scala.inline
  def apply(getPropertyValue: String => CallbackTo[String]): AnonGetPropertyValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPropertyValue")(js.Any.fromFunction1((t0: java.lang.String) => getPropertyValue(t0).runNow()))
    __obj.asInstanceOf[AnonGetPropertyValue]
  }
}

