package typingsJapgolly.vexflow.mod.Flow

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.vexflow.Vex.Flow.Renderer.Backends
import typingsJapgolly.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Renderer")
@js.native
class Renderer protected ()
  extends typingsJapgolly.vexflow.Vex.Flow.Renderer {
  def this(sel: HTMLElement, backend: Backends) = this()
}

/* static members */
@JSImport("vexflow", "Flow.Renderer")
@js.native
object Renderer extends js.Object {
  var USE_CANVAS_PROXY: Boolean = js.native
  def bolsterCanvasContext(ctx: CanvasRenderingContext2D): typingsJapgolly.vexflow.Vex.Flow.CanvasContext = js.native
  def buildContext(sel: HTMLElement, backend: Backends): IRenderContext = js.native
  def buildContext(sel: HTMLElement, backend: Backends, width: Double): IRenderContext = js.native
  def buildContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): IRenderContext = js.native
  def buildContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): IRenderContext = js.native
  def drawDashedLine(
    context: IRenderContext,
    fromX: Double,
    fromY: Double,
    toX: Double,
    toY: Double,
    dashPattern: js.Array[Double]
  ): Unit = js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends): typingsJapgolly.vexflow.Vex.Flow.CanvasContext = js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double): typingsJapgolly.vexflow.Vex.Flow.CanvasContext = js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typingsJapgolly.vexflow.Vex.Flow.CanvasContext = js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typingsJapgolly.vexflow.Vex.Flow.CanvasContext = js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends): typingsJapgolly.vexflow.Vex.Flow.RaphaelContext = js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double): typingsJapgolly.vexflow.Vex.Flow.RaphaelContext = js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typingsJapgolly.vexflow.Vex.Flow.RaphaelContext = js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typingsJapgolly.vexflow.Vex.Flow.RaphaelContext = js.native
  def getSVGContext(sel: HTMLElement, backend: Backends): typingsJapgolly.vexflow.Vex.Flow.SVGContext = js.native
  def getSVGContext(sel: HTMLElement, backend: Backends, width: Double): typingsJapgolly.vexflow.Vex.Flow.SVGContext = js.native
  def getSVGContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typingsJapgolly.vexflow.Vex.Flow.SVGContext = js.native
  def getSVGContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typingsJapgolly.vexflow.Vex.Flow.SVGContext = js.native
}

