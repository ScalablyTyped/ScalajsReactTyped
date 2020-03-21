package typingsJapgolly.antd.rowMod

import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.undefined
  var children: js.Array[Element]
  var colon: Boolean
  var index: Double
  var prefixCls: String
  var vertical: Boolean
}

object RowProps {
  @scala.inline
  def apply(
    children: js.Array[Element],
    colon: Boolean,
    index: Double,
    prefixCls: String,
    vertical: Boolean,
    bordered: js.UndefOr[Boolean] = js.undefined
  ): RowProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], colon = colon.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps]
  }
}

