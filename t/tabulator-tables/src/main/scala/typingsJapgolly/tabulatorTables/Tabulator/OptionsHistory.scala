package typingsJapgolly.tabulatorTables.Tabulator

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsHistory extends js.Object {
  /** Enable user interaction history functionality	 */
  var history: js.UndefOr[Boolean] = js.undefined
  /** The historyRedo event is triggered when the redo action is triggered. */
  var historyRedo: js.UndefOr[
    js.Function3[
      /* action */ HistoryAction, 
      /* component */ CellComponent | RowComponent, 
      /* data */ js.Any, 
      Unit
    ]
  ] = js.undefined
  /** The historyUndo event is triggered when the undo action is triggered. */
  var historyUndo: js.UndefOr[
    js.Function3[
      /* action */ HistoryAction, 
      /* component */ CellComponent | RowComponent, 
      /* data */ js.Any, 
      Unit
    ]
  ] = js.undefined
}

object OptionsHistory {
  @scala.inline
  def apply(
    history: js.UndefOr[Boolean] = js.undefined,
    historyRedo: (/* action */ HistoryAction, /* component */ CellComponent | RowComponent, /* data */ js.Any) => Callback = null,
    historyUndo: (/* action */ HistoryAction, /* component */ CellComponent | RowComponent, /* data */ js.Any) => Callback = null
  ): OptionsHistory = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (historyRedo != null) __obj.updateDynamic("historyRedo")(js.Any.fromFunction3((t0: /* action */ typingsJapgolly.tabulatorTables.Tabulator.HistoryAction, t1: /* component */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent | typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t2: /* data */ js.Any) => historyRedo(t0, t1, t2).runNow()))
    if (historyUndo != null) __obj.updateDynamic("historyUndo")(js.Any.fromFunction3((t0: /* action */ typingsJapgolly.tabulatorTables.Tabulator.HistoryAction, t1: /* component */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent | typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t2: /* data */ js.Any) => historyUndo(t0, t1, t2).runNow()))
    __obj.asInstanceOf[OptionsHistory]
  }
}

