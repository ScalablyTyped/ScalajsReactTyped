package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixStyleReact.distTypesSelectorSelectorDotuniDotdriverMod.SelectorUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEditableSelectorEditableSelectorDotuniDotdriverMod {
  
  trait EditableSelectorUniDriver
    extends StObject
       with BaseUniDriver {
    
    def addNewRow(label: String): js.Promise[Unit]
    
    def clickApprove(): js.Promise[Unit]
    
    def clickCancel(): js.Promise[Unit]
    
    def deleteButtonAt(index: Double): js.Promise[HTMLElement]
    
    def deleteRow(index: Double): js.Promise[Unit]
    
    def editButtonAt(index: Double): js.Promise[HTMLElement]
    
    def editRow(index: Double, label: String): js.Promise[Unit]
    
    def isAddingRow(): js.Promise[Boolean]
    
    def isEditing(): js.Promise[Boolean]
    
    def isEditingRow(): js.Promise[Boolean]
    
    def items(): js.Array[SelectorUniDriver]
    
    def newRowButton(): js.Promise[HTMLElement]
    
    def startAdding(): js.Promise[Unit]
    
    def startEditing(index: Double): js.Promise[Unit]
    
    def title(): js.Promise[String]
    
    def toggleItem(index: Double): js.Promise[String]
  }
  object EditableSelectorUniDriver {
    
    inline def apply(
      addNewRow: String => js.Promise[Unit],
      click: CallbackTo[js.Promise[Unit]],
      clickApprove: CallbackTo[js.Promise[Unit]],
      clickCancel: CallbackTo[js.Promise[Unit]],
      deleteButtonAt: Double => js.Promise[HTMLElement],
      deleteRow: Double => js.Promise[Unit],
      editButtonAt: Double => js.Promise[HTMLElement],
      editRow: (Double, String) => js.Promise[Unit],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      isAddingRow: CallbackTo[js.Promise[Boolean]],
      isEditing: CallbackTo[js.Promise[Boolean]],
      isEditingRow: CallbackTo[js.Promise[Boolean]],
      items: CallbackTo[js.Array[SelectorUniDriver]],
      newRowButton: CallbackTo[js.Promise[HTMLElement]],
      startAdding: CallbackTo[js.Promise[Unit]],
      startEditing: Double => js.Promise[Unit],
      title: CallbackTo[js.Promise[String]],
      toggleItem: Double => js.Promise[String]
    ): EditableSelectorUniDriver = {
      val __obj = js.Dynamic.literal(addNewRow = js.Any.fromFunction1(addNewRow), click = click.toJsFn, clickApprove = clickApprove.toJsFn, clickCancel = clickCancel.toJsFn, deleteButtonAt = js.Any.fromFunction1(deleteButtonAt), deleteRow = js.Any.fromFunction1(deleteRow), editButtonAt = js.Any.fromFunction1(editButtonAt), editRow = js.Any.fromFunction2(editRow), element = element.toJsFn, exists = exists.toJsFn, isAddingRow = isAddingRow.toJsFn, isEditing = isEditing.toJsFn, isEditingRow = isEditingRow.toJsFn, items = items.toJsFn, newRowButton = newRowButton.toJsFn, startAdding = startAdding.toJsFn, startEditing = js.Any.fromFunction1(startEditing), title = title.toJsFn, toggleItem = js.Any.fromFunction1(toggleItem))
      __obj.asInstanceOf[EditableSelectorUniDriver]
    }
    
    extension [Self <: EditableSelectorUniDriver](x: Self) {
      
      inline def setAddNewRow(value: String => js.Promise[Unit]): Self = StObject.set(x, "addNewRow", js.Any.fromFunction1(value))
      
      inline def setClickApprove(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickApprove", value.toJsFn)
      
      inline def setClickCancel(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickCancel", value.toJsFn)
      
      inline def setDeleteButtonAt(value: Double => js.Promise[HTMLElement]): Self = StObject.set(x, "deleteButtonAt", js.Any.fromFunction1(value))
      
      inline def setDeleteRow(value: Double => js.Promise[Unit]): Self = StObject.set(x, "deleteRow", js.Any.fromFunction1(value))
      
      inline def setEditButtonAt(value: Double => js.Promise[HTMLElement]): Self = StObject.set(x, "editButtonAt", js.Any.fromFunction1(value))
      
      inline def setEditRow(value: (Double, String) => js.Promise[Unit]): Self = StObject.set(x, "editRow", js.Any.fromFunction2(value))
      
      inline def setIsAddingRow(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isAddingRow", value.toJsFn)
      
      inline def setIsEditing(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isEditing", value.toJsFn)
      
      inline def setIsEditingRow(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isEditingRow", value.toJsFn)
      
      inline def setItems(value: CallbackTo[js.Array[SelectorUniDriver]]): Self = StObject.set(x, "items", value.toJsFn)
      
      inline def setNewRowButton(value: CallbackTo[js.Promise[HTMLElement]]): Self = StObject.set(x, "newRowButton", value.toJsFn)
      
      inline def setStartAdding(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "startAdding", value.toJsFn)
      
      inline def setStartEditing(value: Double => js.Promise[Unit]): Self = StObject.set(x, "startEditing", js.Any.fromFunction1(value))
      
      inline def setTitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "title", value.toJsFn)
      
      inline def setToggleItem(value: Double => js.Promise[String]): Self = StObject.set(x, "toggleItem", js.Any.fromFunction1(value))
    }
  }
}
