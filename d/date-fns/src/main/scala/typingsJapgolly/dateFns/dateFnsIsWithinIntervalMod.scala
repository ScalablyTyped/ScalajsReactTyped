package typingsJapgolly.dateFns

import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/isWithinInterval", JSImport.Namespace)
@js.native
object dateFnsIsWithinIntervalMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, interval: typingsJapgolly.dateFns.mod.Interval): Boolean = js.native
    def apply(date: Date, interval: typingsJapgolly.dateFns.mod.Interval): Boolean = js.native
  }
  
}

