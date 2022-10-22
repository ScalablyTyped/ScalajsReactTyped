package typingsJapgolly.devexpressWeb.global

import typingsJapgolly.devexpressWeb.ASPxClientEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientMenuItemClickEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientMenuItemEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientMenuItemMouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapMenu control.
  */
@JSGlobal("BootstrapClientMenu")
@js.native
open class BootstrapClientMenu ()
  extends StObject
     with typingsJapgolly.devexpressWeb.BootstrapClientMenu {
  
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  
  /**
    * Occurs on the client side when a submenu closes.
    */
  /* CompleteClass */
  var CloseUp: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientMenuItemEventHandler[typingsJapgolly.devexpressWeb.ASPxClientMenuBase]] = js.native
  
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  
  /**
    * Returns the menu's root menu item specified by its index. An ASPxClientMenuItem object representing the root item located at the specified index within the menu's ASPxMenuBase.Items collection.
    * @param index An integer value specifying the zero-based index of the root menu item to be retrieved.
    */
  /* CompleteClass */
  override def GetItem(index: Double): typingsJapgolly.devexpressWeb.ASPxClientMenuItem = js.native
  
  /**
    * Returns a menu item specified by its name. An ASPxClientMenuItem object that represents the menu item with the specified name.
    * @param name A string value specifying the name of the menu item.
    */
  /* CompleteClass */
  override def GetItemByName(name: String): typingsJapgolly.devexpressWeb.ASPxClientMenuItem = js.native
  
  /**
    * Returns the number of menu items at the root menu level.
    */
  /* CompleteClass */
  override def GetItemCount(): Double = js.native
  
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): Any = js.native
  
  /**
    * Gets a value specifying the menu orientation.
    */
  /* CompleteClass */
  override def GetOrientation(): String = js.native
  
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): Any = js.native
  
  /**
    * Returns a root menu item.
    */
  /* CompleteClass */
  override def GetRootItem(): typingsJapgolly.devexpressWeb.ASPxClientMenuItem = js.native
  
  /**
    * Returns the selected item within the menu control.
    */
  /* CompleteClass */
  override def GetSelectedItem(): typingsJapgolly.devexpressWeb.ASPxClientMenuItem = js.native
  
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  
  /**
    * Returns the control's width.
    */
  /* CompleteClass */
  override def GetWidth(): Double = js.native
  
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  /* CompleteClass */
  override def InCallback(): Boolean = js.native
  
  /**
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  var Init: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsJapgolly.devexpressWeb.ASPxClientControlBase]] = js.native
  
  /**
    * Fires after a menu item has been clicked.
    */
  /* CompleteClass */
  var ItemClick: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientMenuItemClickEventHandler[typingsJapgolly.devexpressWeb.ASPxClientMenuBase]
  ] = js.native
  
  /**
    * Occurs on the client side when the mouse cursor moves outside a menu item.
    */
  /* CompleteClass */
  var ItemMouseOut: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientMenuItemMouseEventHandler[typingsJapgolly.devexpressWeb.ASPxClientMenuBase]
  ] = js.native
  
  /**
    * Occurs on the client side when the mouse cursor is moved into a menu item.
    */
  /* CompleteClass */
  var ItemMouseOver: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientMenuItemMouseEventHandler[typingsJapgolly.devexpressWeb.ASPxClientMenuBase]
  ] = js.native
  
  /**
    * Occurs on the client side when a submenu pops up.
    */
  /* CompleteClass */
  var PopUp: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientMenuItemEventHandler[typingsJapgolly.devexpressWeb.ASPxClientMenuBase]] = js.native
  
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  
  /**
    * Sets the menu orientation.
    * @param orientation 'Vertical' to orient the menu vertically; 'Horizontal' to orient the menu horizontally.
    */
  /* CompleteClass */
  override def SetOrientation(orientation: String): Unit = js.native
  
  /**
    * Selects the specified menu item within a menu control on the client side.
    * @param item An ASPxClientMenuItem object specifying the menu item to select.
    */
  /* CompleteClass */
  override def SetSelectedItem(item: typingsJapgolly.devexpressWeb.ASPxClientMenuItem): Unit = js.native
  /**
    * Selects the specified menu item within the Menu control on the client side.
    * @param item A BootstrapClientMenuItem object specifying the menu item to select.
    */
  /* CompleteClass */
  override def SetSelectedItem(item: typingsJapgolly.devexpressWeb.BootstrapClientMenuItem): Unit = js.native
  
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  /* CompleteClass */
  override def SetVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies the control's width in pixels.
    * @param width An integer value that specifies the control's width, in pixels.
    */
  /* CompleteClass */
  override def SetWidth(width: Double): Unit = js.native
  
  /**
    * Expands or collapses the side menu.
    */
  /* CompleteClass */
  override def ToggleSideMenu(): Unit = js.native
  
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  var name: String = js.native
}
