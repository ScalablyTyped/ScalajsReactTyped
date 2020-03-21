package typingsJapgolly.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuSettings extends js.Object {
  /** Gets or sets a value that indicates whether to add the default context menu actions as a context menu items If enableContextMenu is true it will show all the items related to the
    * target, if you want selected items from contextmenu you have to mention in the contextMenuItems
    * @Default {[]}
    */
  var contextMenuItems: js.UndefOr[js.Array[_]] = js.undefined
  /** Gets or sets a value that indicates whether to add custom contextMenu items within the toolbar to perform any action in the grid
    * @Default {[]}
    */
  var customContextMenuItems: js.UndefOr[js.Array[_]] = js.undefined
  /** Gets or sets a value that indicates whether to disable the default context menu items in the grid.
    * @Default {false}
    */
  var disableDefaultItems: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the context menu action in the grid.
    * @Default {false}
    */
  var enableContextMenu: js.UndefOr[Boolean] = js.undefined
  /** Used to get or set the subMenu to the corresponding custom context menu item.
    */
  var subContextMenu: js.UndefOr[js.Array[ContextMenuSettingsSubContextMenu]] = js.undefined
}

object ContextMenuSettings {
  @scala.inline
  def apply(
    contextMenuItems: js.Array[_] = null,
    customContextMenuItems: js.Array[_] = null,
    disableDefaultItems: js.UndefOr[Boolean] = js.undefined,
    enableContextMenu: js.UndefOr[Boolean] = js.undefined,
    subContextMenu: js.Array[ContextMenuSettingsSubContextMenu] = null
  ): ContextMenuSettings = {
    val __obj = js.Dynamic.literal()
    if (contextMenuItems != null) __obj.updateDynamic("contextMenuItems")(contextMenuItems.asInstanceOf[js.Any])
    if (customContextMenuItems != null) __obj.updateDynamic("customContextMenuItems")(customContextMenuItems.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDefaultItems)) __obj.updateDynamic("disableDefaultItems")(disableDefaultItems.asInstanceOf[js.Any])
    if (!js.isUndefined(enableContextMenu)) __obj.updateDynamic("enableContextMenu")(enableContextMenu.asInstanceOf[js.Any])
    if (subContextMenu != null) __obj.updateDynamic("subContextMenu")(subContextMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuSettings]
  }
}

