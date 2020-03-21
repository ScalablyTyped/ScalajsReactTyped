package typingsJapgolly.reactBootstrap.paginationEllipsisMod

import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationEllipsisProps
  extends AllHTMLAttributes[PaginationEllipsis]
     with ClassAttributes[PaginationEllipsis]

object PaginationEllipsisProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[PaginationEllipsis] = null,
    ClassAttributes: ClassAttributes[PaginationEllipsis] = null
  ): PaginationEllipsisProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    __obj.asInstanceOf[PaginationEllipsisProps]
  }
}

