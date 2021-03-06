package typingsJapgolly.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetCoreFactory[OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */, D /* <: DatasetCore[OutQuad, InQuad] */] extends js.Object {
  /**
    * Returns a new dataset and imports all quads, if given.
    */
  def dataset(): D = js.native
  def dataset(quads: js.Array[InQuad]): D = js.native
}

