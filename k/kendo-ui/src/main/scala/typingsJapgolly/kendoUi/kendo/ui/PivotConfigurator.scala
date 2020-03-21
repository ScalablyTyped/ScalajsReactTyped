package typingsJapgolly.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.kendo.data.DataSource
import typingsJapgolly.kendoUi.kendo.data.PivotDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.PivotConfigurator")
@js.native
class PivotConfigurator protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: PivotConfiguratorOptions) = this()
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_PivotConfigurator: PivotConfiguratorOptions = js.native
  var wrapper: JQuery = js.native
  def refresh(): Unit = js.native
  def setDataSource(dataSource: PivotDataSource): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.PivotConfigurator")
@js.native
object PivotConfigurator extends js.Object {
  var fn: PivotConfigurator = js.native
  def extend(proto: js.Object): PivotConfigurator = js.native
}

