package typingsJapgolly.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTrailResponse extends js.Object {
  var Trail: js.UndefOr[typingsJapgolly.awsSdk.cloudtrailMod.Trail] = js.native
}

object GetTrailResponse {
  @scala.inline
  def apply(Trail: Trail = null): GetTrailResponse = {
    val __obj = js.Dynamic.literal()
    if (Trail != null) __obj.updateDynamic("Trail")(Trail.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrailResponse]
  }
}

