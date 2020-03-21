package typingsJapgolly.code.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings_ extends js.Object {
  /**
    * Ignore object prototypes when doing a deep comparison?
    * Defaults to false.
    */
  var comparePrototypes: js.UndefOr[Boolean] = js.undefined
  /**
    * Truncate long assertion error messages for readability?
    * Defaults to true.
    */
  var truncateMessages: js.UndefOr[Boolean] = js.undefined
}

object Settings_ {
  @scala.inline
  def apply(
    comparePrototypes: js.UndefOr[Boolean] = js.undefined,
    truncateMessages: js.UndefOr[Boolean] = js.undefined
  ): Settings_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(comparePrototypes)) __obj.updateDynamic("comparePrototypes")(comparePrototypes.asInstanceOf[js.Any])
    if (!js.isUndefined(truncateMessages)) __obj.updateDynamic("truncateMessages")(truncateMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings_]
  }
}

