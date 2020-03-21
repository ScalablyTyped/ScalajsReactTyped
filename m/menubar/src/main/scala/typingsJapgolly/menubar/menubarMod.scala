package typingsJapgolly.menubar

import typingsJapgolly.electron.Electron.App_
import typingsJapgolly.electron.Electron.BrowserWindowConstructorOptions
import typingsJapgolly.electron.Electron.LoadURLOptions
import typingsJapgolly.electron.Electron.NativeImage_
import typingsJapgolly.electron.Electron.Rectangle
import typingsJapgolly.electron.mod.BrowserWindow
import typingsJapgolly.electron.mod.Tray
import typingsJapgolly.menubar.menubarBooleans.`false`
import typingsJapgolly.menubar.menubarStrings.bottomCenter
import typingsJapgolly.menubar.menubarStrings.bottomLeft
import typingsJapgolly.menubar.menubarStrings.bottomRight
import typingsJapgolly.menubar.menubarStrings.browserWindow
import typingsJapgolly.menubar.menubarStrings.center
import typingsJapgolly.menubar.menubarStrings.dir
import typingsJapgolly.menubar.menubarStrings.icon
import typingsJapgolly.menubar.menubarStrings.index
import typingsJapgolly.menubar.menubarStrings.leftCenter
import typingsJapgolly.menubar.menubarStrings.loadUrlOptions
import typingsJapgolly.menubar.menubarStrings.preloadWindow
import typingsJapgolly.menubar.menubarStrings.rightCenter
import typingsJapgolly.menubar.menubarStrings.showDockIcon
import typingsJapgolly.menubar.menubarStrings.showOnAllWorkspaces
import typingsJapgolly.menubar.menubarStrings.showOnRightClick
import typingsJapgolly.menubar.menubarStrings.tooltip
import typingsJapgolly.menubar.menubarStrings.topCenter
import typingsJapgolly.menubar.menubarStrings.topLeft
import typingsJapgolly.menubar.menubarStrings.topRight
import typingsJapgolly.menubar.menubarStrings.trayBottomCenter
import typingsJapgolly.menubar.menubarStrings.trayBottomLeft
import typingsJapgolly.menubar.menubarStrings.trayBottomRight
import typingsJapgolly.menubar.menubarStrings.trayCenter
import typingsJapgolly.menubar.menubarStrings.trayLeft
import typingsJapgolly.menubar.menubarStrings.trayRight
import typingsJapgolly.menubar.menubarStrings.windowPosition
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("menubar/lib/Menubar", JSImport.Namespace)
@js.native
object menubarMod extends js.Object {
  @js.native
  class Menubar protected () extends EventEmitter {
    def this(app: App_) = this()
    def this(app: App_, options: PartialOptions) = this()
    var _app: js.Any = js.native
    var _browserWindow: js.UndefOr[js.Any] = js.native
    var _cachedBounds: js.UndefOr[js.Any] = js.native
    var _options: js.Any = js.native
    var _positioner: js.Any = js.native
    var _tray: js.UndefOr[js.Any] = js.native
    /**
      * The Electron [App](https://electronjs.org/docs/api/app)
      * instance.
      */
    val app: App_ = js.native
    var appReady: js.Any = js.native
    /**
      * Callback on tray icon click or double-click.
      *
      * @param e
      * @param bounds
      */
    var clicked: js.Any = js.native
    var createWindow: js.Any = js.native
    /**
      * The [electron-positioner](https://github.com/jenslind/electron-positioner)
      * instance.
      */
    val positioner: js.Any = js.native
    /**
      * The Electron [Tray](https://electronjs.org/docs/api/tray) instance.
      */
    val tray: Tray = js.native
    /**
      * The Electron [BrowserWindow](https://electronjs.org/docs/api/browser-window)
      * instance, if it's present.
      */
    val window: js.UndefOr[BrowserWindow] = js.native
    var windowClear: js.Any = js.native
    /**
      * Retrieve a menubar option.
      *
      * @param key - The option key to retrieve, see {@link Options}.
      */
    @JSName("getOption")
    def getOption_browserWindow(key: browserWindow): BrowserWindowConstructorOptions = js.native
    @JSName("getOption")
    def getOption_dir(key: dir): String = js.native
    @JSName("getOption")
    def getOption_icon(key: icon): String | NativeImage_ = js.native
    @JSName("getOption")
    def getOption_index(key: index): String | `false` = js.native
    @JSName("getOption")
    def getOption_loadUrlOptions(key: loadUrlOptions): LoadURLOptions = js.native
    @JSName("getOption")
    def getOption_preloadWindow(key: preloadWindow): Boolean = js.native
    @JSName("getOption")
    def getOption_showDockIcon(key: showDockIcon): Boolean = js.native
    @JSName("getOption")
    def getOption_showOnAllWorkspaces(key: showOnAllWorkspaces): Boolean = js.native
    @JSName("getOption")
    def getOption_showOnRightClick(key: showOnRightClick): Boolean = js.native
    @JSName("getOption")
    def getOption_tooltip(key: tooltip): String = js.native
    @JSName("getOption")
    def getOption_tray(key: typingsJapgolly.menubar.menubarStrings.tray): Tray = js.native
    @JSName("getOption")
    def getOption_windowPosition(key: windowPosition): trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center = js.native
    /**
      * Hide the menubar window.
      */
    def hideWindow(): Unit = js.native
    def setOption(key: index, value: `false`): Unit = js.native
    def setOption(
      key: windowPosition,
      value: trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center
    ): Unit = js.native
    /**
      * Change an option after menubar is created.
      *
      * @param key - The option key to modify, see {@link Options}.
      * @param value - The value to set.
      */
    @JSName("setOption")
    def setOption_browserWindow(key: browserWindow, value: BrowserWindowConstructorOptions): Unit = js.native
    @JSName("setOption")
    def setOption_dir(key: dir, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_icon(key: icon, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_icon(key: icon, value: NativeImage_): Unit = js.native
    @JSName("setOption")
    def setOption_index(key: index, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_loadUrlOptions(key: loadUrlOptions, value: LoadURLOptions): Unit = js.native
    @JSName("setOption")
    def setOption_preloadWindow(key: preloadWindow, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_showDockIcon(key: showDockIcon, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_showOnAllWorkspaces(key: showOnAllWorkspaces, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_showOnRightClick(key: showOnRightClick, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_tooltip(key: tooltip, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_tray(key: typingsJapgolly.menubar.menubarStrings.tray, value: Tray): Unit = js.native
    /**
      * Show the menubar window.
      *
      * @param trayPos - The bounds to show the window in.
      */
    def showWindow(): js.Promise[Unit] = js.native
    def showWindow(trayPos: Rectangle): js.Promise[Unit] = js.native
  }
  
}

