package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect.IItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CarouselSelect. */
trait ICarouselSelect extends js.Object {
  /** CarouselSelect items */
  var items: js.UndefOr[js.Array[IItem] | Null] = js.undefined
}

object ICarouselSelect {
  @scala.inline
  def apply(items: js.Array[IItem] = null): ICarouselSelect = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICarouselSelect]
  }
}

