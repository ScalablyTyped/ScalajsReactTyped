package typingsJapgolly.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "BaseQuad")
@js.native
class BaseQuad protected ()
  extends typingsJapgolly.rdfJs.mod.BaseQuad {
  def this(subject: Term, predicate: Term, `object`: Term) = this()
  def this(subject: Term, predicate: Term, `object`: Term, graph: Term) = this()
  /**
    * The named graph.
    * @see Quad_Graph
    */
  /* CompleteClass */
  override var graph: typingsJapgolly.rdfJs.mod.Term = js.native
  /**
    * The object.
    * @see Quad_Object
    */
  /* CompleteClass */
  override var `object`: typingsJapgolly.rdfJs.mod.Term = js.native
  /**
    * The predicate.
    * @see Quad_Predicate
    */
  /* CompleteClass */
  override var predicate: typingsJapgolly.rdfJs.mod.Term = js.native
  /**
    * The subject.
    * @see Quad_Subject
    */
  /* CompleteClass */
  override var subject: typingsJapgolly.rdfJs.mod.Term = js.native
  /**
    * @param other The term to compare with.
    * @return True if and only if the argument is a) of the same type b) has all components equal.
    */
  /* CompleteClass */
  override def equals(other: typingsJapgolly.rdfJs.mod.BaseQuad): Boolean = js.native
  def toJSON(): String = js.native
}

