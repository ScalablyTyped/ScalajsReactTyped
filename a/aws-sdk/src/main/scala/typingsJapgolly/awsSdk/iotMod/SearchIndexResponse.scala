package typingsJapgolly.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchIndexResponse extends js.Object {
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The thing groups that match the search query.
    */
  var thingGroups: js.UndefOr[ThingGroupDocumentList] = js.native
  /**
    * The things that match the search query.
    */
  var things: js.UndefOr[ThingDocumentList] = js.native
}

object SearchIndexResponse {
  @scala.inline
  def apply(
    nextToken: NextToken = null,
    thingGroups: ThingGroupDocumentList = null,
    things: ThingDocumentList = null
  ): SearchIndexResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (thingGroups != null) __obj.updateDynamic("thingGroups")(thingGroups.asInstanceOf[js.Any])
    if (things != null) __obj.updateDynamic("things")(things.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchIndexResponse]
  }
}

