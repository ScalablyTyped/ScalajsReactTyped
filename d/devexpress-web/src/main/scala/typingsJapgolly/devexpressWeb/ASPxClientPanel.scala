package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxPanel control.
  */
trait ASPxClientPanel
  extends StObject
     with ASPxClientPanelBase {
  
  /**
    * Collapses the expanded panel.
    */
  def Collapse(): Unit
  
  /**
    * Occurs when the expanded panel is closed.
    */
  var Collapsed: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]]
  
  /**
    * Expands the collapsed panel.
    */
  def Expand(): Unit
  
  /**
    * Occurs when an end-user opens the expand panel.
    */
  var Expanded: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]]
  
  /**
    * Returns a value specifying whether the panel can be expanded.
    */
  def IsExpandable(): Boolean
  
  /**
    * Returns a value specifying whether the panel is expanded.
    */
  def IsExpanded(): Boolean
  
  /**
    * Expands or collapses the client panel.
    */
  def Toggle(): Unit
}
object ASPxClientPanel {
  
  inline def apply(
    AdjustControl: Callback,
    Collapse: Callback,
    Collapsed: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]],
    Expand: Callback,
    Expanded: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]],
    GetClientVisible: CallbackTo[Boolean],
    GetContentHtml: CallbackTo[String],
    GetEnabled: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    IsExpandable: CallbackTo[Boolean],
    IsExpanded: CallbackTo[Boolean],
    SendMessageToAssistiveTechnology: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetContentHtml: String => Callback,
    SetEnabled: Boolean => Callback,
    SetHeight: Double => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    Toggle: Callback,
    name: String
  ): ASPxClientPanel = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, Collapse = Collapse.toJsFn, Collapsed = Collapsed.asInstanceOf[js.Any], Expand = Expand.toJsFn, Expanded = Expanded.asInstanceOf[js.Any], GetClientVisible = GetClientVisible.toJsFn, GetContentHtml = GetContentHtml.toJsFn, GetEnabled = GetEnabled.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], IsExpandable = IsExpandable.toJsFn, IsExpanded = IsExpanded.toJsFn, SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetContentHtml = js.Any.fromFunction1((t0: String) => SetContentHtml(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), Toggle = Toggle.toJsFn, name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPanel]
  }
  
  extension [Self <: ASPxClientPanel](x: Self) {
    
    inline def setCollapse(value: Callback): Self = StObject.set(x, "Collapse", value.toJsFn)
    
    inline def setCollapsed(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]]): Self = StObject.set(x, "Collapsed", value.asInstanceOf[js.Any])
    
    inline def setExpand(value: Callback): Self = StObject.set(x, "Expand", value.toJsFn)
    
    inline def setExpanded(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]]): Self = StObject.set(x, "Expanded", value.asInstanceOf[js.Any])
    
    inline def setIsExpandable(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsExpandable", value.toJsFn)
    
    inline def setIsExpanded(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsExpanded", value.toJsFn)
    
    inline def setToggle(value: Callback): Self = StObject.set(x, "Toggle", value.toJsFn)
  }
}
