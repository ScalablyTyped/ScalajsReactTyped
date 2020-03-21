package typingsJapgolly.reactBootstrap.paginationItemMod

import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationItemProps
  extends AllHTMLAttributes[PaginationItem]
     with ClassAttributes[PaginationItem] {
  var active: js.UndefOr[Boolean] = js.undefined
}

object PaginationItemProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[PaginationItem] = null,
    ClassAttributes: ClassAttributes[PaginationItem] = null,
    active: js.UndefOr[Boolean] = js.undefined
  ): PaginationItemProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationItemProps]
  }
}

