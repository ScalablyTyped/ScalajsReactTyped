package typingsJapgolly.menubar

import typingsJapgolly.electron.Electron.App
import typingsJapgolly.electron.Electron.CrossProcessExports.BrowserWindowConstructorOptions
import typingsJapgolly.electron.Electron.CrossProcessExports.LoadURLOptions
import typingsJapgolly.electron.Electron.NativeImage_
import typingsJapgolly.electron.Electron.Rectangle
import typingsJapgolly.electron.mod.BrowserWindow
import typingsJapgolly.electron.mod.Tray
import typingsJapgolly.electronPositioner.mod.^
import typingsJapgolly.menubar.anon.PartialOptions
import typingsJapgolly.menubar.menubarBooleans.`false`
import typingsJapgolly.menubar.menubarStrings.activateWithApp
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
import typingsJapgolly.menubar.menubarStrings.tray
import typingsJapgolly.menubar.menubarStrings.trayBottomCenter
import typingsJapgolly.menubar.menubarStrings.trayBottomLeft
import typingsJapgolly.menubar.menubarStrings.trayBottomRight
import typingsJapgolly.menubar.menubarStrings.trayCenter
import typingsJapgolly.menubar.menubarStrings.trayLeft
import typingsJapgolly.menubar.menubarStrings.trayRight
import typingsJapgolly.menubar.menubarStrings.windowPosition
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMenubarMod {
  
  @JSImport("menubar/lib/Menubar", "Menubar")
  @js.native
  open class Menubar protected () extends EventEmitter {
    def this(app: App) = this()
    def this(app: App, options: PartialOptions) = this()
    
    /* private */ var _app: Any = js.native
    
    /* private */ var _blurTimeout: Any = js.native
    
    /* private */ var _browserWindow: Any = js.native
    
    /* private */ var _cachedBounds: Any = js.native
    
    /* private */ var _isVisible: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _positioner: Any = js.native
    
    /* private */ var _tray: Any = js.native
    
    /**
      * The Electron [App](https://electronjs.org/docs/api/app)
      * instance.
      */
    def app: App = js.native
    
    /* private */ var appReady: Any = js.native
    
    /**
      * Callback on tray icon click or double-click.
      *
      * @param e
      * @param bounds
      */
    /* private */ var clicked: Any = js.native
    
    /* private */ var createWindow: Any = js.native
    
    /**
      * Retrieve a menubar option.
      *
      * @param key - The option key to retrieve, see {@link Options}.
      */
    @JSName("getOption")
    def getOption_activateWithApp(key: activateWithApp): js.UndefOr[Boolean] = js.native
    @JSName("getOption")
    def getOption_browserWindow(key: browserWindow): BrowserWindowConstructorOptions = js.native
    @JSName("getOption")
    def getOption_dir(key: dir): String = js.native
    @JSName("getOption")
    def getOption_icon(key: icon): js.UndefOr[String | NativeImage_] = js.native
    @JSName("getOption")
    def getOption_index(key: index): String | `false` = js.native
    @JSName("getOption")
    def getOption_loadUrlOptions(key: loadUrlOptions): js.UndefOr[LoadURLOptions] = js.native
    @JSName("getOption")
    def getOption_preloadWindow(key: preloadWindow): js.UndefOr[Boolean] = js.native
    @JSName("getOption")
    def getOption_showDockIcon(key: showDockIcon): js.UndefOr[Boolean] = js.native
    @JSName("getOption")
    def getOption_showOnAllWorkspaces(key: showOnAllWorkspaces): js.UndefOr[Boolean] = js.native
    @JSName("getOption")
    def getOption_showOnRightClick(key: showOnRightClick): js.UndefOr[Boolean] = js.native
    @JSName("getOption")
    def getOption_tooltip(key: tooltip): String = js.native
    @JSName("getOption")
    def getOption_tray(key: tray): js.UndefOr[Tray] = js.native
    @JSName("getOption")
    def getOption_windowPosition(key: windowPosition): js.UndefOr[
        trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center
      ] = js.native
    
    /**
      * Hide the menubar window.
      */
    def hideWindow(): Unit = js.native
    
    /**
      * The [electron-positioner](https://github.com/jenslind/electron-positioner)
      * instance.
      */
    def positioner: ^ = js.native
    
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
    def setOption_activateWithApp(key: activateWithApp): Unit = js.native
    @JSName("setOption")
    def setOption_activateWithApp(key: activateWithApp, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_browserWindow(key: browserWindow, value: BrowserWindowConstructorOptions): Unit = js.native
    @JSName("setOption")
    def setOption_dir(key: dir, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_icon(key: icon): Unit = js.native
    @JSName("setOption")
    def setOption_icon(key: icon, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_icon(key: icon, value: NativeImage_): Unit = js.native
    @JSName("setOption")
    def setOption_index(key: index, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_loadUrlOptions(key: loadUrlOptions): Unit = js.native
    @JSName("setOption")
    def setOption_loadUrlOptions(key: loadUrlOptions, value: LoadURLOptions): Unit = js.native
    @JSName("setOption")
    def setOption_preloadWindow(key: preloadWindow): Unit = js.native
    @JSName("setOption")
    def setOption_preloadWindow(key: preloadWindow, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_showDockIcon(key: showDockIcon): Unit = js.native
    @JSName("setOption")
    def setOption_showDockIcon(key: showDockIcon, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_showOnAllWorkspaces(key: showOnAllWorkspaces): Unit = js.native
    @JSName("setOption")
    def setOption_showOnAllWorkspaces(key: showOnAllWorkspaces, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_showOnRightClick(key: showOnRightClick): Unit = js.native
    @JSName("setOption")
    def setOption_showOnRightClick(key: showOnRightClick, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_tooltip(key: tooltip, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_tray(key: tray): Unit = js.native
    @JSName("setOption")
    def setOption_tray(key: tray, value: Tray): Unit = js.native
    @JSName("setOption")
    def setOption_windowPosition(key: windowPosition): Unit = js.native
    
    /**
      * Show the menubar window.
      *
      * @param trayPos - The bounds to show the window in.
      */
    def showWindow(): js.Promise[Unit] = js.native
    def showWindow(trayPos: Rectangle): js.Promise[Unit] = js.native
    
    /**
      * The Electron [Tray](https://electronjs.org/docs/api/tray) instance.
      */
    def tray: Tray = js.native
    
    /**
      * The Electron [BrowserWindow](https://electronjs.org/docs/api/browser-window)
      * instance, if it's present.
      */
    def window: js.UndefOr[BrowserWindow] = js.native
    
    /* private */ var windowClear: Any = js.native
  }
}
