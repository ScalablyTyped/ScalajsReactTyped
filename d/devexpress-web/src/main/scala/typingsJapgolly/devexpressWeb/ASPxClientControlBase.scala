package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as the base type for all the objects included in the client-side object model.
  */
trait ASPxClientControlBase extends StObject {
  
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  def GetClientVisible(): Boolean
  
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  def GetMainElement(): Any
  
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  def GetParentControl(): Any
  
  /**
    * Returns a value specifying whether a control is displayed.
    */
  def GetVisible(): Boolean
  
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  def InCallback(): Boolean
  
  /**
    * Occurs on the client side after the control has been initialized.
    */
  var Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]]
  
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  def SendMessageToAssistiveTechnology(message: String): Unit
  
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  def SetClientVisible(visible: Boolean): Unit
  
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  def SetVisible(visible: Boolean): Unit
  
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  var name: String
}
object ASPxClientControlBase {
  
  inline def apply(
    GetClientVisible: CallbackTo[Boolean],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetVisible: Boolean => Callback,
    name: String
  ): ASPxClientControlBase = {
    val __obj = js.Dynamic.literal(GetClientVisible = GetClientVisible.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetVisible = GetVisible.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientControlBase]
  }
  
  extension [Self <: ASPxClientControlBase](x: Self) {
    
    inline def setGetClientVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetClientVisible", value.toJsFn)
    
    inline def setGetMainElement(value: CallbackTo[Any]): Self = StObject.set(x, "GetMainElement", value.toJsFn)
    
    inline def setGetParentControl(value: CallbackTo[Any]): Self = StObject.set(x, "GetParentControl", value.toJsFn)
    
    inline def setGetVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetVisible", value.toJsFn)
    
    inline def setInCallback(value: CallbackTo[Boolean]): Self = StObject.set(x, "InCallback", value.toJsFn)
    
    inline def setInit(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]]): Self = StObject.set(x, "Init", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSendMessageToAssistiveTechnology(value: String => Callback): Self = StObject.set(x, "SendMessageToAssistiveTechnology", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetClientVisible(value: Boolean => Callback): Self = StObject.set(x, "SetClientVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "SetVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
