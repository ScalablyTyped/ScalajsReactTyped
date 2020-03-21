package typingsJapgolly.iobroker.mod._Global_.ioBroker

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherCommon
  extends ObjectCommon
     with /* propName */ StringDictionary[js.Any] {
  // Only states can have common.custom
  var custom: js.UndefOr[scala.Nothing] = js.undefined
}

object OtherCommon {
  @scala.inline
  def apply(
    name: String,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    custom: js.UndefOr[scala.Nothing] = js.undefined,
    icon: String = null,
    role: String = null
  ): OtherCommon = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherCommon]
  }
}

