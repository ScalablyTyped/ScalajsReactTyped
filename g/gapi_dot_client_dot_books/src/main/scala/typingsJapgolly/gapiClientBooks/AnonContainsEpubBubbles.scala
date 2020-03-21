package typingsJapgolly.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainsEpubBubbles extends js.Object {
  var containsEpubBubbles: js.UndefOr[Boolean] = js.undefined
  var containsImageBubbles: js.UndefOr[Boolean] = js.undefined
  var epubBubbleVersion: js.UndefOr[String] = js.undefined
  var imageBubbleVersion: js.UndefOr[String] = js.undefined
}

object AnonContainsEpubBubbles {
  @scala.inline
  def apply(
    containsEpubBubbles: js.UndefOr[Boolean] = js.undefined,
    containsImageBubbles: js.UndefOr[Boolean] = js.undefined,
    epubBubbleVersion: String = null,
    imageBubbleVersion: String = null
  ): AnonContainsEpubBubbles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(containsEpubBubbles)) __obj.updateDynamic("containsEpubBubbles")(containsEpubBubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(containsImageBubbles)) __obj.updateDynamic("containsImageBubbles")(containsImageBubbles.asInstanceOf[js.Any])
    if (epubBubbleVersion != null) __obj.updateDynamic("epubBubbleVersion")(epubBubbleVersion.asInstanceOf[js.Any])
    if (imageBubbleVersion != null) __obj.updateDynamic("imageBubbleVersion")(imageBubbleVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainsEpubBubbles]
  }
}

