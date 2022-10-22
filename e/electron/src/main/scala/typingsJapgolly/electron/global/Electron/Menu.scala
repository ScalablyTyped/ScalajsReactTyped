package typingsJapgolly.electron.global.Electron

import typingsJapgolly.electron.Electron.MenuItemConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.Menu")
@js.native
/**
  * Menu
  */
open class Menu ()
  extends StObject
     with typingsJapgolly.electron.Electron.Menu
object Menu {
  
  @JSGlobal("Electron.Menu")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Generally, the `template` is an array of `options` for constructing a MenuItem.
    * The usage can be referenced above.
    *
    * You can also attach other fields to the element of the `template` and they will
    * become properties of the constructed menu items.
    */
  /* static member */
  inline def buildFromTemplate(template: js.Array[MenuItemConstructorOptions | typingsJapgolly.electron.Electron.MenuItem]): typingsJapgolly.electron.Electron.Menu = ^.asInstanceOf[js.Dynamic].applyDynamic("buildFromTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.electron.Electron.Menu]
  
  /**
    * The application menu, if set, or `null`, if not set.
    *
    * **Note:** The returned `Menu` instance doesn't support dynamic addition or
    * removal of menu items. Instance properties can still be dynamically modified.
    */
  /* static member */
  inline def getApplicationMenu(): typingsJapgolly.electron.Electron.Menu | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicationMenu")().asInstanceOf[typingsJapgolly.electron.Electron.Menu | Null]
  
  /**
    * Sends the `action` to the first responder of application. This is used for
    * emulating default macOS menu behaviors. Usually you would use the `role`
    * property of a `MenuItem`.
    *
    * See the macOS Cocoa Event Handling Guide for more information on macOS' native
    * actions.
    *
    * @platform darwin
    */
  /* static member */
  inline def sendActionToFirstResponder(action: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendActionToFirstResponder")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets `menu` as the application menu on macOS. On Windows and Linux, the `menu`
    * will be set as each window's top menu.
    *
    * Also on Windows and Linux, you can use a `&` in the top-level item name to
    * indicate which letter should get a generated accelerator. For example, using
    * `&File` for the file menu would result in a generated `Alt-F` accelerator that
    * opens the associated menu. The indicated character in the button label then gets
    * an underline, and the `&` character is not displayed on the button label.
    *
    * In order to escape the `&` character in an item name, add a proceeding `&`. For
    * example, `&&File` would result in `&File` displayed on the button label.
    *
    * Passing `null` will suppress the default menu. On Windows and Linux, this has
    * the additional effect of removing the menu bar from the window.
    *
    * **Note:** The default menu will be created automatically if the app does not set
    * one. It contains standard items such as `File`, `Edit`, `View`, `Window` and
    * `Help`.
    */
  /* static member */
  inline def setApplicationMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setApplicationMenu")().asInstanceOf[Unit]
  inline def setApplicationMenu(menu: typingsJapgolly.electron.Electron.Menu): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setApplicationMenu")(menu.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
