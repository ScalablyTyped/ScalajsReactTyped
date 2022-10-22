package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapPopupWindow extends StObject {
  
  def getFooterImageUrl(): String
  
  def getFooterNavigateUrl(): String
  
  def getFooterText(): String
  
  def getHeaderImageUrl(): String
  
  def getHeaderNavigateUrl(): String
  
  def getHeaderText(): String
  
  val index: Double
  
  /* protected */ val instance: Any
  
  val name: String
  
  val popupControl: BootstrapPopupControl | Null
  
  def setFooterImageUrl(value: String): Unit
  
  def setFooterNavigateUrl(value: String): Unit
  
  def setFooterText(value: String): Unit
  
  def setHeaderImageUrl(value: String): Unit
  
  def setHeaderNavigateUrl(value: String): Unit
  
  def setHeaderText(value: String): Unit
}
object BootstrapPopupWindow {
  
  inline def apply(
    getFooterImageUrl: CallbackTo[String],
    getFooterNavigateUrl: CallbackTo[String],
    getFooterText: CallbackTo[String],
    getHeaderImageUrl: CallbackTo[String],
    getHeaderNavigateUrl: CallbackTo[String],
    getHeaderText: CallbackTo[String],
    index: Double,
    instance: Any,
    name: String,
    setFooterImageUrl: String => Callback,
    setFooterNavigateUrl: String => Callback,
    setFooterText: String => Callback,
    setHeaderImageUrl: String => Callback,
    setHeaderNavigateUrl: String => Callback,
    setHeaderText: String => Callback
  ): BootstrapPopupWindow = {
    val __obj = js.Dynamic.literal(getFooterImageUrl = getFooterImageUrl.toJsFn, getFooterNavigateUrl = getFooterNavigateUrl.toJsFn, getFooterText = getFooterText.toJsFn, getHeaderImageUrl = getHeaderImageUrl.toJsFn, getHeaderNavigateUrl = getHeaderNavigateUrl.toJsFn, getHeaderText = getHeaderText.toJsFn, index = index.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setFooterImageUrl = js.Any.fromFunction1((t0: String) => setFooterImageUrl(t0).runNow()), setFooterNavigateUrl = js.Any.fromFunction1((t0: String) => setFooterNavigateUrl(t0).runNow()), setFooterText = js.Any.fromFunction1((t0: String) => setFooterText(t0).runNow()), setHeaderImageUrl = js.Any.fromFunction1((t0: String) => setHeaderImageUrl(t0).runNow()), setHeaderNavigateUrl = js.Any.fromFunction1((t0: String) => setHeaderNavigateUrl(t0).runNow()), setHeaderText = js.Any.fromFunction1((t0: String) => setHeaderText(t0).runNow()), popupControl = null)
    __obj.asInstanceOf[BootstrapPopupWindow]
  }
  
  extension [Self <: BootstrapPopupWindow](x: Self) {
    
    inline def setGetFooterImageUrl(value: CallbackTo[String]): Self = StObject.set(x, "getFooterImageUrl", value.toJsFn)
    
    inline def setGetFooterNavigateUrl(value: CallbackTo[String]): Self = StObject.set(x, "getFooterNavigateUrl", value.toJsFn)
    
    inline def setGetFooterText(value: CallbackTo[String]): Self = StObject.set(x, "getFooterText", value.toJsFn)
    
    inline def setGetHeaderImageUrl(value: CallbackTo[String]): Self = StObject.set(x, "getHeaderImageUrl", value.toJsFn)
    
    inline def setGetHeaderNavigateUrl(value: CallbackTo[String]): Self = StObject.set(x, "getHeaderNavigateUrl", value.toJsFn)
    
    inline def setGetHeaderText(value: CallbackTo[String]): Self = StObject.set(x, "getHeaderText", value.toJsFn)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPopupControl(value: BootstrapPopupControl): Self = StObject.set(x, "popupControl", value.asInstanceOf[js.Any])
    
    inline def setPopupControlNull: Self = StObject.set(x, "popupControl", null)
    
    inline def setSetFooterImageUrl(value: String => Callback): Self = StObject.set(x, "setFooterImageUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetFooterNavigateUrl(value: String => Callback): Self = StObject.set(x, "setFooterNavigateUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetFooterText(value: String => Callback): Self = StObject.set(x, "setFooterText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetHeaderImageUrl(value: String => Callback): Self = StObject.set(x, "setHeaderImageUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetHeaderNavigateUrl(value: String => Callback): Self = StObject.set(x, "setHeaderNavigateUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetHeaderText(value: String => Callback): Self = StObject.set(x, "setHeaderText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
