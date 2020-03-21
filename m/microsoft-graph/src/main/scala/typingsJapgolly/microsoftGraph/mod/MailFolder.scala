package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailFolder extends Entity {
  // The number of immediate child mailFolders in the current mailFolder.
  var childFolderCount: js.UndefOr[Double] = js.undefined
  // The collection of child folders in the mailFolder.
  var childFolders: js.UndefOr[js.Array[MailFolder]] = js.undefined
  // The mailFolder's display name.
  var displayName: js.UndefOr[String] = js.undefined
  // The collection of rules that apply to the user's Inbox folder.
  var messageRules: js.UndefOr[js.Array[MessageRule]] = js.undefined
  // The collection of messages in the mailFolder.
  var messages: js.UndefOr[js.Array[Message]] = js.undefined
  // The collection of multi-value extended properties defined for the mailFolder. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.undefined
  // The unique identifier for the mailFolder's parent mailFolder.
  var parentFolderId: js.UndefOr[String] = js.undefined
  // The collection of single-value extended properties defined for the mailFolder. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.undefined
  // The number of items in the mailFolder.
  var totalItemCount: js.UndefOr[Double] = js.undefined
  // The number of items in the mailFolder marked as unread.
  var unreadItemCount: js.UndefOr[Double] = js.undefined
}

object MailFolder {
  @scala.inline
  def apply(
    childFolderCount: Int | Double = null,
    childFolders: js.Array[MailFolder] = null,
    displayName: String = null,
    id: String = null,
    messageRules: js.Array[MessageRule] = null,
    messages: js.Array[Message] = null,
    multiValueExtendedProperties: js.Array[MultiValueLegacyExtendedProperty] = null,
    parentFolderId: String = null,
    singleValueExtendedProperties: js.Array[SingleValueLegacyExtendedProperty] = null,
    totalItemCount: Int | Double = null,
    unreadItemCount: Int | Double = null
  ): MailFolder = {
    val __obj = js.Dynamic.literal()
    if (childFolderCount != null) __obj.updateDynamic("childFolderCount")(childFolderCount.asInstanceOf[js.Any])
    if (childFolders != null) __obj.updateDynamic("childFolders")(childFolders.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (messageRules != null) __obj.updateDynamic("messageRules")(messageRules.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (multiValueExtendedProperties != null) __obj.updateDynamic("multiValueExtendedProperties")(multiValueExtendedProperties.asInstanceOf[js.Any])
    if (parentFolderId != null) __obj.updateDynamic("parentFolderId")(parentFolderId.asInstanceOf[js.Any])
    if (singleValueExtendedProperties != null) __obj.updateDynamic("singleValueExtendedProperties")(singleValueExtendedProperties.asInstanceOf[js.Any])
    if (totalItemCount != null) __obj.updateDynamic("totalItemCount")(totalItemCount.asInstanceOf[js.Any])
    if (unreadItemCount != null) __obj.updateDynamic("unreadItemCount")(unreadItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailFolder]
  }
}

