package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import typingsJapgolly.gapiClientAnalytics.AnonAccountRef
import typingsJapgolly.gapiClientAnalytics.AnonLocal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityUserLink extends js.Object {
  /** Entity for this link. It can be an account, a web property, or a view (profile). */
  var entity: js.UndefOr[AnonAccountRef] = js.undefined
  /** Entity user link ID */
  var id: js.UndefOr[String] = js.undefined
  /** Resource type for entity user link. */
  var kind: js.UndefOr[String] = js.undefined
  /** Permissions the user has for this entity. */
  var permissions: js.UndefOr[AnonLocal] = js.undefined
  /** Self link for this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** User reference. */
  var userRef: js.UndefOr[UserRef] = js.undefined
}

object EntityUserLink {
  @scala.inline
  def apply(
    entity: AnonAccountRef = null,
    id: String = null,
    kind: String = null,
    permissions: AnonLocal = null,
    selfLink: String = null,
    userRef: UserRef = null
  ): EntityUserLink = {
    val __obj = js.Dynamic.literal()
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (userRef != null) __obj.updateDynamic("userRef")(userRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityUserLink]
  }
}

