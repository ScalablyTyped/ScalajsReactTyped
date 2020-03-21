package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactBootstrapTable.AnonColIndex
import typingsJapgolly.reactBootstrapTable.reactBootstrapTableNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellEdit[TRow /* <: js.Object */] extends js.Object {
  /**
  	 * Accept a custom callback function, after cell saving, this function will be called.
  	 * This callback function takes three arguments: row, cellName and cellValue
  	 *   `row`: the row data that was saved.
  	 *   `cellName`: the column dataField cell name that has been modified.
  	 *   `cellValue`: the new cell value.
  	 *   `props`: an object containing the current cell's rowIndex and colIndex values.
  	 */
  var afterSaveCell: js.UndefOr[
    js.Function4[
      /* row */ TRow, 
      /* cellName */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cellValue */ js.Any, 
      /* props */ AnonColIndex, 
      Unit
    ]
  ] = js.undefined
  /**
  	 * Accept a custom callback function, before cell saving, this function will be called.
  	 * This callback function takes four arguments: row, cellName, cellValue and done.
  	 *   `row`: the row data to be saved.
  	 *   `cellName`: the column dataField cell name that has been modified.
  	 *   `cellValue`: the new cell value.
  	 *   `done`: a callback function to use if this is an async operation, to indicate if the save data is valid.
  	 *   `props`: an object containing the current cell's rowIndex and colIndex values.
  	 * If your validation is async, for example: you want to pop a confirm dialog for user to confim in this case,
  	 * react-bootstrap-table pass a callback function to you. You are supposed to call this callback function with a
  	 * bool value to perfom if it is valid or not in addition, you should return 1 from the main function to tell
  	 * react-bootstrap-table that this is a async operation.
  	 */
  var beforeSaveCell: js.UndefOr[
    js.Function5[
      /* row */ TRow, 
      /* cellName */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cellValue */ js.Any, 
      /* done */ js.Function1[/* isValid */ Boolean, Unit], 
      /* props */ AnonColIndex, 
      Boolean | `1`
    ]
  ] = js.undefined
  /**
  	 * Enabling blurToEscape will result in a cell edit being cancelled when the user clicks outside the table during
  	 * editing.
  	 * Default is false.
  	 */
  var blurToEscape: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Enabling blurToSave will trigger a saving event on the cell when the input field becomes deselected. Default is false.
  	 * In the default condition, you need to press ENTER to save the cell.
  	 */
  var blurToSave: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Spectify which condition will trigger cell editing.(click or dbclick). Required.
  	 */
  var mode: CellEditClickMode
  /**
  	 * nonEditableRows tell react-bootstrap-table which rows should not be edited on all of the columns. Briefly, its a row level limitation
  	 * Please assign a callback function, and this function is supposed to be return an array of row keys.
  	 */
  var nonEditableRows: js.UndefOr[js.Function0[js.Array[Double | String]]] = js.undefined
}

object CellEdit {
  @scala.inline
  def apply[TRow /* <: js.Object */](
    mode: CellEditClickMode,
    afterSaveCell: (/* row */ TRow, /* cellName */ String, /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cellValue */ js.Any, /* props */ AnonColIndex) => Callback = null,
    beforeSaveCell: (/* row */ TRow, /* cellName */ String, /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cellValue */ js.Any, /* done */ js.Function1[/* isValid */ Boolean, Unit], /* props */ AnonColIndex) => CallbackTo[Boolean | `1`] = null,
    blurToEscape: js.UndefOr[Boolean] = js.undefined,
    blurToSave: js.UndefOr[Boolean] = js.undefined,
    nonEditableRows: js.UndefOr[CallbackTo[js.Array[Double | String]]] = js.undefined
  ): CellEdit[TRow] = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (afterSaveCell != null) __obj.updateDynamic("afterSaveCell")(js.Any.fromFunction4((t0: /* row */ TRow, t1: /* cellName */ java.lang.String, t2: /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cellValue */ js.Any, t3: /* props */ typingsJapgolly.reactBootstrapTable.AnonColIndex) => afterSaveCell(t0, t1, t2, t3).runNow()))
    if (beforeSaveCell != null) __obj.updateDynamic("beforeSaveCell")(js.Any.fromFunction5((t0: /* row */ TRow, t1: /* cellName */ java.lang.String, t2: /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cellValue */ js.Any, t3: /* done */ js.Function1[/* isValid */ scala.Boolean, scala.Unit], t4: /* props */ typingsJapgolly.reactBootstrapTable.AnonColIndex) => beforeSaveCell(t0, t1, t2, t3, t4).runNow()))
    if (!js.isUndefined(blurToEscape)) __obj.updateDynamic("blurToEscape")(blurToEscape.asInstanceOf[js.Any])
    if (!js.isUndefined(blurToSave)) __obj.updateDynamic("blurToSave")(blurToSave.asInstanceOf[js.Any])
    nonEditableRows.foreach(p => __obj.updateDynamic("nonEditableRows")(p.toJsFn))
    __obj.asInstanceOf[CellEdit[TRow]]
  }
}

