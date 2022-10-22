package typingsJapgolly.electron.Electron

import typingsJapgolly.electron.electronStrings.about
import typingsJapgolly.electron.electronStrings.appMenu
import typingsJapgolly.electron.electronStrings.checkbox
import typingsJapgolly.electron.electronStrings.clearRecentDocuments
import typingsJapgolly.electron.electronStrings.close
import typingsJapgolly.electron.electronStrings.copy
import typingsJapgolly.electron.electronStrings.cut
import typingsJapgolly.electron.electronStrings.delete
import typingsJapgolly.electron.electronStrings.editMenu
import typingsJapgolly.electron.electronStrings.fileMenu
import typingsJapgolly.electron.electronStrings.forceReload
import typingsJapgolly.electron.electronStrings.front
import typingsJapgolly.electron.electronStrings.help
import typingsJapgolly.electron.electronStrings.hide
import typingsJapgolly.electron.electronStrings.hideOthers
import typingsJapgolly.electron.electronStrings.mergeAllWindows
import typingsJapgolly.electron.electronStrings.minimize
import typingsJapgolly.electron.electronStrings.moveTabToNewWindow
import typingsJapgolly.electron.electronStrings.normal
import typingsJapgolly.electron.electronStrings.paste
import typingsJapgolly.electron.electronStrings.pasteAndMatchStyle
import typingsJapgolly.electron.electronStrings.quit
import typingsJapgolly.electron.electronStrings.radio
import typingsJapgolly.electron.electronStrings.recentDocuments
import typingsJapgolly.electron.electronStrings.redo
import typingsJapgolly.electron.electronStrings.reload
import typingsJapgolly.electron.electronStrings.resetZoom
import typingsJapgolly.electron.electronStrings.selectAll
import typingsJapgolly.electron.electronStrings.selectNextTab
import typingsJapgolly.electron.electronStrings.selectPreviousTab
import typingsJapgolly.electron.electronStrings.separator
import typingsJapgolly.electron.electronStrings.services
import typingsJapgolly.electron.electronStrings.shareMenu
import typingsJapgolly.electron.electronStrings.startSpeaking
import typingsJapgolly.electron.electronStrings.stopSpeaking
import typingsJapgolly.electron.electronStrings.submenu
import typingsJapgolly.electron.electronStrings.toggleDevTools
import typingsJapgolly.electron.electronStrings.toggleSpellChecker
import typingsJapgolly.electron.electronStrings.toggleTabBar
import typingsJapgolly.electron.electronStrings.togglefullscreen
import typingsJapgolly.electron.electronStrings.undo
import typingsJapgolly.electron.electronStrings.unhide
import typingsJapgolly.electron.electronStrings.viewMenu
import typingsJapgolly.electron.electronStrings.window
import typingsJapgolly.electron.electronStrings.windowMenu
import typingsJapgolly.electron.electronStrings.zoom
import typingsJapgolly.electron.electronStrings.zoomIn
import typingsJapgolly.electron.electronStrings.zoomOut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItem extends StObject {
  
  /**
    * An `Accelerator` (optional) indicating the item's accelerator, if set.
    */
  var accelerator: js.UndefOr[Accelerator] = js.undefined
  
  /**
    * A `boolean` indicating whether the item is checked, this property can be
    * dynamically changed.
    *
    * A `checkbox` menu item will toggle the `checked` property on and off when
    * selected.
    *
    * A `radio` menu item will turn on its `checked` property when clicked, and will
    * turn off that property for all adjacent items in the same menu.
    *
    * You can add a `click` function for additional behavior.
    */
  var checked: Boolean
  
  /**
    * A `Function` that is fired when the MenuItem receives a click event. It can be
    * called with `menuItem.click(event, focusedWindow, focusedWebContents)`.
    *
    * * `event` KeyboardEvent
    * * `focusedWindow` BrowserWindow
    * * `focusedWebContents` WebContents
    */
  var click: js.Function
  
  /**
    * A `number` indicating an item's sequential unique id.
    */
  var commandId: Double
  
  /**
    * A `boolean` indicating whether the item is enabled, this property can be
    * dynamically changed.
    */
  var enabled: Boolean
  
  /**
    * A `NativeImage | string` (optional) indicating the item's icon, if set.
    */
  var icon: js.UndefOr[NativeImage_ | String] = js.undefined
  
  /**
    * A `string` indicating the item's unique id, this property can be dynamically
    * changed.
    */
  var id: String
  
  /**
    * A `string` indicating the item's visible label.
    */
  var label: String
  
  /**
    * A `Menu` that the item is a part of.
    */
  var menu: Menu
  
  /**
    * A `boolean` indicating if the accelerator should be registered with the system
    * or just displayed.
    *
    * This property can be dynamically changed.
    */
  var registerAccelerator: Boolean
  
  /**
    * A `string` (optional) indicating the item's role, if set. Can be `undo`, `redo`,
    * `cut`, `copy`, `paste`, `pasteAndMatchStyle`, `delete`, `selectAll`, `reload`,
    * `forceReload`, `toggleDevTools`, `resetZoom`, `zoomIn`, `zoomOut`,
    * `toggleSpellChecker`, `togglefullscreen`, `window`, `minimize`, `close`, `help`,
    * `about`, `services`, `hide`, `hideOthers`, `unhide`, `quit`, `startSpeaking`,
    * `stopSpeaking`, `zoom`, `front`, `appMenu`, `fileMenu`, `editMenu`, `viewMenu`,
    * `shareMenu`, `recentDocuments`, `toggleTabBar`, `selectNextTab`,
    * `selectPreviousTab`, `mergeAllWindows`, `clearRecentDocuments`,
    * `moveTabToNewWindow` or `windowMenu`
    */
  var role: js.UndefOr[
    undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | toggleSpellChecker | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | shareMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
  ] = js.undefined
  
  /**
    * A `SharingItem` indicating the item to share when the `role` is `shareMenu`.
    *
    * This property can be dynamically changed.
    *
    * @platform darwin
    */
  var sharingItem: SharingItem
  
  /**
    * A `string` indicating the item's sublabel.
    */
  var sublabel: String
  
  /**
    * A `Menu` (optional) containing the menu item's submenu, if present.
    */
  var submenu: js.UndefOr[Menu] = js.undefined
  
  /**
    * A `string` indicating the item's hover text.
    *
    * @platform darwin
    */
  var toolTip: String
  
  /**
    * A `string` indicating the type of the item. Can be `normal`, `separator`,
    * `submenu`, `checkbox` or `radio`.
    */
  var `type`: normal | separator | submenu | checkbox | radio
  
  /**
    * An `Accelerator | null` indicating the item's user-assigned accelerator for the
    * menu item.
    *
    * **Note:** This property is only initialized after the `MenuItem` has been added
    * to a `Menu`. Either via `Menu.buildFromTemplate` or via
    * `Menu.append()/insert()`.  Accessing before initialization will just return
    * `null`.
    *
    * @platform darwin
    */
  val userAccelerator: Accelerator | Null
  
  /**
    * A `boolean` indicating whether the item is visible, this property can be
    * dynamically changed.
    */
  var visible: Boolean
}
object MenuItem {
  
