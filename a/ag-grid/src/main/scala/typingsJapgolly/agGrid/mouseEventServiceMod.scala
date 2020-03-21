package typingsJapgolly.agGrid

import typingsJapgolly.agGrid.cellCompMod.CellComp
import typingsJapgolly.agGrid.gridCellMod.GridCell
import typingsJapgolly.std.Event_
import typingsJapgolly.std.KeyboardEvent
import typingsJapgolly.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/gridPanel/mouseEventService", JSImport.Namespace)
@js.native
object mouseEventServiceMod extends js.Object {
  @js.native
  class MouseEventService () extends js.Object {
    var eGridDiv: js.Any = js.native
    var gridInstanceId: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    def getGridCellForEvent(event: KeyboardEvent): GridCell = js.native
    def getGridCellForEvent(event: MouseEvent): GridCell = js.native
    def getRenderedCellForEvent(event: Event_): CellComp = js.native
    /* private */ def init(): js.Any = js.native
    def isEventFromThisGrid(event: KeyboardEvent): Boolean = js.native
    def isEventFromThisGrid(event: MouseEvent): Boolean = js.native
    /* private */ def stampDomElementWithGridInstance(): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object MouseEventService extends js.Object {
    var GRID_DOM_KEY: js.Any = js.native
    var gridInstanceSequence: js.Any = js.native
  }
  
}

