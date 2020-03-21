package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shared extends js.Object {
  // The identity of the owner of the shared item. Read-only.
  var owner: js.UndefOr[IdentitySet] = js.undefined
  // Indicates the scope of how the item is shared: anonymous, organization, or users. Read-only.
  var scope: js.UndefOr[String] = js.undefined
  // The identity of the user who shared the item. Read-only.
  var sharedBy: js.UndefOr[IdentitySet] = js.undefined
  // The UTC date and time when the item was shared. Read-only.
  var sharedDateTime: js.UndefOr[String] = js.undefined
}

object Shared {
  @scala.inline
  def apply(
    owner: IdentitySet = null,
    scope: String = null,
    sharedBy: IdentitySet = null,
    sharedDateTime: String = null
  ): Shared = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (sharedBy != null) __obj.updateDynamic("sharedBy")(sharedBy.asInstanceOf[js.Any])
    if (sharedDateTime != null) __obj.updateDynamic("sharedDateTime")(sharedDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shared]
  }
}

