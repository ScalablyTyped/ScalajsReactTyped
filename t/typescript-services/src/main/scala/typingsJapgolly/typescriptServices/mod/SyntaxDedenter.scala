package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.FormattingOptions
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxDedenter")
@js.native
class SyntaxDedenter protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.SyntaxDedenter {
  def this(
    dedentFirstToken: Boolean,
    dedentationAmount: Double,
    minimumIndent: Double,
    options: FormattingOptions
  ) = this()
}

/* static members */
@JSImport("typescript-services", "SyntaxDedenter")
@js.native
object SyntaxDedenter extends js.Object {
  def dedentNode(
    node: ISyntaxNode,
    dedentFirstToken: Boolean,
    dedentAmount: Double,
    minimumIndent: Double,
    options: FormattingOptions
  ): ISyntaxNode = js.native
}

