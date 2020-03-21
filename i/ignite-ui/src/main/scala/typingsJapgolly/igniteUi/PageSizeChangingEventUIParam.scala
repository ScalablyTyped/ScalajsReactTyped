package typingsJapgolly.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageSizeChangingEventUIParam extends js.Object {
  /**
  	 * Gets the current page size.
  	 */
  var currentPageSize: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets the new page size.
  	 */
  var newPageSize: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets reference to GridPaging.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object PageSizeChangingEventUIParam {
  @scala.inline
  def apply(currentPageSize: Int | Double = null, newPageSize: Int | Double = null, owner: js.Any = null): PageSizeChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (currentPageSize != null) __obj.updateDynamic("currentPageSize")(currentPageSize.asInstanceOf[js.Any])
    if (newPageSize != null) __obj.updateDynamic("newPageSize")(newPageSize.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSizeChangingEventUIParam]
  }
}

