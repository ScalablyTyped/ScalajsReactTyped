package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as the base class for controls that implement panel functionality.
  */
trait ASPxClientPanelBase
  extends StObject
     with ASPxClientControl {
  
  /**
    * Returns the HTML code that is the content of the panel.
    */
  def GetContentHtml(): String
  
  /**
    * Returns a value specifying whether a panel is enabled.
    */
  def GetEnabled(): Boolean
  
  /**
    * Sets the HTML content for the panel.
    * @param html A string value that is the HTML code defining the content of the panel.
    */
  def SetContentHtml(html: String): Unit
  
  /**
    * Sets a value specifying whether the panel is enabled.
    * @param enabled true to enable the panel; false to disable it.
    */
  def SetEnabled(enabled: Boolean): Unit
}
object ASPxClientPanelBase {
  
  inline def apply(
    AdjustControl: Callback,
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
    SendMessageToAssistiveTechnology: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetContentHtml: String => Callback,
    SetEnabled: Boolean => Callback,
    SetHeight: Double => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    name: String
  ): ASPxClientPanelBase = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetContentHtml = GetContentHtml.toJsFn, GetEnabled = GetEnabled.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetContentHtml = js.Any.fromFunction1((t0: String) => SetContentHtml(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPanelBase]
  }
  
  extension [Self <: ASPxClientPanelBase](x: Self) {
    
    inline def setGetContentHtml(value: CallbackTo[String]): Self = StObject.set(x, "GetContentHtml", value.toJsFn)
    
    inline def setGetEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetEnabled", value.toJsFn)
    
    inline def setSetContentHtml(value: String => Callback): Self = StObject.set(x, "SetContentHtml", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetEnabled(value: Boolean => Callback): Self = StObject.set(x, "SetEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
