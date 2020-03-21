package typingsJapgolly.kendoUi.kendo.dataviz

import typingsJapgolly.kendoUi.kendo.Observable_
import typingsJapgolly.kendoUi.kendo.geometry.Point
import typingsJapgolly.kendoUi.kendo.geometry.Rect
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ChartAxis")
@js.native
class ChartAxis () extends Observable_ {
  var options: ChartAxisOptions = js.native
  def range(): js.Any = js.native
  def slot(from: String): Rect = js.native
  def slot(from: String, to: String): Rect = js.native
  def slot(from: String, to: String, limit: Boolean): Rect = js.native
  def slot(from: String, to: Double): Rect = js.native
  def slot(from: String, to: Double, limit: Boolean): Rect = js.native
  def slot(from: String, to: Date): Rect = js.native
  def slot(from: String, to: Date, limit: Boolean): Rect = js.native
  def slot(from: Double): Rect = js.native
  def slot(from: Double, to: String): Rect = js.native
  def slot(from: Double, to: String, limit: Boolean): Rect = js.native
  def slot(from: Double, to: Double): Rect = js.native
  def slot(from: Double, to: Double, limit: Boolean): Rect = js.native
  def slot(from: Double, to: Date): Rect = js.native
  def slot(from: Double, to: Date, limit: Boolean): Rect = js.native
  def slot(from: Date): Rect = js.native
  def slot(from: Date, to: String): Rect = js.native
  def slot(from: Date, to: String, limit: Boolean): Rect = js.native
  def slot(from: Date, to: Double): Rect = js.native
  def slot(from: Date, to: Double, limit: Boolean): Rect = js.native
  def slot(from: Date, to: Date): Rect = js.native
  def slot(from: Date, to: Date, limit: Boolean): Rect = js.native
  def value(point: Point): Unit = js.native
  def valueRange(): Unit = js.native
}

