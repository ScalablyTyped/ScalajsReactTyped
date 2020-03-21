package typingsJapgolly.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffixOptions extends js.Object {
  var offset: js.UndefOr[Double | CallBack | js.Object] = js.undefined
  var target: js.UndefOr[js.Any] = js.undefined
}

object AffixOptions {
  @scala.inline
  def apply(offset: Double | CallBack | js.Object = null, target: js.Any = null): AffixOptions = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AffixOptions]
  }
}

