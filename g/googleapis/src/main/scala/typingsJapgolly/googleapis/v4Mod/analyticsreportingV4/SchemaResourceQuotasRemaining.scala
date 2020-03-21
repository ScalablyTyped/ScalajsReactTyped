package typingsJapgolly.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The resource quota tokens remaining for the property after the request is
  * completed.
  */
@js.native
trait SchemaResourceQuotasRemaining extends js.Object {
  /**
    * Daily resource quota remaining remaining.
    */
  var dailyQuotaTokensRemaining: js.UndefOr[Double] = js.native
  /**
    * Hourly resource quota tokens remaining.
    */
  var hourlyQuotaTokensRemaining: js.UndefOr[Double] = js.native
}

object SchemaResourceQuotasRemaining {
  @scala.inline
  def apply(dailyQuotaTokensRemaining: Int | Double = null, hourlyQuotaTokensRemaining: Int | Double = null): SchemaResourceQuotasRemaining = {
    val __obj = js.Dynamic.literal()
    if (dailyQuotaTokensRemaining != null) __obj.updateDynamic("dailyQuotaTokensRemaining")(dailyQuotaTokensRemaining.asInstanceOf[js.Any])
    if (hourlyQuotaTokensRemaining != null) __obj.updateDynamic("hourlyQuotaTokensRemaining")(hourlyQuotaTokensRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourceQuotasRemaining]
  }
}

