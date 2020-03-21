package typingsJapgolly.rdfExt

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.rdfExt.blankNodeMod.BlankNodeExt
import typingsJapgolly.rdfExt.datasetMod.DatasetExt
import typingsJapgolly.rdfExt.defaultGraphMod.DefaultGraphExt
import typingsJapgolly.rdfExt.literalMod.LiteralExt
import typingsJapgolly.rdfExt.namedNodeMod.NamedNodeExt
import typingsJapgolly.rdfExt.prefixMapMod.Prefixes
import typingsJapgolly.rdfExt.prefixMapMod.^
import typingsJapgolly.rdfExt.quadMod.QuadExt
import typingsJapgolly.rdfExt.variableMod.VariableExt
import typingsJapgolly.rdfJs.mod.DataFactory
import typingsJapgolly.rdfJs.mod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlankNode extends js.Object {
  var BlankNode: BlankNodeExt
  var Dataset: DatasetExt
  var Literal: LiteralExt
  var NamedNode: NamedNodeExt
  var PrefixMap: Instantiable2[/* factory */ DataFactory[Quad], /* prefixes */ Prefixes, ^]
  var Quad: QuadExt
  var Variable: VariableExt
  var defaultGraph: DefaultGraphExt
}

object AnonBlankNode {
  @scala.inline
  def apply(
    BlankNode: BlankNodeExt,
    Dataset: DatasetExt,
    Literal: LiteralExt,
    NamedNode: NamedNodeExt,
    PrefixMap: Instantiable2[/* factory */ DataFactory[Quad], /* prefixes */ Prefixes, ^],
    Quad: QuadExt,
    Variable: VariableExt,
    defaultGraph: DefaultGraphExt
  ): AnonBlankNode = {
    val __obj = js.Dynamic.literal(BlankNode = BlankNode.asInstanceOf[js.Any], Dataset = Dataset.asInstanceOf[js.Any], Literal = Literal.asInstanceOf[js.Any], NamedNode = NamedNode.asInstanceOf[js.Any], PrefixMap = PrefixMap.asInstanceOf[js.Any], Quad = Quad.asInstanceOf[js.Any], Variable = Variable.asInstanceOf[js.Any], defaultGraph = defaultGraph.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBlankNode]
  }
}

