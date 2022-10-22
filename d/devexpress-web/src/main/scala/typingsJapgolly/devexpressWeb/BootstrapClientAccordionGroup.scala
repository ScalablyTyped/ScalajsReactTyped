package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the Accordion's BootstrapAccordionGroup object.
  */
trait BootstrapClientAccordionGroup
  extends StObject
     with ASPxClientNavBarGroup {
  
  /**
    * Gets the CSS class of the icon displayed within an accordion group header badge.
    */
  def GetHeaderBadgeIconCssClass(): String
  
  /**
    * Gets the text displayed within an accordion group header badge.
    */
  def GetHeaderBadgeText(): String
  
  /**
    * Sets the CSS class of the icon displayed within an accordion group header badge.
    * @param cssClass A String containing the name of a CSS class.
    */
  def SetHeaderBadgeIconCssClass(cssClass: String): Unit
  
  /**
    * Sets the text displayed within an accordion group header badge.
    * @param text A String specifying the badge text.
    */
  def SetHeaderBadgeText(text: String): Unit
  
  /**
    * Gets the BootstrapClientAccordion object to which the current group belongs.
    */
  @JSName("navBar")
  var navBar_BootstrapClientAccordionGroup: BootstrapClientAccordion
}
object BootstrapClientAccordionGroup {
  
  inline def apply(
    GetEnabled: CallbackTo[Boolean],
    GetExpanded: CallbackTo[Boolean],
    GetHeaderBadgeIconCssClass: CallbackTo[String],
    GetHeaderBadgeText: CallbackTo[String],
    GetItem: Double => ASPxClientNavBarItem,
    GetItemByName: String => ASPxClientNavBarItem,
    GetItemCount: CallbackTo[Double],
    GetText: CallbackTo[String],
    GetVisible: CallbackTo[Boolean],
    SetExpanded: Boolean => Callback,
    SetHeaderBadgeIconCssClass: String => Callback,
    SetHeaderBadgeText: String => Callback,
    SetText: String => Callback,
    SetVisible: Boolean => Callback,
    index: Double,
    name: String,
    navBar: BootstrapClientAccordion
  ): BootstrapClientAccordionGroup = {
    val __obj = js.Dynamic.literal(GetEnabled = GetEnabled.toJsFn, GetExpanded = GetExpanded.toJsFn, GetHeaderBadgeIconCssClass = GetHeaderBadgeIconCssClass.toJsFn, GetHeaderBadgeText = GetHeaderBadgeText.toJsFn, GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = GetItemCount.toJsFn, GetText = GetText.toJsFn, GetVisible = GetVisible.toJsFn, SetExpanded = js.Any.fromFunction1((t0: Boolean) => SetExpanded(t0).runNow()), SetHeaderBadgeIconCssClass = js.Any.fromFunction1((t0: String) => SetHeaderBadgeIconCssClass(t0).runNow()), SetHeaderBadgeText = js.Any.fromFunction1((t0: String) => SetHeaderBadgeText(t0).runNow()), SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], navBar = navBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientAccordionGroup]
  }
  
  extension [Self <: BootstrapClientAccordionGroup](x: Self) {
    
    inline def setGetHeaderBadgeIconCssClass(value: CallbackTo[String]): Self = StObject.set(x, "GetHeaderBadgeIconCssClass", value.toJsFn)
    
    inline def setGetHeaderBadgeText(value: CallbackTo[String]): Self = StObject.set(x, "GetHeaderBadgeText", value.toJsFn)
    
    inline def setNavBar(value: BootstrapClientAccordion): Self = StObject.set(x, "navBar", value.asInstanceOf[js.Any])
    
    inline def setSetHeaderBadgeIconCssClass(value: String => Callback): Self = StObject.set(x, "SetHeaderBadgeIconCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetHeaderBadgeText(value: String => Callback): Self = StObject.set(x, "SetHeaderBadgeText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
