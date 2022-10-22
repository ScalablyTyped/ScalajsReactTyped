package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxLoadingPanel control.
  */
trait ASPxClientLoadingPanel
  extends StObject
     with ASPxClientControl {
  
  /**
    * Gets the text displayed within the ASPxLoadingPanel.
    */
  def GetText(): String
  
  /**
    * Hides the loading panel.
    */
  def Hide(): Unit
  
  /**
    * Sets the text to be displayed within the ASPxLoadingPanel.
    * @param text A string value specifying the text to be displayed within the ASPxLoadingPanel.
    */
  def SetText(text: String): Unit
  
  /**
    * Invokes the loading panel.
    */
  def Show(): Unit
  
  /**
    * Invokes the loading panel at the specified position.
    * @param x An integer value specifying the x-coordinate of the loading panel's display position.
    * @param y An integer value specifying the y-coordinate of the loaidng panel's display position.
    */
  def ShowAtPos(x: Double, y: Double): Unit
  
  /**
    * Invokes the loading panel, displaying it over the specified HTML element.
    * @param htmlElement An object that specifies the required HTML element.
    */
  def ShowInElement(htmlElement: Any): Unit
  
  /**
    * Invokes the loading panel, displaying it over the specified element.
    * @param id A string that specifies the required element's identifier.
    */
  def ShowInElementByID(id: String): Unit
}
object ASPxClientLoadingPanel {
  
  inline def apply(
    AdjustControl: Callback,
    GetClientVisible: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetText: CallbackTo[String],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    Hide: Callback,
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetHeight: Double => Callback,
    SetText: String => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    Show: Callback,
    ShowAtPos: (Double, Double) => Callback,
    ShowInElement: Any => Callback,
    ShowInElementByID: String => Callback,
    name: String
  ): ASPxClientLoadingPanel = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetText = GetText.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, Hide = Hide.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), Show = Show.toJsFn, ShowAtPos = js.Any.fromFunction2((t0: Double, t1: Double) => (ShowAtPos(t0, t1)).runNow()), ShowInElement = js.Any.fromFunction1((t0: Any) => ShowInElement(t0).runNow()), ShowInElementByID = js.Any.fromFunction1((t0: String) => ShowInElementByID(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientLoadingPanel]
  }
  
  extension [Self <: ASPxClientLoadingPanel](x: Self) {
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "GetText", value.toJsFn)
    
    inline def setHide(value: Callback): Self = StObject.set(x, "Hide", value.toJsFn)
    
    inline def setSetText(value: String => Callback): Self = StObject.set(x, "SetText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setShow(value: Callback): Self = StObject.set(x, "Show", value.toJsFn)
    
    inline def setShowAtPos(value: (Double, Double) => Callback): Self = StObject.set(x, "ShowAtPos", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setShowInElement(value: Any => Callback): Self = StObject.set(x, "ShowInElement", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setShowInElementByID(value: String => Callback): Self = StObject.set(x, "ShowInElementByID", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
