package typingsJapgolly.ejWebAll.ej.Kanban

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KanbanSwimlane extends js.Object {
  /** Collapse all the swimlane rows in Kanban.
    * @returns {void}
    */
  def collapseAll(): Unit
  /** Expand all the swimlane rows in Kanban.
    * @returns {void}
    */
  def expandAll(): Unit
  /** Expand or collapse the swimlane row based on the state of target &quot;div&quot;
    * @param {any} Pass the div object to toggleSwimlane row based on its row state
    * @returns {void}
    */
  def toggle($div: js.Any): Unit
}

object KanbanSwimlane {
  @scala.inline
  def apply(collapseAll: Callback, expandAll: Callback, toggle: js.Any => Callback): KanbanSwimlane = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collapseAll")(collapseAll.toJsFn)
    __obj.updateDynamic("expandAll")(expandAll.toJsFn)
    __obj.updateDynamic("toggle")(js.Any.fromFunction1((t0: js.Any) => toggle(t0).runNow()))
    __obj.asInstanceOf[KanbanSwimlane]
  }
}

