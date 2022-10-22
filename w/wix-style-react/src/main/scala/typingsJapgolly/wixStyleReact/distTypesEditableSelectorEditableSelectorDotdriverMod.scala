package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixStyleReact.distTypesSelectorSelectorDotdriverMod.SelectorDriver
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEditableSelectorEditableSelectorDotdriverMod {
  
  trait EditableSelectorDriver
    extends StObject
       with BaseDriver {
    
    def addNewRow(label: String): Unit
    
    def clickApprove(): Unit
    
    def clickCancel(): Unit
    
    def deleteButtonAt(index: Double): HTMLElement
    
    def deleteRow(index: Double): Unit
    
    def editButtonAt(index: Double): HTMLElement
    
    def editRow(index: Double, label: String): Unit
    
    def isAddingRow(): Boolean
    
    def isEditing(): Boolean
    
    def isEditingRow(): Boolean
    
    def items(): js.Array[SelectorDriver]
    
    def newRowButton(): HTMLElement
    
    def startAdding(): Unit
    
    def startEditing(index: Double): Unit
    
    def title(): String
    
    def toggleItem(index: Double): String
  }
  object EditableSelectorDriver {
    
    inline def apply(
      addNewRow: String => Callback,
      clickApprove: Callback,
      clickCancel: Callback,
      deleteButtonAt: Double => HTMLElement,
      deleteRow: Double => Callback,
      editButtonAt: Double => HTMLElement,
      editRow: (Double, String) => Callback,
      exists: CallbackTo[Boolean],
      isAddingRow: CallbackTo[Boolean],
      isEditing: CallbackTo[Boolean],
      isEditingRow: CallbackTo[Boolean],
      items: CallbackTo[js.Array[SelectorDriver]],
      newRowButton: CallbackTo[HTMLElement],
      startAdding: Callback,
      startEditing: Double => Callback,
      title: CallbackTo[String],
      toggleItem: Double => String
    ): EditableSelectorDriver = {
      val __obj = js.Dynamic.literal(addNewRow = js.Any.fromFunction1((t0: String) => addNewRow(t0).runNow()), clickApprove = clickApprove.toJsFn, clickCancel = clickCancel.toJsFn, deleteButtonAt = js.Any.fromFunction1(deleteButtonAt), deleteRow = js.Any.fromFunction1((t0: Double) => deleteRow(t0).runNow()), editButtonAt = js.Any.fromFunction1(editButtonAt), editRow = js.Any.fromFunction2((t0: Double, t1: String) => (editRow(t0, t1)).runNow()), exists = exists.toJsFn, isAddingRow = isAddingRow.toJsFn, isEditing = isEditing.toJsFn, isEditingRow = isEditingRow.toJsFn, items = items.toJsFn, newRowButton = newRowButton.toJsFn, startAdding = startAdding.toJsFn, startEditing = js.Any.fromFunction1((t0: Double) => startEditing(t0).runNow()), title = title.toJsFn, toggleItem = js.Any.fromFunction1(toggleItem))
      __obj.asInstanceOf[EditableSelectorDriver]
    }
    
    extension [Self <: EditableSelectorDriver](x: Self) {
      
      inline def setAddNewRow(value: String => Callback): Self = StObject.set(x, "addNewRow", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setClickApprove(value: Callback): Self = StObject.set(x, "clickApprove", value.toJsFn)
      
      inline def setClickCancel(value: Callback): Self = StObject.set(x, "clickCancel", value.toJsFn)
      
      inline def setDeleteButtonAt(value: Double => HTMLElement): Self = StObject.set(x, "deleteButtonAt", js.Any.fromFunction1(value))
      
      inline def setDeleteRow(value: Double => Callback): Self = StObject.set(x, "deleteRow", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setEditButtonAt(value: Double => HTMLElement): Self = StObject.set(x, "editButtonAt", js.Any.fromFunction1(value))
      
      inline def setEditRow(value: (Double, String) => Callback): Self = StObject.set(x, "editRow", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setIsAddingRow(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAddingRow", value.toJsFn)
      
      inline def setIsEditing(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEditing", value.toJsFn)
      
      inline def setIsEditingRow(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEditingRow", value.toJsFn)
      
      inline def setItems(value: CallbackTo[js.Array[SelectorDriver]]): Self = StObject.set(x, "items", value.toJsFn)
      
      inline def setNewRowButton(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "newRowButton", value.toJsFn)
      
      inline def setStartAdding(value: Callback): Self = StObject.set(x, "startAdding", value.toJsFn)
      
      inline def setStartEditing(value: Double => Callback): Self = StObject.set(x, "startEditing", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setTitle(value: CallbackTo[String]): Self = StObject.set(x, "title", value.toJsFn)
      
      inline def setToggleItem(value: Double => String): Self = StObject.set(x, "toggleItem", js.Any.fromFunction1(value))
    }
  }
}
