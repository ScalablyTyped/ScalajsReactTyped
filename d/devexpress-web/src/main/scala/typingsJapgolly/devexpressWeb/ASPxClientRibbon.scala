package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxRibbon control.
  */
trait ASPxClientRibbon
  extends StObject
     with ASPxClientControl {
  
  /**
    * Fires on the client side after the active tab has been changed within a ribbon control.
    */
  var ActiveTabChanged: ASPxClientEvent[ASPxClientRibbonTabEventHandler[ASPxClientRibbon]]
  
  /**
    * Occurs after an end-user executes an action on a ribbon item.
    */
  var CommandExecuted: ASPxClientEvent[ASPxClientRibbonCommandExecutedEventHandler[ASPxClientRibbon]]
  
  /**
    * Fires on the client side after a dialog box launcher has been clicked.
    */
  var DialogBoxLauncherClicked: ASPxClientEvent[ASPxClientRibbonDialogBoxLauncherClickedEventHandler[ASPxClientRibbon]]
  
  /**
    * Occurs when the file tab is clicked.
    */
  var FileTabClicked: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRibbon]]
  
  /**
    * Returns the active tab within the ribbon control.
    */
  def GetActiveTab(): ASPxClientRibbonTab
  
  /**
    * Returns a value indicating whether the ribbon is enabled.
    */
  def GetEnabled(): Boolean
  
  /**
    * Returns a ribbon item specified by its name. An ASPxClientRibbonItem object that is the ribbon item with the specified name.
    * @param name A string value specifying the name of the item.
    */
  def GetItemByName(name: String): ASPxClientRibbonItem
  
  /**
    * Returns a value of item with the specified name. An Object that is the value of the item with the specified name.
    * @param name A string value specifying the name of the item.
    */
  def GetItemValueByName(name: String): Any
  
  /**
    * Gets a value specifying whether the ribbon is minimized.
    */
  def GetMinimized(): Boolean
  
  /**
    * Returns a tab specified by its index. An ASPxClientRibbonTab object that is the tab located at the specified index within the control's ASPxRibbon.Tabs collection.
    * @param index An integer value specifying the zero-based index of the tab object to retrieve.
    */
  def GetTab(index: Double): ASPxClientRibbonTab
  
  /**
    * Returns a tab specified by its name. An ASPxClientRibbonTab object that is the tab with the specified name.
    * @param name A string value specifying the name of the tab.
    */
  def GetTabByName(name: String): ASPxClientRibbonTab
  
  /**
    * Returns the number of tabs in the ribbon ASPxRibbon.Tabs collection.
    */
  def GetTabCount(): Double
  
  /**
    * Fires after key tips are closed by pressing Esc.
    */
  var KeyTipsClosedOnEscape: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRibbon]]
  
  /**
    * Occurs on the client side when the ribbon minimization state is changed by end-user actions.
    */
  var MinimizationStateChanged: ASPxClientEvent[ASPxClientRibbonMinimizationStateEventHandler[ASPxClientRibbon]]
  
  /**
    * Makes the specified tab active in the ribbon control on the client side.
    * @param tab A ASPxClientRibbonTab object specifying the tab selection.
    */
  def SetActiveTab(tab: ASPxClientRibbonTab): Unit
  
  /**
    * Makes a tab active within the ribbon control, specifying the tab's index.
    * @param index An integer value specifying the index of the tab to select.
    */
  def SetActiveTabIndex(index: Double): Unit
  
  /**
    * Specifies the visibility of a context tab category specified by its name.
    * @param categoryName A String value that is the RibbonContextTabCategory.Name property value of the required category.
    * @param visible true to make a category visible; false to make it hidden.
    */
  def SetContextTabCategoryVisible(categoryName: String, visible: Boolean): Unit
  
  /**
    * Specifies whether the ribbon control is enabled.
    * @param enabled true to enable the ribbon; false to disable it.
    */
  def SetEnabled(enabled: Boolean): Unit
  
  /**
    * Sets the value of the item with the specified name.
    * @param name A string value specifying the name of the item.
    * @param value An object that is the new item value.
    */
  def SetItemValueByName(name: String, value: Any): Unit
  
  /**
    * Specifies whether the ribbon is minimized.
    * @param minimized true to set the ribbon state to minimized; false to set the ribbon state to normal.
    */
  def SetMinimized(minimized: Boolean): Unit
  
  /**
    * Shows ribbon key tips.
    */
  def ShowKeyTips(): Unit
}
object ASPxClientRibbon {
  
