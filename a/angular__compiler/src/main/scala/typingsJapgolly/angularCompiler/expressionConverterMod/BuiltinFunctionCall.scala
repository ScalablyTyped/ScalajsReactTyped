package typingsJapgolly.angularCompiler.expressionConverterMod

import typingsJapgolly.angularCompiler.astMod.AST
import typingsJapgolly.angularCompiler.astMod.FunctionCall
import typingsJapgolly.angularCompiler.astMod.ParseSpan
import typingsJapgolly.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler_util/expression_converter", "BuiltinFunctionCall")
@js.native
class BuiltinFunctionCall protected () extends FunctionCall {
  def this(span: ParseSpan, args: js.Array[AST], converter: BuiltinConverter) = this()
  @JSName("args")
  var args_BuiltinFunctionCall: js.Array[AST] = js.native
  @JSName("converter")
  var converter_Original: BuiltinConverter = js.native
  def converter(args: js.Array[Expression]): Expression = js.native
}

