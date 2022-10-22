package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a base for the ASPxClientTabControl and ASPxClientPageControl objects.
  */
trait ASPxClientTabControlBase
  extends StObject
     with ASPxClientControl {
  
  /**
    * Fires on the client side after the active tab has been changed within a tab control.
    */
  var ActiveTabChanged: ASPxClientEvent[ASPxClientTabControlTabEventHandler[ASPxClientTabControlBase]]
  
  /**
    * Fires on the client side before the active tab is changed within a tab control.
    */
  var ActiveTabChanging: ASPxClientEvent[ASPxClientTabControlTabCancelEventHandler[ASPxClientTabControlBase]]
  
  /**
    * Modifies a tab page's size in accordance with the content.
    */
  def AdjustSize(): Unit
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTabControlBase]]
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by a client tab control.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTabControlBase]]
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTabControlBase]]
  
  /**
    * Returns the active tab within the tab control.
    */
  def GetActiveTab(): ASPxClientTab
  
  /**
    * Returns the index of the active tab within the tab control.
    */
  def GetActiveTabIndex(): Double
  
  /**
    * Returns a tab specified by its index. An ASPxClientTab object representing the tab located at the specified index within the control's ASPxTabControl.Tabs collection.
    * @param index An integer value specifying the zero-based index of the tab object to retrieve.
    */
  def GetTab(index: Double): ASPxClientTab
  
  /**
    * Returns a tab specified by its name. An ASPxClientTab object that represents the tab with the specified name.
    * @param name A string value specifying the name of the tab.
    */
  def GetTabByName(name: String): ASPxClientTab
  
  /**
    * Returns the number of tabs in the ASPxTabControl.
    */
  def GetTabCount(): Double
  
  /**
    * Makes the specified tab active within the tab control on the client side.
    * @param tab An ASPxClientTab object specifying the tab to select.
    */
  def SetActiveTab(tab: ASPxClientTab): Unit
  
  /**
    * Makes a tab active within the tab control, specifying the tab's index.
    * @param index An integer value specifying the index of the tab to select.
    */
  def SetActiveTabIndex(index: Double): Unit
  
  /**
    * Fires when a tab is clicked.
    */
  var TabClick: ASPxClientEvent[ASPxClientTabControlTabClickEventHandler[ASPxClientTabControlBase]]
}
object ASPxClientTabControlBase {
  
  inline def apply(
    ActiveTabChanged: ASPxClientEvent[ASPxClientTabControlTabEventHandler[ASPxClientTabControlBase]],
    ActiveTabChanging: ASPxClientEvent[ASPxClientTabControlTabCancelEventHandler[ASPxClientTabControlBase]],
    AdjustControl: Callback,
    AdjustSize: Callback,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTabControlBase]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTabControlBase]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTabControlBase]],
    GetActiveTab: CallbackTo[ASPxClientTab],
    GetActiveTabIndex: CallbackTo[Double],
    GetClientVisible: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetTab: Double => ASPxClientTab,
    GetTabByName: String => ASPxClientTab,
    GetTabCount: CallbackTo[Double],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetActiveTab: ASPxClientTab => Callback,
    SetActiveTabIndex: Double => Callback,
    SetClientVisible: Boolean => Callback,
    SetHeight: Double => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    TabClick: ASPxClientEvent[ASPxClientTabControlTabClickEventHandler[ASPxClientTabControlBase]],
    name: String
  ): ASPxClientTabControlBase = {
    val __obj = js.Dynamic.literal(ActiveTabChanged = ActiveTabChanged.asInstanceOf[js.Any], ActiveTabChanging = ActiveTabChanging.asInstanceOf[js.Any], AdjustControl = AdjustControl.toJsFn, AdjustSize = AdjustSize.toJsFn, BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], GetActiveTab = GetActiveTab.toJsFn, GetActiveTabIndex = GetActiveTabIndex.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetTab = js.Any.fromFunction1(GetTab), GetTabByName = js.Any.fromFunction1(GetTabByName), GetTabCount = GetTabCount.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetActiveTab = js.Any.fromFunction1((t0: ASPxClientTab) => SetActiveTab(t0).runNow()), SetActiveTabIndex = js.Any.fromFunction1((t0: Double) => SetActiveTabIndex(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), TabClick = TabClick.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTabControlBase]
  }
  
  extension [Self <: ASPxClientTabControlBase](x: Self) {
    
    inline def setActiveTabChanged(value: ASPxClientEvent[ASPxClientTabControlTabEventHandler[ASPxClientTabControlBase]]): Self = StObject.set(x, "ActiveTabChanged", value.asInstanceOf[js.Any])
    
    inline def setActiveTabChanging(value: ASPxClientEvent[ASPxClientTabControlTabCancelEventHandler[ASPxClientTabControlBase]]): Self = StObject.set(x, "ActiveTabChanging", value.asInstanceOf[js.Any])
    
    inline def setAdjustSize(value: Callback): Self = StObject.set(x, "AdjustSize", value.toJsFn)
    
    inline def setBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTabControlBase]]): Self = StObject.set(x, "BeginCallback", value.asInstanceOf[js.Any])
    
    inline def setCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTabControlBase]]): Self = StObject.set(x, "CallbackError", value.asInstanceOf[js.Any])
    
    inline def setEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTabControlBase]]): Self = StObject.set(x, "EndCallback", value.asInstanceOf[js.Any])
    
    inline def setGetActiveTab(value: CallbackTo[ASPxClientTab]): Self = StObject.set(x, "GetActiveTab", value.toJsFn)
    
    inline def setGetActiveTabIndex(value: CallbackTo[Double]): Self = StObject.set(x, "GetActiveTabIndex", value.toJsFn)
    
    inline def setGetTab(value: Double => ASPxClientTab): Self = StObject.set(x, "GetTab", js.Any.fromFunction1(value))
    
    inline def setGetTabByName(value: String => ASPxClientTab): Self = StObject.set(x, "GetTabByName", js.Any.fromFunction1(value))
    
    inline def setGetTabCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetTabCount", value.toJsFn)
    
    inline def setSetActiveTab(value: ASPxClientTab => Callback): Self = StObject.set(x, "SetActiveTab", js.Any.fromFunction1((t0: ASPxClientTab) => value(t0).runNow()))
    
    inline def setSetActiveTabIndex(value: Double => Callback): Self = StObject.set(x, "SetActiveTabIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setTabClick(value: ASPxClientEvent[ASPxClientTabControlTabClickEventHandler[ASPxClientTabControlBase]]): Self = StObject.set(x, "TabClick", value.asInstanceOf[js.Any])
  }
}
