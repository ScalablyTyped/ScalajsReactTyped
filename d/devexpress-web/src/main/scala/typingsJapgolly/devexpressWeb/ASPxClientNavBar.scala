package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxNavBar control.
  */
trait ASPxClientNavBar
  extends StObject
     with ASPxClientControl {
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientNavBar]]
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientNavBar.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientNavBar]]
  
  /**
    * Collapses all groups of the navbar.
    */
  def CollapseAll(): Unit
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientNavBar]]
  
  /**
    * Expands all groups of the navbar.
    */
  def ExpandAll(): Unit
  
  /**
    * Fires on the client side after a group's expansion state has been changed.
    */
  var ExpandedChanged: ASPxClientEvent[ASPxClientNavBarGroupEventHandler[ASPxClientNavBar]]
  
  /**
    * Fires on the client side before the expansion state of a group is changed.
    */
  var ExpandedChanging: ASPxClientEvent[ASPxClientNavBarGroupCancelEventHandler[ASPxClientNavBar]]
  
  /**
    * Returns the navbar's active group.
    */
  def GetActiveGroup(): ASPxClientNavBarGroup
  
  /**
    * Returns a group specified by its index. An ASPxClientNavBarGroup object representing the group located at the specified index within the navbar's ASPxNavBar.Groups collection.
    * @param index An integer value specifying the zero-based index of the group object to retrieve.
    */
  def GetGroup(index: Double): ASPxClientNavBarGroup
  
  /**
    * Returns a group specified by its name. An ASPxClientNavBarGroup object that represents the group with the specified name.
    * @param name A string value specifying the name of the group.
    */
  def GetGroupByName(name: String): ASPxClientNavBarGroup
  
  /**
    * Returns the number of groups in the navbar.
    */
  def GetGroupCount(): Double
  
  /**
    * Returns an item specified by its name. An ASPxClientNavBarItem object that represents the item with the specified name.
    * @param name A string value specifying the name of the item.
    */
  def GetItemByName(name: String): ASPxClientNavBarItem
  
  /**
    * Returns the selected item within the navbar control.
    */
  def GetSelectedItem(): ASPxClientNavBarItem
  
  /**
    * Fires when a group header is clicked.
    */
  var HeaderClick: ASPxClientEvent[ASPxClientNavBarGroupClickEventHandler[ASPxClientNavBar]]
  
  /**
    * Fires after an item has been clicked.
    */
  var ItemClick: ASPxClientEvent[ASPxClientNavBarItemEventHandler[ASPxClientNavBar]]
  
  /**
    * Makes the specified group active.
    * @param group A ASPxClientNavBarGroup object that specifies the active group.
    */
  def SetActiveGroup(group: ASPxClientNavBarGroup): Unit
  
  /**
    * Selects the specified item within the navbar control on the client side.
    * @param item An ASPxClientNavBarItem object specifying the item to select.
    */
  def SetSelectedItem(item: ASPxClientNavBarItem): Unit
}
object ASPxClientNavBar {
  
