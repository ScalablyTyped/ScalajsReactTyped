package typingsJapgolly.phenomnomnominalTsquery

import typingsJapgolly.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phenomnomnominal/tsquery/dist/src/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def getPath(obj: js.Any, path: String): js.Any = js.native
  def inPath(node: Node, ancestor: Node, path: js.Array[String]): Boolean = js.native
}

