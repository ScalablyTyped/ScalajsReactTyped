package typingsJapgolly.phosphorWidgets.docklayoutMod.DockLayout

import typingsJapgolly.phosphorWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for adding a widget to the dock layout.
  */
trait IAddOptions extends js.Object {
  /**
    * The insertion mode for adding the widget.
    *
    * The default is `'tab-after'`.
    */
  var mode: js.UndefOr[InsertMode] = js.undefined
  /**
    * The reference widget for the insert location.
    *
    * The default is `null`.
    */
  var ref: js.UndefOr[Widget | Null] = js.undefined
}

object IAddOptions {
  @scala.inline
  def apply(mode: InsertMode = null, ref: Widget = null): IAddOptions = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddOptions]
  }
}