  inline def apply(
    ActiveTabChanged: ASPxClientEvent[ASPxClientRibbonTabEventHandler[ASPxClientRibbon]],
    AdjustControl: Callback,
    CommandExecuted: ASPxClientEvent[ASPxClientRibbonCommandExecutedEventHandler[ASPxClientRibbon]],
    DialogBoxLauncherClicked: ASPxClientEvent[ASPxClientRibbonDialogBoxLauncherClickedEventHandler[ASPxClientRibbon]],
    FileTabClicked: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRibbon]],
    GetActiveTab: CallbackTo[ASPxClientRibbonTab],
    GetClientVisible: CallbackTo[Boolean],
    GetEnabled: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetItemByName: String => ASPxClientRibbonItem,
    GetItemValueByName: String => Any,
    GetMainElement: CallbackTo[Any],
    GetMinimized: CallbackTo[Boolean],
    GetParentControl: CallbackTo[Any],
    GetTab: Double => ASPxClientRibbonTab,
    GetTabByName: String => ASPxClientRibbonTab,
    GetTabCount: CallbackTo[Double],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    KeyTipsClosedOnEscape: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRibbon]],
    MinimizationStateChanged: ASPxClientEvent[ASPxClientRibbonMinimizationStateEventHandler[ASPxClientRibbon]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetActiveTab: ASPxClientRibbonTab => Callback,
    SetActiveTabIndex: Double => Callback,
    SetClientVisible: Boolean => Callback,
    SetContextTabCategoryVisible: (String, Boolean) => Callback,
    SetEnabled: Boolean => Callback,
    SetHeight: Double => Callback,
    SetItemValueByName: (String, Any) => Callback,
    SetMinimized: Boolean => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    ShowKeyTips: Callback,
    name: String
  ): ASPxClientRibbon = {
    val __obj = js.Dynamic.literal(ActiveTabChanged = ActiveTabChanged.asInstanceOf[js.Any], AdjustControl = AdjustControl.toJsFn, CommandExecuted = CommandExecuted.asInstanceOf[js.Any], DialogBoxLauncherClicked = DialogBoxLauncherClicked.asInstanceOf[js.Any], FileTabClicked = FileTabClicked.asInstanceOf[js.Any], GetActiveTab = GetActiveTab.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetEnabled = GetEnabled.toJsFn, GetHeight = GetHeight.toJsFn, GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemValueByName = js.Any.fromFunction1(GetItemValueByName), GetMainElement = GetMainElement.toJsFn, GetMinimized = GetMinimized.toJsFn, GetParentControl = GetParentControl.toJsFn, GetTab = js.Any.fromFunction1(GetTab), GetTabByName = js.Any.fromFunction1(GetTabByName), GetTabCount = GetTabCount.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], KeyTipsClosedOnEscape = KeyTipsClosedOnEscape.asInstanceOf[js.Any], MinimizationStateChanged = MinimizationStateChanged.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetActiveTab = js.Any.fromFunction1((t0: ASPxClientRibbonTab) => SetActiveTab(t0).runNow()), SetActiveTabIndex = js.Any.fromFunction1((t0: Double) => SetActiveTabIndex(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetContextTabCategoryVisible = js.Any.fromFunction2((t0: String, t1: Boolean) => (SetContextTabCategoryVisible(t0, t1)).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetItemValueByName = js.Any.fromFunction2((t0: String, t1: Any) => (SetItemValueByName(t0, t1)).runNow()), SetMinimized = js.Any.fromFunction1((t0: Boolean) => SetMinimized(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), ShowKeyTips = ShowKeyTips.toJsFn, name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbon]
  }
  
  extension [Self <: ASPxClientRibbon](x: Self) {
    
    inline def setActiveTabChanged(value: ASPxClientEvent[ASPxClientRibbonTabEventHandler[ASPxClientRibbon]]): Self = StObject.set(x, "ActiveTabChanged", value.asInstanceOf[js.Any])
    
    inline def setCommandExecuted(value: ASPxClientEvent[ASPxClientRibbonCommandExecutedEventHandler[ASPxClientRibbon]]): Self = StObject.set(x, "CommandExecuted", value.asInstanceOf[js.Any])
    
    inline def setDialogBoxLauncherClicked(value: ASPxClientEvent[ASPxClientRibbonDialogBoxLauncherClickedEventHandler[ASPxClientRibbon]]): Self = StObject.set(x, "DialogBoxLauncherClicked", value.asInstanceOf[js.Any])
    
    inline def setFileTabClicked(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRibbon]]): Self = StObject.set(x, "FileTabClicked", value.asInstanceOf[js.Any])
    
    inline def setGetActiveTab(value: CallbackTo[ASPxClientRibbonTab]): Self = StObject.set(x, "GetActiveTab", value.toJsFn)
    
    inline def setGetEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetEnabled", value.toJsFn)
    
    inline def setGetItemByName(value: String => ASPxClientRibbonItem): Self = StObject.set(x, "GetItemByName", js.Any.fromFunction1(value))
    
    inline def setGetItemValueByName(value: String => Any): Self = StObject.set(x, "GetItemValueByName", js.Any.fromFunction1(value))
    
    inline def setGetMinimized(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetMinimized", value.toJsFn)
    
    inline def setGetTab(value: Double => ASPxClientRibbonTab): Self = StObject.set(x, "GetTab", js.Any.fromFunction1(value))
    
    inline def setGetTabByName(value: String => ASPxClientRibbonTab): Self = StObject.set(x, "GetTabByName", js.Any.fromFunction1(value))
    
    inline def setGetTabCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetTabCount", value.toJsFn)
    
    inline def setKeyTipsClosedOnEscape(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRibbon]]): Self = StObject.set(x, "KeyTipsClosedOnEscape", value.asInstanceOf[js.Any])
    
    inline def setMinimizationStateChanged(value: ASPxClientEvent[ASPxClientRibbonMinimizationStateEventHandler[ASPxClientRibbon]]): Self = StObject.set(x, "MinimizationStateChanged", value.asInstanceOf[js.Any])
    
    inline def setSetActiveTab(value: ASPxClientRibbonTab => Callback): Self = StObject.set(x, "SetActiveTab", js.Any.fromFunction1((t0: ASPxClientRibbonTab) => value(t0).runNow()))
    
    inline def setSetActiveTabIndex(value: Double => Callback): Self = StObject.set(x, "SetActiveTabIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetContextTabCategoryVisible(value: (String, Boolean) => Callback): Self = StObject.set(x, "SetContextTabCategoryVisible", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setSetEnabled(value: Boolean => Callback): Self = StObject.set(x, "SetEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetItemValueByName(value: (String, Any) => Callback): Self = StObject.set(x, "SetItemValueByName", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSetMinimized(value: Boolean => Callback): Self = StObject.set(x, "SetMinimized", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setShowKeyTips(value: Callback): Self = StObject.set(x, "ShowKeyTips", value.toJsFn)
  }
}
