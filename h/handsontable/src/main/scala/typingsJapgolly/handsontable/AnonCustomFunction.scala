package typingsJapgolly.handsontable

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.handsontable.handsontableStrings.custom
import typingsJapgolly.handsontable.mod.Handsontable.plugins.Endpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustomFunction extends js.Object {
  var `type`: custom
  def customFunction(endpoint: Endpoint): Double
}

object AnonCustomFunction {
  @scala.inline
  def apply(customFunction: Endpoint => CallbackTo[Double], `type`: custom): AnonCustomFunction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("customFunction")(js.Any.fromFunction1((t0: typingsJapgolly.handsontable.mod.Handsontable.plugins.Endpoint) => customFunction(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomFunction]
  }
}

