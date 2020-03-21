package typingsJapgolly.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMonitoredResourceDescriptorsResponse extends js.Object {
  /**
    * If there might be more results than those appearing in this response, then nextPageToken is included. To get the next set of results, call this method
    * again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** A list of resource descriptors. */
  var resourceDescriptors: js.UndefOr[js.Array[MonitoredResourceDescriptor]] = js.undefined
}

object ListMonitoredResourceDescriptorsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, resourceDescriptors: js.Array[MonitoredResourceDescriptor] = null): ListMonitoredResourceDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (resourceDescriptors != null) __obj.updateDynamic("resourceDescriptors")(resourceDescriptors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMonitoredResourceDescriptorsResponse]
  }
}

