package typingsJapgolly.rdfJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quad extends BaseQuad {
  /**
    * The named graph.
    * @see Quad_Graph
    */
  @JSName("graph")
  var graph_Quad: QuadGraph
  /**
    * The object.
    * @see Quad_Object
    */
  @JSName("object")
  var object_Quad: QuadObject
  /**
    * The predicate.
    * @see Quad_Predicate
    */
  @JSName("predicate")
  var predicate_Quad: QuadPredicate
  /**
    * The subject.
    * @see Quad_Subject
    */
  @JSName("subject")
  var subject_Quad: QuadSubject
}

object Quad {
  @scala.inline
  def apply(
    equals: BaseQuad => CallbackTo[Boolean],
    graph: QuadGraph,
    `object`: QuadObject,
    predicate: QuadPredicate,
    subject: QuadSubject
  ): Quad = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: typingsJapgolly.rdfJs.mod.BaseQuad) => equals(t0).runNow()))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quad]
  }
}

