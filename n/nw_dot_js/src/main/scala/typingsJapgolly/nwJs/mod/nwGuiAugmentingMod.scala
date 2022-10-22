package typingsJapgolly.nwJs.mod

import typingsJapgolly.nwJs.mod.global.NWJSHelpers.MenuItemOption
import typingsJapgolly.nwJs.mod.global.NWJSHelpers.MenuOption
import typingsJapgolly.nwJs.mod.global.NWJSHelpers.ShortcutOption
import typingsJapgolly.nwJs.mod.global.NWJSHelpers.TrayOption
import typingsJapgolly.nwJs.mod.global.nw.App
import typingsJapgolly.nwJs.mod.global.nw.Clipboard
import typingsJapgolly.nwJs.mod.global.nw.Screen
import typingsJapgolly.nwJs.mod.global.nw.Shell
import typingsJapgolly.nwJs.mod.global.nw.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object nwGuiAugmentingMod {
  
  @JSImport("nw.gui", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nw.gui", "App")
  @js.native
  def App: typingsJapgolly.nwJs.mod.global.nw.App = js.native
  inline def App_=(x: App): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("App")(x.asInstanceOf[js.Any])
  
  @JSImport("nw.gui", "Clipboard")
  @js.native
  def Clipboard: typingsJapgolly.nwJs.mod.global.nw.Clipboard = js.native
  inline def Clipboard_=(x: Clipboard): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Clipboard")(x.asInstanceOf[js.Any])
  
  @JSImport("nw.gui", "Menu")
  @js.native
  /**
    * Create a Menu object.
    *
    * @param option {Object} (Optional) Option to customize returned menu object.
    */
  open class Menu ()
    extends typingsJapgolly.nwJs.mod.global.nw.Menu {
    def this(option: MenuOption) = this()
  }
  
  @JSImport("nw.gui", "MenuItem")
  @js.native
  open class MenuItem protected ()
    extends typingsJapgolly.nwJs.mod.global.nw.MenuItem {
    /**
      * Create a new MenuItem.
      *
      * @param option {Object} Customize how MenuItem render and behave.
      */
    def this(option: MenuItemOption) = this()
  }
  
  @JSImport("nw.gui", "Screen")
  @js.native
  def Screen: typingsJapgolly.nwJs.mod.global.nw.Screen = js.native
  inline def Screen_=(x: Screen): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Screen")(x.asInstanceOf[js.Any])
  
  @JSImport("nw.gui", "Shell")
  @js.native
  def Shell: typingsJapgolly.nwJs.mod.global.nw.Shell = js.native
  inline def Shell_=(x: Shell): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Shell")(x.asInstanceOf[js.Any])
  
  @JSImport("nw.gui", "Shortcut")
  @js.native
  open class Shortcut protected ()
    extends typingsJapgolly.nwJs.mod.global.nw.Shortcut {
    /**
      * Create new Shortcut.
      *
      * @param option {Object} Shortcut option is an object contains initial settings for the Shortcut.
      */
    def this(option: ShortcutOption) = this()
  }
  
  @JSImport("nw.gui", "Tray")
  @js.native
  open class Tray protected ()
    extends typingsJapgolly.nwJs.mod.global.nw.Tray {
    /**
      * Create a new Tray.
      * @param option {Object} Contains initial settings for the Tray.
      */
    def this(option: TrayOption) = this()
  }
  
  @JSImport("nw.gui", "Window")
  @js.native
  def Window: typingsJapgolly.nwJs.mod.global.nw.Window = js.native
  inline def Window_=(x: Window): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Window")(x.asInstanceOf[js.Any])
}
