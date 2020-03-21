package typingsJapgolly.uirouterAngularjs.mod.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "core.PathNode")
@js.native
class PathNode protected ()
  extends typingsJapgolly.uirouterCore.mod.PathNode {
  /** Creates a copy of a PathNode */
  def this(node: typingsJapgolly.uirouterCore.pathNodeMod.PathNode) = this()
  /** Creates a new (empty) PathNode for a State */
  def this(state: typingsJapgolly.uirouterCore.stateObjectMod.StateObject) = this()
}

/* static members */
@JSImport("@uirouter/angularjs", "core.PathNode")
@js.native
object PathNode extends js.Object {
  /**
    * Returns a clone of the PathNode
    * @deprecated use instance method `node.clone()`
    */
  def clone(node: typingsJapgolly.uirouterCore.pathNodeMod.PathNode): typingsJapgolly.uirouterCore.pathNodeMod.PathNode = js.native
}

