package typingsJapgolly.phenomnomnominalTsquery

import typingsJapgolly.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryOptions
import typingsJapgolly.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryProperties
import typingsJapgolly.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phenomnomnominal/tsquery/dist/src/traverse", JSImport.Namespace)
@js.native
object traverseMod extends js.Object {
  def getProperties(node: Node): TSQueryProperties = js.native
  def getVisitorKeys(): js.Array[String] = js.native
  def getVisitorKeys(node: Node): js.Array[String] = js.native
  def traverseChildren(
    node: Node,
    iterator: js.Function2[/* childNode */ Node, /* ancestors */ js.Array[Node], Unit],
    options: TSQueryOptions
  ): Unit = js.native
}

