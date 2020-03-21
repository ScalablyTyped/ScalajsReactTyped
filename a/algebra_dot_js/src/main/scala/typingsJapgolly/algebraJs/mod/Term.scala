package typingsJapgolly.algebraJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Term extends _Union {
  var coefficients: js.Array[typingsJapgolly.algebraJs.mod.algebra.js.Fraction]
  var variables: js.Array[Variable]
  def coefficient(): typingsJapgolly.algebraJs.mod.algebra.js.Fraction
}

object Term {
  @scala.inline
  def apply(
    coefficient: CallbackTo[typingsJapgolly.algebraJs.mod.algebra.js.Fraction],
    coefficients: js.Array[typingsJapgolly.algebraJs.mod.algebra.js.Fraction],
    variables: js.Array[Variable]
  ): Term = {
    val __obj = js.Dynamic.literal(coefficients = coefficients.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("coefficient")(coefficient.toJsFn)
    __obj.asInstanceOf[Term]
  }
}

