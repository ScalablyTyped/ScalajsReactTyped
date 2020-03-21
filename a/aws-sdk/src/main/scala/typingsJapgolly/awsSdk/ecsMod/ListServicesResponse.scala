package typingsJapgolly.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServicesResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListServices request. When the results of a ListServices request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The list of full ARN entries for each service associated with the specified cluster.
    */
  var serviceArns: js.UndefOr[StringList] = js.native
}

object ListServicesResponse {
  @scala.inline
  def apply(nextToken: String = null, serviceArns: StringList = null): ListServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (serviceArns != null) __obj.updateDynamic("serviceArns")(serviceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServicesResponse]
  }
}

