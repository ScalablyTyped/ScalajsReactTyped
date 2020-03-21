package typingsJapgolly.vexflow.Vex.Flow

import typingsJapgolly.vexflow.AnonArrowheadangle
import typingsJapgolly.vexflow.AnonFirstindices
import typingsJapgolly.vexflow.AnonLastindices
import typingsJapgolly.vexflow.AnonSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveLine")
@js.native
class StaveLine_ protected () extends js.Object {
  def this(notes: AnonFirstindices) = this()
  //inconsistent API: this should be set via an options object in the constructor
  var render_options: AnonArrowheadangle = js.native
  def applyFontStyle(): Unit = js.native
  def applyLineStyle(): Unit = js.native
  def draw(): StaveLine = js.native
  def setContext(context: js.Object): StaveLine = js.native
  def setFont(font: AnonSize): StaveLine = js.native
  def setNotes(notes: AnonLastindices): StaveLine = js.native
  def setText(text: String): StaveLine = js.native
}

