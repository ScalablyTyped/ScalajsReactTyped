package typingsJapgolly.reactDayPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commonMod {
  type FunctionModifier = js.Function1[/* date */ js.Date, scala.Boolean]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.std.Date
    - typingsJapgolly.reactDayPicker.commonMod.RangeModifier
    - typingsJapgolly.reactDayPicker.commonMod.BeforeModifier
    - typingsJapgolly.reactDayPicker.commonMod.AfterModifier
    - typingsJapgolly.reactDayPicker.commonMod.BeforeAfterModifier
    - typingsJapgolly.reactDayPicker.commonMod.DaysOfWeekModifier
    - typingsJapgolly.reactDayPicker.commonMod.FunctionModifier
    - `js.undefined`
  */
  type Modifier = js.UndefOr[
    typingsJapgolly.reactDayPicker.commonMod._Modifier | js.Date | typingsJapgolly.reactDayPicker.commonMod.FunctionModifier
  ]
}
