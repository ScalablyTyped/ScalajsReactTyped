package typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "PropertyWrite")
@js.native
class PropertyWrite protected () extends AST {
  def this(span: ParseSpan, receiver: AST, name: String, value: AST) = this()
  var name: String = js.native
  var receiver: AST = js.native
  var value: AST = js.native
}

