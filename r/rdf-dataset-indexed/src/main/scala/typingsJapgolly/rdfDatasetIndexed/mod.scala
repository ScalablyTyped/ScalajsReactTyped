package typingsJapgolly.rdfDatasetIndexed

import typingsJapgolly.rdfJs.mod.BaseQuad
import typingsJapgolly.rdfJs.mod.DataFactory
import typingsJapgolly.rdfJs.mod.DatasetCore
import typingsJapgolly.rdfJs.mod.DatasetCoreFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-dataset-indexed", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[Q /* <: BaseQuad */](): DatasetCore[Q, BaseQuad] = js.native
  def apply[Q /* <: BaseQuad */](quads: js.Array[Q]): DatasetCore[Q, BaseQuad] = js.native
  def apply[Q /* <: BaseQuad */](quads: js.Array[Q], dataFactory: DataFactory[Q] with (DatasetCoreFactory[Q, Q, DatasetCore[Q, Q]])): DatasetCore[Q, BaseQuad] = js.native
}

