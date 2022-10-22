package typingsJapgolly.n3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.rdfjsTypes.dataModelMod._Term because Already inherited
- typingsJapgolly.rdfjsTypes.dataModelMod.BaseQuad because Already inherited
- typingsJapgolly.rdfjsTypes.dataModelMod.Quad because var conflicts: graph, `object`, predicate, subject, termType, value. Inlined subject_Quad, predicate_Quad, object_Quad, graph_Quad */ @JSImport("n3", "Quad")
@js.native
open class Quad protected ()
  extends BaseQuad
     with typingsJapgolly.rdfjsTypes.dataModelMod._QuadObject
     with typingsJapgolly.rdfjsTypes.dataModelMod._QuadSubject {
  def this(subject: Term, predicate: Term, `object`: Term) = this()
  def this(subject: Term, predicate: Term, `object`: Term, graph: Term) = this()
  
  /**
    * The named graph.
    * @see Quad_Graph
    */
  @JSName("graph")
  var graph_Quad: typingsJapgolly.rdfjsTypes.dataModelMod.QuadGraph = js.native
  
  /**
    * The object.
    * @see Quad_Object
    */
  @JSName("object")
  var object_Quad: typingsJapgolly.rdfjsTypes.dataModelMod.QuadObject = js.native
  
  /**
    * The predicate.
    * @see Quad_Predicate
    */
  @JSName("predicate")
  var predicate_Quad: typingsJapgolly.rdfjsTypes.dataModelMod.QuadPredicate = js.native
  
  /**
    * The subject.
    * @see Quad_Subject
    */
  @JSName("subject")
  var subject_Quad: typingsJapgolly.rdfjsTypes.dataModelMod.QuadSubject = js.native
}
