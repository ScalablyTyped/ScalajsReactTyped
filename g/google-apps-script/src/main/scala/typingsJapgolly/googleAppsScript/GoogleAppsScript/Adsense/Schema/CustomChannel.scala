package typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomChannel extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var targetingInfo: js.UndefOr[CustomChannelTargetingInfo] = js.undefined
}

object CustomChannel {
  @scala.inline
  def apply(
    code: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    targetingInfo: CustomChannelTargetingInfo = null
  ): CustomChannel = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (targetingInfo != null) __obj.updateDynamic("targetingInfo")(targetingInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomChannel]
  }
}

