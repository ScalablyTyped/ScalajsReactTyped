package typingsJapgolly.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An unsampled report collection lists Analytics unsampled reports to which
  * the user has access. Each view (profile) can have a set of unsampled
  * reports. Each resource in the unsampled report collection corresponds to a
  * single Analytics unsampled report.
  */
@js.native
trait SchemaUnsampledReports extends js.Object {
  /**
    * A list of unsampled reports.
    */
  var items: js.UndefOr[js.Array[SchemaUnsampledReport]] = js.native
  /**
    * The maximum number of resources the response can contain, regardless of
    * the actual number of resources returned. Its value ranges from 1 to 1000
    * with a value of 1000 by default, or otherwise specified by the
    * max-results query parameter.
    */
  var itemsPerPage: js.UndefOr[Double] = js.native
  /**
    * Collection type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Link to next page for this unsampled report collection.
    */
  var nextLink: js.UndefOr[String] = js.native
  /**
    * Link to previous page for this unsampled report collection.
    */
  var previousLink: js.UndefOr[String] = js.native
  /**
    * The starting index of the resources, which is 1 by default or otherwise
    * specified by the start-index query parameter.
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * The total number of results for the query, regardless of the number of
    * resources in the result.
    */
  var totalResults: js.UndefOr[Double] = js.native
  /**
    * Email ID of the authenticated user
    */
  var username: js.UndefOr[String] = js.native
}

object SchemaUnsampledReports {
  @scala.inline
  def apply(
    items: js.Array[SchemaUnsampledReport] = null,
    itemsPerPage: Int | Double = null,
    kind: String = null,
    nextLink: String = null,
    previousLink: String = null,
    startIndex: Int | Double = null,
    totalResults: Int | Double = null,
    username: String = null
  ): SchemaUnsampledReports = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink.asInstanceOf[js.Any])
    if (previousLink != null) __obj.updateDynamic("previousLink")(previousLink.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUnsampledReports]
  }
}

