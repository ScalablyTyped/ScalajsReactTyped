package typingsJapgolly.angularCompiler.outputAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "ExpressionType")
@js.native
class ExpressionType_ protected () extends Type {
  def this(value: Expression) = this()
  def this(value: Expression, modifiers: js.Array[TypeModifier]) = this()
  def this(value: Expression, modifiers: js.Array[TypeModifier], typeParams: js.Array[Type]) = this()
  def this(value: Expression, modifiers: Null, typeParams: js.Array[Type]) = this()
  var typeParams: js.Array[Type] | Null = js.native
  var value: Expression = js.native
}

