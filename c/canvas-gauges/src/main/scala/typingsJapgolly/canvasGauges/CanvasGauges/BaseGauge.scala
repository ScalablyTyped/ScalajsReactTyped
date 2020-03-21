package typingsJapgolly.canvasGauges.CanvasGauges

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.canvasGauges.canvasGaugesStrings.animate
import typingsJapgolly.canvasGauges.canvasGaugesStrings.animationEnd
import typingsJapgolly.canvasGauges.canvasGaugesStrings.animationStart
import typingsJapgolly.canvasGauges.canvasGaugesStrings.beforeHighlights
import typingsJapgolly.canvasGauges.canvasGaugesStrings.beforeMajorTicks
import typingsJapgolly.canvasGauges.canvasGaugesStrings.beforeMinorTicks
import typingsJapgolly.canvasGauges.canvasGaugesStrings.beforeNeedle
import typingsJapgolly.canvasGauges.canvasGaugesStrings.beforeNumbers
import typingsJapgolly.canvasGauges.canvasGaugesStrings.beforePlate
import typingsJapgolly.canvasGauges.canvasGaugesStrings.beforeProgressBar
import typingsJapgolly.canvasGauges.canvasGaugesStrings.beforeTitle
import typingsJapgolly.canvasGauges.canvasGaugesStrings.beforeUnits
import typingsJapgolly.canvasGauges.canvasGaugesStrings.beforeValueBox
import typingsJapgolly.canvasGauges.canvasGaugesStrings.destroy
import typingsJapgolly.canvasGauges.canvasGaugesStrings.init
import typingsJapgolly.canvasGauges.canvasGaugesStrings.render
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CanvasGauges.BaseGauge")
@js.native
abstract class BaseGauge protected () extends js.Object {
  def this(options: GenericOptions) = this()
  var animation: Animation = js.native
  var canvas: SmartCanvas = js.native
  var options: GenericOptions = js.native
  var `type`: BaseGauge = js.native
  var value: Double = js.native
  def destroy(): js.Any = js.native
  def draw(): BaseGauge = js.native
  @JSName("on")
  def on_animate(event: animate, listeners: js.Function2[/* percent */ Double, /* value */ Double, Unit]): Unit = js.native
  @JSName("on")
  def on_animationEnd(event: animationEnd, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_animationStart(event: animationStart, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeHighlights(event: beforeHighlights, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeMajorTicks(event: beforeMajorTicks, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeMinorTicks(event: beforeMinorTicks, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeNeedle(event: beforeNeedle, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeNumbers(event: beforeNumbers, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforePlate(event: beforePlate, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeProgressBar(event: beforeProgressBar, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeTitle(event: beforeTitle, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeUnits(event: beforeUnits, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeValueBox(event: beforeValueBox, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_destroy(event: destroy, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_init(event: init, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_render(event: render, listeners: js.Function0[Unit]): Unit = js.native
  def update(options: GenericOptions): BaseGauge = js.native
}

/* static members */
@JSGlobal("CanvasGauges.BaseGauge")
@js.native
object BaseGauge extends js.Object {
  val version: Double = js.native
  def ensureValue(value: Double): Double = js.native
  def fromElement(element: HTMLElement): js.Any = js.native
  def initialize(`type`: String, options: GenericOptions): js.Any = js.native
}

