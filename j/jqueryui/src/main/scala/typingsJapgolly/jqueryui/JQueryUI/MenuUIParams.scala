package typingsJapgolly.jqueryui.JQueryUI

import typingsJapgolly.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuUIParams extends js.Object {
  var item: js.UndefOr[JQuery] = js.undefined
}

object MenuUIParams {
  @scala.inline
  def apply(item: JQuery = null): MenuUIParams = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuUIParams]
  }
}

