package typingsJapgolly.grommet

import typingsJapgolly.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtendExtendType extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object AnonExtendExtendType {
  @scala.inline
  def apply(extend: ExtendType = null, size: String = null): AnonExtendExtendType = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtendExtendType]
  }
}

