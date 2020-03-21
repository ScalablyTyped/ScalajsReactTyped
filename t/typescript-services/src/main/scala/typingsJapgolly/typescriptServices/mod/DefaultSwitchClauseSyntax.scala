package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "DefaultSwitchClauseSyntax")
@js.native
class DefaultSwitchClauseSyntax protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.DefaultSwitchClauseSyntax {
  def this(
    defaultKeyword: ISyntaxToken,
    colonToken: ISyntaxToken,
    statements: ISyntaxList,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "DefaultSwitchClauseSyntax")
@js.native
object DefaultSwitchClauseSyntax extends js.Object {
  def create(defaultKeyword: ISyntaxToken, colonToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.DefaultSwitchClauseSyntax = js.native
  def create1(): typingsJapgolly.typescriptServices.TypeScript.DefaultSwitchClauseSyntax = js.native
}

