package typingsJapgolly.wordpressDate.mod

import typingsJapgolly.moment.mod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/date", "getDate")
@js.native
object getDate extends js.Object {
  def apply(): js.Date = js.native
  def apply(dateValue: MomentInput): js.Date = js.native
}

