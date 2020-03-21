package typingsJapgolly.gapiClientPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActor extends js.Object {
  /**
    * If this activity's object is itself another activity, such as when a person reshares an activity, this property specifies the original activity's
    * actor.
    */
  var actor: js.UndefOr[AnonDisplayName] = js.undefined
  /** The media objects attached to this activity. */
  var attachments: js.UndefOr[js.Array[AnonContent]] = js.undefined
  /** The HTML-formatted content, which is suitable for display. */
  var content: js.UndefOr[String] = js.undefined
  /** The ID of the object. When resharing an activity, this is the ID of the activity that is being reshared. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The type of the object. Possible values include, but are not limited to, the following values:
    * - "note" - Textual content.
    * - "activity" - A Google+ activity.
    */
  var objectType: js.UndefOr[String] = js.undefined
  /**
    * The content (text) as provided by the author, which is stored without any HTML formatting. When creating or updating an activity, this value must be
    * supplied as plain text in the request.
    */
  var originalContent: js.UndefOr[String] = js.undefined
  /** People who +1'd this activity. */
  var plusoners: js.UndefOr[AnonSelfLink] = js.undefined
  /** Comments in reply to this activity. */
  var replies: js.UndefOr[AnonSelfLink] = js.undefined
  /** People who reshared this activity. */
  var resharers: js.UndefOr[AnonSelfLink] = js.undefined
  /** The URL that points to the linked resource. */
  var url: js.UndefOr[String] = js.undefined
}

object AnonActor {
  @scala.inline
  def apply(
    actor: AnonDisplayName = null,
    attachments: js.Array[AnonContent] = null,
    content: String = null,
    id: String = null,
    objectType: String = null,
    originalContent: String = null,
    plusoners: AnonSelfLink = null,
    replies: AnonSelfLink = null,
    resharers: AnonSelfLink = null,
    url: String = null
  ): AnonActor = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (originalContent != null) __obj.updateDynamic("originalContent")(originalContent.asInstanceOf[js.Any])
    if (plusoners != null) __obj.updateDynamic("plusoners")(plusoners.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    if (resharers != null) __obj.updateDynamic("resharers")(resharers.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActor]
  }
}

