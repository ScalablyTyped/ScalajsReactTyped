package typingsJapgolly.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceMod {
  type DisabledTime[DateType] = js.Function1[
    /* date */ DateType | scala.Null, 
    typingsJapgolly.rcPicker.interfaceMod.DisabledTimes
  ]
  type EventValue[DateType] = DateType | scala.Null
  type NullableDateType[DateType] = js.UndefOr[DateType | scala.Null]
  type OnPanelChange[DateType] = js.Function2[
    /* value */ DateType, 
    /* mode */ typingsJapgolly.rcPicker.interfaceMod.PanelMode, 
    scala.Unit
  ]
  type OnSelect[DateType] = js.Function2[
    /* value */ DateType, 
    /* type */ typingsJapgolly.rcPicker.rcPickerStrings.key | typingsJapgolly.rcPicker.rcPickerStrings.mouse | typingsJapgolly.rcPicker.rcPickerStrings.submit, 
    scala.Unit
  ]
  type RangeList = js.Array[typingsJapgolly.rcPicker.AnonLabel]
  type RangeValue[DateType] = (js.Tuple2[
    typingsJapgolly.rcPicker.interfaceMod.EventValue[DateType], 
    typingsJapgolly.rcPicker.interfaceMod.EventValue[DateType]
  ]) | scala.Null
}