  inline def apply(
    checked: Boolean,
    click: js.Function,
    commandId: Double,
    enabled: Boolean,
    id: String,
    label: String,
    menu: Menu,
    registerAccelerator: Boolean,
    sharingItem: SharingItem,
    sublabel: String,
    toolTip: String,
    `type`: normal | separator | submenu | checkbox | radio,
    visible: Boolean
  ): MenuItem = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], commandId = commandId.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], registerAccelerator = registerAccelerator.asInstanceOf[js.Any], sharingItem = sharingItem.asInstanceOf[js.Any], sublabel = sublabel.asInstanceOf[js.Any], toolTip = toolTip.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], userAccelerator = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItem]
  }
  
  extension [Self <: MenuItem](x: Self) {
    
    inline def setAccelerator(value: Accelerator): Self = StObject.set(x, "accelerator", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorUndefined: Self = StObject.set(x, "accelerator", js.undefined)
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setClick(value: js.Function): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setCommandId(value: Double): Self = StObject.set(x, "commandId", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: NativeImage_ | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMenu(value: Menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setRegisterAccelerator(value: Boolean): Self = StObject.set(x, "registerAccelerator", value.asInstanceOf[js.Any])
    
    inline def setRole(
      value: undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | toggleSpellChecker | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | shareMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
    ): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSharingItem(value: SharingItem): Self = StObject.set(x, "sharingItem", value.asInstanceOf[js.Any])
    
    inline def setSublabel(value: String): Self = StObject.set(x, "sublabel", value.asInstanceOf[js.Any])
    
    inline def setSubmenu(value: Menu): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
    
    inline def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
    
    inline def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
    
    inline def setType(value: normal | separator | submenu | checkbox | radio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUserAccelerator(value: Accelerator): Self = StObject.set(x, "userAccelerator", value.asInstanceOf[js.Any])
    
    inline def setUserAcceleratorNull: Self = StObject.set(x, "userAccelerator", null)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
