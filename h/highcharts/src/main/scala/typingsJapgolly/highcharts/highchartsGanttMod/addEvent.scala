package typingsJapgolly.highcharts.highchartsGanttMod

import typingsJapgolly.highcharts.mod.Class
import typingsJapgolly.highcharts.mod.EventCallbackFunction
import typingsJapgolly.highcharts.mod.EventOptionsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts/highcharts-gantt", "addEvent")
@js.native
object addEvent extends js.Object {
  def apply[T](el: T, `type`: String, fn: js.Function): js.Function = js.native
  def apply[T](el: T, `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = js.native
  def apply[T](el: T, `type`: String, fn: EventCallbackFunction[T]): js.Function = js.native
  def apply[T](el: T, `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = js.native
  def apply[T](el: Class[T], `type`: String, fn: js.Function): js.Function = js.native
  def apply[T](el: Class[T], `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = js.native
  def apply[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T]): js.Function = js.native
  def apply[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = js.native
}

