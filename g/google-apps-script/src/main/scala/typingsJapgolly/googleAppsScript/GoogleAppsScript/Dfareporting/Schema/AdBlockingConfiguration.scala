package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdBlockingConfiguration extends js.Object {
  var clickThroughUrl: js.UndefOr[String] = js.undefined
  var creativeBundleId: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var overrideClickThroughUrl: js.UndefOr[Boolean] = js.undefined
}

object AdBlockingConfiguration {
  @scala.inline
  def apply(
    clickThroughUrl: String = null,
    creativeBundleId: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    overrideClickThroughUrl: js.UndefOr[Boolean] = js.undefined
  ): AdBlockingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl.asInstanceOf[js.Any])
    if (creativeBundleId != null) __obj.updateDynamic("creativeBundleId")(creativeBundleId.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideClickThroughUrl)) __obj.updateDynamic("overrideClickThroughUrl")(overrideClickThroughUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdBlockingConfiguration]
  }
}

