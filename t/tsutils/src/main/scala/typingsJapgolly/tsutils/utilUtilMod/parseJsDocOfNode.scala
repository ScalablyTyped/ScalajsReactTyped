package typingsJapgolly.tsutils.utilUtilMod

import typingsJapgolly.typescript.mod.JSDoc
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/util", "parseJsDocOfNode")
@js.native
object parseJsDocOfNode extends js.Object {
  def apply(node: Node): js.Array[JSDoc] = js.native
  def apply(node: Node, considerTrailingComments: Boolean): js.Array[JSDoc] = js.native
  def apply(node: Node, considerTrailingComments: Boolean, sourceFile: SourceFile): js.Array[JSDoc] = js.native
}

