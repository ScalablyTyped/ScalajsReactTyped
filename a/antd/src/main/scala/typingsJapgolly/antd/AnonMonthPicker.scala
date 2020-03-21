package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.antd.generatePickerMod.InjectDefaultProps
import typingsJapgolly.antd.generatePickerMod.RangePickerProps
import typingsJapgolly.rcPicker.pickerMod.PickerDateProps
import typingsJapgolly.rcPicker.pickerMod.PickerTimeProps
import typingsJapgolly.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMonthPicker[DateType] extends js.Object {
  var MonthPicker: ComponentClassP[
    (Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
    ]) with js.Object
  ]
  var RangePicker: ComponentClassP[RangePickerProps[DateType] with js.Object]
  var TimePicker: ComponentClassP[
    (Pick[
      InjectDefaultProps[PickerTimeProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 107 */ js.Any
    ]) with js.Object
  ]
  var WeekPicker: ComponentClassP[
    (Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
    ]) with js.Object
  ]
  var YearPicker: ComponentClassP[
    (Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
    ]) with js.Object
  ]
}

object AnonMonthPicker {
  @scala.inline
  def apply[DateType](
    MonthPicker: ComponentClassP[
      (Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
      ]) with js.Object
    ],
    RangePicker: ComponentClassP[RangePickerProps[DateType] with js.Object],
    TimePicker: ComponentClassP[
      (Pick[
        InjectDefaultProps[PickerTimeProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 107 */ js.Any
      ]) with js.Object
    ],
    WeekPicker: ComponentClassP[
      (Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
      ]) with js.Object
    ],
    YearPicker: ComponentClassP[
      (Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
      ]) with js.Object
    ]
  ): AnonMonthPicker[DateType] = {
    val __obj = js.Dynamic.literal(MonthPicker = MonthPicker.asInstanceOf[js.Any], RangePicker = RangePicker.asInstanceOf[js.Any], TimePicker = TimePicker.asInstanceOf[js.Any], WeekPicker = WeekPicker.asInstanceOf[js.Any], YearPicker = YearPicker.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMonthPicker[DateType]]
  }
}

