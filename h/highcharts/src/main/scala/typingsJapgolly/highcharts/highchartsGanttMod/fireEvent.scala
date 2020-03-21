package typingsJapgolly.highcharts.highchartsGanttMod

import typingsJapgolly.highcharts.mod.Dictionary
import typingsJapgolly.highcharts.mod.EventCallbackFunction
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts/highcharts-gantt", "fireEvent")
@js.native
object fireEvent extends js.Object {
  def apply[T](el: T, `type`: String): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Dictionary[_]): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Dictionary[_], defaultFunction: js.Function): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Dictionary[_], defaultFunction: EventCallbackFunction[T]): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Event_): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Event_, defaultFunction: js.Function): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Event_, defaultFunction: EventCallbackFunction[T]): Unit = js.native
}

