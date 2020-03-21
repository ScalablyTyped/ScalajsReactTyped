package typingsJapgolly.downshift.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait A11yStatusMessageOptions[Item] extends js.Object {
  var highlightedIndex: Double | Null
  var highlightedItem: Item
  var inputValue: String
  var isOpen: Boolean
  var previousResultCount: Double
  var resultCount: Double
  var selectedItem: Item
  def itemToString(item: Item): String
}

object A11yStatusMessageOptions {
  @scala.inline
  def apply[Item](
    highlightedItem: Item,
    inputValue: String,
    isOpen: Boolean,
    itemToString: Item => CallbackTo[String],
    previousResultCount: Double,
    resultCount: Double,
    selectedItem: Item,
    highlightedIndex: Int | Double = null
  ): A11yStatusMessageOptions[Item] = {
    val __obj = js.Dynamic.literal(highlightedItem = highlightedItem.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], previousResultCount = previousResultCount.asInstanceOf[js.Any], resultCount = resultCount.asInstanceOf[js.Any], selectedItem = selectedItem.asInstanceOf[js.Any])
    __obj.updateDynamic("itemToString")(js.Any.fromFunction1((t0: Item) => itemToString(t0).runNow()))
    if (highlightedIndex != null) __obj.updateDynamic("highlightedIndex")(highlightedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[A11yStatusMessageOptions[Item]]
  }
}

