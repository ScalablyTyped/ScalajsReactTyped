package typingsJapgolly.echarts.echarts.EChartOption.BasicComponents.CartesianAxis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.echarts.echartsStrings.value
  - typingsJapgolly.echarts.echartsStrings.category
  - typingsJapgolly.echarts.echartsStrings.time
  - typingsJapgolly.echarts.echartsStrings.log
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def category: typingsJapgolly.echarts.echartsStrings.category = this.cast("category")
  @scala.inline
  def log: typingsJapgolly.echarts.echartsStrings.log = this.cast("log")
  @scala.inline
  def time: typingsJapgolly.echarts.echartsStrings.time = this.cast("time")
  @scala.inline
  def value: typingsJapgolly.echarts.echartsStrings.value = this.cast("value")
}

