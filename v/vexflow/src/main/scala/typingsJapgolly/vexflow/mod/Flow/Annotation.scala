package typingsJapgolly.vexflow.mod.Flow

import typingsJapgolly.vexflow.AnonLeftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Annotation")
@js.native
class Annotation protected ()
  extends typingsJapgolly.vexflow.Vex.Flow.Annotation {
  def this(text: String) = this()
}

/* static members */
@JSImport("vexflow", "Flow.Annotation")
@js.native
object Annotation extends js.Object {
  val CATEGORY: String = js.native
  var DEBUG: Boolean = js.native
  def format(annotations: js.Array[typingsJapgolly.vexflow.Vex.Flow.Annotation], state: AnonLeftshift): Boolean = js.native
}

