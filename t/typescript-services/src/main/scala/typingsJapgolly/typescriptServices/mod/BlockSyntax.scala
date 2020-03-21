package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "BlockSyntax")
@js.native
class BlockSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.BlockSyntax {
  def this(
    openBraceToken: ISyntaxToken,
    statements: ISyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "BlockSyntax")
@js.native
object BlockSyntax extends js.Object {
  def create(openBraceToken: ISyntaxToken, closeBraceToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.BlockSyntax = js.native
  def create1(): typingsJapgolly.typescriptServices.TypeScript.BlockSyntax = js.native
}

