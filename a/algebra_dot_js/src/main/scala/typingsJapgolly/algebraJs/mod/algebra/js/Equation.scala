package typingsJapgolly.algebraJs.mod.algebra.js

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Equation extends js.Object {
  var lhs: Expression
  var rhs: Expression
  def solveFor(variable: String): Fraction | (js.Array[Double | Fraction])
}

object Equation {
  @scala.inline
  def apply(
    lhs: Expression,
    rhs: Expression,
    solveFor: String => CallbackTo[Fraction | (js.Array[Double | Fraction])]
  ): Equation = {
    val __obj = js.Dynamic.literal(lhs = lhs.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
    __obj.updateDynamic("solveFor")(js.Any.fromFunction1((t0: java.lang.String) => solveFor(t0).runNow()))
    __obj.asInstanceOf[Equation]
  }
}

