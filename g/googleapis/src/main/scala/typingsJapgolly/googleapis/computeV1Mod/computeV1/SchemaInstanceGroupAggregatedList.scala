package typingsJapgolly.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupAggregatedList extends js.Object {
  /**
    * [Output Only] Unique identifier for the resource; defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A list of InstanceGroupsScopedList resources.
    */
  var items: js.UndefOr[StringDictionary[SchemaInstanceGroupsScopedList]] = js.native
  /**
    * [Output Only] The resource type, which is always
    * compute#instanceGroupAggregatedList for aggregated lists of instance
    * groups.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Output Only] This token allows you to get the next page of results for
    * list requests. If the number of results is larger than maxResults, use
    * the nextPageToken as a value for the query parameter pageToken in the
    * next list request. Subsequent list requests will have their own
    * nextPageToken to continue paging through the results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Informational warning message.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaInstanceGroupAggregatedList {
  @scala.inline
  def apply(
    id: String = null,
    items: StringDictionary[SchemaInstanceGroupsScopedList] = null,
    kind: String = null,
    nextPageToken: String = null,
    selfLink: String = null,
    warning: AnonCode = null
  ): SchemaInstanceGroupAggregatedList = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceGroupAggregatedList]
  }
}

