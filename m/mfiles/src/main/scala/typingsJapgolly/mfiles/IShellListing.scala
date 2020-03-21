package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFFolderDefType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellListing extends js.Object {
  var AutoFitAllColumns: Boolean
  var AutoFitFirstColumn: Boolean
  var ColumnHeadersVisible: Boolean
  val CurrentPath: String
  val CurrentSelection: IShellItems
  val Events: IShellListingEvents
  var GroupObjectsByObjectType: Boolean
  var GroupViewsAndFolders: Boolean
  val IsActive: Boolean
  val Items: IShellItems
  val SumOfResultCounts: Double
  def ActivateListing(): Unit
  def ActivateSelected(): Unit
  def RefreshListing(smartUpdate: Boolean, refreshFromServer: Boolean, forceFullRefreshFromServer: Boolean): Unit
  def RefreshListingAsync(): Unit
  def RefreshObject(objID: IObjID, refreshFromServer: Boolean, updateRelatedObjects: Boolean): Unit
  def RefreshSelectedObjects(refreshFromServer: Boolean, updateRelatedObjects: Boolean): Unit
  def SelectFolder(folderDef: IFolderDef): Unit
  def SelectNextFolder(folderDefType: MFFolderDefType): Boolean
  def SelectNextObject(): Boolean
  def SelectNextObjectFile(allowMoveToNextObject: Boolean): Boolean
  def SelectObjectFile(objVer: IObjVer, fileVer: IFileVer): Unit
  def SelectObjectOrObjectFileVersion(objOrFileVer: IObjOrFileVer): Unit
  def SelectObjectVersion(objVer: IObjVer): Unit
  def SelectPrevFolder(folderDefType: MFFolderDefType): Boolean
  def SelectPrevObject(): Boolean
  def SelectPrevObjectFile(allowMoveToPrevObject: Boolean): Boolean
  def SetFolderSelectionStates(folderDefs: IFolderDefs, select: Boolean): Unit
  def SetObjectOrObjectFileVersionSelectionStates(objOrFileVers: IObjOrFileVers, select: Boolean): Unit
  def SetObjectVersionSelectionStates(objVers: IObjVers, select: Boolean): Unit
  def SetTheme(theme: ITheme): Unit
  def SetVirtualSelection(objOrFileVers: IObjOrFileVers): Unit
  def UnselectAll(): Unit
}

