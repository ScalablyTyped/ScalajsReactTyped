package typingsJapgolly.dateFns.esmMod

import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm", "isSameSecond")
@js.native
object isSameSecond extends js.Object {
  def apply(dateLeft: Double, dateRight: Double): Boolean = js.native
  def apply(dateLeft: Double, dateRight: Date): Boolean = js.native
  def apply(dateLeft: Date, dateRight: Double): Boolean = js.native
  def apply(dateLeft: Date, dateRight: Date): Boolean = js.native
}

