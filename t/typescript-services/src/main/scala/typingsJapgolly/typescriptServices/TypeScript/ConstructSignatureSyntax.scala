package typingsJapgolly.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ConstructSignatureSyntax")
@js.native
class ConstructSignatureSyntax protected () extends SyntaxNode {
  def this(newKeyword: ISyntaxToken, callSignature: CallSignatureSyntax, parsedInStrictMode: Boolean) = this()
  var callSignature: CallSignatureSyntax = js.native
  var newKeyword: ISyntaxToken = js.native
  def update(newKeyword: ISyntaxToken, callSignature: CallSignatureSyntax): ConstructSignatureSyntax = js.native
  def withCallSignature(callSignature: CallSignatureSyntax): ConstructSignatureSyntax = js.native
  def withNewKeyword(newKeyword: ISyntaxToken): ConstructSignatureSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ConstructSignatureSyntax")
@js.native
object ConstructSignatureSyntax extends js.Object {
  def create1(): ConstructSignatureSyntax = js.native
}

