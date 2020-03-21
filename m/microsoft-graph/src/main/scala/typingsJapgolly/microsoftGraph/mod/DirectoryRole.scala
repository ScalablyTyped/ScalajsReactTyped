package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryRole extends DirectoryObject {
  // The description for the directory role. Read-only.
  var description: js.UndefOr[String] = js.undefined
  // The display name for the directory role. Read-only.
  var displayName: js.UndefOr[String] = js.undefined
  // Users that are members of this directory role. HTTP Methods: GET, POST, DELETE. Read-only. Nullable.
  var members: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  /**
    * The id of the directoryRoleTemplate that this role is based on. The property must be specified when activating a
    * directory role in a tenant with a POST operation. After the directory role has been activated, the property is read
    * only.
    */
  var roleTemplateId: js.UndefOr[String] = js.undefined
}

object DirectoryRole {
  @scala.inline
  def apply(
    deletedDateTime: String = null,
    description: String = null,
    displayName: String = null,
    id: String = null,
    members: js.Array[DirectoryObject] = null,
    roleTemplateId: String = null
  ): DirectoryRole = {
    val __obj = js.Dynamic.literal()
    if (deletedDateTime != null) __obj.updateDynamic("deletedDateTime")(deletedDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    if (roleTemplateId != null) __obj.updateDynamic("roleTemplateId")(roleTemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryRole]
  }
}