  inline def apply(
    AdjustControl: Callback,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientNavBar]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientNavBar]],
    CollapseAll: Callback,
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientNavBar]],
    ExpandAll: Callback,
    ExpandedChanged: ASPxClientEvent[ASPxClientNavBarGroupEventHandler[ASPxClientNavBar]],
    ExpandedChanging: ASPxClientEvent[ASPxClientNavBarGroupCancelEventHandler[ASPxClientNavBar]],
    GetActiveGroup: CallbackTo[ASPxClientNavBarGroup],
    GetClientVisible: CallbackTo[Boolean],
    GetGroup: Double => ASPxClientNavBarGroup,
    GetGroupByName: String => ASPxClientNavBarGroup,
    GetGroupCount: CallbackTo[Double],
    GetHeight: CallbackTo[Double],
    GetItemByName: String => ASPxClientNavBarItem,
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetSelectedItem: CallbackTo[ASPxClientNavBarItem],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    HeaderClick: ASPxClientEvent[ASPxClientNavBarGroupClickEventHandler[ASPxClientNavBar]],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    ItemClick: ASPxClientEvent[ASPxClientNavBarItemEventHandler[ASPxClientNavBar]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetActiveGroup: ASPxClientNavBarGroup => Callback,
    SetClientVisible: Boolean => Callback,
    SetHeight: Double => Callback,
    SetSelectedItem: ASPxClientNavBarItem => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    name: String
  ): ASPxClientNavBar = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], CollapseAll = CollapseAll.toJsFn, EndCallback = EndCallback.asInstanceOf[js.Any], ExpandAll = ExpandAll.toJsFn, ExpandedChanged = ExpandedChanged.asInstanceOf[js.Any], ExpandedChanging = ExpandedChanging.asInstanceOf[js.Any], GetActiveGroup = GetActiveGroup.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetGroup = js.Any.fromFunction1(GetGroup), GetGroupByName = js.Any.fromFunction1(GetGroupByName), GetGroupCount = GetGroupCount.toJsFn, GetHeight = GetHeight.toJsFn, GetItemByName = js.Any.fromFunction1(GetItemByName), GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetSelectedItem = GetSelectedItem.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, HeaderClick = HeaderClick.asInstanceOf[js.Any], InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], ItemClick = ItemClick.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetActiveGroup = js.Any.fromFunction1((t0: ASPxClientNavBarGroup) => SetActiveGroup(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetSelectedItem = js.Any.fromFunction1((t0: ASPxClientNavBarItem) => SetSelectedItem(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNavBar]
  }
  
  extension [Self <: ASPxClientNavBar](x: Self) {
    
    inline def setBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientNavBar]]): Self = StObject.set(x, "BeginCallback", value.asInstanceOf[js.Any])
    
    inline def setCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientNavBar]]): Self = StObject.set(x, "CallbackError", value.asInstanceOf[js.Any])
    
    inline def setCollapseAll(value: Callback): Self = StObject.set(x, "CollapseAll", value.toJsFn)
    
    inline def setEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientNavBar]]): Self = StObject.set(x, "EndCallback", value.asInstanceOf[js.Any])
    
    inline def setExpandAll(value: Callback): Self = StObject.set(x, "ExpandAll", value.toJsFn)
    
    inline def setExpandedChanged(value: ASPxClientEvent[ASPxClientNavBarGroupEventHandler[ASPxClientNavBar]]): Self = StObject.set(x, "ExpandedChanged", value.asInstanceOf[js.Any])
    
    inline def setExpandedChanging(value: ASPxClientEvent[ASPxClientNavBarGroupCancelEventHandler[ASPxClientNavBar]]): Self = StObject.set(x, "ExpandedChanging", value.asInstanceOf[js.Any])
    
    inline def setGetActiveGroup(value: CallbackTo[ASPxClientNavBarGroup]): Self = StObject.set(x, "GetActiveGroup", value.toJsFn)
    
    inline def setGetGroup(value: Double => ASPxClientNavBarGroup): Self = StObject.set(x, "GetGroup", js.Any.fromFunction1(value))
    
    inline def setGetGroupByName(value: String => ASPxClientNavBarGroup): Self = StObject.set(x, "GetGroupByName", js.Any.fromFunction1(value))
    
    inline def setGetGroupCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetGroupCount", value.toJsFn)
    
    inline def setGetItemByName(value: String => ASPxClientNavBarItem): Self = StObject.set(x, "GetItemByName", js.Any.fromFunction1(value))
    
    inline def setGetSelectedItem(value: CallbackTo[ASPxClientNavBarItem]): Self = StObject.set(x, "GetSelectedItem", value.toJsFn)
    
    inline def setHeaderClick(value: ASPxClientEvent[ASPxClientNavBarGroupClickEventHandler[ASPxClientNavBar]]): Self = StObject.set(x, "HeaderClick", value.asInstanceOf[js.Any])
    
    inline def setItemClick(value: ASPxClientEvent[ASPxClientNavBarItemEventHandler[ASPxClientNavBar]]): Self = StObject.set(x, "ItemClick", value.asInstanceOf[js.Any])
    
    inline def setSetActiveGroup(value: ASPxClientNavBarGroup => Callback): Self = StObject.set(x, "SetActiveGroup", js.Any.fromFunction1((t0: ASPxClientNavBarGroup) => value(t0).runNow()))
    
    inline def setSetSelectedItem(value: ASPxClientNavBarItem => Callback): Self = StObject.set(x, "SetSelectedItem", js.Any.fromFunction1((t0: ASPxClientNavBarItem) => value(t0).runNow()))
  }
}
