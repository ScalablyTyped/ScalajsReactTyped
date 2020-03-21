package typingsJapgolly.reactVirtualized

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.Requireable
import typingsJapgolly.react.mod.Validator
import typingsJapgolly.reactVirtualized.esColumnSizerMod.SizedColumnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: Validator[js.Function1[/* props */ SizedColumnProps, Node]]
  var columnCount: Validator[Double]
  var columnMaxWidth: Requireable[Double]
  var columnMinWidth: Requireable[Double]
  var width: Validator[Double]
}

object AnonChildren {
  @scala.inline
  def apply(
    children: Validator[js.Function1[/* props */ SizedColumnProps, Node]],
    columnCount: Validator[Double],
    columnMaxWidth: Requireable[Double],
    columnMinWidth: Requireable[Double],
    width: Validator[Double]
  ): AnonChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnMaxWidth = columnMaxWidth.asInstanceOf[js.Any], columnMinWidth = columnMinWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildren]
  }
}

