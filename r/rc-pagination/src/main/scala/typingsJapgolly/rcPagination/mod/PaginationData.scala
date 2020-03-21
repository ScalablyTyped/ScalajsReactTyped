package typingsJapgolly.rcPagination.mod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationData extends js.Object {
  var className: String
  var current: Double
  var defaultCurrent: Double
  var defaultPageSize: Double
  var hideOnSinglePage: Boolean
  var jumpNextIcon: ComponentType[js.Object] | Node
  var jumpPrevIcon: ComponentType[js.Object] | Node
  var locale: js.Object
  var nextIcon: ComponentType[js.Object] | Node
  var pageSize: Double
  var pageSizeOptions: js.Array[String]
  var prefixCls: String
  var prevIcon: ComponentType[js.Object] | Node
  var selectComponentClass: ComponentType[js.Object]
  var selectPrefixCls: String
  var showLessItems: Boolean
  var showPrevNextJumpers: Boolean
  var showQuickJumper: Boolean | js.Object
  var showSizeChanger: Boolean
  var showTitle: Boolean
  var style: CSSProperties
  var total: Double
}

object PaginationData {
  @scala.inline
  def apply(
    className: String,
    current: Double,
    defaultCurrent: Double,
    defaultPageSize: Double,
    hideOnSinglePage: Boolean,
    locale: js.Object,
    pageSize: Double,
    pageSizeOptions: js.Array[String],
    prefixCls: String,
    selectComponentClass: ComponentType[js.Object],
    selectPrefixCls: String,
    showLessItems: Boolean,
    showPrevNextJumpers: Boolean,
    showQuickJumper: Boolean | js.Object,
    showSizeChanger: Boolean,
    showTitle: Boolean,
    style: CSSProperties,
    total: Double,
    jumpNextIcon: ComponentType[js.Object] | Node = null,
    jumpPrevIcon: ComponentType[js.Object] | Node = null,
    nextIcon: ComponentType[js.Object] | Node = null,
    prevIcon: ComponentType[js.Object] | Node = null
  ): PaginationData = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], defaultCurrent = defaultCurrent.asInstanceOf[js.Any], defaultPageSize = defaultPageSize.asInstanceOf[js.Any], hideOnSinglePage = hideOnSinglePage.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pageSizeOptions = pageSizeOptions.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectComponentClass = selectComponentClass.asInstanceOf[js.Any], selectPrefixCls = selectPrefixCls.asInstanceOf[js.Any], showLessItems = showLessItems.asInstanceOf[js.Any], showPrevNextJumpers = showPrevNextJumpers.asInstanceOf[js.Any], showQuickJumper = showQuickJumper.asInstanceOf[js.Any], showSizeChanger = showSizeChanger.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (jumpNextIcon != null) __obj.updateDynamic("jumpNextIcon")(jumpNextIcon.asInstanceOf[js.Any])
    if (jumpPrevIcon != null) __obj.updateDynamic("jumpPrevIcon")(jumpPrevIcon.asInstanceOf[js.Any])
    if (nextIcon != null) __obj.updateDynamic("nextIcon")(nextIcon.asInstanceOf[js.Any])
    if (prevIcon != null) __obj.updateDynamic("prevIcon")(prevIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationData]
  }
}

