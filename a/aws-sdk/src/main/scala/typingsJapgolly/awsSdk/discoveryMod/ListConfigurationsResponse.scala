package typingsJapgolly.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationsResponse extends js.Object {
  /**
    * Returns configuration details, including the configuration ID, attribute names, and attribute values.
    */
  var configurations: js.UndefOr[Configurations] = js.native
  /**
    * Token to retrieve the next set of results. For example, if your call to ListConfigurations returned 100 items, but you set ListConfigurationsRequest$maxResults to 10, you received a set of 10 results along with this token. Use this token in the next query to retrieve the next set of 10.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListConfigurationsResponse {
  @scala.inline
  def apply(configurations: Configurations = null, nextToken: NextToken = null): ListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (configurations != null) __obj.updateDynamic("configurations")(configurations.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationsResponse]
  }
}

