package typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineObject extends js.Object {
  var inlineObjectProperties: js.UndefOr[InlineObjectProperties] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  var suggestedInlineObjectPropertiesChanges: js.UndefOr[js.Object] = js.undefined
  var suggestedInsertionId: js.UndefOr[String] = js.undefined
}

object InlineObject {
  @scala.inline
  def apply(
    inlineObjectProperties: InlineObjectProperties = null,
    objectId: String = null,
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInlineObjectPropertiesChanges: js.Object = null,
    suggestedInsertionId: String = null
  ): InlineObject = {
    val __obj = js.Dynamic.literal()
    if (inlineObjectProperties != null) __obj.updateDynamic("inlineObjectProperties")(inlineObjectProperties.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds.asInstanceOf[js.Any])
    if (suggestedInlineObjectPropertiesChanges != null) __obj.updateDynamic("suggestedInlineObjectPropertiesChanges")(suggestedInlineObjectPropertiesChanges.asInstanceOf[js.Any])
    if (suggestedInsertionId != null) __obj.updateDynamic("suggestedInsertionId")(suggestedInsertionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineObject]
  }
}

