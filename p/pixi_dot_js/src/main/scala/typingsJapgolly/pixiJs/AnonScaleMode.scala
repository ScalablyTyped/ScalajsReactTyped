package typingsJapgolly.pixiJs

import typingsJapgolly.pixiJs.PIXI.SCALE_MODES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScaleMode extends js.Object {
  var scaleMode: js.UndefOr[SCALE_MODES] = js.undefined
}

object AnonScaleMode {
  @scala.inline
  def apply(scaleMode: SCALE_MODES = null): AnonScaleMode = {
    val __obj = js.Dynamic.literal()
    if (scaleMode != null) __obj.updateDynamic("scaleMode")(scaleMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScaleMode]
  }
}

