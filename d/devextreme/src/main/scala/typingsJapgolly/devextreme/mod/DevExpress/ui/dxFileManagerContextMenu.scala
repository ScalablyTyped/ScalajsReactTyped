package typingsJapgolly.devextreme.mod.DevExpress.ui

import typingsJapgolly.devextreme.devextremeStrings.copy
import typingsJapgolly.devextreme.devextremeStrings.create
import typingsJapgolly.devextreme.devextremeStrings.delete
import typingsJapgolly.devextreme.devextremeStrings.download
import typingsJapgolly.devextreme.devextremeStrings.move
import typingsJapgolly.devextreme.devextremeStrings.refresh
import typingsJapgolly.devextreme.devextremeStrings.rename
import typingsJapgolly.devextreme.devextremeStrings.upload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFileManagerContextMenu extends js.Object {
  /** Configures context menu items' settings. */
  var items: js.UndefOr[
    js.Array[
      dxFileManagerContextMenuItem | create | upload | refresh | download | move | copy | rename | delete
    ]
  ] = js.undefined
}

object dxFileManagerContextMenu {
  @scala.inline
  def apply(
    items: js.Array[
      dxFileManagerContextMenuItem | create | upload | refresh | download | move | copy | rename | delete
    ] = null
  ): dxFileManagerContextMenu = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFileManagerContextMenu]
  }
}

