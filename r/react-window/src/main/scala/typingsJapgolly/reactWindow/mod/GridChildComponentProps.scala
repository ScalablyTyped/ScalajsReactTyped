package typingsJapgolly.reactWindow.mod

import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridChildComponentProps extends js.Object {
  var columnIndex: Double
  var data: js.Any
  var isScrolling: js.UndefOr[Boolean] = js.undefined
  var rowIndex: Double
  var style: CSSProperties
}

object GridChildComponentProps {
  @scala.inline
  def apply(
    columnIndex: Double,
    data: js.Any,
    rowIndex: Double,
    style: CSSProperties,
    isScrolling: js.UndefOr[Boolean] = js.undefined
  ): GridChildComponentProps = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    if (!js.isUndefined(isScrolling)) __obj.updateDynamic("isScrolling")(isScrolling.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridChildComponentProps]
  }
}

