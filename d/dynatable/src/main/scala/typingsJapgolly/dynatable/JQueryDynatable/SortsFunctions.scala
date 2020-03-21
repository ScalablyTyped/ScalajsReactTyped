package typingsJapgolly.dynatable.JQueryDynatable

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortsFunctions extends js.Object {
  /**
    * Sorting between 2 numbers
    *
    * @param a The first record
    * @param b The second record
    * @param attr The key of the property
    * @param direction The number describingthe order: ASC (+1), DESC (-1) or none (0)
    * @return The number (-1, 0 or +1) representing the comparison
    */
  def number(a: js.Any, b: js.Any, attr: String, direction: Double): Double
  /**
    * Restores the original order we had...
    *
    * @param a The first record
    * @param b The second record
    * @return The number (-1, 0 or +1) representing the comparison
    */
  def originalPlacement(a: js.Any, b: js.Any): Double
  /**
    * Sorting between 2 strings
    *
    * @param a The first record
    * @param b The second record
    * @param attr The key of the property
    * @param direction The number describingthe order: ASC (+1), DESC (-1) or none (0)
    * @return The number (-1, 0 or +1) representing the comparison
    */
  def string(a: js.Any, b: js.Any, attr: String, direction: Double): Double
}

object SortsFunctions {
  @scala.inline
  def apply(
    number: (js.Any, js.Any, String, Double) => CallbackTo[Double],
    originalPlacement: (js.Any, js.Any) => CallbackTo[Double],
    string: (js.Any, js.Any, String, Double) => CallbackTo[Double]
  ): SortsFunctions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("number")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: java.lang.String, t3: scala.Double) => number(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("originalPlacement")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => originalPlacement(t0, t1).runNow()))
    __obj.updateDynamic("string")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: java.lang.String, t3: scala.Double) => string(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[SortsFunctions]
  }
}

