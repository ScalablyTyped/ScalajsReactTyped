package typingsJapgolly.tslint.utilsMod

import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/utils", "childOfKind")
@js.native
object childOfKind extends js.Object {
  def apply(node: Node, kind: SyntaxKind): js.UndefOr[Node] = js.native
}

