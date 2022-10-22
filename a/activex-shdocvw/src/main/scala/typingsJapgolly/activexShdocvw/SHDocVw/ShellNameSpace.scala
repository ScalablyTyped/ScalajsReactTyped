package typingsJapgolly.activexShdocvw.SHDocVw

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShellNameSpace extends StObject {
  
  var Columns: String
  
  /** number of view types */
  val CountViewTypes: Double
  
  /** method CreateSubscriptionForSelection */
  def CreateSubscriptionForSelection(): Boolean
  
  /** method DeleteSubscriptionForSelection */
  def DeleteSubscriptionForSelection(): Boolean
  
  var Depth: Double
  
  /** options  */
  var EnumOptions: Double
  
  /** expands item specified depth */
  def Expand(var_0: Any, iDepth: Double): Unit
  
  /** method Export */
  def Export(): Unit
  
  var Flags: Double
  
  /** method Import */
  def Import(): Unit
  
  /** method InvokeContextMenuCommand */
  def InvokeContextMenuCommand(strCommand: String): Unit
  
  var Mode: Double
  
  /** method MoveSelectionDown */
  def MoveSelectionDown(): Unit
  
  /** method MoveSelectionTo */
  def MoveSelectionTo(): Unit
  
  /** method MoveSelectionUp */
  def MoveSelectionUp(): Unit
  
  /** method NewFolder */
  def NewFolder(): Unit
  
  /** method ResetSort */
  def ResetSort(): Unit
  
  /** get the root item */
  var Root: Any
  
  /* private */ @JSName("SHDocVw.ShellNameSpace_typekey")
  var SHDocVwDotShellNameSpace_typekey: ShellNameSpace
  
  /** get the selected item */
  var SelectedItem: Any
  
  /** collection of selected items */
  def SelectedItems(): Any
  
  /** old, use put_Root() instead */
  def SetRoot(bstrFullPath: String): Unit
  
  /** set view type */
  def SetViewType(iType: Double): Unit
  
  /** Query to see if subscriptions are enabled */
  val SubscriptionsEnabled: Boolean
  
  /** method Synchronize */
  def Synchronize(): Unit
  
  var TVFlags: Double
  
  /** unselects all items */
  def UnselectAll(): Unit
}
object ShellNameSpace {
  
