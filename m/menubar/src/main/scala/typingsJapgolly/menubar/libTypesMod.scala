package typingsJapgolly.menubar

import typingsJapgolly.electron.Electron.CrossProcessExports.BrowserWindowConstructorOptions
import typingsJapgolly.electron.Electron.CrossProcessExports.LoadURLOptions
import typingsJapgolly.electron.Electron.NativeImage_
import typingsJapgolly.electron.mod.Tray
import typingsJapgolly.menubar.menubarBooleans.`false`
import typingsJapgolly.menubar.menubarStrings.bottomCenter
import typingsJapgolly.menubar.menubarStrings.bottomLeft
import typingsJapgolly.menubar.menubarStrings.bottomRight
import typingsJapgolly.menubar.menubarStrings.center
import typingsJapgolly.menubar.menubarStrings.leftCenter
import typingsJapgolly.menubar.menubarStrings.rightCenter
import typingsJapgolly.menubar.menubarStrings.topCenter
import typingsJapgolly.menubar.menubarStrings.topLeft
import typingsJapgolly.menubar.menubarStrings.topRight
import typingsJapgolly.menubar.menubarStrings.trayBottomCenter
import typingsJapgolly.menubar.menubarStrings.trayBottomLeft
import typingsJapgolly.menubar.menubarStrings.trayBottomRight
import typingsJapgolly.menubar.menubarStrings.trayCenter
import typingsJapgolly.menubar.menubarStrings.trayLeft
import typingsJapgolly.menubar.menubarStrings.trayRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  trait Options extends StObject {
    
    /**
      * Listen on `app.on('activate')` to open menubar when app is activated.
      * @default `true`
      */
    var activateWithApp: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An Electron BrowserWindow instance, or an options object to be passed into
      * the BrowserWindow constructor.
      * @example
      * ```typescript
      * const options = { height: 640, width: 480 };
      *
      * const mb = new Menubar({
      *   browserWindow: options
      * });
      * ```
      */
    var browserWindow: BrowserWindowConstructorOptions
    
    /**
      * The app source directory.
      */
    var dir: String
    
    /**
      * The png icon to use for the menubar. A good size to start with is 20x20.
      * To support retina, supply a 2x sized image (e.g. 40x40) with @2x added to
      * the end of the name, so icon.png and icon@2x.png and Electron will
      * automatically use your @2x version on retina screens.
      */
    var icon: js.UndefOr[String | NativeImage_] = js.undefined
    
    /**
      * The URL to load the menubar's browserWindow with. The url can be a remote
      * address (e.g. `http://`) or a path to a local HTML file using the
      * `file://` protocol. If false, then menubar won't call `loadURL` on
      * start.
      * @default `file:// + options.dir + index.html`
      * @see https://electronjs.org/docs/api/browser-window#winloadurlurl-options
      */
    var index: String | `false`
    
    /**
      * The options passed when loading the index URL in the menubar's
      * browserWindow. Everything browserWindow.loadURL supports is supported;
      * this object is simply passed onto browserWindow.loadURL
      * @default `{}`
      * @see https://electronjs.org/docs/api/browser-window#winloadurlurl-options
      */
    var loadUrlOptions: js.UndefOr[LoadURLOptions] = js.undefined
    
    /**
      * Create BrowserWindow instance before it is used -- increasing resource
      * usage, but making the click on the menubar load faster.
      */
    var preloadWindow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configure the visibility of the application dock icon, macOS only. Calls
      * [`app.dock.hide`](https://electronjs.org/docs/api/app#appdockhide-macos).
      */
    var showDockIcon: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Makes the window available on all OS X workspaces. Calls
      * [`setVisibleOnAllWorkspaces`](https://electronjs.org/docs/api/browser-window#winsetvisibleonallworkspacesvisible-options).
      */
    var showOnAllWorkspaces: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show the window on 'right-click' event instead of regular 'click'.
      */
    var showOnRightClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Menubar tray icon tooltip text. Calls [`tray.setTooltip`](https://electronjs.org/docs/api/tray#traysettooltiptooltip).
      */
    var tooltip: String
    
    /**
      * An electron Tray instance. If provided, `options.icon` will be ignored.
      */
    var tray: js.UndefOr[Tray] = js.undefined
    
    /**
      * Sets the window position (x and y will still override this), check
      * electron-positioner docs for valid values.
      */
    var windowPosition: js.UndefOr[
        trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center
      ] = js.undefined
  }
  object Options {
    
    inline def apply(
      browserWindow: BrowserWindowConstructorOptions,
      dir: String,
      index: String | `false`,
      tooltip: String
    ): Options = {
      val __obj = js.Dynamic.literal(browserWindow = browserWindow.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setActivateWithApp(value: Boolean): Self = StObject.set(x, "activateWithApp", value.asInstanceOf[js.Any])
      
      inline def setActivateWithAppUndefined: Self = StObject.set(x, "activateWithApp", js.undefined)
      
      inline def setBrowserWindow(value: BrowserWindowConstructorOptions): Self = StObject.set(x, "browserWindow", value.asInstanceOf[js.Any])
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String | NativeImage_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIndex(value: String | `false`): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLoadUrlOptions(value: LoadURLOptions): Self = StObject.set(x, "loadUrlOptions", value.asInstanceOf[js.Any])
      
      inline def setLoadUrlOptionsUndefined: Self = StObject.set(x, "loadUrlOptions", js.undefined)
      
      inline def setPreloadWindow(value: Boolean): Self = StObject.set(x, "preloadWindow", value.asInstanceOf[js.Any])
      
      inline def setPreloadWindowUndefined: Self = StObject.set(x, "preloadWindow", js.undefined)
      
      inline def setShowDockIcon(value: Boolean): Self = StObject.set(x, "showDockIcon", value.asInstanceOf[js.Any])
      
      inline def setShowDockIconUndefined: Self = StObject.set(x, "showDockIcon", js.undefined)
      
      inline def setShowOnAllWorkspaces(value: Boolean): Self = StObject.set(x, "showOnAllWorkspaces", value.asInstanceOf[js.Any])
      
      inline def setShowOnAllWorkspacesUndefined: Self = StObject.set(x, "showOnAllWorkspaces", js.undefined)
      
      inline def setShowOnRightClick(value: Boolean): Self = StObject.set(x, "showOnRightClick", value.asInstanceOf[js.Any])
      
      inline def setShowOnRightClickUndefined: Self = StObject.set(x, "showOnRightClick", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTray(value: Tray): Self = StObject.set(x, "tray", value.asInstanceOf[js.Any])
      
      inline def setTrayUndefined: Self = StObject.set(x, "tray", js.undefined)
      
      inline def setWindowPosition(
        value: trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center
      ): Self = StObject.set(x, "windowPosition", value.asInstanceOf[js.Any])
      
      inline def setWindowPositionUndefined: Self = StObject.set(x, "windowPosition", js.undefined)
    }
  }
}
