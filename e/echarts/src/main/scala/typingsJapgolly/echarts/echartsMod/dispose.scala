package typingsJapgolly.echarts.echartsMod

import typingsJapgolly.echarts.echarts.ECharts
import typingsJapgolly.std.HTMLCanvasElement
import typingsJapgolly.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("echarts/lib/echarts", "dispose")
@js.native
object dispose extends js.Object {
  /**
    * Destroys chart instance, after which the instance cannot be used any
    *     more.
    *
    * @param target Chart instance or container.
    */
  def apply(target: ECharts): Unit = js.native
  def apply(target: HTMLCanvasElement): Unit = js.native
  def apply(target: HTMLDivElement): Unit = js.native
}

