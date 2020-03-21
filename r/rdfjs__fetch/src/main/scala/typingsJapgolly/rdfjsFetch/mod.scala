package typingsJapgolly.rdfjsFetch

import typingsJapgolly.rdfJs.mod.BaseQuad
import typingsJapgolly.rdfJs.mod.DatasetCore
import typingsJapgolly.rdfJs.mod.Quad
import typingsJapgolly.rdfjsFetchLite.mod.DatasetResponse
import typingsJapgolly.rdfjsFetchLite.mod.FactoryInit
import typingsJapgolly.rdfjsFetchLite.mod.FormatsInit
import typingsJapgolly.rdfjsFetchLite.mod.RdfFetchResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@rdfjs/fetch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(url: String, options: FormatsInit): js.Promise[RdfFetchResponse[Quad]] = js.native
  def apply[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](url: String, options: FactoryInit[D, OutQuad, InQuad]): js.Promise[DatasetResponse[D, OutQuad, InQuad]] = js.native
}

