package typingsJapgolly.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "Util")
@js.native
object Util extends js.Object {
  def inDefaultGraph(value: typingsJapgolly.rdfJs.mod.Quad): Boolean = js.native
  def isBlankNode(): Boolean = js.native
  def isBlankNode(value: typingsJapgolly.rdfJs.mod.Term): Boolean = js.native
  def isDefaultGraph(): Boolean = js.native
  def isDefaultGraph(value: typingsJapgolly.rdfJs.mod.Term): Boolean = js.native
  def isLiteral(): Boolean = js.native
  def isLiteral(value: typingsJapgolly.rdfJs.mod.Term): Boolean = js.native
  def isNamedNode(): Boolean = js.native
  def isNamedNode(value: typingsJapgolly.rdfJs.mod.Term): Boolean = js.native
  def isVariable(): Boolean = js.native
  def isVariable(value: typingsJapgolly.rdfJs.mod.Term): Boolean = js.native
  def prefix(iri: String): PrefixedToIri = js.native
  def prefix(iri: String, factory: typingsJapgolly.rdfJs.mod.DataFactory[typingsJapgolly.rdfJs.mod.Quad]): PrefixedToIri = js.native
  def prefix(iri: typingsJapgolly.rdfJs.mod.NamedNode): PrefixedToIri = js.native
  def prefix(
    iri: typingsJapgolly.rdfJs.mod.NamedNode,
    factory: typingsJapgolly.rdfJs.mod.DataFactory[typingsJapgolly.rdfJs.mod.Quad]
  ): PrefixedToIri = js.native
  def prefixes(defaultPrefixes: Prefixes[typingsJapgolly.rdfJs.mod.NamedNode | String]): js.Function1[/* prefix */ String, PrefixedToIri] = js.native
  def prefixes(
    defaultPrefixes: Prefixes[typingsJapgolly.rdfJs.mod.NamedNode | String],
    factory: typingsJapgolly.rdfJs.mod.DataFactory[typingsJapgolly.rdfJs.mod.Quad]
  ): js.Function1[/* prefix */ String, PrefixedToIri] = js.native
}

