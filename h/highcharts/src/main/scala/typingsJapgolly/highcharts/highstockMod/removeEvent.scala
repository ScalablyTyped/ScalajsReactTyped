package typingsJapgolly.highcharts.highstockMod

import typingsJapgolly.highcharts.mod.Class
import typingsJapgolly.highcharts.mod.EventCallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts/highstock", "removeEvent")
@js.native
object removeEvent extends js.Object {
  def apply[T](el: T): Unit = js.native
  def apply[T](el: T, `type`: String): Unit = js.native
  def apply[T](el: T, `type`: String, fn: EventCallbackFunction[T]): Unit = js.native
  def apply[T](el: Class[T]): Unit = js.native
  def apply[T](el: Class[T], `type`: String): Unit = js.native
  def apply[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T]): Unit = js.native
}

