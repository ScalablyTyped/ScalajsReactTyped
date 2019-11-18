package typingsJapgolly.typescript.typescriptMod

import typingsJapgolly.typescript.typescriptMod.SyntaxKind.MultiLineCommentTrivia
import typingsJapgolly.typescript.typescriptMod.SyntaxKind.SingleLineCommentTrivia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "addSyntheticTrailingComment")
@js.native
object addSyntheticTrailingComment extends js.Object {
  def apply[T /* <: Node */](node: T, kind: MultiLineCommentTrivia, text: String): T = js.native
  def apply[T /* <: Node */](node: T, kind: MultiLineCommentTrivia, text: String, hasTrailingNewLine: Boolean): T = js.native
  def apply[T /* <: Node */](node: T, kind: SingleLineCommentTrivia, text: String): T = js.native
  def apply[T /* <: Node */](node: T, kind: SingleLineCommentTrivia, text: String, hasTrailingNewLine: Boolean): T = js.native
}

