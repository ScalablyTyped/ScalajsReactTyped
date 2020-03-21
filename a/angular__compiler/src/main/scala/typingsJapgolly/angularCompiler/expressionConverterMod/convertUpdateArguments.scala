package typingsJapgolly.angularCompiler.expressionConverterMod

import typingsJapgolly.angularCompiler.AnonArgs
import typingsJapgolly.angularCompiler.astMod.AST
import typingsJapgolly.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertUpdateArguments")
@js.native
object convertUpdateArguments extends js.Object {
  def apply(
    localResolver: LocalResolver,
    contextVariableExpression: Expression,
    expressionWithArgumentsToExtract: AST,
    bindingId: String
  ): AnonArgs = js.native
}

