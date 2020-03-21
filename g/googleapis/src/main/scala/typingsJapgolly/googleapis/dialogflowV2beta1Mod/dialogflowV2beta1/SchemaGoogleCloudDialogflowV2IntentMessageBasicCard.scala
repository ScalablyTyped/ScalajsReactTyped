package typingsJapgolly.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The basic card message. Useful for displaying information.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageBasicCard extends js.Object {
  /**
    * Optional. The collection of card buttons.
    */
  var buttons: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButton]] = js.native
  /**
    * Required, unless image is present. The body text of the card.
    */
  var formattedText: js.UndefOr[String] = js.native
  /**
    * Optional. The image for the card.
    */
  var image: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageImage] = js.native
  /**
    * Optional. The subtitle of the card.
    */
  var subtitle: js.UndefOr[String] = js.native
  /**
    * Optional. The title of the card.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentMessageBasicCard {
  @scala.inline
  def apply(
    buttons: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButton] = null,
    formattedText: String = null,
    image: SchemaGoogleCloudDialogflowV2IntentMessageImage = null,
    subtitle: String = null,
    title: String = null
  ): SchemaGoogleCloudDialogflowV2IntentMessageBasicCard = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (formattedText != null) __obj.updateDynamic("formattedText")(formattedText.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageBasicCard]
  }
}

