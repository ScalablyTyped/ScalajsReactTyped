package typingsJapgolly.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLean extends js.Object {
  /** return the raw object instead of the Mongoose Model */
  var lean: js.UndefOr[Boolean] = js.undefined
  /** The maximum number of results to return */
  var limit: js.UndefOr[Double] = js.undefined
  /** the maximum distance from the point near that a result can be */
  var maxDistance: Double
  /** x,y point to search for */
  var near: js.Array[Double]
}

object AnonLean {
  @scala.inline
  def apply(
    maxDistance: Double,
    near: js.Array[Double],
    lean: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null
  ): AnonLean = {
    val __obj = js.Dynamic.literal(maxDistance = maxDistance.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any])
    if (!js.isUndefined(lean)) __obj.updateDynamic("lean")(lean.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLean]
  }
}

