package typingsJapgolly.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pickerMod {
  type OmitPanelProps[Props] = typingsJapgolly.std.Omit[
    Props, 
    typingsJapgolly.rcPicker.rcPickerStrings.onChange | typingsJapgolly.rcPicker.rcPickerStrings.hideHeader | typingsJapgolly.rcPicker.rcPickerStrings.pickerValue | typingsJapgolly.rcPicker.rcPickerStrings.onPickerValueChange
  ]
}
