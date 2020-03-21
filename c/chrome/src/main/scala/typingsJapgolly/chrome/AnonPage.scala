package typingsJapgolly.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPage extends js.Object {
  var page: js.UndefOr[String] = js.undefined
  var persistent: js.UndefOr[Boolean] = js.undefined
  var scripts: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonPage {
  @scala.inline
  def apply(
    page: String = null,
    persistent: js.UndefOr[Boolean] = js.undefined,
    scripts: js.Array[String] = null
  ): AnonPage = {
    val __obj = js.Dynamic.literal()
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPage]
  }
}

