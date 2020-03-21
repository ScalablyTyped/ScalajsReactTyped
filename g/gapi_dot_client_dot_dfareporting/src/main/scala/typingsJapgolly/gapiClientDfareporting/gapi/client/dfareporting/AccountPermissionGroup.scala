package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionGroup extends js.Object {
  /** ID of this account permission group. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountPermissionGroup". */
  var kind: js.UndefOr[String] = js.undefined
  /** Name of this account permission group. */
  var name: js.UndefOr[String] = js.undefined
}

object AccountPermissionGroup {
  @scala.inline
  def apply(id: String = null, kind: String = null, name: String = null): AccountPermissionGroup = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountPermissionGroup]
  }
}

