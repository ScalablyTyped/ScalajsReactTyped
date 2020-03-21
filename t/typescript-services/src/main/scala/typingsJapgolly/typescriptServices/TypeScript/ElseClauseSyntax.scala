package typingsJapgolly.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ElseClauseSyntax")
@js.native
class ElseClauseSyntax protected () extends SyntaxNode {
  def this(elseKeyword: ISyntaxToken, statement: IStatementSyntax, parsedInStrictMode: Boolean) = this()
  var elseKeyword: ISyntaxToken = js.native
  var statement: IStatementSyntax = js.native
  def update(elseKeyword: ISyntaxToken, statement: IStatementSyntax): ElseClauseSyntax = js.native
  def withElseKeyword(elseKeyword: ISyntaxToken): ElseClauseSyntax = js.native
  def withStatement(statement: IStatementSyntax): ElseClauseSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ElseClauseSyntax")
@js.native
object ElseClauseSyntax extends js.Object {
  def create1(statement: IStatementSyntax): ElseClauseSyntax = js.native
}

