package typingsJapgolly.rdflib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "DataFactory")
@js.native
object DataFactory extends js.Object {
  /**
    * Creates a new blank node
    * @param value The blank node's identifier
    */
  def blankNode(value: String): BlankNode_ = js.native
  /**
    * Creates a new collection
    * @param elements The initial element
    */
  def collection(elements: js.Array[ValueType]): Collection = js.native
  /**
    * Gets the default graph
    */
  def defaultGraph(): DefaultGraph_ = js.native
  /**
    * Creates a new fetcher
    * @param store The store to use
    * @param options The options
    */
  def fetcher(store: Formula, options: js.Any): Fetcher_ = js.native
  /**
    * Creates a new graph (store)
    */
  def graph(): IndexedFormula = js.native
  /**
    * Creates a new literal node
    * @param val The lexical value
    * @param lang The language
    * @param dt The datatype
    */
  def lit(`val`: String): Literal_ = js.native
  def lit(`val`: String, lang: String): Literal_ = js.native
  def lit(`val`: String, lang: String, dt: NamedNode_): Literal_ = js.native
  /**
    * Creates a new literal node
    * @param value The lexical value
    * @param languageOrDatatype Either the language or the datatype
    */
  def literal(value: String): Literal_ = js.native
  def literal(value: String, languageOrDatatype: String): Literal_ = js.native
  def literal(value: String, languageOrDatatype: NamedNode_): Literal_ = js.native
  /**
    * Creates a new named node
    * @param value The new named node
    */
  def namedNode(value: String): NamedNode_ = js.native
  /**
    * Creates a new statement
    * @param subject The subject
    * @param predicate The predicate
    * @param object The object
    * @param graph The containing graph
    */
  def quad(subject: Node, predicate: Node, `object`: Node, graph: Node): Statement = js.native
  /**
    * Creates a new statement
    * @param subject The subject
    * @param predicate The predicate
    * @param object The object
    * @param graph The containing graph
    */
  def st(subject: Node, predicate: Node, `object`: Node, graph: Node): Statement = js.native
  /**
    * Creates a new statement
    * @param subject The subject
    * @param predicate The predicate
    * @param object The object
    */
  def triple(subject: Node, predicate: Node, `object`: Node): Statement = js.native
  /**
    * Creates a new variable
    * @param name The name for the variable
    */
  def variable(): Variable_ = js.native
  def variable(name: String): Variable_ = js.native
}

