package typingsJapgolly.dojo.dojox.grid.cells

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/cells/tree.html
  *
  *
  */
trait tree extends js.Object {
  /**
    *
    * @param inItem
    * @param level
    * @param inRowIndexes
    */
  def formatAggregate(inItem: js.Any, level: js.Any, inRowIndexes: js.Any): js.Any
  /**
    *
    * @param inRowIndexes
    * @param inItem
    * @param level
    * @param summaryRow
    * @param toggleClass
    * @param cellClasses
    */
  def formatAtLevel(
    inRowIndexes: js.Any,
    inItem: js.Any,
    level: js.Any,
    summaryRow: js.Any,
    toggleClass: js.Any,
    cellClasses: js.Any
  ): String
  /**
    *
    * @param inRowIndexes
    * @param inItem
    */
  def formatIndexes(inRowIndexes: js.Any, inItem: js.Any): js.Any
  /**
    *
    * @param itemId
    */
  def getOpenState(itemId: js.Any): js.Any
}

object tree {
  @scala.inline
  def apply(
    formatAggregate: (js.Any, js.Any, js.Any) => CallbackTo[js.Any],
    formatAtLevel: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => CallbackTo[String],
    formatIndexes: (js.Any, js.Any) => CallbackTo[js.Any],
    getOpenState: js.Any => CallbackTo[js.Any]
  ): tree = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("formatAggregate")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => formatAggregate(t0, t1, t2).runNow()))
    __obj.updateDynamic("formatAtLevel")(js.Any.fromFunction6((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any, t4: js.Any, t5: js.Any) => formatAtLevel(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("formatIndexes")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => formatIndexes(t0, t1).runNow()))
    __obj.updateDynamic("getOpenState")(js.Any.fromFunction1((t0: js.Any) => getOpenState(t0).runNow()))
    __obj.asInstanceOf[tree]
  }
}

