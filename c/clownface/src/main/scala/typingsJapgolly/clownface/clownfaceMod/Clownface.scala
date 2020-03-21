package typingsJapgolly.clownface.clownfaceMod

import typingsJapgolly.clownface.mod.SafeClownface
import typingsJapgolly.clownface.mod.SingleContextClownface
import typingsJapgolly.rdfJs.mod.BlankNode
import typingsJapgolly.rdfJs.mod.DatasetCore
import typingsJapgolly.rdfJs.mod.Quad
import typingsJapgolly.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clownface[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */]
  extends typingsJapgolly.clownface.mod.Clownface[D, T] {
  def blankNode(value: String): SingleContextClownface[D, BlankNode] = js.native
  @JSName("blankNode")
  def blankNode_SafeClownface(values: js.Array[String]): SafeClownface[D, BlankNode] = js.native
}

