package typingsJapgolly.jupyterlabStatusbar.hoverMod.Popup

import typingsJapgolly.jupyterlabStatusbar.jupyterlabStatusbarStrings.left
import typingsJapgolly.jupyterlabStatusbar.jupyterlabStatusbarStrings.right
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating a Popup widget.
  */
trait IOptions extends js.Object {
  /**
    * Whether to align the popup to the left or the right of the anchor.
    */
  var align: js.UndefOr[left | right] = js.undefined
  /**
    * The widget to which we are attaching the popup.
    */
  var anchor: Widget
  /**
    * The content of the popup.
    */
  var body: Widget
}

object IOptions {
  @scala.inline
  def apply(anchor: Widget, body: Widget, align: left | right = null): IOptions = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

