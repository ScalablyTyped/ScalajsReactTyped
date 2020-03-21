package typingsJapgolly.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UiElementsCarouselBrowseItem extends js.Object {
  /**
    * Description of the carousel item.
    * Optional.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Footer text for the carousel item, displayed below the description.
    * Single line of text, truncated with an ellipsis.
    * Optional.
    */
  var footer: js.UndefOr[String] = js.undefined
  /**
    * Hero image for the carousel item.
    * Optional.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /**
    * URL of the document associated with the carousel item.
    * The document can contain HTML content or, if \"url_type_hint\" is set to
    * AMP_CONTENT, AMP content.
    * Required.
    */
  var openUrlAction: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.undefined
  /**
    * Title of the carousel item.
    * Required.
    */
  var title: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2UiElementsCarouselBrowseItem {
  @scala.inline
  def apply(
    description: String = null,
    footer: String = null,
    image: GoogleActionsV2UiElementsImage = null,
    openUrlAction: GoogleActionsV2UiElementsOpenUrlAction = null,
    title: String = null
  ): GoogleActionsV2UiElementsCarouselBrowseItem = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (openUrlAction != null) __obj.updateDynamic("openUrlAction")(openUrlAction.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2UiElementsCarouselBrowseItem]
  }
}

