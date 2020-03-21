package typingsJapgolly.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.rdfJs.mod.BaseQuad because Already inherited
- typingsJapgolly.rdfJs.mod.Quad because var conflicts: graph, `object`, predicate, subject. Inlined graph_Quad, object_Quad, predicate_Quad, subject_Quad */ @JSImport("n3", "Quad")
@js.native
class Quad protected () extends BaseQuad {
  def this(subject: Term, predicate: Term, `object`: Term) = this()
  def this(subject: Term, predicate: Term, `object`: Term, graph: Term) = this()
  /**
    * The named graph.
    * @see Quad_Graph
    */
  @JSName("graph")
  var graph_Quad: typingsJapgolly.rdfJs.mod.QuadGraph = js.native
  /**
    * The object.
    * @see Quad_Object
    */
  @JSName("object")
  var object_Quad: typingsJapgolly.rdfJs.mod.QuadObject = js.native
  /**
    * The predicate.
    * @see Quad_Predicate
    */
  @JSName("predicate")
  var predicate_Quad: typingsJapgolly.rdfJs.mod.QuadPredicate = js.native
  /**
    * The subject.
    * @see Quad_Subject
    */
  @JSName("subject")
  var subject_Quad: typingsJapgolly.rdfJs.mod.QuadSubject = js.native
}

