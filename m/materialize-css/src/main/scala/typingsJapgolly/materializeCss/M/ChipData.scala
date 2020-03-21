package typingsJapgolly.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChipData extends js.Object {
  /**
    * Chip image
    */
  var img: js.UndefOr[String] = js.undefined
  /**
    * Chip tag
    */
  var tag: String
}

object ChipData {
  @scala.inline
  def apply(tag: String, img: String = null): ChipData = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChipData]
  }
}

