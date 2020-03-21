package typingsJapgolly.agGrid

import typingsJapgolly.agGrid.colDefMod.ColDef
import typingsJapgolly.agGrid.iCellEditorMod.ICellEditorComp
import typingsJapgolly.agGrid.iCellEditorMod.ICellEditorParams
import typingsJapgolly.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellEditorFactory", JSImport.Namespace)
@js.native
object cellEditorFactoryMod extends js.Object {
  @js.native
  class CellEditorFactory () extends js.Object {
    var componentResolver: js.Any = js.native
    var context: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    def addCellEditor(key: String, cellEditor: AnonInstantiableICellEditorComp): Unit = js.native
    def createCellEditor(column: ColDef, params: ICellEditorParams): Promise[ICellEditorComp] = js.native
    /* private */ def init(): js.Any = js.native
  }
  
}

