package typingsJapgolly.joi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArrays extends js.Object {
  var arrays: js.UndefOr[Boolean] = js.undefined
  var objects: js.UndefOr[Boolean] = js.undefined
}

object AnonArrays {
  @scala.inline
  def apply(arrays: js.UndefOr[Boolean] = js.undefined, objects: js.UndefOr[Boolean] = js.undefined): AnonArrays = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrays)) __obj.updateDynamic("arrays")(arrays.asInstanceOf[js.Any])
    if (!js.isUndefined(objects)) __obj.updateDynamic("objects")(objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArrays]
  }
}

