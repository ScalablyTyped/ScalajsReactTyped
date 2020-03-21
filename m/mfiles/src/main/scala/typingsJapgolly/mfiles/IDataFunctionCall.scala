package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import typingsJapgolly.mfiles.MFiles.MFDataFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataFunctionCall extends js.Object {
  val DataFunction: MFDataFunction
  def SetDataDate(): Unit
  def SetDataDaysFrom(): Unit
  def SetDataDaysTo(): Unit
  def SetDataInitialCharGroup(Locale: Double): Unit
  def SetDataIntegerSegment(SegmentSize: Double): Unit
  def SetDataLeftChars(Characters: Double): Unit
  def SetDataMonth(): Unit
  def SetDataNoOp(): Unit
  def SetDataYear(): Unit
  def SetDataYearAndMonth(): Unit
}

object IDataFunctionCall {
  @scala.inline
  def apply(
    DataFunction: MFDataFunction,
    SetDataDate: Callback,
    SetDataDaysFrom: Callback,
    SetDataDaysTo: Callback,
    SetDataInitialCharGroup: Double => Callback,
    SetDataIntegerSegment: Double => Callback,
    SetDataLeftChars: Double => Callback,
    SetDataMonth: Callback,
    SetDataNoOp: Callback,
    SetDataYear: Callback,
    SetDataYearAndMonth: Callback
  ): IDataFunctionCall = {
    val __obj = js.Dynamic.literal(DataFunction = DataFunction.asInstanceOf[js.Any])
    __obj.updateDynamic("SetDataDate")(SetDataDate.toJsFn)
    __obj.updateDynamic("SetDataDaysFrom")(SetDataDaysFrom.toJsFn)
    __obj.updateDynamic("SetDataDaysTo")(SetDataDaysTo.toJsFn)
    __obj.updateDynamic("SetDataInitialCharGroup")(js.Any.fromFunction1((t0: scala.Double) => SetDataInitialCharGroup(t0).runNow()))
    __obj.updateDynamic("SetDataIntegerSegment")(js.Any.fromFunction1((t0: scala.Double) => SetDataIntegerSegment(t0).runNow()))
    __obj.updateDynamic("SetDataLeftChars")(js.Any.fromFunction1((t0: scala.Double) => SetDataLeftChars(t0).runNow()))
    __obj.updateDynamic("SetDataMonth")(SetDataMonth.toJsFn)
    __obj.updateDynamic("SetDataNoOp")(SetDataNoOp.toJsFn)
    __obj.updateDynamic("SetDataYear")(SetDataYear.toJsFn)
    __obj.updateDynamic("SetDataYearAndMonth")(SetDataYearAndMonth.toJsFn)
    __obj.asInstanceOf[IDataFunctionCall]
  }
}

