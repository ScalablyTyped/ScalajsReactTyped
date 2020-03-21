package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import typingsJapgolly.sharepoint.AnonBottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEditActorCellContext extends js.Object {
  var cellExpandSpace: AnonBottom
  var column: ColumnInfo
  var field: GridField
  var fieldKey: String
  var originalValue: IValue
  var propType: IPropertyType
  var record: IRecord
  def SetCurrentValue(value: js.Any): Unit
}

object IEditActorCellContext {
  @scala.inline
  def apply(
    SetCurrentValue: js.Any => Callback,
    cellExpandSpace: AnonBottom,
    column: ColumnInfo,
    field: GridField,
    fieldKey: String,
    originalValue: IValue,
    propType: IPropertyType,
    record: IRecord
  ): IEditActorCellContext = {
    val __obj = js.Dynamic.literal(cellExpandSpace = cellExpandSpace.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], propType = propType.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any])
    __obj.updateDynamic("SetCurrentValue")(js.Any.fromFunction1((t0: js.Any) => SetCurrentValue(t0).runNow()))
    __obj.asInstanceOf[IEditActorCellContext]
  }
}

