package typingsJapgolly.nodeSchedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JobCallback = js.Function1[/* fireDate */ js.Date, scala.Unit]
  type Recurrence = scala.Double | typingsJapgolly.nodeSchedule.mod.Range | java.lang.String
  type RecurrenceSegment = typingsJapgolly.nodeSchedule.mod.Recurrence | js.Array[typingsJapgolly.nodeSchedule.mod.Recurrence]
  type Timezone = java.lang.String
}
