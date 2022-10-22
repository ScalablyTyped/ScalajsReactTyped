package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapAccordion control.
  */
trait BootstrapClientAccordion
  extends StObject
     with ASPxClientNavBar {
  
  /**
    * Makes the specified group active.
    * @param group A BootstrapClientAccordionGroup object that specifies the active group.
    */
  def SetActiveGroup(group: BootstrapClientAccordionGroup): Unit
  
  /**
    * Selects the specified item within the Accordion control on the client side.
    * @param item A BootstrapClientAccordionItem object specifying the item to select.
    */
  def SetSelectedItem(item: BootstrapClientAccordionItem): Unit
}
object BootstrapClientAccordion {
  
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
    SetActiveGroup: BootstrapClientAccordionGroup => Callback,
    SetClientVisible: Boolean => Callback,
    SetHeight: Double => Callback,
    SetSelectedItem: BootstrapClientAccordionItem => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    name: String
  ): BootstrapClientAccordion = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], CollapseAll = CollapseAll.toJsFn, EndCallback = EndCallback.asInstanceOf[js.Any], ExpandAll = ExpandAll.toJsFn, ExpandedChanged = ExpandedChanged.asInstanceOf[js.Any], ExpandedChanging = ExpandedChanging.asInstanceOf[js.Any], GetActiveGroup = GetActiveGroup.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetGroup = js.Any.fromFunction1(GetGroup), GetGroupByName = js.Any.fromFunction1(GetGroupByName), GetGroupCount = GetGroupCount.toJsFn, GetHeight = GetHeight.toJsFn, GetItemByName = js.Any.fromFunction1(GetItemByName), GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetSelectedItem = GetSelectedItem.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, HeaderClick = HeaderClick.asInstanceOf[js.Any], InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], ItemClick = ItemClick.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetActiveGroup = js.Any.fromFunction1((t0: BootstrapClientAccordionGroup) => SetActiveGroup(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetSelectedItem = js.Any.fromFunction1((t0: BootstrapClientAccordionItem) => SetSelectedItem(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientAccordion]
  }
  
  extension [Self <: BootstrapClientAccordion](x: Self) {
    
    inline def setSetActiveGroup(value: BootstrapClientAccordionGroup => Callback): Self = StObject.set(x, "SetActiveGroup", js.Any.fromFunction1((t0: BootstrapClientAccordionGroup) => value(t0).runNow()))
    
    inline def setSetSelectedItem(value: BootstrapClientAccordionItem => Callback): Self = StObject.set(x, "SetSelectedItem", js.Any.fromFunction1((t0: BootstrapClientAccordionItem) => value(t0).runNow()))
  }
}
