package typingsJapgolly.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonText extends js.Object {
  /**
    * To set the word count. 5 | 20 | 100 | ...
    */
  var count: js.UndefOr[js.Any] = js.undefined
  /**
    * To set the word. "Flowers" | "Freesia" | "Peony" | ...
    */
  var text: js.UndefOr[String] = js.undefined
}

object AnonText {
  @scala.inline
  def apply(count: js.Any = null, text: String = null): AnonText = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonText]
  }
}

