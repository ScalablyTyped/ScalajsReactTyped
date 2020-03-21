package typingsJapgolly.tslint.utilsMod

import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.NodeFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/utils", "isCombinedNodeFlagSet")
@js.native
object isCombinedNodeFlagSet extends js.Object {
  def apply(node: Node, flagToCheck: NodeFlags): Boolean = js.native
}

