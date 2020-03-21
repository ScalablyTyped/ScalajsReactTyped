package typingsJapgolly.agGrid

import typingsJapgolly.agGrid.componentResolverMod.ComponentHolder
import typingsJapgolly.agGrid.iCellEditorMod.ICellEditorParams
import typingsJapgolly.agGrid.iCellRendererMod.ICellRendererFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/interfaces/iRichCellEditorParams", JSImport.Namespace)
@js.native
object iRichCellEditorParamsMod extends js.Object {
  @js.native
  trait IRichCellEditorParams
    extends ICellEditorParams
       with ComponentHolder {
    var cellHeight: Double = js.native
    var cellRenderer: AnonInstantiableICellRendererComp | ICellRendererFunc | String = js.native
    var values: js.Array[String] = js.native
  }
  
}

