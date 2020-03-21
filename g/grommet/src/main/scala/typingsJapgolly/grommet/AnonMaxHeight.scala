package typingsJapgolly.grommet

import typingsJapgolly.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxHeight extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var maxHeight: js.UndefOr[String] = js.undefined
}

object AnonMaxHeight {
  @scala.inline
  def apply(extend: ExtendType = null, maxHeight: String = null): AnonMaxHeight = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxHeight]
  }
}

