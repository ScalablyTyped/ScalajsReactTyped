package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.gestalt.gestaltStrings.circle
import typingsJapgolly.gestalt.gestaltStrings.rounded
import typingsJapgolly.gestalt.gestaltStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var shape: js.UndefOr[circle | rounded | square] = js.undefined
  var wash: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object MaskProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    height: Double | String = null,
    shape: circle | rounded | square = null,
    wash: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null
  ): MaskProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (!js.isUndefined(wash)) __obj.updateDynamic("wash")(wash.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskProps]
  }
}

