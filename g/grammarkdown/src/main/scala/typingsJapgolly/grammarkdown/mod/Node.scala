package typingsJapgolly.grammarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Node")
@js.native
abstract class Node[TKind /* <: typingsJapgolly.grammarkdown.tokensMod.SyntaxKind */] protected ()
  extends typingsJapgolly.grammarkdown.nodesMod.Node[TKind] {
  def this(kind: TKind) = this()
}

