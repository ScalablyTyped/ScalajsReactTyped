package typingsJapgolly.awsSdkClientPinpointBrowser.typesEventsBatchMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientPinpointBrowser.typesEventMod.Event
import typingsJapgolly.awsSdkClientPinpointBrowser.typesPublicEndpointMod.PublicEndpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsBatch extends js.Object {
  /**
    * The PublicEndpoint attached to the EndpointId from the request.
    */
  var Endpoint: js.UndefOr[PublicEndpoint] = js.undefined
  /**
    * An object that contains a set of events associated with the endpoint.
    */
  var Events: js.UndefOr[StringDictionary[Event] | (js.Iterable[js.Tuple2[String, Event]])] = js.undefined
}

object EventsBatch {
  @scala.inline
  def apply(
    Endpoint: PublicEndpoint = null,
    Events: StringDictionary[Event] | (js.Iterable[js.Tuple2[String, Event]]) = null
  ): EventsBatch = {
    val __obj = js.Dynamic.literal()
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsBatch]
  }
}

