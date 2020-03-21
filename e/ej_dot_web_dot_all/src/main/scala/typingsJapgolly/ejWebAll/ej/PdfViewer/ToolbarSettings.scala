package typingsJapgolly.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarSettings extends js.Object {
  /** Shows or hides the tooltip of the toolbar items.
    */
  var showToolTip: js.UndefOr[Boolean] = js.undefined
  /** Shows or hides the grouped items in the toolbar with the help of enum ej.PdfViewer.ToolbarItems
    */
  var toolbarItem: js.UndefOr[ToolbarItems | String] = js.undefined
}

object ToolbarSettings {
  @scala.inline
  def apply(showToolTip: js.UndefOr[Boolean] = js.undefined, toolbarItem: ToolbarItems | String = null): ToolbarSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showToolTip)) __obj.updateDynamic("showToolTip")(showToolTip.asInstanceOf[js.Any])
    if (toolbarItem != null) __obj.updateDynamic("toolbarItem")(toolbarItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarSettings]
  }
}

