package typingsJapgolly.countdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object countdown {
  type DateFunction = js.Function1[/* timespan */ typingsJapgolly.countdown.countdown.Timespan, scala.Unit]
  type DateTime = js.UndefOr[
    scala.Double | js.Date | typingsJapgolly.countdown.countdown.DateFunction | scala.Null
  ]
}
