package typingsJapgolly.rdfDatasetExt

import typingsJapgolly.rdfJs.mod.BaseQuad
import typingsJapgolly.rdfJs.mod.DatasetCore
import typingsJapgolly.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-dataset-ext/toStream", JSImport.Namespace)
@js.native
object toStreamMod extends js.Object {
  def apply[Q /* <: BaseQuad */](dataset: DatasetCore[Q, Q]): Stream[Q] = js.native
}

