package typingsJapgolly.iobroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<iobroker.iobroker._Global_.ioBroker.ChannelCommon> */
trait PartialChannelCommon extends js.Object {
  var custom: js.UndefOr[scala.Nothing] = js.undefined
  var desc: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
}

object PartialChannelCommon {
  @scala.inline
  def apply(
    custom: js.UndefOr[scala.Nothing] = js.undefined,
    desc: String = null,
    icon: String = null,
    name: String = null,
    role: String = null
  ): PartialChannelCommon = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialChannelCommon]
  }
}

