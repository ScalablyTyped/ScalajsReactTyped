package typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserLexerMod

import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError
import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/lexer", "TokenError")
@js.native
class TokenError protected () extends ParseError {
  def this(errorMsg: String, tokenType: Null, span: ParseSourceSpan) = this()
  def this(errorMsg: String, tokenType: TokenType, span: ParseSourceSpan) = this()
  var tokenType: TokenType | Null = js.native
}

