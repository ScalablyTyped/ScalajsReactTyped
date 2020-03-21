package typingsJapgolly.babelTypes.mod

import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "valueToNode")
@js.native
object valueToNode extends js.Object {
  def apply(): Identifier_ = js.native
  def apply(value: String): StringLiteral_ = js.native
  def apply(value: js.Array[js.UndefOr[Boolean | Null | String | Double | RegExp | js.Object]]): ArrayExpression_ = js.native
  def apply(value: js.Object): ObjectExpression_ = js.native
  def apply(value: Boolean): BooleanLiteral_ = js.native
  def apply(value: Double): NumericLiteral_ | BinaryExpression_ | UnaryExpression_ = js.native
  def apply(value: RegExp): RegExpLiteral_ = js.native
}

