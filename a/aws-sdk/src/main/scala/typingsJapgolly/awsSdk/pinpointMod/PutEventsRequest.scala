package typingsJapgolly.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEventsRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  var EventsRequest: typingsJapgolly.awsSdk.pinpointMod.EventsRequest = js.native
}

object PutEventsRequest {
  @scala.inline
  def apply(ApplicationId: string, EventsRequest: EventsRequest): PutEventsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EventsRequest = EventsRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutEventsRequest]
  }
}

