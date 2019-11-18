package typingsJapgolly.atAngularCompiler.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod

import typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST
import typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
@js.native
object convertActionBinding extends js.Object {
  def apply(localResolver: Null, implicitReceiver: Expression, action: AST, bindingId: String): ConvertActionBindingResult = js.native
  def apply(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction
  ): ConvertActionBindingResult = js.native
  def apply(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: ParseSourceSpan
  ): ConvertActionBindingResult = js.native
  def apply(localResolver: LocalResolver, implicitReceiver: Expression, action: AST, bindingId: String): ConvertActionBindingResult = js.native
  def apply(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction
  ): ConvertActionBindingResult = js.native
  def apply(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: ParseSourceSpan
  ): ConvertActionBindingResult = js.native
}

