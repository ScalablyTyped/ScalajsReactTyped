package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapAccordionGroup extends StObject {
  
  def getEnabled(): Boolean
  
  def getExpanded(): Boolean
  
  def getHeaderBadgeIconCssClass(): String
  
  def getHeaderBadgeText(): String
  
  def getItem(index: Double): BootstrapAccordionItem | Null
  
  def getItemByName(name: String): BootstrapAccordionItem | Null
  
  def getItemCount(): Double
  
  def getText(): String
  
  def getVisible(): Boolean
  
  val index: Double
  
  /* protected */ val instance: Any
  
  val name: String
  
  val navBar: BootstrapAccordion | Null
  
  def setExpanded(value: Boolean): Unit
  
  def setHeaderBadgeIconCssClass(cssClass: String): Unit
  
  def setHeaderBadgeText(text: String): Unit
  
  def setText(text: String): Unit
  
  def setVisible(value: Boolean): Unit
}
object BootstrapAccordionGroup {
  
  inline def apply(
    getEnabled: CallbackTo[Boolean],
    getExpanded: CallbackTo[Boolean],
    getHeaderBadgeIconCssClass: CallbackTo[String],
    getHeaderBadgeText: CallbackTo[String],
    getItem: Double => BootstrapAccordionItem | Null,
    getItemByName: String => BootstrapAccordionItem | Null,
    getItemCount: CallbackTo[Double],
    getText: CallbackTo[String],
    getVisible: CallbackTo[Boolean],
    index: Double,
    instance: Any,
    name: String,
    setExpanded: Boolean => Callback,
    setHeaderBadgeIconCssClass: String => Callback,
    setHeaderBadgeText: String => Callback,
    setText: String => Callback,
    setVisible: Boolean => Callback
  ): BootstrapAccordionGroup = {
    val __obj = js.Dynamic.literal(getEnabled = getEnabled.toJsFn, getExpanded = getExpanded.toJsFn, getHeaderBadgeIconCssClass = getHeaderBadgeIconCssClass.toJsFn, getHeaderBadgeText = getHeaderBadgeText.toJsFn, getItem = js.Any.fromFunction1(getItem), getItemByName = js.Any.fromFunction1(getItemByName), getItemCount = getItemCount.toJsFn, getText = getText.toJsFn, getVisible = getVisible.toJsFn, index = index.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setExpanded = js.Any.fromFunction1((t0: Boolean) => setExpanded(t0).runNow()), setHeaderBadgeIconCssClass = js.Any.fromFunction1((t0: String) => setHeaderBadgeIconCssClass(t0).runNow()), setHeaderBadgeText = js.Any.fromFunction1((t0: String) => setHeaderBadgeText(t0).runNow()), setText = js.Any.fromFunction1((t0: String) => setText(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), navBar = null)
    __obj.asInstanceOf[BootstrapAccordionGroup]
  }
  
  extension [Self <: BootstrapAccordionGroup](x: Self) {
    
    inline def setGetEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "getEnabled", value.toJsFn)
    
    inline def setGetExpanded(value: CallbackTo[Boolean]): Self = StObject.set(x, "getExpanded", value.toJsFn)
    
    inline def setGetHeaderBadgeIconCssClass(value: CallbackTo[String]): Self = StObject.set(x, "getHeaderBadgeIconCssClass", value.toJsFn)
    
    inline def setGetHeaderBadgeText(value: CallbackTo[String]): Self = StObject.set(x, "getHeaderBadgeText", value.toJsFn)
    
    inline def setGetItem(value: Double => BootstrapAccordionItem | Null): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setGetItemByName(value: String => BootstrapAccordionItem | Null): Self = StObject.set(x, "getItemByName", js.Any.fromFunction1(value))
    
    inline def setGetItemCount(value: CallbackTo[Double]): Self = StObject.set(x, "getItemCount", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setGetVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "getVisible", value.toJsFn)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNavBar(value: BootstrapAccordion): Self = StObject.set(x, "navBar", value.asInstanceOf[js.Any])
    
    inline def setNavBarNull: Self = StObject.set(x, "navBar", null)
    
    inline def setSetExpanded(value: Boolean => Callback): Self = StObject.set(x, "setExpanded", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetHeaderBadgeIconCssClass(value: String => Callback): Self = StObject.set(x, "setHeaderBadgeIconCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetHeaderBadgeText(value: String => Callback): Self = StObject.set(x, "setHeaderBadgeText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetText(value: String => Callback): Self = StObject.set(x, "setText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "setVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
