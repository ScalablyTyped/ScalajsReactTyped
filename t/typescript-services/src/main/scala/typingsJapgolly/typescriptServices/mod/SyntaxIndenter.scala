package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.FormattingOptions
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxIndenter")
@js.native
class SyntaxIndenter protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.SyntaxIndenter {
  def this(indentFirstToken: Boolean, indentationAmount: Double, options: FormattingOptions) = this()
}

/* static members */
@JSImport("typescript-services", "SyntaxIndenter")
@js.native
object SyntaxIndenter extends js.Object {
  def indentNode(node: ISyntaxNode, indentFirstToken: Boolean, indentAmount: Double, options: FormattingOptions): typingsJapgolly.typescriptServices.TypeScript.SyntaxNode = js.native
  def indentNodes(
    nodes: js.Array[typingsJapgolly.typescriptServices.TypeScript.SyntaxNode],
    indentFirstToken: Boolean,
    indentAmount: Double,
    options: FormattingOptions
  ): js.Array[typingsJapgolly.typescriptServices.TypeScript.SyntaxNode] = js.native
}

