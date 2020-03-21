package typingsJapgolly.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookupEventsResponse extends js.Object {
  /**
    * A list of events returned based on the lookup attributes specified and the CloudTrail event. The events list is sorted by time. The most recent event is listed first.
    */
  var Events: js.UndefOr[EventsList] = js.native
  /**
    * The token to use to get the next page of results after a previous API call. If the token does not appear, there are no more results to return. The token must be passed in with the same parameters as the previous call. For example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.cloudtrailMod.NextToken] = js.native
}

object LookupEventsResponse {
  @scala.inline
  def apply(Events: EventsList = null, NextToken: NextToken = null): LookupEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupEventsResponse]
  }
}

