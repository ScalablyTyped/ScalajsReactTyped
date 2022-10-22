package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the area that is used within the Html Editor's media dialogs.
  */
trait ASPxClientMediaFileSelector
  extends StObject
     with ASPxClientControl {
  
  /**
    * Returns a URL text from the URL text box in Html Editor's media dialogs.
    */
  def GetUrl(): String
  
  /**
    * Sets a URL text in the Html Editor's media dialogs.
    * @param url A string value that is the Url text.
    */
  def SetUrl(url: String): Unit
}
object ASPxClientMediaFileSelector {
  
  inline def apply(
    AdjustControl: Callback,
    GetClientVisible: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetUrl: CallbackTo[String],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetHeight: Double => Callback,
    SetUrl: String => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    name: String
  ): ASPxClientMediaFileSelector = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetUrl = GetUrl.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetUrl = js.Any.fromFunction1((t0: String) => SetUrl(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMediaFileSelector]
  }
  
  extension [Self <: ASPxClientMediaFileSelector](x: Self) {
    
    inline def setGetUrl(value: CallbackTo[String]): Self = StObject.set(x, "GetUrl", value.toJsFn)
    
    inline def setSetUrl(value: String => Callback): Self = StObject.set(x, "SetUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
