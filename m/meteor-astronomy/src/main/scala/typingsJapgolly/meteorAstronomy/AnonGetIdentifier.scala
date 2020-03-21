package typingsJapgolly.meteorAstronomy

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetIdentifier extends js.Object {
  def getIdentifier(identifier: js.Any): String
  def getValues(): js.Array[_]
}

object AnonGetIdentifier {
  @scala.inline
  def apply(getIdentifier: js.Any => CallbackTo[String], getValues: CallbackTo[js.Array[js.Any]]): AnonGetIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getIdentifier")(js.Any.fromFunction1((t0: js.Any) => getIdentifier(t0).runNow()))
    __obj.updateDynamic("getValues")(getValues.toJsFn)
    __obj.asInstanceOf[AnonGetIdentifier]
  }
}

