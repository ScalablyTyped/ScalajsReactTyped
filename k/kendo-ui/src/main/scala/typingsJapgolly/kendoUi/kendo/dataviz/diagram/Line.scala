package typingsJapgolly.kendoUi.kendo.dataviz.diagram

import typingsJapgolly.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.Line")
@js.native
class Line () extends Observable_ {
  def this(options: LineOptions) = this()
  var drawingElement: typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  var options: LineOptions = js.native
  def position(): Unit = js.native
  def position(offset: Point): Unit = js.native
  def rotate(angle: Double, center: Point): Unit = js.native
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}

