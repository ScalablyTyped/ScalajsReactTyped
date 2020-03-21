package typingsJapgolly.typescriptServices.mod.Syntax

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxTrivia
import typingsJapgolly.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Syntax.trivia")
@js.native
object trivia extends js.Object {
  def apply(kind: SyntaxKind, text: String): ISyntaxTrivia = js.native
}

