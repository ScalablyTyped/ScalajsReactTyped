package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashPresetPanel extends js.Object {
  def addNewItem(): js.Any
  def applyPreset(): js.Any
  def deleteFolder(): js.Any
  def deleteItem(): js.Any
  def expandFolder(): js.Any
  def exportItem(): js.Any
  def findItemIndex(): js.Any
  def getSelectedItems(): js.Any
  def importItem(): js.Any
  def moveToFolder(): js.Any
  def newFolder(): js.Any
  def renameItem(): js.Any
  def selectItem(): js.Any
}

object FlashPresetPanel {
  @scala.inline
  def apply(
    addNewItem: CallbackTo[js.Any],
    applyPreset: CallbackTo[js.Any],
    deleteFolder: CallbackTo[js.Any],
    deleteItem: CallbackTo[js.Any],
    expandFolder: CallbackTo[js.Any],
    exportItem: CallbackTo[js.Any],
    findItemIndex: CallbackTo[js.Any],
    getSelectedItems: CallbackTo[js.Any],
    importItem: CallbackTo[js.Any],
    moveToFolder: CallbackTo[js.Any],
    newFolder: CallbackTo[js.Any],
    renameItem: CallbackTo[js.Any],
    selectItem: CallbackTo[js.Any]
  ): FlashPresetPanel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addNewItem")(addNewItem.toJsFn)
    __obj.updateDynamic("applyPreset")(applyPreset.toJsFn)
    __obj.updateDynamic("deleteFolder")(deleteFolder.toJsFn)
    __obj.updateDynamic("deleteItem")(deleteItem.toJsFn)
    __obj.updateDynamic("expandFolder")(expandFolder.toJsFn)
    __obj.updateDynamic("exportItem")(exportItem.toJsFn)
    __obj.updateDynamic("findItemIndex")(findItemIndex.toJsFn)
    __obj.updateDynamic("getSelectedItems")(getSelectedItems.toJsFn)
    __obj.updateDynamic("importItem")(importItem.toJsFn)
    __obj.updateDynamic("moveToFolder")(moveToFolder.toJsFn)
    __obj.updateDynamic("newFolder")(newFolder.toJsFn)
    __obj.updateDynamic("renameItem")(renameItem.toJsFn)
    __obj.updateDynamic("selectItem")(selectItem.toJsFn)
    __obj.asInstanceOf[FlashPresetPanel]
  }
}

