package typingsJapgolly.reactToolbox.cardCardTitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardTitleTheme extends js.Object {
  /**
    * Class used for the root element.
    */
  var cardTitle: js.UndefOr[String] = js.undefined
  /**
    * Added to the root element when the card has no avatar.
    */
  var large: js.UndefOr[String] = js.undefined
  /**
    * Added to the root element when the card has avatar.
    */
  var small: js.UndefOr[String] = js.undefined
  /**
    * Added to the subtitle element.
    */
  var subtitle: js.UndefOr[String] = js.undefined
  /**
    * Added to the title element.
    */
  var title: js.UndefOr[String] = js.undefined
}

object CardTitleTheme {
  @scala.inline
  def apply(
    cardTitle: String = null,
    large: String = null,
    small: String = null,
    subtitle: String = null,
    title: String = null
  ): CardTitleTheme = {
    val __obj = js.Dynamic.literal()
    if (cardTitle != null) __obj.updateDynamic("cardTitle")(cardTitle.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardTitleTheme]
  }
}

