package typingsJapgolly.electron.global.Electron

import typingsJapgolly.electron.Electron.MenuItemConstructorOptions
import typingsJapgolly.electron.Electron.SharingItem
import typingsJapgolly.electron.electronStrings.checkbox
import typingsJapgolly.electron.electronStrings.normal
import typingsJapgolly.electron.electronStrings.radio
import typingsJapgolly.electron.electronStrings.separator
import typingsJapgolly.electron.electronStrings.submenu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.MenuItem")
@js.native
open class MenuItem protected ()
  extends StObject
     with typingsJapgolly.electron.Electron.MenuItem {
  // Docs: https://electronjs.org/docs/api/menu-item
  /**
    * MenuItem
    */
  def this(options: MenuItemConstructorOptions) = this()
  
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
  /* CompleteClass */
  var checked: Boolean = js.native
  
  /**
    * A `Function` that is fired when the MenuItem receives a click event. It can be
    * called with `menuItem.click(event, focusedWindow, focusedWebContents)`.
    *
    * * `event` KeyboardEvent
    * * `focusedWindow` BrowserWindow
    * * `focusedWebContents` WebContents
    */
  /* CompleteClass */
  var click: js.Function = js.native
  
  /**
    * A `number` indicating an item's sequential unique id.
    */
  /* CompleteClass */
  var commandId: Double = js.native
  
  /**
    * A `boolean` indicating whether the item is enabled, this property can be
    * dynamically changed.
    */
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /**
    * A `string` indicating the item's unique id, this property can be dynamically
    * changed.
    */
  /* CompleteClass */
  var id: String = js.native
  
  /**
    * A `string` indicating the item's visible label.
    */
  /* CompleteClass */
  var label: String = js.native
  
  /**
    * A `Menu` that the item is a part of.
    */
  /* CompleteClass */
  var menu: typingsJapgolly.electron.Electron.Menu = js.native
  
  /**
    * A `boolean` indicating if the accelerator should be registered with the system
    * or just displayed.
    *
    * This property can be dynamically changed.
    */
  /* CompleteClass */
  var registerAccelerator: Boolean = js.native
  
  /**
    * A `SharingItem` indicating the item to share when the `role` is `shareMenu`.
    *
    * This property can be dynamically changed.
    *
    * @platform darwin
    */
  /* CompleteClass */
  var sharingItem: SharingItem = js.native
  
  /**
    * A `string` indicating the item's sublabel.
    */
  /* CompleteClass */
  var sublabel: String = js.native
  
  /**
    * A `string` indicating the item's hover text.
    *
    * @platform darwin
    */
  /* CompleteClass */
  var toolTip: String = js.native
  
  /**
    * A `string` indicating the type of the item. Can be `normal`, `separator`,
    * `submenu`, `checkbox` or `radio`.
    */
  /* CompleteClass */
  var `type`: normal | separator | submenu | checkbox | radio = js.native
  
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
  /* CompleteClass */
  override val userAccelerator: typingsJapgolly.electron.Electron.Accelerator | Null = js.native
  
  /**
    * A `boolean` indicating whether the item is visible, this property can be
    * dynamically changed.
    */
  /* CompleteClass */
  var visible: Boolean = js.native
}
