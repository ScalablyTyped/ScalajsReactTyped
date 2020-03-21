package typingsJapgolly.electronUtil.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.electron.Electron.Accelerator
import typingsJapgolly.electron.Electron.BrowserWindow
import typingsJapgolly.electron.Electron.KeyboardEvent
import typingsJapgolly.electron.Electron.Menu
import typingsJapgolly.electron.Electron.MenuItem
import typingsJapgolly.electron.Electron.MenuItemConstructorOptions
import typingsJapgolly.electron.Electron.NativeImage_
import typingsJapgolly.electronUtil.electronUtilStrings.about
import typingsJapgolly.electronUtil.electronUtilStrings.checkbox
import typingsJapgolly.electronUtil.electronUtilStrings.clearRecentDocuments
import typingsJapgolly.electronUtil.electronUtilStrings.close
import typingsJapgolly.electronUtil.electronUtilStrings.copy
import typingsJapgolly.electronUtil.electronUtilStrings.cut
import typingsJapgolly.electronUtil.electronUtilStrings.delete
import typingsJapgolly.electronUtil.electronUtilStrings.editMenu
import typingsJapgolly.electronUtil.electronUtilStrings.fileMenu
import typingsJapgolly.electronUtil.electronUtilStrings.forceReload
import typingsJapgolly.electronUtil.electronUtilStrings.front
import typingsJapgolly.electronUtil.electronUtilStrings.help
import typingsJapgolly.electronUtil.electronUtilStrings.hide
import typingsJapgolly.electronUtil.electronUtilStrings.hideOthers
import typingsJapgolly.electronUtil.electronUtilStrings.mergeAllWindows
import typingsJapgolly.electronUtil.electronUtilStrings.minimize
import typingsJapgolly.electronUtil.electronUtilStrings.moveTabToNewWindow
import typingsJapgolly.electronUtil.electronUtilStrings.normal
import typingsJapgolly.electronUtil.electronUtilStrings.paste
import typingsJapgolly.electronUtil.electronUtilStrings.pasteAndMatchStyle
import typingsJapgolly.electronUtil.electronUtilStrings.quit
import typingsJapgolly.electronUtil.electronUtilStrings.radio
import typingsJapgolly.electronUtil.electronUtilStrings.recentDocuments
import typingsJapgolly.electronUtil.electronUtilStrings.redo
import typingsJapgolly.electronUtil.electronUtilStrings.reload
import typingsJapgolly.electronUtil.electronUtilStrings.resetZoom
import typingsJapgolly.electronUtil.electronUtilStrings.selectAll
import typingsJapgolly.electronUtil.electronUtilStrings.selectNextTab
import typingsJapgolly.electronUtil.electronUtilStrings.selectPreviousTab
import typingsJapgolly.electronUtil.electronUtilStrings.separator
import typingsJapgolly.electronUtil.electronUtilStrings.services
import typingsJapgolly.electronUtil.electronUtilStrings.startSpeaking
import typingsJapgolly.electronUtil.electronUtilStrings.stopSpeaking
import typingsJapgolly.electronUtil.electronUtilStrings.submenu
import typingsJapgolly.electronUtil.electronUtilStrings.toggleDevTools
import typingsJapgolly.electronUtil.electronUtilStrings.toggleTabBar
import typingsJapgolly.electronUtil.electronUtilStrings.togglefullscreen
import typingsJapgolly.electronUtil.electronUtilStrings.undo
import typingsJapgolly.electronUtil.electronUtilStrings.unhide
import typingsJapgolly.electronUtil.electronUtilStrings.viewMenu
import typingsJapgolly.electronUtil.electronUtilStrings.window
import typingsJapgolly.electronUtil.electronUtilStrings.windowMenu
import typingsJapgolly.electronUtil.electronUtilStrings.zoom
import typingsJapgolly.electronUtil.electronUtilStrings.zoomIn
import typingsJapgolly.electronUtil.electronUtilStrings.zoomOut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Readonly<electron.electron.MenuItemConstructorOptions> */
trait OpenUrlMenuItemOptions extends js.Object {
  val accelerator: js.UndefOr[Accelerator] = js.undefined
  val acceleratorWorksWhenHidden: js.UndefOr[Boolean] = js.undefined
  val after: js.UndefOr[js.Array[String]] = js.undefined
  val afterGroupContaining: js.UndefOr[js.Array[String]] = js.undefined
  val before: js.UndefOr[js.Array[String]] = js.undefined
  val beforeGroupContaining: js.UndefOr[js.Array[String]] = js.undefined
  val checked: js.UndefOr[Boolean] = js.undefined
  val click: js.UndefOr[
    js.Function3[
      /* menuItem */ MenuItem, 
      /* browserWindow */ BrowserWindow, 
      /* event */ KeyboardEvent, 
      Unit
    ]
  ] = js.undefined
  val enabled: js.UndefOr[Boolean] = js.undefined
  val icon: js.UndefOr[NativeImage_ | String] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  val label: js.UndefOr[String] = js.undefined
  val registerAccelerator: js.UndefOr[Boolean] = js.undefined
  val role: js.UndefOr[
    undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | typingsJapgolly.electronUtil.electronUtilStrings.appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
  ] = js.undefined
  val sublabel: js.UndefOr[String] = js.undefined
  val submenu: js.UndefOr[js.Array[MenuItemConstructorOptions] | Menu] = js.undefined
  val `type`: js.UndefOr[
    normal | separator | typingsJapgolly.electronUtil.electronUtilStrings.submenu | checkbox | radio
  ] = js.undefined
  /**
  	URL to be opened when the menu item is clicked.
  	*/
  val url: String
  val visible: js.UndefOr[Boolean] = js.undefined
}

