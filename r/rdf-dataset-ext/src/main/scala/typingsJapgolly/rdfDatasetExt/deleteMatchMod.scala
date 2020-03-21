package typingsJapgolly.rdfDatasetExt

import typingsJapgolly.rdfJs.mod.BaseQuad
import typingsJapgolly.rdfJs.mod.DatasetCore
import typingsJapgolly.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-dataset-ext/deleteMatch", JSImport.Namespace)
@js.native
object deleteMatchMod extends js.Object {
  def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D): D = js.native
  def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term): D = js.native
  def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Term): D = js.native
  def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Term, `object`: Term): D = js.native
  def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Term, `object`: Term, graph: Term): D = js.native
}

