package typingsJapgolly.highcharts.highchartsGanttMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.highcharts.mod.CSSObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts/highcharts-gantt", "SVGRenderer")
@js.native
class SVGRenderer protected ()
  extends typingsJapgolly.highcharts.mod.SVGRenderer {
  /**
    * Allows direct access to the Highcharts rendering layer in order to draw
    * primitive shapes like circles, rectangles, paths or text directly on a
    * chart, or independent from any chart. The SVGRenderer represents a
    * wrapper object for SVG in modern browsers. Through the VMLRenderer, part
    * of the `oldie.js` module, it also brings vector graphics to IE <= 8.
    *
    * An existing chart's renderer can be accessed through Chart.renderer. The
    * renderer can also be used completely decoupled from a chart.
    *
    * @param container
    *        Where to put the SVG in the web page.
    *
    * @param width
    *        The width of the SVG.
    *
    * @param height
    *        The height of the SVG.
    *
    * @param style
    *        The box style, if not in styleMode
    *
    * @param forExport
    *        Whether the rendered content is intended for export.
    *
    * @param allowHTML
    *        Whether the renderer is allowed to include HTML text, which will
    *        be projected on top of the SVG.
    *
    * @param styledMode
    *        Whether the renderer belongs to a chart that is in styled mode. If
    *        it does, it will avoid setting presentational attributes in some
    *        cases, but not when set explicitly through `.attr` and `.css` etc.
    */
  def this(container: HTMLElement, width: Double, height: Double) = this()
  def this(container: HTMLElement, width: Double, height: Double, style: CSSObject) = this()
  def this(container: HTMLElement, width: Double, height: Double, style: CSSObject, forExport: Boolean) = this()
  def this(
    container: HTMLElement,
    width: Double,
    height: Double,
    style: CSSObject,
    forExport: Boolean,
    allowHTML: Boolean
  ) = this()
  def this(
    container: HTMLElement,
    width: Double,
    height: Double,
    style: CSSObject,
    forExport: Boolean,
    allowHTML: Boolean,
    styledMode: Boolean
  ) = this()
}

