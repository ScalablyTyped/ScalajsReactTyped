package typingsJapgolly.phaser.Phaser.Types.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchInputConfig extends js.Object {
  /**
    * Whether touch input events have preventDefault() called on them.
    */
  var capture: js.UndefOr[Boolean] = js.undefined
  /**
    * Where the Touch Manager listens for touch input events. The default is the game canvas.
    */
  var target: js.UndefOr[js.Any] = js.undefined
}

object TouchInputConfig {
  @scala.inline
  def apply(capture: js.UndefOr[Boolean] = js.undefined, target: js.Any = null): TouchInputConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchInputConfig]
  }
}

