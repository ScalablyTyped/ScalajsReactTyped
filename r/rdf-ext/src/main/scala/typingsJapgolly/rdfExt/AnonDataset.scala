package typingsJapgolly.rdfExt

import typingsJapgolly.rdfExt.blankNodeMod.BlankNodeExt
import typingsJapgolly.rdfExt.datasetMod.DatasetExt
import typingsJapgolly.rdfExt.defaultGraphMod.DefaultGraphExt
import typingsJapgolly.rdfExt.literalMod.LiteralExt
import typingsJapgolly.rdfExt.namedNodeMod.NamedNodeExt
import typingsJapgolly.rdfExt.quadMod.QuadExt
import typingsJapgolly.rdfExt.variableMod.VariableExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataset extends js.Object {
  var BlankNode: BlankNodeExt
  var Dataset: DatasetExt
  var Literal: LiteralExt
  var NamedNode: NamedNodeExt
  var Quad: QuadExt
  var Variable: VariableExt
  var defaultGraph: DefaultGraphExt
}

object AnonDataset {
  @scala.inline
  def apply(
    BlankNode: BlankNodeExt,
    Dataset: DatasetExt,
    Literal: LiteralExt,
    NamedNode: NamedNodeExt,
    Quad: QuadExt,
    Variable: VariableExt,
    defaultGraph: DefaultGraphExt
  ): AnonDataset = {
    val __obj = js.Dynamic.literal(BlankNode = BlankNode.asInstanceOf[js.Any], Dataset = Dataset.asInstanceOf[js.Any], Literal = Literal.asInstanceOf[js.Any], NamedNode = NamedNode.asInstanceOf[js.Any], Quad = Quad.asInstanceOf[js.Any], Variable = Variable.asInstanceOf[js.Any], defaultGraph = defaultGraph.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataset]
  }
}

