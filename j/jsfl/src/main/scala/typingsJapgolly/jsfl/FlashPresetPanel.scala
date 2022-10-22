package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashPresetPanel extends StObject {
  
  def addNewItem(): Any
  
  def applyPreset(): Any
  
  def deleteFolder(): Any
  
  def deleteItem(): Any
  
  def expandFolder(): Any
  
  def exportItem(): Any
  
  def findItemIndex(): Any
  
  def getSelectedItems(): Any
  
  def importItem(): Any
  
  def moveToFolder(): Any
  
  def newFolder(): Any
  
  def renameItem(): Any
  
  def selectItem(): Any
}
object FlashPresetPanel {
  
  inline def apply(
    addNewItem: CallbackTo[Any],
    applyPreset: CallbackTo[Any],
    deleteFolder: CallbackTo[Any],
    deleteItem: CallbackTo[Any],
    expandFolder: CallbackTo[Any],
    exportItem: CallbackTo[Any],
    findItemIndex: CallbackTo[Any],
    getSelectedItems: CallbackTo[Any],
    importItem: CallbackTo[Any],
    moveToFolder: CallbackTo[Any],
    newFolder: CallbackTo[Any],
    renameItem: CallbackTo[Any],
    selectItem: CallbackTo[Any]
  ): FlashPresetPanel = {
    val __obj = js.Dynamic.literal(addNewItem = addNewItem.toJsFn, applyPreset = applyPreset.toJsFn, deleteFolder = deleteFolder.toJsFn, deleteItem = deleteItem.toJsFn, expandFolder = expandFolder.toJsFn, exportItem = exportItem.toJsFn, findItemIndex = findItemIndex.toJsFn, getSelectedItems = getSelectedItems.toJsFn, importItem = importItem.toJsFn, moveToFolder = moveToFolder.toJsFn, newFolder = newFolder.toJsFn, renameItem = renameItem.toJsFn, selectItem = selectItem.toJsFn)
    __obj.asInstanceOf[FlashPresetPanel]
  }
  
  extension [Self <: FlashPresetPanel](x: Self) {
    
    inline def setAddNewItem(value: CallbackTo[Any]): Self = StObject.set(x, "addNewItem", value.toJsFn)
    
    inline def setApplyPreset(value: CallbackTo[Any]): Self = StObject.set(x, "applyPreset", value.toJsFn)
    
    inline def setDeleteFolder(value: CallbackTo[Any]): Self = StObject.set(x, "deleteFolder", value.toJsFn)
    
    inline def setDeleteItem(value: CallbackTo[Any]): Self = StObject.set(x, "deleteItem", value.toJsFn)
    
    inline def setExpandFolder(value: CallbackTo[Any]): Self = StObject.set(x, "expandFolder", value.toJsFn)
    
    inline def setExportItem(value: CallbackTo[Any]): Self = StObject.set(x, "exportItem", value.toJsFn)
    
    inline def setFindItemIndex(value: CallbackTo[Any]): Self = StObject.set(x, "findItemIndex", value.toJsFn)
    
    inline def setGetSelectedItems(value: CallbackTo[Any]): Self = StObject.set(x, "getSelectedItems", value.toJsFn)
    
    inline def setImportItem(value: CallbackTo[Any]): Self = StObject.set(x, "importItem", value.toJsFn)
    
    inline def setMoveToFolder(value: CallbackTo[Any]): Self = StObject.set(x, "moveToFolder", value.toJsFn)
    
    inline def setNewFolder(value: CallbackTo[Any]): Self = StObject.set(x, "newFolder", value.toJsFn)
    
    inline def setRenameItem(value: CallbackTo[Any]): Self = StObject.set(x, "renameItem", value.toJsFn)
    
    inline def setSelectItem(value: CallbackTo[Any]): Self = StObject.set(x, "selectItem", value.toJsFn)
  }
}
