package typingsJapgolly.gremlin.mod.process

import typingsJapgolly.gremlin.mod.Newable
import typingsJapgolly.gremlin.mod.driver.RemoteConnection
import typingsJapgolly.gremlin.mod.structure.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "process.AnonymousTraversalSource")
@js.native
class AnonymousTraversalSource[S /* <: GraphTraversalSource[GraphTraversal] */] () extends js.Object {
  def withGraph(graph: Graph): S = js.native
  def withRemote(remoteConnection: RemoteConnection): S = js.native
}

/* static members */
@JSImport("gremlin", "process.AnonymousTraversalSource")
@js.native
object AnonymousTraversalSource extends js.Object {
  def traversal[S /* <: GraphTraversalSource[GraphTraversal] */](): AnonymousTraversalSource[S] = js.native
  def traversal[S /* <: GraphTraversalSource[GraphTraversal] */](traversalSourceClass: Newable[S]): AnonymousTraversalSource[S] = js.native
}

