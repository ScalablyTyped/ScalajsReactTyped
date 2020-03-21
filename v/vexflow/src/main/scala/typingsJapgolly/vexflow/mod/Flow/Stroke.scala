package typingsJapgolly.vexflow.mod.Flow

import typingsJapgolly.vexflow.AnonAllvoices
import typingsJapgolly.vexflow.AnonLeftshift
import typingsJapgolly.vexflow.Vex.Flow.Stroke.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Stroke")
@js.native
class Stroke protected ()
  extends typingsJapgolly.vexflow.Vex.Flow.Stroke {
  def this(`type`: Type) = this()
  def this(`type`: Type, options: AnonAllvoices) = this()
}

/* static members */
@JSImport("vexflow", "Flow.Stroke")
@js.native
object Stroke extends js.Object {
  val CATEGORY: String = js.native
  def format(strokes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Stroke], state: AnonLeftshift): Boolean = js.native
}

