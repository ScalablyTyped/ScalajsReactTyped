package typingsJapgolly.vexflow.Vex.Flow

import typingsJapgolly.vexflow.AnonBaseY
import typingsJapgolly.vexflow.AnonFillStyle_
import typingsJapgolly.vexflow.AnonStemdirection
import typingsJapgolly.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Stem")
@js.native
class Stem protected () extends js.Object {
  def this(options: AnonStemdirection) = this()
  //inconsistent API: this should be set via the options object in the constructor
  var hide: Boolean = js.native
  def applyStyle(context: IRenderContext): Stem = js.native
  def draw(): Unit = js.native
  def getBoundingBox(): BoundingBox = js.native
  def getCategory(): String = js.native
  def getExtents(): AnonBaseY = js.native
  def getHeight(): Double = js.native
  def getStyle(): AnonFillStyle_ = js.native
  def setContext(context: IRenderContext): Stem = js.native
  def setDirection(direction: Double): Unit = js.native
  def setExtension(extension: Double): Unit = js.native
  def setNoteHeadXBounds(x_begin: Double, x_end: Double): Stem = js.native
  def setStyle(style: AnonFillStyle_): Unit = js.native
  def setYBounds(y_top: Double, y_bottom: Double): Unit = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Stem")
@js.native
object Stem extends js.Object {
  var DEBUG: Boolean = js.native
  val DOWN: Double = js.native
  val UP: Double = js.native
}

