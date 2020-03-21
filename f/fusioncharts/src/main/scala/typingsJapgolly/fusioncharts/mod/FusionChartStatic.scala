package typingsJapgolly.fusioncharts.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FusionChartStatic
  extends Instantiable1[(/* chartObject */ ChartObject) | (/* chartObject */ js.Object), FusionCharts] {
  var debugger: Debugger = js.native
  var version: js.Array[String] = js.native
  def apply(chartId: String): FusionCharts = js.native
  def addEventListener(
    `type`: String,
    listener: js.Function2[
      /* eventObject */ js.UndefOr[EventObject], 
      /* eventArgs */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: js.Array[String],
    listener: js.Function2[
      /* eventObject */ js.UndefOr[EventObject], 
      /* eventArgs */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Unit = js.native
  def batchExport(options: js.Object): Unit = js.native
  def formatNumber(num: Double): Element = js.native
  def formatNumber(num: Double, `type`: String): Element = js.native
  def formatNumber(num: Double, `type`: String, config: js.Object): Element = js.native
  def getCurrentRenderer(): String = js.native
  def getObjectReference(elementId: String): Element = js.native
  def ready(callback: js.Function1[/* fusionChartStatic */ js.UndefOr[this.type], _]): FusionChartStatic = js.native
  def ready(callback: js.Function1[/* fusionChartStatic */ js.UndefOr[this.type], _], context: js.Any): FusionChartStatic = js.native
  def removeEventListener(
    `type`: String,
    listener: js.Function2[
      /* eventObject */ js.UndefOr[EventObject], 
      /* eventArgs */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Unit = js.native
  def removeEventListener(
    `type`: js.Array[String],
    listener: js.Function2[
      /* eventObject */ js.UndefOr[EventObject], 
      /* eventArgs */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Unit = js.native
  def render(): FusionCharts = js.native
  def render(options: ChartObject): FusionCharts = js.native
  def render(options: ChartObject, callback: js.Function0[_]): FusionCharts = js.native
  def setCurrentRenderer(name: String): Unit = js.native
  def transcodeData(data: String, source: ChartDataFormats, target: ChartDataFormats, advanced: Boolean): js.Any = js.native
  def transcodeData(data: js.Object, source: ChartDataFormats, target: ChartDataFormats, advanced: Boolean): js.Any = js.native
}

