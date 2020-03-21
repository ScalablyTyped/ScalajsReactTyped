package typingsJapgolly.alexaSdk.mod.templateBuilders

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.alexaSdk.mod.ListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetListItems[T /* <: TemplateBuilder[T] */] extends js.Object {
  def setListItems(listItems: js.Array[ListItem]): T
}

object SetListItems {
  @scala.inline
  def apply[T /* <: TemplateBuilder[T] */](setListItems: js.Array[ListItem] => CallbackTo[T]): SetListItems[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setListItems")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.alexaSdk.mod.ListItem]) => setListItems(t0).runNow()))
    __obj.asInstanceOf[SetListItems[T]]
  }
}

