package typingsJapgolly.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.EnumElementSyntax")
@js.native
class EnumElementSyntax protected () extends SyntaxNode {
  def this(
    propertyName: ISyntaxToken,
    equalsValueClause: EqualsValueClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var equalsValueClause: EqualsValueClauseSyntax = js.native
  var propertyName: ISyntaxToken = js.native
  def update(propertyName: ISyntaxToken, equalsValueClause: EqualsValueClauseSyntax): EnumElementSyntax = js.native
  def withEqualsValueClause(equalsValueClause: EqualsValueClauseSyntax): EnumElementSyntax = js.native
  def withPropertyName(propertyName: ISyntaxToken): EnumElementSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.EnumElementSyntax")
@js.native
object EnumElementSyntax extends js.Object {
  def create(propertyName: ISyntaxToken): EnumElementSyntax = js.native
  def create1(propertyName: ISyntaxToken): EnumElementSyntax = js.native
}

