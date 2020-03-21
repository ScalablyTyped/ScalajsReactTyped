package typingsJapgolly.agGrid

import typingsJapgolly.agGrid.componentMod.Component
import typingsJapgolly.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typingsJapgolly.agGrid.iCellEditorMod.ICellEditor
import typingsJapgolly.agGrid.iCellEditorMod.ICellEditorComp
import typingsJapgolly.agGrid.iCellEditorMod.ICellEditorParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellEditors/popupEditorWrapper", JSImport.Namespace)
@js.native
object popupEditorWrapperMod extends js.Object {
  @js.native
  class PopupEditorWrapper protected ()
    extends Component
       with ICellEditor {
    def this(cellEditor: ICellEditorComp) = this()
    var cellEditor: js.Any = js.native
    var getGuiCalledOnChild: js.Any = js.native
    var gridOptionsWrapper: GridOptionsWrapper = js.native
    var params: js.Any = js.native
    @JSName("afterGuiAttached")
    def afterGuiAttached_MPopupEditorWrapper(): Unit = js.native
    @JSName("focusIn")
    def focusIn_MPopupEditorWrapper(): Unit = js.native
    @JSName("focusOut")
    def focusOut_MPopupEditorWrapper(): Unit = js.native
    /** Return the final value - called by the grid once after editing is complete */
    /* CompleteClass */
    override def getValue(): js.Any = js.native
    @JSName("init")
    def init_MPopupEditorWrapper(params: ICellEditorParams): Unit = js.native
    @JSName("isCancelAfterEnd")
    def isCancelAfterEnd_MPopupEditorWrapper(): Boolean = js.native
    @JSName("isCancelBeforeStart")
    def isCancelBeforeStart_MPopupEditorWrapper(): Boolean = js.native
    @JSName("isPopup")
    def isPopup_MPopupEditorWrapper(): Boolean = js.native
    /* private */ def onKeyDown(event: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object PopupEditorWrapper extends js.Object {
    var DOM_KEY_POPUP_EDITOR_WRAPPER: String = js.native
  }
  
}

