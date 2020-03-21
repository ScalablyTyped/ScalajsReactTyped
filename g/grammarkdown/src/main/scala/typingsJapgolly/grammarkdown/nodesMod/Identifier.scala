package typingsJapgolly.grammarkdown.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Identifier")
@js.native
class Identifier ()
  extends Node[typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.Identifier]
     with TextContent {
  def this(text: String) = this()
}

