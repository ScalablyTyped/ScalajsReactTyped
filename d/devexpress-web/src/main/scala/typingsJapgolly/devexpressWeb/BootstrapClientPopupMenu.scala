package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the BootstrapPopupMenu control.
  */
@JSGlobal("BootstrapClientPopupMenu")
@js.native
class BootstrapClientPopupMenu () extends ASPxClientPopupMenu {
  /**
    * Sets the CSS selector of a web control or HTML element with which the current popup menu is associated.
    * @param selector A string value specifying the CSS selector of the web control or HTML element with which the popup menu is associated.
    */
  def SetPopupElementCssSelector(selector: String): Unit = js.native
  /**
    * Selects the specified menu item within a the Popup Menu control on the client side.
    * @param item A BootstrapClientMenuItem object specifying the menu item to select.
    */
  def SetSelectedItem(item: BootstrapClientMenuItem): Unit = js.native
}

