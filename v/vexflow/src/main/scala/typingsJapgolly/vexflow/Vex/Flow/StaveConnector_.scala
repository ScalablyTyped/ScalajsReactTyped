package typingsJapgolly.vexflow.Vex.Flow

import typingsJapgolly.vexflow.AnonFamily
import typingsJapgolly.vexflow.AnonShiftx
import typingsJapgolly.vexflow.Vex.Flow.StaveConnector.`type`
import typingsJapgolly.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveConnector")
@js.native
class StaveConnector_ protected () extends js.Object {
  def this(top_stave: Stave, bottom_stave: Stave) = this()
  var bottom_stave: Stave = js.native
  var thickness: Double = js.native
  var top_stave: Stave = js.native
  var x_shift: Double = js.native
  def draw(): Unit = js.native
  def drawBoldDoubleLine(ctx: js.Object, `type`: `type`, topX: Double, topY: Double, botY: Double): Unit = js.native
  def setContext(ctx: IRenderContext): StaveConnector = js.native
  def setFont(font: AnonFamily): Unit = js.native
  def setText(text: String): StaveConnector = js.native
  def setText(text: String, text_options: AnonShiftx): StaveConnector = js.native
  def setType(`type`: `type`): StaveConnector = js.native
   //inconsistent type: void -> StaveConnector
  def setXShift(x_shift: Double): StaveConnector = js.native
}

