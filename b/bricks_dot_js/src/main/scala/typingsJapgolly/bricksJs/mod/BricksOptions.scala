package typingsJapgolly.bricksJs.mod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BricksOptions extends js.Object {
  var container: Node | String
  var packed: String
  var position: js.UndefOr[Boolean] = js.undefined
  var sizes: js.Array[SizeDetail]
}

object BricksOptions {
  @scala.inline
  def apply(
    container: Node | String,
    packed: String,
    sizes: js.Array[SizeDetail],
    position: js.UndefOr[Boolean] = js.undefined
  ): BricksOptions = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BricksOptions]
  }
}

