package typingsJapgolly.angularCompiler.outputAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "importType")
@js.native
object importType extends js.Object {
  def apply(id: ExternalReference): ExpressionType_ | Null = js.native
  def apply(id: ExternalReference, typeParams: js.Array[Type]): ExpressionType_ | Null = js.native
  def apply(id: ExternalReference, typeParams: js.Array[Type], typeModifiers: js.Array[TypeModifier]): ExpressionType_ | Null = js.native
  def apply(id: ExternalReference, typeParams: Null, typeModifiers: js.Array[TypeModifier]): ExpressionType_ | Null = js.native
}

