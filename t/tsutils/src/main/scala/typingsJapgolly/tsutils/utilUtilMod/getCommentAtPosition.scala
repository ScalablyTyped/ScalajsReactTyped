package typingsJapgolly.tsutils.utilUtilMod

import typingsJapgolly.typescript.mod.CommentRange
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/util", "getCommentAtPosition")
@js.native
object getCommentAtPosition extends js.Object {
  def apply(sourceFile: SourceFile, pos: Double): js.UndefOr[CommentRange] = js.native
  def apply(sourceFile: SourceFile, pos: Double, parent: Node): js.UndefOr[CommentRange] = js.native
}

