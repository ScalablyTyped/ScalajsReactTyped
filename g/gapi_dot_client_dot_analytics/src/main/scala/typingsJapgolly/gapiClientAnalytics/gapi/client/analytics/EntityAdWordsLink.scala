package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import typingsJapgolly.gapiClientAnalytics.AnonWebPropertyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityAdWordsLink extends js.Object {
  /** A list of AdWords client accounts. These cannot be MCC accounts. This field is required when creating an AdWords link. It cannot be empty. */
  var adWordsAccounts: js.UndefOr[js.Array[AdWordsAccount]] = js.undefined
  /** Web property being linked. */
  var entity: js.UndefOr[AnonWebPropertyRef] = js.undefined
  /** Entity AdWords link ID */
  var id: js.UndefOr[String] = js.undefined
  /** Resource type for entity AdWords link. */
  var kind: js.UndefOr[String] = js.undefined
  /** Name of the link. This field is required when creating an AdWords link. */
  var name: js.UndefOr[String] = js.undefined
  /** IDs of linked Views (Profiles) represented as strings. */
  var profileIds: js.UndefOr[js.Array[String]] = js.undefined
  /** URL link for this Google Analytics - Google AdWords link. */
  var selfLink: js.UndefOr[String] = js.undefined
}

object EntityAdWordsLink {
  @scala.inline
  def apply(
    adWordsAccounts: js.Array[AdWordsAccount] = null,
    entity: AnonWebPropertyRef = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    profileIds: js.Array[String] = null,
    selfLink: String = null
  ): EntityAdWordsLink = {
    val __obj = js.Dynamic.literal()
    if (adWordsAccounts != null) __obj.updateDynamic("adWordsAccounts")(adWordsAccounts.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (profileIds != null) __obj.updateDynamic("profileIds")(profileIds.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityAdWordsLink]
  }
}

