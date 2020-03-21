package typingsJapgolly.babelCore.mod

import typingsJapgolly.babelTraverse.mod.Hub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/core", "NodePath")
@js.native
class NodePath[T] protected ()
  extends typingsJapgolly.babelTraverse.mod.NodePath[T] {
  def this(hub: Hub, parent: typingsJapgolly.babelTraverse.mod.Node) = this()
}

