package typingsJapgolly.intercomClient

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.intercomClient.intercomClientStrings.visitor
import typingsJapgolly.intercomClient.tagMod.Tag
import typingsJapgolly.intercomClient.userMod.Avatar
import typingsJapgolly.intercomClient.userMod.LocationData
import typingsJapgolly.intercomClient.userMod.Segment
import typingsJapgolly.intercomClient.userMod.SocialProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<intercom-client.intercom-client/Visitor.Visitor> */
trait PartialVisitor extends js.Object {
  var avatar: js.UndefOr[Avatar] = js.undefined
  var created_at: js.UndefOr[Double] = js.undefined
  var custom_attributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var last_request_at: js.UndefOr[Double] = js.undefined
  var location_data: js.UndefOr[LocationData | js.Object] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var segments: js.UndefOr[js.Array[Segment]] = js.undefined
  var social_profiles: js.UndefOr[js.Array[SocialProfile]] = js.undefined
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
  var `type`: js.UndefOr[visitor] = js.undefined
  var unsubscribed_from_emails: js.UndefOr[Boolean] = js.undefined
  var updated_at: js.UndefOr[Double] = js.undefined
  var user_id: js.UndefOr[String] = js.undefined
}

object PartialVisitor {
  @scala.inline
  def apply(
    avatar: Avatar = null,
    created_at: Int | Double = null,
    custom_attributes: StringDictionary[js.Any] = null,
    id: String = null,
    last_request_at: Int | Double = null,
    location_data: LocationData | js.Object = null,
    name: String = null,
    segments: js.Array[Segment] = null,
    social_profiles: js.Array[SocialProfile] = null,
    tags: js.Array[Tag] = null,
    `type`: visitor = null,
    unsubscribed_from_emails: js.UndefOr[Boolean] = js.undefined,
    updated_at: Int | Double = null,
    user_id: String = null
  ): PartialVisitor = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (custom_attributes != null) __obj.updateDynamic("custom_attributes")(custom_attributes.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (last_request_at != null) __obj.updateDynamic("last_request_at")(last_request_at.asInstanceOf[js.Any])
    if (location_data != null) __obj.updateDynamic("location_data")(location_data.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (social_profiles != null) __obj.updateDynamic("social_profiles")(social_profiles.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(unsubscribed_from_emails)) __obj.updateDynamic("unsubscribed_from_emails")(unsubscribed_from_emails.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialVisitor]
  }
}

