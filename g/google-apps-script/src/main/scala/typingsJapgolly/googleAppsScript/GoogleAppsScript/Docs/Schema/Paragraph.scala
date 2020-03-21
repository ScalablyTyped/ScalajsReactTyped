package typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paragraph extends js.Object {
  var bullet: js.UndefOr[Bullet] = js.undefined
  var elements: js.UndefOr[js.Array[ParagraphElement]] = js.undefined
  var paragraphStyle: js.UndefOr[ParagraphStyle] = js.undefined
  var positionedObjectIds: js.UndefOr[js.Array[String]] = js.undefined
  var suggestedBulletChanges: js.UndefOr[js.Object] = js.undefined
  var suggestedParagraphStyleChanges: js.UndefOr[js.Object] = js.undefined
  var suggestedPositionedObjectIds: js.UndefOr[js.Object] = js.undefined
}

object Paragraph {
  @scala.inline
  def apply(
    bullet: Bullet = null,
    elements: js.Array[ParagraphElement] = null,
    paragraphStyle: ParagraphStyle = null,
    positionedObjectIds: js.Array[String] = null,
    suggestedBulletChanges: js.Object = null,
    suggestedParagraphStyleChanges: js.Object = null,
    suggestedPositionedObjectIds: js.Object = null
  ): Paragraph = {
    val __obj = js.Dynamic.literal()
    if (bullet != null) __obj.updateDynamic("bullet")(bullet.asInstanceOf[js.Any])
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    if (paragraphStyle != null) __obj.updateDynamic("paragraphStyle")(paragraphStyle.asInstanceOf[js.Any])
    if (positionedObjectIds != null) __obj.updateDynamic("positionedObjectIds")(positionedObjectIds.asInstanceOf[js.Any])
    if (suggestedBulletChanges != null) __obj.updateDynamic("suggestedBulletChanges")(suggestedBulletChanges.asInstanceOf[js.Any])
    if (suggestedParagraphStyleChanges != null) __obj.updateDynamic("suggestedParagraphStyleChanges")(suggestedParagraphStyleChanges.asInstanceOf[js.Any])
    if (suggestedPositionedObjectIds != null) __obj.updateDynamic("suggestedPositionedObjectIds")(suggestedPositionedObjectIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paragraph]
  }
}

