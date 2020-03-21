package typingsJapgolly.dateFns

import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/isSameWeek", JSImport.Namespace)
@js.native
object dateFnsIsSameWeekMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(dateLeft: Double, dateRight: Double): Boolean = js.native
    def apply(dateLeft: Double, dateRight: Double, options: AnonLocale): Boolean = js.native
    def apply(dateLeft: Double, dateRight: Date): Boolean = js.native
    def apply(dateLeft: Double, dateRight: Date, options: AnonLocale): Boolean = js.native
    def apply(dateLeft: Date, dateRight: Double): Boolean = js.native
    def apply(dateLeft: Date, dateRight: Double, options: AnonLocale): Boolean = js.native
    def apply(dateLeft: Date, dateRight: Date): Boolean = js.native
    def apply(dateLeft: Date, dateRight: Date, options: AnonLocale): Boolean = js.native
  }
  
}

