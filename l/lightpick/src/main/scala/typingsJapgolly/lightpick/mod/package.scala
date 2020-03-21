package typingsJapgolly.lightpick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DisabledDate = typingsJapgolly.lightpick.mod.InputDate | typingsJapgolly.lightpick.mod.InputDateRange
  type FormatSpecification = typingsJapgolly.moment.mod.MomentFormatSpecification
  type InputDate = typingsJapgolly.moment.mod.MomentInput | scala.Null
  type InputDateRange = js.Tuple2[typingsJapgolly.lightpick.mod.InputDate, typingsJapgolly.lightpick.mod.InputDate]
  type Options = typingsJapgolly.lightpick.mod.Options_
  type OutputDate = typingsJapgolly.moment.mod.Moment | scala.Null
}
