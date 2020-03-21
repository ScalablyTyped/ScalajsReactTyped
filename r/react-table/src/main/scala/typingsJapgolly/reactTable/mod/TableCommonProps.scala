package typingsJapgolly.reactTable.mod

import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCommonProps extends js.Object {
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TableCommonProps {
  @scala.inline
  def apply(style: CSSProperties = null): TableCommonProps = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCommonProps]
  }
}

