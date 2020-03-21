package typingsJapgolly.kendoUi.kendo.dataviz.diagram

import typingsJapgolly.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.Layout")
@js.native
class Layout protected () extends Observable_ {
  def this(rect: Rect) = this()
  def this(rect: Rect, options: LayoutOptions) = this()
  var drawingElement: typingsJapgolly.kendoUi.kendo.drawing.Layout = js.native
  var options: LayoutOptions = js.native
  def append(element: js.Any): Unit = js.native
  def clear(): Unit = js.native
  def rect(): Rect = js.native
  def rect(rect: Rect): Unit = js.native
  def reflow(): Unit = js.native
  def remove(element: js.Any): Unit = js.native
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}

