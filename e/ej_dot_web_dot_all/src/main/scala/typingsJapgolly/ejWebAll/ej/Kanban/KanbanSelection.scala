package typingsJapgolly.ejWebAll.ej.Kanban

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KanbanSelection extends js.Object {
  /** It is used to clear all the card selection.
    * @returns {void}
    */
  def clear(): Unit
}

object KanbanSelection {
  @scala.inline
  def apply(clear: Callback): KanbanSelection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.asInstanceOf[KanbanSelection]
  }
}

