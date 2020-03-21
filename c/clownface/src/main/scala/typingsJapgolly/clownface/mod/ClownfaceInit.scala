package typingsJapgolly.clownface.mod

import typingsJapgolly.clownface.contextMod.Context
import typingsJapgolly.rdfJs.mod.DatasetCore
import typingsJapgolly.rdfJs.mod.Quad
import typingsJapgolly.rdfJs.mod.QuadGraph
import typingsJapgolly.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<clownface.clownface.Clownface<D, T>, 'dataset' | '_context'> & {  graph  :rdf-js.rdf-js.Quad_Graph}> */
trait ClownfaceInit[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */] extends js.Object {
  var _context: js.UndefOr[js.Array[Context[D, T]]] = js.undefined
  var dataset: js.UndefOr[D] = js.undefined
  var graph: js.UndefOr[QuadGraph] = js.undefined
}

object ClownfaceInit {
  @scala.inline
  def apply[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */](_context: js.Array[Context[D, T]] = null, dataset: D = null, graph: QuadGraph = null): ClownfaceInit[D, T] = {
    val __obj = js.Dynamic.literal()
    if (_context != null) __obj.updateDynamic("_context")(_context.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (graph != null) __obj.updateDynamic("graph")(graph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClownfaceInit[D, T]]
  }
}

