package typingsJapgolly.antd.generatePickerMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.antd.AnonMonthPicker
import typingsJapgolly.rcPicker.generateMod.GenerateConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/date-picker/generatePicker", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[DateType](generateConfig: GenerateConfig[DateType]): (ComponentClassP[PickerProps[DateType] with js.Object]) with AnonMonthPicker[DateType] = js.native
}

