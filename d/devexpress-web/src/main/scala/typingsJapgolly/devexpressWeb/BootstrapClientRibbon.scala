package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapRibbon control.
  */
trait BootstrapClientRibbon
  extends StObject
     with ASPxClientRibbon {
  
  def GetQuickAccessToolbarItem(name: String): ASPxClientRibbonItem
}
object BootstrapClientRibbon {
  
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
    GetQuickAccessToolbarItem: String => ASPxClientRibbonItem,
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
  ): BootstrapClientRibbon = {
    val __obj = js.Dynamic.literal(ActiveTabChanged = ActiveTabChanged.asInstanceOf[js.Any], AdjustControl = AdjustControl.toJsFn, CommandExecuted = CommandExecuted.asInstanceOf[js.Any], DialogBoxLauncherClicked = DialogBoxLauncherClicked.asInstanceOf[js.Any], FileTabClicked = FileTabClicked.asInstanceOf[js.Any], GetActiveTab = GetActiveTab.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetEnabled = GetEnabled.toJsFn, GetHeight = GetHeight.toJsFn, GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemValueByName = js.Any.fromFunction1(GetItemValueByName), GetMainElement = GetMainElement.toJsFn, GetMinimized = GetMinimized.toJsFn, GetParentControl = GetParentControl.toJsFn, GetQuickAccessToolbarItem = js.Any.fromFunction1(GetQuickAccessToolbarItem), GetTab = js.Any.fromFunction1(GetTab), GetTabByName = js.Any.fromFunction1(GetTabByName), GetTabCount = GetTabCount.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], KeyTipsClosedOnEscape = KeyTipsClosedOnEscape.asInstanceOf[js.Any], MinimizationStateChanged = MinimizationStateChanged.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetActiveTab = js.Any.fromFunction1((t0: ASPxClientRibbonTab) => SetActiveTab(t0).runNow()), SetActiveTabIndex = js.Any.fromFunction1((t0: Double) => SetActiveTabIndex(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetContextTabCategoryVisible = js.Any.fromFunction2((t0: String, t1: Boolean) => (SetContextTabCategoryVisible(t0, t1)).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetItemValueByName = js.Any.fromFunction2((t0: String, t1: Any) => (SetItemValueByName(t0, t1)).runNow()), SetMinimized = js.Any.fromFunction1((t0: Boolean) => SetMinimized(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), ShowKeyTips = ShowKeyTips.toJsFn, name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientRibbon]
  }
  
  extension [Self <: BootstrapClientRibbon](x: Self) {
    
    inline def setGetQuickAccessToolbarItem(value: String => ASPxClientRibbonItem): Self = StObject.set(x, "GetQuickAccessToolbarItem", js.Any.fromFunction1(value))
  }
}
