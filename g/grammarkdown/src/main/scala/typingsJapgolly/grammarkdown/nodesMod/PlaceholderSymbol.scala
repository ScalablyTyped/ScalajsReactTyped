package typingsJapgolly.grammarkdown.nodesMod

import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.AtToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "PlaceholderSymbol")
@js.native
class PlaceholderSymbol protected ()
  extends Node[typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.PlaceholderSymbol] {
  def this(placeholderToken: Token[AtToken]) = this()
  val placeholderToken: Token[AtToken] = js.native
}

