package typingsJapgolly.menubar.typesMod

import typingsJapgolly.electron.Electron.BrowserWindowConstructorOptions
import typingsJapgolly.electron.Electron.LoadURLOptions
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
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
    * `file://` protocol. If false, then menubar won't call `loadUrl` on
    * start.
    * @default `file:// + options.dir + index.html`
    * @see https://electronjs.org/docs/api/browser-window#winloadurlurl-options
    */
  var index: String | `false`
  /**
    * The options passed when loading the index URL in the menubar's
    * browserWindow. Everything browserWindow.loadUrl supports is supported;
    * this object is simply passed onto browserWindow.loadUrl
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
  @scala.inline
  def apply(
    browserWindow: BrowserWindowConstructorOptions,
    dir: String,
    index: String | `false`,
    tooltip: String,
    icon: String | NativeImage_ = null,
    loadUrlOptions: LoadURLOptions = null,
    preloadWindow: js.UndefOr[Boolean] = js.undefined,
    showDockIcon: js.UndefOr[Boolean] = js.undefined,
    showOnAllWorkspaces: js.UndefOr[Boolean] = js.undefined,
    showOnRightClick: js.UndefOr[Boolean] = js.undefined,
    tray: Tray = null,
    windowPosition: trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center = null
  ): Options = {
    val __obj = js.Dynamic.literal(browserWindow = browserWindow.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (loadUrlOptions != null) __obj.updateDynamic("loadUrlOptions")(loadUrlOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(preloadWindow)) __obj.updateDynamic("preloadWindow")(preloadWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(showDockIcon)) __obj.updateDynamic("showDockIcon")(showDockIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnAllWorkspaces)) __obj.updateDynamic("showOnAllWorkspaces")(showOnAllWorkspaces.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnRightClick)) __obj.updateDynamic("showOnRightClick")(showOnRightClick.asInstanceOf[js.Any])
    if (tray != null) __obj.updateDynamic("tray")(tray.asInstanceOf[js.Any])
    if (windowPosition != null) __obj.updateDynamic("windowPosition")(windowPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