object IShellListing {
  @scala.inline
  def apply(
    ActivateListing: Callback,
    ActivateSelected: Callback,
    AutoFitAllColumns: Boolean,
    AutoFitFirstColumn: Boolean,
    ColumnHeadersVisible: Boolean,
    CurrentPath: String,
    CurrentSelection: IShellItems,
    Events: IShellListingEvents,
    GroupObjectsByObjectType: Boolean,
    GroupViewsAndFolders: Boolean,
    IsActive: Boolean,
    Items: IShellItems,
    RefreshListing: (Boolean, Boolean, Boolean) => Callback,
    RefreshListingAsync: Callback,
    RefreshObject: (IObjID, Boolean, Boolean) => Callback,
    RefreshSelectedObjects: (Boolean, Boolean) => Callback,
    SelectFolder: IFolderDef => Callback,
    SelectNextFolder: MFFolderDefType => CallbackTo[Boolean],
    SelectNextObject: CallbackTo[Boolean],
    SelectNextObjectFile: Boolean => CallbackTo[Boolean],
    SelectObjectFile: (IObjVer, IFileVer) => Callback,
    SelectObjectOrObjectFileVersion: IObjOrFileVer => Callback,
    SelectObjectVersion: IObjVer => Callback,
    SelectPrevFolder: MFFolderDefType => CallbackTo[Boolean],
    SelectPrevObject: CallbackTo[Boolean],
    SelectPrevObjectFile: Boolean => CallbackTo[Boolean],
    SetFolderSelectionStates: (IFolderDefs, Boolean) => Callback,
    SetObjectOrObjectFileVersionSelectionStates: (IObjOrFileVers, Boolean) => Callback,
    SetObjectVersionSelectionStates: (IObjVers, Boolean) => Callback,
    SetTheme: ITheme => Callback,
    SetVirtualSelection: IObjOrFileVers => Callback,
    SumOfResultCounts: Double,
    UnselectAll: Callback
  ): IShellListing = {
    val __obj = js.Dynamic.literal(AutoFitAllColumns = AutoFitAllColumns.asInstanceOf[js.Any], AutoFitFirstColumn = AutoFitFirstColumn.asInstanceOf[js.Any], ColumnHeadersVisible = ColumnHeadersVisible.asInstanceOf[js.Any], CurrentPath = CurrentPath.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], GroupObjectsByObjectType = GroupObjectsByObjectType.asInstanceOf[js.Any], GroupViewsAndFolders = GroupViewsAndFolders.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], SumOfResultCounts = SumOfResultCounts.asInstanceOf[js.Any])
    __obj.updateDynamic("ActivateListing")(ActivateListing.toJsFn)
    __obj.updateDynamic("ActivateSelected")(ActivateSelected.toJsFn)
    __obj.updateDynamic("RefreshListing")(js.Any.fromFunction3((t0: scala.Boolean, t1: scala.Boolean, t2: scala.Boolean) => RefreshListing(t0, t1, t2).runNow()))
    __obj.updateDynamic("RefreshListingAsync")(RefreshListingAsync.toJsFn)
    __obj.updateDynamic("RefreshObject")(js.Any.fromFunction3((t0: typingsJapgolly.mfiles.IObjID, t1: scala.Boolean, t2: scala.Boolean) => RefreshObject(t0, t1, t2).runNow()))
    __obj.updateDynamic("RefreshSelectedObjects")(js.Any.fromFunction2((t0: scala.Boolean, t1: scala.Boolean) => RefreshSelectedObjects(t0, t1).runNow()))
    __obj.updateDynamic("SelectFolder")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IFolderDef) => SelectFolder(t0).runNow()))
    __obj.updateDynamic("SelectNextFolder")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.MFiles.MFFolderDefType) => SelectNextFolder(t0).runNow()))
    __obj.updateDynamic("SelectNextObject")(SelectNextObject.toJsFn)
    __obj.updateDynamic("SelectNextObjectFile")(js.Any.fromFunction1((t0: scala.Boolean) => SelectNextObjectFile(t0).runNow()))
    __obj.updateDynamic("SelectObjectFile")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjVer, t1: typingsJapgolly.mfiles.IFileVer) => SelectObjectFile(t0, t1).runNow()))
    __obj.updateDynamic("SelectObjectOrObjectFileVersion")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IObjOrFileVer) => SelectObjectOrObjectFileVersion(t0).runNow()))
    __obj.updateDynamic("SelectObjectVersion")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IObjVer) => SelectObjectVersion(t0).runNow()))
    __obj.updateDynamic("SelectPrevFolder")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.MFiles.MFFolderDefType) => SelectPrevFolder(t0).runNow()))
    __obj.updateDynamic("SelectPrevObject")(SelectPrevObject.toJsFn)
    __obj.updateDynamic("SelectPrevObjectFile")(js.Any.fromFunction1((t0: scala.Boolean) => SelectPrevObjectFile(t0).runNow()))
    __obj.updateDynamic("SetFolderSelectionStates")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IFolderDefs, t1: scala.Boolean) => SetFolderSelectionStates(t0, t1).runNow()))
    __obj.updateDynamic("SetObjectOrObjectFileVersionSelectionStates")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjOrFileVers, t1: scala.Boolean) => SetObjectOrObjectFileVersionSelectionStates(t0, t1).runNow()))
    __obj.updateDynamic("SetObjectVersionSelectionStates")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjVers, t1: scala.Boolean) => SetObjectVersionSelectionStates(t0, t1).runNow()))
    __obj.updateDynamic("SetTheme")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.ITheme) => SetTheme(t0).runNow()))
    __obj.updateDynamic("SetVirtualSelection")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IObjOrFileVers) => SetVirtualSelection(t0).runNow()))
    __obj.updateDynamic("UnselectAll")(UnselectAll.toJsFn)
    __obj.asInstanceOf[IShellListing]
  }
}

