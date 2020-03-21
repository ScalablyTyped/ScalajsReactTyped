package typingsJapgolly.rdfDataModel

import typingsJapgolly.rdfJs.mod.BlankNode
import typingsJapgolly.rdfJs.mod.DefaultGraph
import typingsJapgolly.rdfJs.mod.Literal
import typingsJapgolly.rdfJs.mod.NamedNode
import typingsJapgolly.rdfJs.mod.Quad
import typingsJapgolly.rdfJs.mod.Term
import typingsJapgolly.rdfJs.mod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-data-model", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val defaultGraphInstance: DefaultGraph = js.native
  def blankNode(): BlankNode = js.native
  def blankNode(value: String): BlankNode = js.native
  def defaultGraph(): DefaultGraph = js.native
  def literal(value: String): Literal = js.native
  def literal(value: String, languageOrDatatype: String): Literal = js.native
  def literal(value: String, languageOrDatatype: NamedNode): Literal = js.native
  def namedNode(value: String): NamedNode = js.native
  def quad(subject: Term, predicate: Term, `object`: Term): Quad = js.native
  def quad(subject: Term, predicate: Term, `object`: Term, graph: Term): Quad = js.native
  def triple(subject: Term, predicate: Term, `object`: Term): Quad = js.native
  def variable(value: String): Variable = js.native
}

