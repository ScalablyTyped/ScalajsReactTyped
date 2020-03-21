package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySiteContactsListResponse extends js.Object {
  /** Directory site contact collection */
  var directorySiteContacts: js.UndefOr[js.Array[DirectorySiteContact]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#directorySiteContactsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object DirectorySiteContactsListResponse {
  @scala.inline
  def apply(
    directorySiteContacts: js.Array[DirectorySiteContact] = null,
    kind: String = null,
    nextPageToken: String = null
  ): DirectorySiteContactsListResponse = {
    val __obj = js.Dynamic.literal()
    if (directorySiteContacts != null) __obj.updateDynamic("directorySiteContacts")(directorySiteContacts.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectorySiteContactsListResponse]
  }
}

