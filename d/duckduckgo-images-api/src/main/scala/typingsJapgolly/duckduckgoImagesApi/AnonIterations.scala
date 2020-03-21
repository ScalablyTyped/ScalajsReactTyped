package typingsJapgolly.duckduckgoImagesApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIterations extends js.Object {
  var iterations: js.UndefOr[Double] = js.undefined
  var moderate: js.UndefOr[Boolean] = js.undefined
  var query: String
  var retries: js.UndefOr[Double] = js.undefined
}

object AnonIterations {
  @scala.inline
  def apply(
    query: String,
    iterations: Int | Double = null,
    moderate: js.UndefOr[Boolean] = js.undefined,
    retries: Int | Double = null
  ): AnonIterations = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (!js.isUndefined(moderate)) __obj.updateDynamic("moderate")(moderate.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIterations]
  }
}

