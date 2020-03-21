package typingsJapgolly.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.FunctionTypeSyntax")
@js.native
class FunctionTypeSyntax protected () extends SyntaxNode {
  def this(
    typeParameterList: TypeParameterListSyntax,
    parameterList: ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var equalsGreaterThanToken: ISyntaxToken = js.native
  var parameterList: ParameterListSyntax = js.native
  var `type`: ITypeSyntax = js.native
  var typeParameterList: TypeParameterListSyntax = js.native
  def isType(): Boolean = js.native
  def update(
    typeParameterList: TypeParameterListSyntax,
    parameterList: ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): FunctionTypeSyntax = js.native
  def withEqualsGreaterThanToken(equalsGreaterThanToken: ISyntaxToken): FunctionTypeSyntax = js.native
  def withParameterList(parameterList: ParameterListSyntax): FunctionTypeSyntax = js.native
  def withType(`type`: ITypeSyntax): FunctionTypeSyntax = js.native
  def withTypeParameterList(typeParameterList: TypeParameterListSyntax): FunctionTypeSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.FunctionTypeSyntax")
@js.native
object FunctionTypeSyntax extends js.Object {
  def create(parameterList: ParameterListSyntax, equalsGreaterThanToken: ISyntaxToken, `type`: ITypeSyntax): FunctionTypeSyntax = js.native
  def create1(`type`: ITypeSyntax): FunctionTypeSyntax = js.native
}

