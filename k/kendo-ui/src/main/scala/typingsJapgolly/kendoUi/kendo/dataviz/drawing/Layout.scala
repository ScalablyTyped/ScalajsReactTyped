package typingsJapgolly.kendoUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Layout")
@js.native
class Layout protected ()
  extends typingsJapgolly.kendoUi.kendo.drawing.Group {
  def this(rect: typingsJapgolly.kendoUi.kendo.geometry.Rect) = this()
  def this(rect: typingsJapgolly.kendoUi.kendo.geometry.Rect, options: LayoutOptions) = this()
  @JSName("options")
  var options_Layout: LayoutOptions = js.native
  def rect(): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
  def rect(rect: typingsJapgolly.kendoUi.kendo.geometry.Rect): Unit = js.native
  def reflow(): Unit = js.native
}

