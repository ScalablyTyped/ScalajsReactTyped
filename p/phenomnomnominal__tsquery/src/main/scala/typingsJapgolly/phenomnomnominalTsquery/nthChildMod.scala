package typingsJapgolly.phenomnomnominalTsquery

import typingsJapgolly.phenomnomnominalTsquery.tsqueryTypesMod.TSQuerySelectorNode
import typingsJapgolly.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phenomnomnominal/tsquery/dist/src/matchers/nth-child", JSImport.Namespace)
@js.native
object nthChildMod extends js.Object {
  def nthChild(node: Node, selector: TSQuerySelectorNode, ancestry: js.Array[Node]): Boolean = js.native
  def nthLastChild(node: Node, selector: TSQuerySelectorNode, ancestry: js.Array[Node]): Boolean = js.native
}

