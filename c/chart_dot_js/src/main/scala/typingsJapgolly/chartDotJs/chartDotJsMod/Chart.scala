package typingsJapgolly.chartDotJs.chartDotJsMod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chart extends js.Object {
  var aspectRatio: Double | Null = js.native
  var canvas: HTMLCanvasElement | Null = js.native
  var chartArea: ChartArea = js.native
  var config: ChartConfiguration = js.native
  var ctx: CanvasRenderingContext2D | Null = js.native
  var data: ChartData = js.native
  var height: Double | Null = js.native
  var options: ChartOptions = js.native
  var width: Double | Null = js.native
  def clear(): js.Object = js.native
  def destroy(): js.Object = js.native
  def generateLegend(): js.Object = js.native
  def getDatasetAtEvent(e: js.Any): js.Array[js.Object] = js.native
  def getDatasetMeta(index: Double): Meta = js.native
  def getElementAtEvent(e: js.Any): js.Array[js.Object] = js.native
  def getElementsAtEvent(e: js.Any): js.Array[js.Object] = js.native
  def render(): js.Object = js.native
  def render(hasDurationLazyEasing: ChartRenderProps): js.Object = js.native
  def resize(): js.Object = js.native
  def stop(): js.Object = js.native
  def toBase64Image(): String = js.native
  def update(): js.Object = js.native
  def update(hasDurationLazyEasing: ChartUpdateProps): js.Object = js.native
}

