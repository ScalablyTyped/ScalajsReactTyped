package typingsJapgolly.dateFns

import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/isAfter", JSImport.Namespace)
@js.native
object dateFnsIsAfterMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, dateToCompare: Double): Boolean = js.native
    def apply(date: Double, dateToCompare: Date): Boolean = js.native
    def apply(date: Date, dateToCompare: Double): Boolean = js.native
    def apply(date: Date, dateToCompare: Date): Boolean = js.native
  }
  
}

