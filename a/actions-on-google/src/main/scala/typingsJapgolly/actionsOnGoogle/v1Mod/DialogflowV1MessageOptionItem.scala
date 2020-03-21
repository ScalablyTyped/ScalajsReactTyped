package typingsJapgolly.actionsOnGoogle.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1MessageOptionItem extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[DialogflowV1MessageImage] = js.undefined
  var optionInfo: js.UndefOr[DialogflowV1MessageOptionInfo] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object DialogflowV1MessageOptionItem {
  @scala.inline
  def apply(
    description: String = null,
    image: DialogflowV1MessageImage = null,
    optionInfo: DialogflowV1MessageOptionInfo = null,
    title: String = null
  ): DialogflowV1MessageOptionItem = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (optionInfo != null) __obj.updateDynamic("optionInfo")(optionInfo.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageOptionItem]
  }
}

