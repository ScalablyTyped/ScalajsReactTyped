package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.CardOrientation
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.ThumbnailImageAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RbmStandaloneCard. */
trait IRbmStandaloneCard extends js.Object {
  /** RbmStandaloneCard cardContent */
  var cardContent: js.UndefOr[IRbmCardContent | Null] = js.undefined
  /** RbmStandaloneCard cardOrientation */
  var cardOrientation: js.UndefOr[CardOrientation | Null] = js.undefined
  /** RbmStandaloneCard thumbnailImageAlignment */
  var thumbnailImageAlignment: js.UndefOr[ThumbnailImageAlignment | Null] = js.undefined
}

object IRbmStandaloneCard {
  @scala.inline
  def apply(
    cardContent: IRbmCardContent = null,
    cardOrientation: CardOrientation = null,
    thumbnailImageAlignment: ThumbnailImageAlignment = null
  ): IRbmStandaloneCard = {
    val __obj = js.Dynamic.literal()
    if (cardContent != null) __obj.updateDynamic("cardContent")(cardContent.asInstanceOf[js.Any])
    if (cardOrientation != null) __obj.updateDynamic("cardOrientation")(cardOrientation.asInstanceOf[js.Any])
    if (thumbnailImageAlignment != null) __obj.updateDynamic("thumbnailImageAlignment")(thumbnailImageAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRbmStandaloneCard]
  }
}

