package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileSummary extends js.Object {
  /** View (profile) ID. */
  var id: js.UndefOr[String] = js.undefined
  /** Resource type for Analytics ProfileSummary. */
  var kind: js.UndefOr[String] = js.undefined
  /** View (profile) name. */
  var name: js.UndefOr[String] = js.undefined
  /** Indicates whether this view (profile) is starred or not. */
  var starred: js.UndefOr[Boolean] = js.undefined
  /** View (Profile) type. Supported types: WEB or APP. */
  var `type`: js.UndefOr[String] = js.undefined
}

object ProfileSummary {
  @scala.inline
  def apply(
    id: String = null,
    kind: String = null,
    name: String = null,
    starred: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): ProfileSummary = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileSummary]
  }
}

