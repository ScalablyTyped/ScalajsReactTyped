package typingsJapgolly.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ArrayTypeSyntax")
@js.native
class ArrayTypeSyntax protected () extends SyntaxNode {
  def this(
    `type`: ITypeSyntax,
    openBracketToken: ISyntaxToken,
    closeBracketToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var closeBracketToken: ISyntaxToken = js.native
  var openBracketToken: ISyntaxToken = js.native
  var `type`: ITypeSyntax = js.native
  def isType(): Boolean = js.native
  def update(`type`: ITypeSyntax, openBracketToken: ISyntaxToken, closeBracketToken: ISyntaxToken): ArrayTypeSyntax = js.native
  def withCloseBracketToken(closeBracketToken: ISyntaxToken): ArrayTypeSyntax = js.native
  def withOpenBracketToken(openBracketToken: ISyntaxToken): ArrayTypeSyntax = js.native
  def withType(`type`: ITypeSyntax): ArrayTypeSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ArrayTypeSyntax")
@js.native
object ArrayTypeSyntax extends js.Object {
  def create1(`type`: ITypeSyntax): ArrayTypeSyntax = js.native
}

