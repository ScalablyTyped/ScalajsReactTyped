package typingsJapgolly.rdfDatasetExt

import typingsJapgolly.rdfJs.mod.BaseQuad
import typingsJapgolly.rdfJs.mod.DatasetCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-dataset-ext/addAll", JSImport.Namespace)
@js.native
object addAllMod extends js.Object {
  def apply[Q /* <: BaseQuad */, D /* <: DatasetCore[Q, Q] */](dataset: D, iterable: js.Iterable[Q]): D = js.native
}

