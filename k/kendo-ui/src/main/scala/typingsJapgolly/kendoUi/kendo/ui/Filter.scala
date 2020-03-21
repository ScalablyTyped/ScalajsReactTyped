package typingsJapgolly.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Filter")
@js.native
class Filter protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: FilterOptions) = this()
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_Filter: FilterOptions = js.native
  var wrapper: JQuery = js.native
  def applyFilter(): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.Filter")
@js.native
object Filter extends js.Object {
  var fn: Filter = js.native
  def extend(proto: js.Object): Filter = js.native
}

