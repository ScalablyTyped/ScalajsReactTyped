package typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "PropertyRead")
@js.native
class PropertyRead protected () extends AST {
  def this(span: ParseSpan, receiver: AST, name: String) = this()
  var name: String = js.native
  var receiver: AST = js.native
}