  inline def apply(
    Columns: String,
    CountViewTypes: Double,
    CreateSubscriptionForSelection: CallbackTo[Boolean],
    DeleteSubscriptionForSelection: CallbackTo[Boolean],
    Depth: Double,
    EnumOptions: Double,
    Expand: (Any, Double) => Callback,
    Export: Callback,
    Flags: Double,
    Import: Callback,
    InvokeContextMenuCommand: String => Callback,
    Mode: Double,
    MoveSelectionDown: Callback,
    MoveSelectionTo: Callback,
    MoveSelectionUp: Callback,
    NewFolder: Callback,
    ResetSort: Callback,
    Root: Any,
    SHDocVwDotShellNameSpace_typekey: ShellNameSpace,
    SelectedItem: Any,
    SelectedItems: CallbackTo[Any],
    SetRoot: String => Callback,
    SetViewType: Double => Callback,
    SubscriptionsEnabled: Boolean,
    Synchronize: Callback,
    TVFlags: Double,
    UnselectAll: Callback
  ): ShellNameSpace = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], CountViewTypes = CountViewTypes.asInstanceOf[js.Any], CreateSubscriptionForSelection = CreateSubscriptionForSelection.toJsFn, DeleteSubscriptionForSelection = DeleteSubscriptionForSelection.toJsFn, Depth = Depth.asInstanceOf[js.Any], EnumOptions = EnumOptions.asInstanceOf[js.Any], Expand = js.Any.fromFunction2((t0: Any, t1: Double) => (Expand(t0, t1)).runNow()), Export = Export.toJsFn, Flags = Flags.asInstanceOf[js.Any], Import = Import.toJsFn, InvokeContextMenuCommand = js.Any.fromFunction1((t0: String) => InvokeContextMenuCommand(t0).runNow()), Mode = Mode.asInstanceOf[js.Any], MoveSelectionDown = MoveSelectionDown.toJsFn, MoveSelectionTo = MoveSelectionTo.toJsFn, MoveSelectionUp = MoveSelectionUp.toJsFn, NewFolder = NewFolder.toJsFn, ResetSort = ResetSort.toJsFn, Root = Root.asInstanceOf[js.Any], SelectedItem = SelectedItem.asInstanceOf[js.Any], SelectedItems = SelectedItems.toJsFn, SetRoot = js.Any.fromFunction1((t0: String) => SetRoot(t0).runNow()), SetViewType = js.Any.fromFunction1((t0: Double) => SetViewType(t0).runNow()), SubscriptionsEnabled = SubscriptionsEnabled.asInstanceOf[js.Any], Synchronize = Synchronize.toJsFn, TVFlags = TVFlags.asInstanceOf[js.Any], UnselectAll = UnselectAll.toJsFn)
    __obj.updateDynamic("SHDocVw.ShellNameSpace_typekey")(SHDocVwDotShellNameSpace_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellNameSpace]
  }
  
  extension [Self <: ShellNameSpace](x: Self) {
    
    inline def setColumns(value: String): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setCountViewTypes(value: Double): Self = StObject.set(x, "CountViewTypes", value.asInstanceOf[js.Any])
    
    inline def setCreateSubscriptionForSelection(value: CallbackTo[Boolean]): Self = StObject.set(x, "CreateSubscriptionForSelection", value.toJsFn)
    
    inline def setDeleteSubscriptionForSelection(value: CallbackTo[Boolean]): Self = StObject.set(x, "DeleteSubscriptionForSelection", value.toJsFn)
    
    inline def setDepth(value: Double): Self = StObject.set(x, "Depth", value.asInstanceOf[js.Any])
    
    inline def setEnumOptions(value: Double): Self = StObject.set(x, "EnumOptions", value.asInstanceOf[js.Any])
    
    inline def setExpand(value: (Any, Double) => Callback): Self = StObject.set(x, "Expand", js.Any.fromFunction2((t0: Any, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setExport(value: Callback): Self = StObject.set(x, "Export", value.toJsFn)
    
    inline def setFlags(value: Double): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    inline def setImport(value: Callback): Self = StObject.set(x, "Import", value.toJsFn)
    
    inline def setInvokeContextMenuCommand(value: String => Callback): Self = StObject.set(x, "InvokeContextMenuCommand", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setMode(value: Double): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setMoveSelectionDown(value: Callback): Self = StObject.set(x, "MoveSelectionDown", value.toJsFn)
    
    inline def setMoveSelectionTo(value: Callback): Self = StObject.set(x, "MoveSelectionTo", value.toJsFn)
    
    inline def setMoveSelectionUp(value: Callback): Self = StObject.set(x, "MoveSelectionUp", value.toJsFn)
    
    inline def setNewFolder(value: Callback): Self = StObject.set(x, "NewFolder", value.toJsFn)
    
    inline def setResetSort(value: Callback): Self = StObject.set(x, "ResetSort", value.toJsFn)
    
    inline def setRoot(value: Any): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    inline def setSHDocVwDotShellNameSpace_typekey(value: ShellNameSpace): Self = StObject.set(x, "SHDocVw.ShellNameSpace_typekey", value.asInstanceOf[js.Any])
    
    inline def setSelectedItem(value: Any): Self = StObject.set(x, "SelectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItems(value: CallbackTo[Any]): Self = StObject.set(x, "SelectedItems", value.toJsFn)
    
    inline def setSetRoot(value: String => Callback): Self = StObject.set(x, "SetRoot", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetViewType(value: Double => Callback): Self = StObject.set(x, "SetViewType", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSubscriptionsEnabled(value: Boolean): Self = StObject.set(x, "SubscriptionsEnabled", value.asInstanceOf[js.Any])
    
    inline def setSynchronize(value: Callback): Self = StObject.set(x, "Synchronize", value.toJsFn)
    
    inline def setTVFlags(value: Double): Self = StObject.set(x, "TVFlags", value.asInstanceOf[js.Any])
    
    inline def setUnselectAll(value: Callback): Self = StObject.set(x, "UnselectAll", value.toJsFn)
  }
}
