package typingsJapgolly.reactNativeSortableGrid.mod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderedItem extends js.Object {
  var key: String
  var order: Double
  var ref: Element | Null
}

object OrderedItem {
  @scala.inline
  def apply(key: String, order: Double, ref: VdomElement = null): OrderedItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderedItem]
  }
}

