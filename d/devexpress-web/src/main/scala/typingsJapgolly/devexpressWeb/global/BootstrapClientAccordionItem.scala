package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the Accordion's BootstrapAccordionItem object.
  */
@JSGlobal("BootstrapClientAccordionItem")
@js.native
open class BootstrapClientAccordionItem ()
  extends StObject
     with typingsJapgolly.devexpressWeb.BootstrapClientAccordionItem {
  
  /**
    * Gets the CSS class of the icon displayed within the accordion item badge.
    */
  /* CompleteClass */
  override def GetBadgeIconCssClass(): String = js.native
  
  /**
    * Gets the text displayed within the accordion item badge.
    */
  /* CompleteClass */
  override def GetBadgeText(): String = js.native
  
  /**
    * Returns a value indicating whether an item is enabled.
    */
  /* CompleteClass */
  override def GetEnabled(): Boolean = js.native
  
  /**
    * Gets the CSS class of the icon displayed by the Accordion item.
    */
  /* CompleteClass */
  override def GetIconCssClass(): String = js.native
  
  /**
    * Returns the URL which points to the image displayed within the item.
    */
  /* CompleteClass */
  override def GetImageUrl(): String = js.native
  
  /**
    * Gets an URL which defines the item's navigation location.
    */
  /* CompleteClass */
  override def GetNavigateUrl(): String = js.native
  
  /**
    * Returns text displayed within the item.
    */
  /* CompleteClass */
  override def GetText(): String = js.native
  
  /**
    * Returns a value specifying whether an item is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  
  /**
    * Sets the CSS class of the icon displayed within the accordion item badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  /* CompleteClass */
  override def SetBadgeIconCssClass(cssClass: String): Unit = js.native
  
  /**
    * Sets the text displayed within the accordion item badge.
    * @param text A String specifying the badge text.
    */
  /* CompleteClass */
  override def SetBadgeText(text: String): Unit = js.native
  
  /**
    * Specifies whether the item is enabled.
    * @param value true if the item is enabled; otherwise, false.
    */
  /* CompleteClass */
  override def SetEnabled(value: Boolean): Unit = js.native
  
  /**
    * Sets the CSS class of the icon displayed by the Accordion item.
    * @param cssClass A string containing the name of a CSS class.
    */
  /* CompleteClass */
  override def SetIconCssClass(cssClass: String): Unit = js.native
  
  /**
    * Specifies the URL which points to the image displayed within the item.
    * @param value A string value that specifies the URL to the image displayed within the item.
    */
  /* CompleteClass */
  override def SetImageUrl(value: String): Unit = js.native
  
  /**
    * Specifies a URL which defines the item's navigation location.
    * @param value A string value which represents the URL to where the client web browser will navigate when the item is clicked.
    */
  /* CompleteClass */
  override def SetNavigateUrl(value: String): Unit = js.native
  
  /**
    * Specifies the text displayed within the item.
    * @param value A string value that represents the text displayed within the item.
    */
  /* CompleteClass */
  override def SetText(value: String): Unit = js.native
  
  /**
    * Specifies whether the item is visible.
    * @param value true is the item is visible; otherwise, false.
    */
  /* CompleteClass */
  override def SetVisible(value: Boolean): Unit = js.native
  
  /**
    * Gets the group to which the current item belongs.
    */
  /* CompleteClass */
  var group: typingsJapgolly.devexpressWeb.ASPxClientNavBarGroup = js.native
  /**
    * Gets the group to which the current item belongs.
    */
  /* CompleteClass */
  @JSName("group")
  var group_BootstrapClientAccordionItem: typingsJapgolly.devexpressWeb.BootstrapClientAccordionGroup = js.native
  
  /**
    * Gets the item's index within a collection of a group's items.
    */
  /* CompleteClass */
  var index: Double = js.native
  
  /**
    * Gets the name that uniquely identifies the item.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Gets the navbar to which the current item belongs.
    */
  /* CompleteClass */
  var navBar: typingsJapgolly.devexpressWeb.ASPxClientNavBar = js.native
  /**
    * Gets the BootstrapClientAccordion object to which the current item belongs.
    */
  /* CompleteClass */
  @JSName("navBar")
  var navBar_BootstrapClientAccordionItem: typingsJapgolly.devexpressWeb.BootstrapClientAccordion = js.native
}
