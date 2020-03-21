package typingsJapgolly.vexflow.mod.Flow

import typingsJapgolly.vexflow.AnonLeftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.StringNumber")
@js.native
class StringNumber protected ()
  extends typingsJapgolly.vexflow.Vex.Flow.StringNumber {
  def this(number: String) = this()
  // actually this is not really consistent in the vexflow code "ctx.measureText(this.string_number).width" looks
  // like it is a string. But from the use of it it might be a number ?!
  def this(number: Double) = this()
}

/* static members */
@JSImport("vexflow", "Flow.StringNumber")
@js.native
object StringNumber extends js.Object {
  val CATEGORY: String = js.native
  def format(nums: js.Array[typingsJapgolly.vexflow.Vex.Flow.StringNumber], state: AnonLeftshift): Boolean = js.native
}

