package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "CatchClauseSyntax")
@js.native
class CatchClauseSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.CatchClauseSyntax {
  def this(
    catchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    identifier: ISyntaxToken,
    typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax,
    closeParenToken: ISyntaxToken,
    block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "CatchClauseSyntax")
@js.native
object CatchClauseSyntax extends js.Object {
  def create(
    catchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    identifier: ISyntaxToken,
    closeParenToken: ISyntaxToken,
    block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax
  ): typingsJapgolly.typescriptServices.TypeScript.CatchClauseSyntax = js.native
  def create1(identifier: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.CatchClauseSyntax = js.native
}

