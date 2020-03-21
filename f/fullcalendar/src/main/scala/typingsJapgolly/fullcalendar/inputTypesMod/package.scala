package typingsJapgolly.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inputTypesMod {
  type DurationInput = typingsJapgolly.moment.mod.Duration_ | js.Object | java.lang.String | scala.Double
  type EventSourceFunction = js.Function4[
    /* start */ typingsJapgolly.moment.mod.Moment, 
    /* end */ typingsJapgolly.moment.mod.Moment, 
    /* timezone */ java.lang.String, 
    /* callback */ js.Function1[
      /* events */ js.Array[typingsJapgolly.fullcalendar.inputTypesMod.EventObjectInput], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type EventSourceInput = typingsJapgolly.fullcalendar.inputTypesMod.EventSourceSimpleInput | typingsJapgolly.fullcalendar.inputTypesMod.EventSourceExtendedInput
  type EventSourceSimpleInput = js.Array[typingsJapgolly.fullcalendar.inputTypesMod.EventObjectInput] | typingsJapgolly.fullcalendar.inputTypesMod.EventSourceFunction | java.lang.String
  type MomentInput = typingsJapgolly.moment.mod.Moment | js.Date | js.Object | java.lang.String | scala.Double
}
