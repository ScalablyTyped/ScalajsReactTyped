package typingsJapgolly.downshift.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseSelectA11yMessageOptions[Item] extends js.Object {
  var isOpen: Boolean
  var items: js.Array[Item]
  var selectedItem: Item
  def itemToString(item: Item): String
}

object UseSelectA11yMessageOptions {
  @scala.inline
  def apply[Item](
    isOpen: Boolean,
    itemToString: Item => CallbackTo[String],
    items: js.Array[Item],
    selectedItem: Item
  ): UseSelectA11yMessageOptions[Item] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], selectedItem = selectedItem.asInstanceOf[js.Any])
    __obj.updateDynamic("itemToString")(js.Any.fromFunction1((t0: Item) => itemToString(t0).runNow()))
    __obj.asInstanceOf[UseSelectA11yMessageOptions[Item]]
  }
}