object OpenUrlMenuItemOptions {
  @scala.inline
  def apply(
    url: String,
    accelerator: Accelerator = null,
    acceleratorWorksWhenHidden: js.UndefOr[Boolean] = js.undefined,
    after: js.Array[String] = null,
    afterGroupContaining: js.Array[String] = null,
    before: js.Array[String] = null,
    beforeGroupContaining: js.Array[String] = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    click: (/* menuItem */ MenuItem, /* browserWindow */ BrowserWindow, /* event */ KeyboardEvent) => Callback = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    icon: NativeImage_ | String = null,
    id: String = null,
    label: String = null,
    registerAccelerator: js.UndefOr[Boolean] = js.undefined,
    role: undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | typingsJapgolly.electronUtil.electronUtilStrings.appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu = null,
    sublabel: String = null,
    submenu: js.Array[MenuItemConstructorOptions] | Menu = null,
    `type`: normal | separator | submenu | checkbox | radio = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): OpenUrlMenuItemOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (accelerator != null) __obj.updateDynamic("accelerator")(accelerator.asInstanceOf[js.Any])
    if (!js.isUndefined(acceleratorWorksWhenHidden)) __obj.updateDynamic("acceleratorWorksWhenHidden")(acceleratorWorksWhenHidden.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (afterGroupContaining != null) __obj.updateDynamic("afterGroupContaining")(afterGroupContaining.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (beforeGroupContaining != null) __obj.updateDynamic("beforeGroupContaining")(beforeGroupContaining.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction3((t0: /* menuItem */ typingsJapgolly.electron.Electron.MenuItem, t1: /* browserWindow */ typingsJapgolly.electron.Electron.BrowserWindow, t2: /* event */ typingsJapgolly.electron.Electron.KeyboardEvent) => click(t0, t1, t2).runNow()))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(registerAccelerator)) __obj.updateDynamic("registerAccelerator")(registerAccelerator.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sublabel != null) __obj.updateDynamic("sublabel")(sublabel.asInstanceOf[js.Any])
    if (submenu != null) __obj.updateDynamic("submenu")(submenu.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenUrlMenuItemOptions]
  }
}

