package typingsJapgolly.jsgraph.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsgraph.AnonDirgaph
import typingsJapgolly.jsgraph.AnonError
import typingsJapgolly.jsgraph.AnonResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directed extends js.Object {
  var colors: typingsJapgolly.jsgraph.mod.colors
  var directedGraph: DirectedGraph
  def breadthFirstTraverse(params: TraversalParams): TraversalResult
  def create(): AnonResult
  def createTraversalContext(req: AnonDirgaph): TraversalContext
  def depthFirstTraverse(params: TraversalParams): TraversalResult
  def transpose(graph: DirectedGraph): AnonError
}

object Directed {
  @scala.inline
  def apply(
    breadthFirstTraverse: TraversalParams => CallbackTo[TraversalResult],
    colors: colors,
    create: CallbackTo[AnonResult],
    createTraversalContext: AnonDirgaph => CallbackTo[TraversalContext],
    depthFirstTraverse: TraversalParams => CallbackTo[TraversalResult],
    directedGraph: DirectedGraph,
    transpose: DirectedGraph => CallbackTo[AnonError]
  ): Directed = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], directedGraph = directedGraph.asInstanceOf[js.Any])
    __obj.updateDynamic("breadthFirstTraverse")(js.Any.fromFunction1((t0: typingsJapgolly.jsgraph.mod.TraversalParams) => breadthFirstTraverse(t0).runNow()))
    __obj.updateDynamic("create")(create.toJsFn)
    __obj.updateDynamic("createTraversalContext")(js.Any.fromFunction1((t0: typingsJapgolly.jsgraph.AnonDirgaph) => createTraversalContext(t0).runNow()))
    __obj.updateDynamic("depthFirstTraverse")(js.Any.fromFunction1((t0: typingsJapgolly.jsgraph.mod.TraversalParams) => depthFirstTraverse(t0).runNow()))
    __obj.updateDynamic("transpose")(js.Any.fromFunction1((t0: typingsJapgolly.jsgraph.mod.DirectedGraph) => transpose(t0).runNow()))
    __obj.asInstanceOf[Directed]
  }
}

