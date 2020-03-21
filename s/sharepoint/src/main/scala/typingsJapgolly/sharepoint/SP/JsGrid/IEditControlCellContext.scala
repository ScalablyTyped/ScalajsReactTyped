package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.sharepoint.AnonBottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEditControlCellContext extends IEditActorCellContext {
  var cellHeight: Double
   // TODO: Determine correct type
  var cellRect: js.Any
  var cellStyle: js.Any
  var cellWidth: Double
  def Hide(element: HTMLElement): Unit
  def NotifyEditComplete(): Unit
  def NotifyExpandControl(): Unit
  def Show(element: HTMLElement): Unit
}

object IEditControlCellContext {
  @scala.inline
  def apply(
    Hide: HTMLElement => Callback,
    NotifyEditComplete: Callback,
    NotifyExpandControl: Callback,
    SetCurrentValue: js.Any => Callback,
    Show: HTMLElement => Callback,
    cellExpandSpace: AnonBottom,
    cellHeight: Double,
    cellRect: js.Any,
    cellStyle: js.Any,
    cellWidth: Double,
    column: ColumnInfo,
    field: GridField,
    fieldKey: String,
    originalValue: IValue,
    propType: IPropertyType,
    record: IRecord
  ): IEditControlCellContext = {
    val __obj = js.Dynamic.literal(cellExpandSpace = cellExpandSpace.asInstanceOf[js.Any], cellHeight = cellHeight.asInstanceOf[js.Any], cellRect = cellRect.asInstanceOf[js.Any], cellStyle = cellStyle.asInstanceOf[js.Any], cellWidth = cellWidth.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], propType = propType.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any])
    __obj.updateDynamic("Hide")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => Hide(t0).runNow()))
    __obj.updateDynamic("NotifyEditComplete")(NotifyEditComplete.toJsFn)
    __obj.updateDynamic("NotifyExpandControl")(NotifyExpandControl.toJsFn)
    __obj.updateDynamic("SetCurrentValue")(js.Any.fromFunction1((t0: js.Any) => SetCurrentValue(t0).runNow()))
    __obj.updateDynamic("Show")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => Show(t0).runNow()))
    __obj.asInstanceOf[IEditControlCellContext]
  }
}

