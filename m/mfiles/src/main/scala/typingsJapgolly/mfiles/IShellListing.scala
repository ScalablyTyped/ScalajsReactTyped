package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFFolderDefType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellListing extends StObject {
  
  def ActivateListing(): Unit
  
  def ActivateSelected(): Unit
  
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
  
  val SumOfResultCounts: Double
  
  def UnselectAll(): Unit
}
object IShellListing {
  
  inline def apply(
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
    SelectNextFolder: MFFolderDefType => Boolean,
    SelectNextObject: CallbackTo[Boolean],
    SelectNextObjectFile: Boolean => Boolean,
    SelectObjectFile: (IObjVer, IFileVer) => Callback,
    SelectObjectOrObjectFileVersion: IObjOrFileVer => Callback,
    SelectObjectVersion: IObjVer => Callback,
    SelectPrevFolder: MFFolderDefType => Boolean,
    SelectPrevObject: CallbackTo[Boolean],
    SelectPrevObjectFile: Boolean => Boolean,
    SetFolderSelectionStates: (IFolderDefs, Boolean) => Callback,
    SetObjectOrObjectFileVersionSelectionStates: (IObjOrFileVers, Boolean) => Callback,
    SetObjectVersionSelectionStates: (IObjVers, Boolean) => Callback,
    SetTheme: ITheme => Callback,
    SetVirtualSelection: IObjOrFileVers => Callback,
    SumOfResultCounts: Double,
    UnselectAll: Callback
  ): IShellListing = {
    val __obj = js.Dynamic.literal(ActivateListing = ActivateListing.toJsFn, ActivateSelected = ActivateSelected.toJsFn, AutoFitAllColumns = AutoFitAllColumns.asInstanceOf[js.Any], AutoFitFirstColumn = AutoFitFirstColumn.asInstanceOf[js.Any], ColumnHeadersVisible = ColumnHeadersVisible.asInstanceOf[js.Any], CurrentPath = CurrentPath.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], GroupObjectsByObjectType = GroupObjectsByObjectType.asInstanceOf[js.Any], GroupViewsAndFolders = GroupViewsAndFolders.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], RefreshListing = js.Any.fromFunction3((t0: Boolean, t1: Boolean, t2: Boolean) => (RefreshListing(t0, t1, t2)).runNow()), RefreshListingAsync = RefreshListingAsync.toJsFn, RefreshObject = js.Any.fromFunction3((t0: IObjID, t1: Boolean, t2: Boolean) => (RefreshObject(t0, t1, t2)).runNow()), RefreshSelectedObjects = js.Any.fromFunction2((t0: Boolean, t1: Boolean) => (RefreshSelectedObjects(t0, t1)).runNow()), SelectFolder = js.Any.fromFunction1((t0: IFolderDef) => SelectFolder(t0).runNow()), SelectNextFolder = js.Any.fromFunction1(SelectNextFolder), SelectNextObject = SelectNextObject.toJsFn, SelectNextObjectFile = js.Any.fromFunction1(SelectNextObjectFile), SelectObjectFile = js.Any.fromFunction2((t0: IObjVer, t1: IFileVer) => (SelectObjectFile(t0, t1)).runNow()), SelectObjectOrObjectFileVersion = js.Any.fromFunction1((t0: IObjOrFileVer) => SelectObjectOrObjectFileVersion(t0).runNow()), SelectObjectVersion = js.Any.fromFunction1((t0: IObjVer) => SelectObjectVersion(t0).runNow()), SelectPrevFolder = js.Any.fromFunction1(SelectPrevFolder), SelectPrevObject = SelectPrevObject.toJsFn, SelectPrevObjectFile = js.Any.fromFunction1(SelectPrevObjectFile), SetFolderSelectionStates = js.Any.fromFunction2((t0: IFolderDefs, t1: Boolean) => (SetFolderSelectionStates(t0, t1)).runNow()), SetObjectOrObjectFileVersionSelectionStates = js.Any.fromFunction2((t0: IObjOrFileVers, t1: Boolean) => (SetObjectOrObjectFileVersionSelectionStates(t0, t1)).runNow()), SetObjectVersionSelectionStates = js.Any.fromFunction2((t0: IObjVers, t1: Boolean) => (SetObjectVersionSelectionStates(t0, t1)).runNow()), SetTheme = js.Any.fromFunction1((t0: ITheme) => SetTheme(t0).runNow()), SetVirtualSelection = js.Any.fromFunction1((t0: IObjOrFileVers) => SetVirtualSelection(t0).runNow()), SumOfResultCounts = SumOfResultCounts.asInstanceOf[js.Any], UnselectAll = UnselectAll.toJsFn)
    __obj.asInstanceOf[IShellListing]
  }
  
  extension [Self <: IShellListing](x: Self) {
    
    inline def setActivateListing(value: Callback): Self = StObject.set(x, "ActivateListing", value.toJsFn)
    
    inline def setActivateSelected(value: Callback): Self = StObject.set(x, "ActivateSelected", value.toJsFn)
    
    inline def setAutoFitAllColumns(value: Boolean): Self = StObject.set(x, "AutoFitAllColumns", value.asInstanceOf[js.Any])
    
    inline def setAutoFitFirstColumn(value: Boolean): Self = StObject.set(x, "AutoFitFirstColumn", value.asInstanceOf[js.Any])
    
    inline def setColumnHeadersVisible(value: Boolean): Self = StObject.set(x, "ColumnHeadersVisible", value.asInstanceOf[js.Any])
    
    inline def setCurrentPath(value: String): Self = StObject.set(x, "CurrentPath", value.asInstanceOf[js.Any])
    
    inline def setCurrentSelection(value: IShellItems): Self = StObject.set(x, "CurrentSelection", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: IShellListingEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setGroupObjectsByObjectType(value: Boolean): Self = StObject.set(x, "GroupObjectsByObjectType", value.asInstanceOf[js.Any])
    
    inline def setGroupViewsAndFolders(value: Boolean): Self = StObject.set(x, "GroupViewsAndFolders", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "IsActive", value.asInstanceOf[js.Any])
    
    inline def setItems(value: IShellItems): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setRefreshListing(value: (Boolean, Boolean, Boolean) => Callback): Self = StObject.set(x, "RefreshListing", js.Any.fromFunction3((t0: Boolean, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setRefreshListingAsync(value: Callback): Self = StObject.set(x, "RefreshListingAsync", value.toJsFn)
    
    inline def setRefreshObject(value: (IObjID, Boolean, Boolean) => Callback): Self = StObject.set(x, "RefreshObject", js.Any.fromFunction3((t0: IObjID, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setRefreshSelectedObjects(value: (Boolean, Boolean) => Callback): Self = StObject.set(x, "RefreshSelectedObjects", js.Any.fromFunction2((t0: Boolean, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setSelectFolder(value: IFolderDef => Callback): Self = StObject.set(x, "SelectFolder", js.Any.fromFunction1((t0: IFolderDef) => value(t0).runNow()))
    
    inline def setSelectNextFolder(value: MFFolderDefType => Boolean): Self = StObject.set(x, "SelectNextFolder", js.Any.fromFunction1(value))
    
    inline def setSelectNextObject(value: CallbackTo[Boolean]): Self = StObject.set(x, "SelectNextObject", value.toJsFn)
    
    inline def setSelectNextObjectFile(value: Boolean => Boolean): Self = StObject.set(x, "SelectNextObjectFile", js.Any.fromFunction1(value))
    
    inline def setSelectObjectFile(value: (IObjVer, IFileVer) => Callback): Self = StObject.set(x, "SelectObjectFile", js.Any.fromFunction2((t0: IObjVer, t1: IFileVer) => (value(t0, t1)).runNow()))
    
    inline def setSelectObjectOrObjectFileVersion(value: IObjOrFileVer => Callback): Self = StObject.set(x, "SelectObjectOrObjectFileVersion", js.Any.fromFunction1((t0: IObjOrFileVer) => value(t0).runNow()))
    
    inline def setSelectObjectVersion(value: IObjVer => Callback): Self = StObject.set(x, "SelectObjectVersion", js.Any.fromFunction1((t0: IObjVer) => value(t0).runNow()))
    
    inline def setSelectPrevFolder(value: MFFolderDefType => Boolean): Self = StObject.set(x, "SelectPrevFolder", js.Any.fromFunction1(value))
    
    inline def setSelectPrevObject(value: CallbackTo[Boolean]): Self = StObject.set(x, "SelectPrevObject", value.toJsFn)
    
    inline def setSelectPrevObjectFile(value: Boolean => Boolean): Self = StObject.set(x, "SelectPrevObjectFile", js.Any.fromFunction1(value))
    
    inline def setSetFolderSelectionStates(value: (IFolderDefs, Boolean) => Callback): Self = StObject.set(x, "SetFolderSelectionStates", js.Any.fromFunction2((t0: IFolderDefs, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setSetObjectOrObjectFileVersionSelectionStates(value: (IObjOrFileVers, Boolean) => Callback): Self = StObject.set(x, "SetObjectOrObjectFileVersionSelectionStates", js.Any.fromFunction2((t0: IObjOrFileVers, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setSetObjectVersionSelectionStates(value: (IObjVers, Boolean) => Callback): Self = StObject.set(x, "SetObjectVersionSelectionStates", js.Any.fromFunction2((t0: IObjVers, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setSetTheme(value: ITheme => Callback): Self = StObject.set(x, "SetTheme", js.Any.fromFunction1((t0: ITheme) => value(t0).runNow()))
    
    inline def setSetVirtualSelection(value: IObjOrFileVers => Callback): Self = StObject.set(x, "SetVirtualSelection", js.Any.fromFunction1((t0: IObjOrFileVers) => value(t0).runNow()))
    
    inline def setSumOfResultCounts(value: Double): Self = StObject.set(x, "SumOfResultCounts", value.asInstanceOf[js.Any])
    
    inline def setUnselectAll(value: Callback): Self = StObject.set(x, "UnselectAll", value.toJsFn)
  }
}
