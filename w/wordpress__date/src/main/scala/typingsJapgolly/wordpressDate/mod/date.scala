package typingsJapgolly.wordpressDate.mod

import typingsJapgolly.moment.mod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/date", "date")
@js.native
object date extends js.Object {
  def apply(dateFormat: String): String = js.native
  def apply(dateFormat: String, dateValue: MomentInput): String = js.native
}

