package typingsJapgolly.plottable.canvasDrawerMod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsJapgolly.d3Shape.mod.Area_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/canvasDrawer", "renderArea")
@js.native
object renderArea extends js.Object {
  def apply(
    context: CanvasRenderingContext2D,
    d3Area: Area_[_],
    data: js.Array[_],
    style: IFillStyle with IStrokeStyle
  ): Unit = js.native
}

