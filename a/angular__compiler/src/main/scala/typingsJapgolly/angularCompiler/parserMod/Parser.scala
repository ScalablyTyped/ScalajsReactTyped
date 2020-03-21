package typingsJapgolly.angularCompiler.parserMod

import typingsJapgolly.angularCompiler.astMod.ASTWithSource
import typingsJapgolly.angularCompiler.interpolationConfigMod.InterpolationConfig
import typingsJapgolly.angularCompiler.lexerMod.Lexer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/parser", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(_lexer: Lexer) = this()
  var _checkNoInterpolation: js.Any = js.native
  var _commentStart: js.Any = js.native
  var _findInterpolationErrorColumn: js.Any = js.native
  var _lexer: js.Any = js.native
  var _parseBindingAst: js.Any = js.native
  var _parseQuote: js.Any = js.native
  var _reportError: js.Any = js.native
  var _stripComments: js.Any = js.native
  var errors: js.Any = js.native
  def parseAction(input: String, location: js.Any, absoluteOffset: Double): ASTWithSource = js.native
  def parseAction(input: String, location: js.Any, absoluteOffset: Double, interpolationConfig: InterpolationConfig): ASTWithSource = js.native
  def parseBinding(input: String, location: js.Any, absoluteOffset: Double): ASTWithSource = js.native
  def parseBinding(input: String, location: js.Any, absoluteOffset: Double, interpolationConfig: InterpolationConfig): ASTWithSource = js.native
  def parseInterpolation(input: String, location: js.Any, absoluteOffset: Double): ASTWithSource | Null = js.native
  def parseInterpolation(input: String, location: js.Any, absoluteOffset: Double, interpolationConfig: InterpolationConfig): ASTWithSource | Null = js.native
  def parseSimpleBinding(input: String, location: String, absoluteOffset: Double): ASTWithSource = js.native
  def parseSimpleBinding(input: String, location: String, absoluteOffset: Double, interpolationConfig: InterpolationConfig): ASTWithSource = js.native
  def parseTemplateBindings(tplKey: String, tplValue: String, location: js.Any, absoluteOffset: Double): TemplateBindingParseResult = js.native
  def splitInterpolation(input: String, location: String): SplitInterpolation | Null = js.native
  def splitInterpolation(input: String, location: String, interpolationConfig: InterpolationConfig): SplitInterpolation | Null = js.native
  def wrapLiteralPrimitive(input: String, location: js.Any, absoluteOffset: Double): ASTWithSource = js.native
  def wrapLiteralPrimitive(input: Null, location: js.Any, absoluteOffset: Double): ASTWithSource = js.native
}

