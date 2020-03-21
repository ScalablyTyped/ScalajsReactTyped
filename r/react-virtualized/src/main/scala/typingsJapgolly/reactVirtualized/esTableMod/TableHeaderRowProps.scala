package typingsJapgolly.reactVirtualized.esTableMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeaderRowProps extends js.Object {
  var className: String
  var columns: js.Array[Node]
  var height: Double
  var scrollbarWidth: Double
  var style: CSSProperties
  var width: Double
}

object TableHeaderRowProps {
  @scala.inline
  def apply(
    className: String,
    columns: js.Array[Node],
    height: Double,
    scrollbarWidth: Double,
    style: CSSProperties,
    width: Double
  ): TableHeaderRowProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], scrollbarWidth = scrollbarWidth.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TableHeaderRowProps]
  }
}

