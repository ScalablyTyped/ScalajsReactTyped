package typingsJapgolly.handsontable.mod.Handsontable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.handsontable.mod.Handsontable.cellTypes.Autocomplete
import typingsJapgolly.handsontable.mod.Handsontable.cellTypes.Checkbox
import typingsJapgolly.handsontable.mod.Handsontable.cellTypes.Date
import typingsJapgolly.handsontable.mod.Handsontable.cellTypes.Dropdown
import typingsJapgolly.handsontable.mod.Handsontable.cellTypes.Numeric
import typingsJapgolly.handsontable.mod.Handsontable.cellTypes.Password
import typingsJapgolly.handsontable.mod.Handsontable.cellTypes.Text
import typingsJapgolly.handsontable.mod.Handsontable.cellTypes.Time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellTypes_ extends js.Object {
  var autocomplete: Autocomplete
  var checkbox: Checkbox
  var date: Date
  var dropdown: Dropdown
  var handsontable: typingsJapgolly.handsontable.mod.Handsontable.cellTypes.Handsontable
  var numeric: Numeric
  var password: Password
  var text: Text
  var time: Time
  def getCellType(name: String): CellTypeObject
  def registerCellType(name: String, `type`: CellTypeObject): Unit
}

object CellTypes_ {
  @scala.inline
  def apply(
    autocomplete: Autocomplete,
    checkbox: Checkbox,
    date: Date,
    dropdown: Dropdown,
    getCellType: String => CallbackTo[CellTypeObject],
    handsontable: typingsJapgolly.handsontable.mod.Handsontable.cellTypes.Handsontable,
    numeric: Numeric,
    password: Password,
    registerCellType: (String, CellTypeObject) => Callback,
    text: Text,
    time: Time
  ): CellTypes_ = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], handsontable = handsontable.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.updateDynamic("getCellType")(js.Any.fromFunction1((t0: java.lang.String) => getCellType(t0).runNow()))
    __obj.updateDynamic("registerCellType")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.handsontable.mod.Handsontable.CellTypeObject) => registerCellType(t0, t1).runNow()))
    __obj.asInstanceOf[CellTypes_]
  }
}

