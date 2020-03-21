package typingsJapgolly.ol.triangulationMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Triangulation extends js.Object {
  def calculateSourceExtent(): Extent
  def getTriangles(): js.Array[Triangle]
}

object Triangulation {
  @scala.inline
  def apply(calculateSourceExtent: CallbackTo[Extent], getTriangles: CallbackTo[js.Array[Triangle]]): Triangulation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calculateSourceExtent")(calculateSourceExtent.toJsFn)
    __obj.updateDynamic("getTriangles")(getTriangles.toJsFn)
    __obj.asInstanceOf[Triangulation]
  }
}

