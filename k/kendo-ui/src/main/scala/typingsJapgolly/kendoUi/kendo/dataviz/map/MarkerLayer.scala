package typingsJapgolly.kendoUi.kendo.dataviz.map

import typingsJapgolly.kendoUi.kendo.dataviz.ui.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.map.MarkerLayer")
@js.native
class MarkerLayer protected () extends Layer_ {
  def this(map: Map) = this()
  def this(map: Map, options: MarkerLayerOptions) = this()
  var items: js.Any = js.native
  @JSName("options")
  var options_MarkerLayer: MarkerLayerOptions = js.native
  def add(marker: Marker): Unit = js.native
  def clear(): Unit = js.native
  def remove(marker: Marker): Unit = js.native
  def setDataSource(dataSource: js.Any): Unit = js.native
}

