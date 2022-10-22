package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of a popup control's PopupWindow object.
  */
trait ASPxClientPopupWindow extends StObject {
  
  /**
    * Returns the URL pointing to the image displayed within the window footer.
    */
  def GetFooterImageUrl(): String
  
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's footer.
    */
  def GetFooterNavigateUrl(): String
  
  /**
    * Returns the text displayed within the popup window's footer.
    */
  def GetFooterText(): String
  
  /**
    * Returns the URL pointing to the image displayed within the window header.
    */
  def GetHeaderImageUrl(): String
  
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's header.
    */
  def GetHeaderNavigateUrl(): String
  
  /**
    * Returns the text displayed within the window's header.
    */
  def GetHeaderText(): String
  
  /**
    * Specifies the URL which points to the image displayed within the window footer.
    * @param value A string value that is the URL to the image displayed within the window footer.
    */
  def SetFooterImageUrl(value: String): Unit
  
  /**
    * Specifies the URL where the web browser will navigate when the text or image is clicked within the popup window's footer.
    * @param value A string value which specifies the required navigation location.
    */
  def SetFooterNavigateUrl(value: String): Unit
  
  /**
    * Specifies the text displayed within the window's footer.
    * @param value A string value that specifies the window's footer text.
    */
  def SetFooterText(value: String): Unit
  
  /**
    * Specifies the URL which points to the image displayed within the window header.
    * @param value A string value that is the URL to the image displayed within the header.
    */
  def SetHeaderImageUrl(value: String): Unit
  
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's header.
    * @param value A string value which specifies the required navigation location.
    */
  def SetHeaderNavigateUrl(value: String): Unit
  
  /**
    * Specifies the text displayed within the window's header.
    * @param value A string value that specifies the window's header text.
    */
  def SetHeaderText(value: String): Unit
  
  /**
    * Gets the index of the current popup window within the popup control's ASPxPopupControl.Windows collection.
    */
  var index: Double
  
  /**
    * Gets the name that uniquely identifies the current popup window.
    */
  var name: String
  
  /**
    * Gets the popup control to which the current popup window belongs.
    */
  var popupControl: ASPxClientPopupControl
}
object ASPxClientPopupWindow {
  
  inline def apply(
    GetFooterImageUrl: CallbackTo[String],
    GetFooterNavigateUrl: CallbackTo[String],
    GetFooterText: CallbackTo[String],
    GetHeaderImageUrl: CallbackTo[String],
    GetHeaderNavigateUrl: CallbackTo[String],
    GetHeaderText: CallbackTo[String],
    SetFooterImageUrl: String => Callback,
    SetFooterNavigateUrl: String => Callback,
    SetFooterText: String => Callback,
    SetHeaderImageUrl: String => Callback,
    SetHeaderNavigateUrl: String => Callback,
    SetHeaderText: String => Callback,
    index: Double,
    name: String,
    popupControl: ASPxClientPopupControl
  ): ASPxClientPopupWindow = {
    val __obj = js.Dynamic.literal(GetFooterImageUrl = GetFooterImageUrl.toJsFn, GetFooterNavigateUrl = GetFooterNavigateUrl.toJsFn, GetFooterText = GetFooterText.toJsFn, GetHeaderImageUrl = GetHeaderImageUrl.toJsFn, GetHeaderNavigateUrl = GetHeaderNavigateUrl.toJsFn, GetHeaderText = GetHeaderText.toJsFn, SetFooterImageUrl = js.Any.fromFunction1((t0: String) => SetFooterImageUrl(t0).runNow()), SetFooterNavigateUrl = js.Any.fromFunction1((t0: String) => SetFooterNavigateUrl(t0).runNow()), SetFooterText = js.Any.fromFunction1((t0: String) => SetFooterText(t0).runNow()), SetHeaderImageUrl = js.Any.fromFunction1((t0: String) => SetHeaderImageUrl(t0).runNow()), SetHeaderNavigateUrl = js.Any.fromFunction1((t0: String) => SetHeaderNavigateUrl(t0).runNow()), SetHeaderText = js.Any.fromFunction1((t0: String) => SetHeaderText(t0).runNow()), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], popupControl = popupControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupWindow]
  }
  
  extension [Self <: ASPxClientPopupWindow](x: Self) {
    
    inline def setGetFooterImageUrl(value: CallbackTo[String]): Self = StObject.set(x, "GetFooterImageUrl", value.toJsFn)
    
    inline def setGetFooterNavigateUrl(value: CallbackTo[String]): Self = StObject.set(x, "GetFooterNavigateUrl", value.toJsFn)
    
    inline def setGetFooterText(value: CallbackTo[String]): Self = StObject.set(x, "GetFooterText", value.toJsFn)
    
    inline def setGetHeaderImageUrl(value: CallbackTo[String]): Self = StObject.set(x, "GetHeaderImageUrl", value.toJsFn)
    
    inline def setGetHeaderNavigateUrl(value: CallbackTo[String]): Self = StObject.set(x, "GetHeaderNavigateUrl", value.toJsFn)
    
    inline def setGetHeaderText(value: CallbackTo[String]): Self = StObject.set(x, "GetHeaderText", value.toJsFn)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPopupControl(value: ASPxClientPopupControl): Self = StObject.set(x, "popupControl", value.asInstanceOf[js.Any])
    
    inline def setSetFooterImageUrl(value: String => Callback): Self = StObject.set(x, "SetFooterImageUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetFooterNavigateUrl(value: String => Callback): Self = StObject.set(x, "SetFooterNavigateUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetFooterText(value: String => Callback): Self = StObject.set(x, "SetFooterText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetHeaderImageUrl(value: String => Callback): Self = StObject.set(x, "SetHeaderImageUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetHeaderNavigateUrl(value: String => Callback): Self = StObject.set(x, "SetHeaderNavigateUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetHeaderText(value: String => Callback): Self = StObject.set(x, "SetHeaderText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
