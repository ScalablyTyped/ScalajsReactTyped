package typingsJapgolly.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedNode
  extends QuadGraph
     with QuadObject
     with QuadPredicate
     with QuadSubject
     with Term {
  /**
    * Contains the constant "NamedNode".
    */
  var termType: typingsJapgolly.rdfJs.rdfJsStrings.NamedNode = js.native
  /**
    * The IRI of the named node (example: `http://example.org/resource`)
    */
  var value: String = js.native
  def equals(): Boolean = js.native
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "NamedNode" and the same `value`.
    */
  def equals(other: Term): Boolean = js.native
}

