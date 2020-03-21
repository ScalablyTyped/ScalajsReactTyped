package typingsJapgolly.rdfDatasetExt

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.rdfJs.mod.BaseQuad
import typingsJapgolly.rdfJs.mod.DatasetCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-dataset-ext/fromStream", JSImport.Namespace)
@js.native
object fromStreamMod extends js.Object {
  def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, stream: EventEmitter): js.Promise[D] = js.native
}

