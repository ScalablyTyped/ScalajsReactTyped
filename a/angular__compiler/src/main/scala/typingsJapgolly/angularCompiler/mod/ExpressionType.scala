package typingsJapgolly.angularCompiler.mod

import typingsJapgolly.angularCompiler.outputAstMod.TypeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ExpressionType")
@js.native
class ExpressionType protected ()
  extends typingsJapgolly.angularCompiler.publicApiMod.ExpressionType {
  def this(value: typingsJapgolly.angularCompiler.outputAstMod.Expression) = this()
  def this(value: typingsJapgolly.angularCompiler.outputAstMod.Expression, modifiers: js.Array[TypeModifier]) = this()
  def this(
    value: typingsJapgolly.angularCompiler.outputAstMod.Expression,
    modifiers: js.Array[TypeModifier],
    typeParams: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Type]
  ) = this()
  def this(
    value: typingsJapgolly.angularCompiler.outputAstMod.Expression,
    modifiers: Null,
    typeParams: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Type]
  ) = this()
}

