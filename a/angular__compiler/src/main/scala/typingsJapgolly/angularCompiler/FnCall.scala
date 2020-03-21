package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.outputAstMod.Expression
import typingsJapgolly.angularCompiler.outputAstMod.Statement
import typingsJapgolly.angularCompiler.r3AstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply[T](arg: Expression): scala.Nothing = js.native
  def apply[T](arg: Statement): scala.Nothing = js.native
  def apply[T](arg: Node): scala.Nothing = js.native
}

