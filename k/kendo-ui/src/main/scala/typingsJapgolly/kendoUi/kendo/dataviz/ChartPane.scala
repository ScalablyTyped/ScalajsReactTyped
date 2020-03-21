package typingsJapgolly.kendoUi.kendo.dataviz

import typingsJapgolly.kendoUi.kendo.Observable_
import typingsJapgolly.kendoUi.kendo.drawing.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ChartPane")
@js.native
class ChartPane () extends Observable_ {
  var chartsVisual: Group = js.native
  var options: ChartPaneOptions = js.native
  var visual: Group = js.native
  def findAxisByName(name: String): ChartAxis = js.native
  def series(): js.Any = js.native
}

