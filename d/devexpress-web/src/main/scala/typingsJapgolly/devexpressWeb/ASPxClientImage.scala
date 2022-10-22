package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxImage control.
  */
trait ASPxClientImage
  extends StObject
     with ASPxClientImageBase {
  
  /**
    * Returns the URL pointing to the image displayed within the image editor.
    */
  def GetImageUrl(): String
  
  /**
    * Sets the URL which points to the image displayed within the image editor.
    * @param url A string value specifying the URL to the image displayed within the editor.
    */
  def SetImageUrl(url: String): Unit
}
object ASPxClientImage {
  
  inline def apply(
    AdjustControl: Callback,
    Click: ASPxClientEvent[ASPxClientEditEventHandler[ASPxClientStaticEdit]],
    GetCaption: CallbackTo[String],
    GetClientVisible: CallbackTo[Boolean],
    GetEnabled: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetImageUrl: CallbackTo[String],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetValue: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetCaption: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetEnabled: Boolean => Callback,
    SetHeight: Double => Callback,
    SetImageUrl: String => Callback,
    SetSize: (Double, Double) => Callback,
    SetValue: Any => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    name: String
  ): ASPxClientImage = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, Click = Click.asInstanceOf[js.Any], GetCaption = GetCaption.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetEnabled = GetEnabled.toJsFn, GetHeight = GetHeight.toJsFn, GetImageUrl = GetImageUrl.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetValue = GetValue.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetCaption = js.Any.fromFunction1((t0: String) => SetCaption(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetImageUrl = js.Any.fromFunction1((t0: String) => SetImageUrl(t0).runNow()), SetSize = js.Any.fromFunction2((t0: Double, t1: Double) => (SetSize(t0, t1)).runNow()), SetValue = js.Any.fromFunction1((t0: Any) => SetValue(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientImage]
  }
  
  extension [Self <: ASPxClientImage](x: Self) {
    
    inline def setGetImageUrl(value: CallbackTo[String]): Self = StObject.set(x, "GetImageUrl", value.toJsFn)
    
    inline def setSetImageUrl(value: String => Callback): Self = StObject.set(x, "SetImageUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
