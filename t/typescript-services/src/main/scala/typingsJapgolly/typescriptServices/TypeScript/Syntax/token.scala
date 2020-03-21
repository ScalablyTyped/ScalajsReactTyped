package typingsJapgolly.typescriptServices.TypeScript.Syntax

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import typingsJapgolly.typescriptServices.TypeScript.ITokenInfo
import typingsJapgolly.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Syntax.token")
@js.native
object token extends js.Object {
  def apply(kind: SyntaxKind): ISyntaxToken = js.native
  def apply(kind: SyntaxKind, info: ITokenInfo): ISyntaxToken = js.native
}

