package typingsJapgolly.vexflow.Vex.Flow

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGRect
import typingsJapgolly.vexflow.AnonY
import typingsJapgolly.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.SVGContext")
@js.native
class SVGContext protected () extends IRenderContext {
  def this(element: HTMLElement) = this()
  var attributes: js.Any = js.native
  var lineWidth: Double = js.native
  var state: js.Any = js.native
  var svg: SVGElement = js.native
  def ieMeasureTextFix(bbox: SVGRect, text: String): AnonY = js.native
  def iePolyfill(): Boolean = js.native
  def rect(x: Double, y: Double, width: Double, height: Double): SVGContext = js.native
  def setFont(family: String, size: Double, weight: String): SVGContext = js.native
  def setViewBox(xMin: Double, yMin: Double, width: Double, height: Double): Unit = js.native
}

