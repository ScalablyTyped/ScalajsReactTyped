package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an individual item of the Rich Edit's context menu.
  */
@JSGlobal("ASPxClientRichEditPopupMenuItem")
@js.native
class ASPxClientRichEditPopupMenuItem () extends js.Object {
  /**
    * Gets or sets a value that specifies whether the current menu item starts a group.
    */
  var beginGroup: Boolean = js.native
  /**
    * Gets or sets a value that indicates whether the menu item is enabled, allowing the item to respond to end-user interactions.
    */
  var enabled: Boolean = js.native
  /**
    * Gets or sets the CSS class name defining the menu item's image.
    */
  var imageClassName: String = js.native
  /**
    * Gets or sets the URL of the menu item's image.
    */
  var imageUrl: String = js.native
  /**
    * Gets or sets the unique identifier name for the current menu item.
    */
  var name: String = js.native
  /**
    * Gets or sets a URL which defines the navigation location.
    */
  var navigateUrl: String = js.native
  /**
    * Gets the immediate parent menu item to which the current menu item belongs.
    */
  var parent: ASPxClientRichEditPopupMenuItem = js.native
  /**
    * Gets or sets the window or frame at which to target the contents of the URL associated with the current menu item.
    */
  var target: String = js.native
  /**
    * Gets or sets the text content of the current menu item.
    */
  var text: String = js.native
  /**
    * Gets or sets the current menu item's tooltip text.
    */
  var tooltip: String = js.native
  /**
    * Returns the menu item's sub-item with the specified index. An ASPxClientRichEditPopupMenuItem object representing the found sub-item.
    * @param index An integer value specifying the index of the sub-item within a collection of the current menu item's submenu items.
    */
  def GetItem(index: Double): ASPxClientRichEditPopupMenuItem = js.native
  /**
    * Returns the menu item's sub-item with the specified ASPxClientRichEditPopupMenuItem.name property value. An ASPxClientRichEditPopupMenuItem object representing the found sub-item.
    * @param name A string value specifying the ASPxClientRichEditPopupMenuItem.name property value of the sub-item to find.
    */
  def GetItemByName(name: String): ASPxClientRichEditPopupMenuItem = js.native
  /**
    * Returns the total number of the menu item's child items (submenu items).
    */
  def GetItemCount(): Double = js.native
  /**
    * Gets a collection that contains the submenu items of the current menu item.
    */
  def GetSubItems(): ASPxClientRichEditPopupMenuItemCollection = js.native
}

