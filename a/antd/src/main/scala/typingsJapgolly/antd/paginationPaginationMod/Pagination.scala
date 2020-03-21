package typingsJapgolly.antd.paginationPaginationMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.AnonJumpNextIcon
import typingsJapgolly.antd.antdStrings.ltr
import typingsJapgolly.antd.antdStrings.rtl
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pagination
  extends Component[PaginationProps, js.Object, js.Any] {
  def getIconsProps(prefixCls: String): AnonJumpNextIcon = js.native
  @JSName("getIconsProps")
  def getIconsProps_ltr(prefixCls: String, direction: ltr): AnonJumpNextIcon = js.native
  @JSName("getIconsProps")
  def getIconsProps_rtl(prefixCls: String, direction: rtl): AnonJumpNextIcon = js.native
  def renderPagination(contextLocale: js.Any): Element = js.native
}

