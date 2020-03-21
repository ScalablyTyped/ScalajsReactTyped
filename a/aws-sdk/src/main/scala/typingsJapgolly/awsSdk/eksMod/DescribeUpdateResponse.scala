package typingsJapgolly.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUpdateResponse extends js.Object {
  /**
    * The full description of the specified update.
    */
  var update: js.UndefOr[Update] = js.native
}

object DescribeUpdateResponse {
  @scala.inline
  def apply(update: Update = null): DescribeUpdateResponse = {
    val __obj = js.Dynamic.literal()
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUpdateResponse]
  }
}

