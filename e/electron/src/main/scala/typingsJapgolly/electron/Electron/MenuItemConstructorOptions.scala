package typingsJapgolly.electron.Electron

import japgolly.scalajs.react.Callback
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
import typingsJapgolly.electron.electronStrings.showSubstitutions
import typingsJapgolly.electron.electronStrings.startSpeaking
import typingsJapgolly.electron.electronStrings.stopSpeaking
import typingsJapgolly.electron.electronStrings.submenu
import typingsJapgolly.electron.electronStrings.toggleDevTools
import typingsJapgolly.electron.electronStrings.toggleSmartDashes
import typingsJapgolly.electron.electronStrings.toggleSmartQuotes
import typingsJapgolly.electron.electronStrings.toggleSpellChecker
import typingsJapgolly.electron.electronStrings.toggleTabBar
import typingsJapgolly.electron.electronStrings.toggleTextReplacement
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

trait MenuItemConstructorOptions extends StObject {
  
  var accelerator: js.UndefOr[Accelerator] = js.undefined
  
  /**
    * default is `true`, and when `false` will prevent the accelerator from triggering
    * the item if the item is not visible`.
    *
    * @platform darwin
    */
  var acceleratorWorksWhenHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Inserts this item after the item with the specified label. If the referenced
    * item doesn't exist the item will be inserted at the end of the menu.
    */
  var after: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Provides a means for a single context menu to declare the placement of their
    * containing group after the containing group of the item with the specified
    * label.
    */
  var afterGroupContaining: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Inserts this item before the item with the specified label. If the referenced
    * item doesn't exist the item will be inserted at the end of  the menu. Also
    * implies that the menu item in question should be placed in the same “group” as
    * the item.
    */
  var before: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Provides a means for a single context menu to declare the placement of their
    * containing group before the containing group of the item with the specified
    * label.
    */
  var beforeGroupContaining: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Should only be specified for `checkbox` or `radio` type menu items.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Will be called with `click(menuItem, browserWindow, event)` when the menu item
    * is clicked.
    */
  var click: js.UndefOr[
    js.Function3[
      /* menuItem */ MenuItem, 
      /* browserWindow */ js.UndefOr[BrowserWindow], 
      /* event */ KeyboardEvent, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * If false, the menu item will be greyed out and unclickable.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[NativeImage_ | String] = js.undefined
  
  /**
    * Unique within a single menu. If defined then it can be used as a reference to
    * this item by the position attribute.
    */
  var id: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * If false, the accelerator won't be registered with the system, but it will still
    * be displayed. Defaults to true.
    *
    * @platform linux,win32
    */
  var registerAccelerator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Can be `undo`, `redo`, `cut`, `copy`, `paste`, `pasteAndMatchStyle`, `delete`,
    * `selectAll`, `reload`, `forceReload`, `toggleDevTools`, `resetZoom`, `zoomIn`,
    * `zoomOut`, `toggleSpellChecker`, `togglefullscreen`, `window`, `minimize`,
    * `close`, `help`, `about`, `services`, `hide`, `hideOthers`, `unhide`, `quit`,
    * 'showSubstitutions', 'toggleSmartQuotes', 'toggleSmartDashes',
    * 'toggleTextReplacement', `startSpeaking`, `stopSpeaking`, `zoom`, `front`,
    * `appMenu`, `fileMenu`, `editMenu`, `viewMenu`, `shareMenu`, `recentDocuments`,
    * `toggleTabBar`, `selectNextTab`, `selectPreviousTab`, `mergeAllWindows`,
    * `clearRecentDocuments`, `moveTabToNewWindow` or `windowMenu` - Define the action
    * of the menu item, when specified the `click` property will be ignored. See
    * roles.
    */
  var role: js.UndefOr[
    undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | toggleSpellChecker | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | showSubstitutions | toggleSmartQuotes | toggleSmartDashes | toggleTextReplacement | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | shareMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
  ] = js.undefined
  
  /**
    * The item to share when the `role` is `shareMenu`.
    *
    * @platform darwin
    */
  var sharingItem: js.UndefOr[SharingItem] = js.undefined
  
  var sublabel: js.UndefOr[String] = js.undefined
  
  /**
    * Should be specified for `submenu` type menu items. If `submenu` is specified,
    * the `type: 'submenu'` can be omitted. If the value is not a `Menu` then it will
    * be automatically converted to one using `Menu.buildFromTemplate`.
    */
  var submenu: js.UndefOr[js.Array[MenuItemConstructorOptions] | Menu] = js.undefined
  
  /**
    * Hover text for this menu item.
    *
    * @platform darwin
    */
  var toolTip: js.UndefOr[String] = js.undefined
  
  /**
    * Can be `normal`, `separator`, `submenu`, `checkbox` or `radio`.
    */
  var `type`: js.UndefOr[normal | separator | submenu | checkbox | radio] = js.undefined
  
  /**
    * If false, the menu item will be entirely hidden.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object MenuItemConstructorOptions {
  
  inline def apply(): MenuItemConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemConstructorOptions]
  }
  
  extension [Self <: MenuItemConstructorOptions](x: Self) {
    
    inline def setAccelerator(value: Accelerator): Self = StObject.set(x, "accelerator", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorUndefined: Self = StObject.set(x, "accelerator", js.undefined)
    
    inline def setAcceleratorWorksWhenHidden(value: Boolean): Self = StObject.set(x, "acceleratorWorksWhenHidden", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorWorksWhenHiddenUndefined: Self = StObject.set(x, "acceleratorWorksWhenHidden", js.undefined)
    
    inline def setAfter(value: js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterGroupContaining(value: js.Array[String]): Self = StObject.set(x, "afterGroupContaining", value.asInstanceOf[js.Any])
    
    inline def setAfterGroupContainingUndefined: Self = StObject.set(x, "afterGroupContaining", js.undefined)
    
    inline def setAfterGroupContainingVarargs(value: String*): Self = StObject.set(x, "afterGroupContaining", js.Array(value*))
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value*))
    
    inline def setBefore(value: js.Array[String]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeGroupContaining(value: js.Array[String]): Self = StObject.set(x, "beforeGroupContaining", value.asInstanceOf[js.Any])
    
    inline def setBeforeGroupContainingUndefined: Self = StObject.set(x, "beforeGroupContaining", js.undefined)
    
    inline def setBeforeGroupContainingVarargs(value: String*): Self = StObject.set(x, "beforeGroupContaining", js.Array(value*))
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setBeforeVarargs(value: String*): Self = StObject.set(x, "before", js.Array(value*))
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setClick(
      value: (/* menuItem */ MenuItem, /* browserWindow */ js.UndefOr[BrowserWindow], /* event */ KeyboardEvent) => Callback
    ): Self = StObject.set(x, "click", js.Any.fromFunction3((t0: /* menuItem */ MenuItem, t1: /* browserWindow */ js.UndefOr[BrowserWindow], t2: /* event */ KeyboardEvent) => (value(t0, t1, t2)).runNow()))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setIcon(value: NativeImage_ | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRegisterAccelerator(value: Boolean): Self = StObject.set(x, "registerAccelerator", value.asInstanceOf[js.Any])
    
    inline def setRegisterAcceleratorUndefined: Self = StObject.set(x, "registerAccelerator", js.undefined)
    
    inline def setRole(
      value: undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | toggleSpellChecker | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | showSubstitutions | toggleSmartQuotes | toggleSmartDashes | toggleTextReplacement | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | shareMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
    ): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSharingItem(value: SharingItem): Self = StObject.set(x, "sharingItem", value.asInstanceOf[js.Any])
    
    inline def setSharingItemUndefined: Self = StObject.set(x, "sharingItem", js.undefined)
    
    inline def setSublabel(value: String): Self = StObject.set(x, "sublabel", value.asInstanceOf[js.Any])
    
    inline def setSublabelUndefined: Self = StObject.set(x, "sublabel", js.undefined)
    
    inline def setSubmenu(value: js.Array[MenuItemConstructorOptions] | Menu): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
    
    inline def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
    
    inline def setSubmenuVarargs(value: MenuItemConstructorOptions*): Self = StObject.set(x, "submenu", js.Array(value*))
    
    inline def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
    
    inline def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
    
    inline def setType(value: normal | separator | submenu | checkbox | radio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
