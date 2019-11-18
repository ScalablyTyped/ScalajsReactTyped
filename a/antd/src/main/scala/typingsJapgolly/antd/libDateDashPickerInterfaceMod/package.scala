package typingsJapgolly.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDateDashPickerInterfaceMod {
  import typingsJapgolly.moment.momentMod.Moment

  type RangePickerPresetRange = RangePickerValue | js.Function0[RangePickerValue]
  type RangePickerValue = js.Array[js.UndefOr[Moment]] | (js.Tuple2[js.UndefOr[Moment], js.UndefOr[Moment]])
}
