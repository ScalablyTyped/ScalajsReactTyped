package typingsJapgolly.rdfExt

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.rdfExt.blankNodeMod.BlankNodeExt
import typingsJapgolly.rdfExt.dataFactoryMod.DataFactoryExt
import typingsJapgolly.rdfExt.dataFactoryMod.Prefixes
import typingsJapgolly.rdfExt.datasetMod.DatasetExt
import typingsJapgolly.rdfExt.defaultGraphMod.DefaultGraphExt
import typingsJapgolly.rdfExt.literalMod.LiteralExt
import typingsJapgolly.rdfExt.namedNodeMod.NamedNodeExt
import typingsJapgolly.rdfExt.prefixMapMod.^
import typingsJapgolly.rdfExt.propTypeMod.PropType
import typingsJapgolly.rdfExt.quadMod.QuadExt
import typingsJapgolly.rdfExt.rdfExtStrings.graph
import typingsJapgolly.rdfExt.variableMod.VariableExt
import typingsJapgolly.rdfJs.mod.NamedNode
import typingsJapgolly.rdfJs.mod.Quad
import typingsJapgolly.rdfJs.mod.QuadGraph
import typingsJapgolly.rdfJs.mod.QuadObject
import typingsJapgolly.rdfJs.mod.QuadPredicate
import typingsJapgolly.rdfJs.mod.QuadSubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofDataFactoryExt extends Instantiable0[DataFactoryExt] {
  var defaults: AnonDataset = js.native
  def blankNode(): BlankNodeExt = js.native
  def blankNode(value: String): BlankNodeExt = js.native
  def dataset(): DatasetExt = js.native
  def dataset(quads: js.Array[Quad]): DatasetExt = js.native
  @JSName("dataset")
  def dataset_graph(quads: js.Array[Quad], graph: PropType[QuadExt, graph]): DatasetExt = js.native
  def defaultGraph(): DefaultGraphExt = js.native
  def graph(): DatasetExt = js.native
  def graph(quads: js.Any): DatasetExt = js.native
  def literal(value: String): LiteralExt = js.native
  def literal(value: String, languageOrDatatype: String): LiteralExt = js.native
  def literal(value: String, languageOrDatatype: NamedNode): LiteralExt = js.native
  def namedNode(value: String): NamedNodeExt = js.native
  def prefixMap(prefixes: Prefixes): ^ = js.native
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): QuadExt = js.native
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): QuadExt = js.native
  def triple(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): QuadExt = js.native
  def variable(value: String): VariableExt = js.native
}

