package typingsJapgolly.electron.Electron

import typingsJapgolly.electron.electronStrings.`menu-will-close`
import typingsJapgolly.electron.electronStrings.`menu-will-show`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.Menu")
@js.native
class Menu () extends js.Object {
  var items: js.Array[MenuItem] = js.native
  @JSName("addListener")
  def addListener_menuwillclose(event: `menu-will-close`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_menuwillshow(event: `menu-will-show`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Appends the menuItem to the menu.
    */
  def append(menuItem: MenuItem): Unit = js.native
  /**
    * Closes the context menu in the browserWindow.
    */
  def closePopup(): Unit = js.native
  def closePopup(browserWindow: BrowserWindow): Unit = js.native
  def getMenuItemById(id: String): MenuItem = js.native
  /**
    * Inserts the menuItem to the pos position of the menu.
    */
  def insert(pos: Double, menuItem: MenuItem): Unit = js.native
  // Docs: http://electronjs.org/docs/api/menu
  /**
    * Emitted when a popup is closed either manually or with menu.closePopup().
    */
  @JSName("on")
  def on_menuwillclose(event: `menu-will-close`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when menu.popup() is called.
    */
  @JSName("on")
  def on_menuwillshow(event: `menu-will-show`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  def once_menuwillclose(event: `menu-will-close`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  def once_menuwillshow(event: `menu-will-show`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Pops up this menu as a context menu in the BrowserWindow.
    */
  def popup(): Unit = js.native
  def popup(options: PopupOptions): Unit = js.native
  @JSName("removeListener")
  def removeListener_menuwillclose(event: `menu-will-close`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_menuwillshow(event: `menu-will-show`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
}

/* static members */
@JSGlobal("Electron.Menu")
@js.native
object Menu extends js.Object {
  /**
    * Generally, the template is an array of options for constructing a MenuItem. The
    * usage can be referenced above. You can also attach other fields to the element
    * of the template and they will become properties of the constructed menu items.
    */
  def buildFromTemplate(template: js.Array[MenuItemConstructorOptions | MenuItem]): Menu = js.native
  /**
    * Note: The returned Menu instance doesn't support dynamic addition or removal of
    * menu items. Instance properties can still be dynamically modified.
    */
  def getApplicationMenu(): Menu | Null = js.native
  /**
    * Sends the action to the first responder of application. This is used for
    * emulating default macOS menu behaviors. Usually you would use the role property
    * of a MenuItem. See the macOS Cocoa Event Handling Guide for more information on
    * macOS' native actions.
    */
  def sendActionToFirstResponder(action: String): Unit = js.native
  def setApplicationMenu(): Unit = js.native
  /**
    * Sets menu as the application menu on macOS. On Windows and Linux, the menu will
    * be set as each window's top menu. Also on Windows and Linux, you can use a & in
    * the top-level item name to indicate which letter should get a generated
    * accelerator. For example, using &File for the file menu would result in a
    * generated Alt-F accelerator that opens the associated menu. The indicated
    * character in the button label gets an underline. The & character is not
    * displayed on the button label. Passing null will suppress the default menu. On
    * Windows and Linux, this has the additional effect of removing the menu bar from
    * the window. Note: The default menu will be created automatically if the app does
    * not set one. It contains standard items such as File, Edit, View, Window and
    * Help.
    */
  def setApplicationMenu(menu: Menu): Unit = js.native
}

