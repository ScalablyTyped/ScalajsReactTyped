package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapAccordionItem extends StObject {
  
  def getBadgeIconCssClass(): String
  
  def getBadgeText(): String
  
  def getEnabled(): Boolean
  
  def getIconCssClass(): String
  
  def getImageUrl(): String
  
  def getNavigateUrl(): String
  
  def getText(): String
  
  def getVisible(): Boolean
  
  val group: BootstrapAccordionGroup | Null
  
  val index: Double
  
  /* protected */ val instance: Any
  
  val name: String
  
  val navBar: BootstrapAccordion | Null
  
  def setBadgeIconCssClass(cssClass: String): Unit
  
  def setBadgeText(text: String): Unit
  
  def setEnabled(value: Boolean): Unit
  
  def setIconCssClass(cssClass: String): Unit
  
  def setImageUrl(value: String): Unit
  
  def setNavigateUrl(value: String): Unit
  
  def setText(value: String): Unit
  
  def setVisible(value: Boolean): Unit
}
object BootstrapAccordionItem {
  
  inline def apply(
    getBadgeIconCssClass: CallbackTo[String],
    getBadgeText: CallbackTo[String],
    getEnabled: CallbackTo[Boolean],
    getIconCssClass: CallbackTo[String],
    getImageUrl: CallbackTo[String],
    getNavigateUrl: CallbackTo[String],
    getText: CallbackTo[String],
    getVisible: CallbackTo[Boolean],
    index: Double,
    instance: Any,
    name: String,
    setBadgeIconCssClass: String => Callback,
    setBadgeText: String => Callback,
    setEnabled: Boolean => Callback,
    setIconCssClass: String => Callback,
    setImageUrl: String => Callback,
    setNavigateUrl: String => Callback,
    setText: String => Callback,
    setVisible: Boolean => Callback
  ): BootstrapAccordionItem = {
    val __obj = js.Dynamic.literal(getBadgeIconCssClass = getBadgeIconCssClass.toJsFn, getBadgeText = getBadgeText.toJsFn, getEnabled = getEnabled.toJsFn, getIconCssClass = getIconCssClass.toJsFn, getImageUrl = getImageUrl.toJsFn, getNavigateUrl = getNavigateUrl.toJsFn, getText = getText.toJsFn, getVisible = getVisible.toJsFn, index = index.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setBadgeIconCssClass = js.Any.fromFunction1((t0: String) => setBadgeIconCssClass(t0).runNow()), setBadgeText = js.Any.fromFunction1((t0: String) => setBadgeText(t0).runNow()), setEnabled = js.Any.fromFunction1((t0: Boolean) => setEnabled(t0).runNow()), setIconCssClass = js.Any.fromFunction1((t0: String) => setIconCssClass(t0).runNow()), setImageUrl = js.Any.fromFunction1((t0: String) => setImageUrl(t0).runNow()), setNavigateUrl = js.Any.fromFunction1((t0: String) => setNavigateUrl(t0).runNow()), setText = js.Any.fromFunction1((t0: String) => setText(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), group = null, navBar = null)
    __obj.asInstanceOf[BootstrapAccordionItem]
  }
  
  extension [Self <: BootstrapAccordionItem](x: Self) {
    
    inline def setGetBadgeIconCssClass(value: CallbackTo[String]): Self = StObject.set(x, "getBadgeIconCssClass", value.toJsFn)
    
    inline def setGetBadgeText(value: CallbackTo[String]): Self = StObject.set(x, "getBadgeText", value.toJsFn)
    
    inline def setGetEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "getEnabled", value.toJsFn)
    
    inline def setGetIconCssClass(value: CallbackTo[String]): Self = StObject.set(x, "getIconCssClass", value.toJsFn)
    
    inline def setGetImageUrl(value: CallbackTo[String]): Self = StObject.set(x, "getImageUrl", value.toJsFn)
    
    inline def setGetNavigateUrl(value: CallbackTo[String]): Self = StObject.set(x, "getNavigateUrl", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setGetVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "getVisible", value.toJsFn)
    
    inline def setGroup(value: BootstrapAccordionGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupNull: Self = StObject.set(x, "group", null)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNavBar(value: BootstrapAccordion): Self = StObject.set(x, "navBar", value.asInstanceOf[js.Any])
    
    inline def setNavBarNull: Self = StObject.set(x, "navBar", null)
    
    inline def setSetBadgeIconCssClass(value: String => Callback): Self = StObject.set(x, "setBadgeIconCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetBadgeText(value: String => Callback): Self = StObject.set(x, "setBadgeText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetEnabled(value: Boolean => Callback): Self = StObject.set(x, "setEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetIconCssClass(value: String => Callback): Self = StObject.set(x, "setIconCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetImageUrl(value: String => Callback): Self = StObject.set(x, "setImageUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetNavigateUrl(value: String => Callback): Self = StObject.set(x, "setNavigateUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetText(value: String => Callback): Self = StObject.set(x, "setText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "setVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
