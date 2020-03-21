package typingsJapgolly.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Calendar Resource List Response object in Directory API.
  */
@js.native
trait SchemaCalendarResources extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The CalendarResources in this page of results.
    */
  var items: js.UndefOr[js.Array[SchemaCalendarResource]] = js.native
  /**
    * Identifies this as a collection of CalendarResources. This is always
    * admin#directory#resources#calendars#calendarResourcesList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The continuation token, used to page through large result sets. Provide
    * this value in a subsequent request to return the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaCalendarResources {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[SchemaCalendarResource] = null,
    kind: String = null,
    nextPageToken: String = null
  ): SchemaCalendarResources = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCalendarResources]
  }
}

