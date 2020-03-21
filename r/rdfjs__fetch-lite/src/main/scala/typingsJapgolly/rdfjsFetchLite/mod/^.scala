package typingsJapgolly.rdfjsFetchLite.mod

import typingsJapgolly.rdfJs.mod.BaseQuad
import typingsJapgolly.rdfJs.mod.DatasetCore
import typingsJapgolly.rdfJs.mod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@rdfjs/fetch-lite", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(url: String, options: FormatsInit): js.Promise[RdfFetchResponse[Quad]] = js.native
  def apply[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](url: String, options: FactoryInit[D, OutQuad, InQuad]): js.Promise[DatasetResponse[D, OutQuad, InQuad]] = js.native
}

