package typingsJapgolly.devextreme.mod.DevExpress.ui

import typingsJapgolly.devextreme.devextremeStrings.clear
import typingsJapgolly.devextreme.devextremeStrings.copy
import typingsJapgolly.devextreme.devextremeStrings.create
import typingsJapgolly.devextreme.devextremeStrings.delete
import typingsJapgolly.devextreme.devextremeStrings.download
import typingsJapgolly.devextreme.devextremeStrings.move
import typingsJapgolly.devextreme.devextremeStrings.refresh
import typingsJapgolly.devextreme.devextremeStrings.rename
import typingsJapgolly.devextreme.devextremeStrings.separator
import typingsJapgolly.devextreme.devextremeStrings.showNavPane
import typingsJapgolly.devextreme.devextremeStrings.upload
import typingsJapgolly.devextreme.devextremeStrings.viewSwitcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFileManagerToolbar extends js.Object {
  /** Configures settings of the toolbar items that are visible when users select files. */
  var fileSelectionItems: js.UndefOr[
    js.Array[
      dxFileManagerToolbarItem | showNavPane | create | upload | refresh | viewSwitcher | download | move | copy | rename | delete | clear | separator
    ]
  ] = js.undefined
  /** Configures toolbar items' settings. */
  var items: js.UndefOr[
    js.Array[
      dxFileManagerToolbarItem | showNavPane | create | upload | refresh | viewSwitcher | download | move | copy | rename | delete | clear | separator
    ]
  ] = js.undefined
}

object dxFileManagerToolbar {
  @scala.inline
  def apply(
    fileSelectionItems: js.Array[
      dxFileManagerToolbarItem | showNavPane | create | upload | refresh | viewSwitcher | download | move | copy | rename | delete | clear | separator
    ] = null,
    items: js.Array[
      dxFileManagerToolbarItem | showNavPane | create | upload | refresh | viewSwitcher | download | move | copy | rename | delete | clear | separator
    ] = null
  ): dxFileManagerToolbar = {
    val __obj = js.Dynamic.literal()
    if (fileSelectionItems != null) __obj.updateDynamic("fileSelectionItems")(fileSelectionItems.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFileManagerToolbar]
  }
}

