package typingsJapgolly.gapiClientAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  /** The name of the variation. This field is required when creating an experiment. This field may not be changed for an experiment whose status is ENDED. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Status of the variation. Possible values: "ACTIVE", "INACTIVE". INACTIVE variations are not served. This field may not be changed for an experiment
    * whose status is ENDED.
    */
  var status: js.UndefOr[String] = js.undefined
  /** The URL of the variation. This field may not be changed for an experiment whose status is RUNNING or ENDED. */
  var url: js.UndefOr[String] = js.undefined
  /** Weight that this variation should receive. Only present if the experiment is running. This field is read-only. */
  var weight: js.UndefOr[Double] = js.undefined
  /** True if the experiment has ended and this variation performed (statistically) significantly better than the original. This field is read-only. */
  var won: js.UndefOr[Boolean] = js.undefined
}

object AnonName {
  @scala.inline
  def apply(
    name: String = null,
    status: String = null,
    url: String = null,
    weight: Int | Double = null,
    won: js.UndefOr[Boolean] = js.undefined
  ): AnonName = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    if (!js.isUndefined(won)) __obj.updateDynamic("won")(won.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

