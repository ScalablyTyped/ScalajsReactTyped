package typingsJapgolly.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TypeParameterListSyntax")
@js.native
class TypeParameterListSyntax protected () extends SyntaxNode {
  def this(
    lessThanToken: ISyntaxToken,
    typeParameters: ISeparatedSyntaxList,
    greaterThanToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var greaterThanToken: ISyntaxToken = js.native
  var lessThanToken: ISyntaxToken = js.native
  var typeParameters: ISeparatedSyntaxList = js.native
  def update(lessThanToken: ISyntaxToken, typeParameters: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): TypeParameterListSyntax = js.native
  def withGreaterThanToken(greaterThanToken: ISyntaxToken): TypeParameterListSyntax = js.native
  def withLessThanToken(lessThanToken: ISyntaxToken): TypeParameterListSyntax = js.native
  def withTypeParameter(typeParameter: TypeParameterSyntax): TypeParameterListSyntax = js.native
  def withTypeParameters(typeParameters: ISeparatedSyntaxList): TypeParameterListSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.TypeParameterListSyntax")
@js.native
object TypeParameterListSyntax extends js.Object {
  def create(lessThanToken: ISyntaxToken, greaterThanToken: ISyntaxToken): TypeParameterListSyntax = js.native
  def create1(): TypeParameterListSyntax = js.native
}

