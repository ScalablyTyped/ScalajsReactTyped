package typingsJapgolly.jqueryBlockui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  /** block user activity for the page */
  var blockUI: js.UndefOr[JQBlockUIStatic] = js.undefined
  /** unblock the page */
  var unblockUI: js.UndefOr[JQBlockUIStatic] = js.undefined
}

object JQueryStatic {
  @scala.inline
  def apply(blockUI: JQBlockUIStatic = null, unblockUI: JQBlockUIStatic = null): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    if (blockUI != null) __obj.updateDynamic("blockUI")(blockUI.asInstanceOf[js.Any])
    if (unblockUI != null) __obj.updateDynamic("unblockUI")(unblockUI.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
}

