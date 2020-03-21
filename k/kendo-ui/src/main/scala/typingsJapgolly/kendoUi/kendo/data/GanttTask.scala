package typingsJapgolly.kendoUi.kendo.data

import typingsJapgolly.kendoUi.TypeofGanttTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.GanttTask")
@js.native
class GanttTask () extends Model {
  def this(data: js.Any) = this()
  var end: js.Date = js.native
  var expanded: Boolean = js.native
  var orderId: Double = js.native
  var parentId: Double = js.native
  var percentComplete: Double = js.native
  var start: js.Date = js.native
  var summary: Boolean = js.native
  var title: String = js.native
}

/* static members */
@JSGlobal("kendo.data.GanttTask")
@js.native
object GanttTask extends js.Object {
  var fields: DataSourceSchemaModelFields = js.native
  var idField: String = js.native
  def define(options: DataSourceSchemaModelWithFieldsArray): TypeofGanttTask = js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): TypeofGanttTask = js.native
}

