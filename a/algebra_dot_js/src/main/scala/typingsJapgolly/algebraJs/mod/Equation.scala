package typingsJapgolly.algebraJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("algebra.js", "Equation")
@js.native
class Equation protected ()
  extends typingsJapgolly.algebraJs.mod.algebra.js.Equation {
  def this(lhs: typingsJapgolly.algebraJs.mod.algebra.js.Expression, rhs: Double) = this()
  def this(
    lhs: typingsJapgolly.algebraJs.mod.algebra.js.Expression,
    rhs: typingsJapgolly.algebraJs.mod.algebra.js.Expression
  ) = this()
  def this(
    lhs: typingsJapgolly.algebraJs.mod.algebra.js.Expression,
    rhs: typingsJapgolly.algebraJs.mod.algebra.js.Fraction
  ) = this()
  /* CompleteClass */
  override var lhs: typingsJapgolly.algebraJs.mod.algebra.js.Expression = js.native
  /* CompleteClass */
  override var rhs: typingsJapgolly.algebraJs.mod.algebra.js.Expression = js.native
  /* CompleteClass */
  override def solveFor(variable: String): typingsJapgolly.algebraJs.mod.algebra.js.Fraction | (js.Array[Double | typingsJapgolly.algebraJs.mod.algebra.js.Fraction]) = js.native
}

