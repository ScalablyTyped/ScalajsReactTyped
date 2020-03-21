package typingsJapgolly.agGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "ClientSideNodeManager")
@js.native
class ClientSideNodeManager protected ()
  extends typingsJapgolly.agGrid.clientSideNodeManagerMod.ClientSideNodeManager {
  def this(
    rootNode: typingsJapgolly.agGrid.rowNodeMod.RowNode,
    gridOptionsWrapper: typingsJapgolly.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    context: typingsJapgolly.agGrid.contextMod.Context,
    eventService: typingsJapgolly.agGrid.eventServiceMod.EventService,
    columnController: typingsJapgolly.agGrid.columnControllerMod.ColumnController,
    gridApi: typingsJapgolly.agGrid.gridApiMod.GridApi,
    columnApi: typingsJapgolly.agGrid.columnApiMod.ColumnApi,
    selectionController: typingsJapgolly.agGrid.selectionControllerMod.SelectionController
  ) = this()
}

/* static members */
@JSImport("ag-grid", "ClientSideNodeManager")
@js.native
object ClientSideNodeManager extends js.Object {
  var ROOT_NODE_ID: js.Any = js.native
  var TOP_LEVEL: js.Any = js.native
}

