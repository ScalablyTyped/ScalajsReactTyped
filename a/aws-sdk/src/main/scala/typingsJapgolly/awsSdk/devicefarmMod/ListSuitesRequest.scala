package typingsJapgolly.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSuitesRequest extends js.Object {
  /**
    * The job's Amazon Resource Name (ARN).
    */
  var arn: AmazonResourceName = js.native
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListSuitesRequest {
  @scala.inline
  def apply(arn: AmazonResourceName, nextToken: PaginationToken = null): ListSuitesRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSuitesRequest]
  }
}

