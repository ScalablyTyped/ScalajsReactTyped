package typingsJapgolly.fhirJsClient

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAny extends js.Object {
  /**
    * Returns the valueQuantity value as number. (As it is)
    */
  def any(valueQuantity: js.Any): Double
  /**
    * Converts the valueQuantity passed into cm based on the code
    */
  def cm(valueQuantity: js.Any): Double
  /**
    * Converts the valueQuantity passed into kg based on the code
    */
  def kg(valueQuantity: js.Any): Double
}

object AnonAny {
  @scala.inline
  def apply(
    any: js.Any => CallbackTo[Double],
    cm: js.Any => CallbackTo[Double],
    kg: js.Any => CallbackTo[Double]
  ): AnonAny = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("any")(js.Any.fromFunction1((t0: js.Any) => any(t0).runNow()))
    __obj.updateDynamic("cm")(js.Any.fromFunction1((t0: js.Any) => cm(t0).runNow()))
    __obj.updateDynamic("kg")(js.Any.fromFunction1((t0: js.Any) => kg(t0).runNow()))
    __obj.asInstanceOf[AnonAny]
  }
}

