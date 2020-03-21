package typingsJapgolly.rdflib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "BlankNode")
@js.native
class BlankNode_ protected () extends Node {
  /**
    * Initializes this node
    * @param id The identifier for the blank node
    */
  def this(id: String) = this()
  /**
    * The identifier for the blank node
    */
  var id: String = js.native
  /**
    * Whether this is a blank node
    */
  var isBlank: Boolean = js.native
  /**
    * Gets a copy of this blank node in the specified formula
    * @param formula The formula
    */
  def copy(formula: Formula): BlankNode_ = js.native
}

/* static members */
@JSImport("rdflib", "BlankNode")
@js.native
object BlankNode_ extends js.Object {
  var NTAnonymousNodePrefix: String = js.native
  /**
    * The next unique identifier for blank nodes
    */
  var nextId: Double = js.native
  var termType: String = js.native
}

