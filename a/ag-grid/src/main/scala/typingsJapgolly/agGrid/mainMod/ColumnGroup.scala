package typingsJapgolly.agGrid.mainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "ColumnGroup")
@js.native
class ColumnGroup protected ()
  extends typingsJapgolly.agGrid.columnGroupMod.ColumnGroup {
  def this(
    originalColumnGroup: typingsJapgolly.agGrid.originalColumnGroupMod.OriginalColumnGroup,
    groupId: String,
    instanceId: Double
  ) = this()
}

/* static members */
@JSImport("ag-grid/dist/lib/main", "ColumnGroup")
@js.native
object ColumnGroup extends js.Object {
  var EVENT_DISPLAYED_CHILDREN_CHANGED: String = js.native
  var EVENT_LEFT_CHANGED: String = js.native
  var HEADER_GROUP_SHOW_CLOSED: String = js.native
  var HEADER_GROUP_SHOW_OPEN: String = js.native
  def createUniqueId(groupId: String, instanceId: Double): String = js.native
}

