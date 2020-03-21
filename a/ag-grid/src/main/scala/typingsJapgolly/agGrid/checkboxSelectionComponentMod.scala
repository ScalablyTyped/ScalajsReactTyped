package typingsJapgolly.agGrid

import typingsJapgolly.agGrid.componentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/checkboxSelectionComponent", JSImport.Namespace)
@js.native
object checkboxSelectionComponentMod extends js.Object {
  @js.native
  class CheckboxSelectionComponent () extends Component {
    var column: js.Any = js.native
    var columnApi: js.Any = js.native
    var eCheckedIcon: js.Any = js.native
    var eIndeterminateIcon: js.Any = js.native
    var eUncheckedIcon: js.Any = js.native
    var eventService: js.Any = js.native
    var gridApi: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    var isRowSelectableFunc: js.Any = js.native
    var rowNode: js.Any = js.native
    /* private */ def checkboxCallbackExists(): js.Any = js.native
    /* private */ def createAndAddIcons(): js.Any = js.native
    @JSName("init")
    def init_MCheckboxSelectionComponent(params: js.Any): Unit = js.native
    /* private */ def onCheckedClicked(): js.Any = js.native
    /* private */ def onDataChanged(): js.Any = js.native
    /* private */ def onIndeterminateClicked(event: js.Any): js.Any = js.native
    /* private */ def onSelectableChanged(): js.Any = js.native
    /* private */ def onSelectionChanged(): js.Any = js.native
    /* private */ def onUncheckedClicked(event: js.Any): js.Any = js.native
    /* private */ def showOrHideSelect(): js.Any = js.native
  }
  
}

