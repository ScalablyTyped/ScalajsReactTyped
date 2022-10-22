package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapTabControl control.
  */
trait BootstrapClientTabControl
  extends StObject
     with ASPxClientTabControlBase {
  
  /**
    * Makes the specified tab active within the Tab Control on the client side.
    * @param tab A BootstrapClientTab object specifying the tab to select.
    */
  def SetActiveTab(tab: BootstrapClientTab): Unit
}
object BootstrapClientTabControl {
  
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
    SetActiveTab: BootstrapClientTab => Callback,
    SetActiveTabIndex: Double => Callback,
    SetClientVisible: Boolean => Callback,
    SetHeight: Double => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    TabClick: ASPxClientEvent[ASPxClientTabControlTabClickEventHandler[ASPxClientTabControlBase]],
    name: String
  ): BootstrapClientTabControl = {
    val __obj = js.Dynamic.literal(ActiveTabChanged = ActiveTabChanged.asInstanceOf[js.Any], ActiveTabChanging = ActiveTabChanging.asInstanceOf[js.Any], AdjustControl = AdjustControl.toJsFn, AdjustSize = AdjustSize.toJsFn, BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], GetActiveTab = GetActiveTab.toJsFn, GetActiveTabIndex = GetActiveTabIndex.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetTab = js.Any.fromFunction1(GetTab), GetTabByName = js.Any.fromFunction1(GetTabByName), GetTabCount = GetTabCount.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetActiveTab = js.Any.fromFunction1((t0: BootstrapClientTab) => SetActiveTab(t0).runNow()), SetActiveTabIndex = js.Any.fromFunction1((t0: Double) => SetActiveTabIndex(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), TabClick = TabClick.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTabControl]
  }
  
  extension [Self <: BootstrapClientTabControl](x: Self) {
    
    inline def setSetActiveTab(value: BootstrapClientTab => Callback): Self = StObject.set(x, "SetActiveTab", js.Any.fromFunction1((t0: BootstrapClientTab) => value(t0).runNow()))
  }
}
