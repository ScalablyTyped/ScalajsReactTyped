package typingsJapgolly.menubar

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

/* Inlined std.Partial<menubar.menubar/lib/types.Options> */
trait PartialOptions extends js.Object {
  var browserWindow: js.UndefOr[BrowserWindowConstructorOptions] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String | NativeImage_] = js.undefined
  var index: js.UndefOr[String | `false`] = js.undefined
  var loadUrlOptions: js.UndefOr[LoadURLOptions] = js.undefined
  var preloadWindow: js.UndefOr[Boolean] = js.undefined
  var showDockIcon: js.UndefOr[Boolean] = js.undefined
  var showOnAllWorkspaces: js.UndefOr[Boolean] = js.undefined
  var showOnRightClick: js.UndefOr[Boolean] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
  var tray: js.UndefOr[Tray] = js.undefined
  var windowPosition: js.UndefOr[
    trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center
  ] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    browserWindow: BrowserWindowConstructorOptions = null,
    dir: String = null,
    icon: String | NativeImage_ = null,
    index: String | `false` = null,
    loadUrlOptions: LoadURLOptions = null,
    preloadWindow: js.UndefOr[Boolean] = js.undefined,
    showDockIcon: js.UndefOr[Boolean] = js.undefined,
    showOnAllWorkspaces: js.UndefOr[Boolean] = js.undefined,
    showOnRightClick: js.UndefOr[Boolean] = js.undefined,
    tooltip: String = null,
    tray: Tray = null,
    windowPosition: trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (browserWindow != null) __obj.updateDynamic("browserWindow")(browserWindow.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (loadUrlOptions != null) __obj.updateDynamic("loadUrlOptions")(loadUrlOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(preloadWindow)) __obj.updateDynamic("preloadWindow")(preloadWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(showDockIcon)) __obj.updateDynamic("showDockIcon")(showDockIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnAllWorkspaces)) __obj.updateDynamic("showOnAllWorkspaces")(showOnAllWorkspaces.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnRightClick)) __obj.updateDynamic("showOnRightClick")(showOnRightClick.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tray != null) __obj.updateDynamic("tray")(tray.asInstanceOf[js.Any])
    if (windowPosition != null) __obj.updateDynamic("windowPosition")(windowPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

