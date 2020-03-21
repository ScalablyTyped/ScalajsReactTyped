package typingsJapgolly.tslint.mod

import typingsJapgolly.tslint.utilsMod.ForEachCommentCallback
import typingsJapgolly.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "forEachComment")
@js.native
object forEachComment extends js.Object {
  def apply(node: Node, cb: ForEachCommentCallback): Unit = js.native
}

