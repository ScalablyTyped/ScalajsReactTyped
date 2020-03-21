package typingsJapgolly.vexflow.mod.Flow

import typingsJapgolly.vexflow.AnonLeftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Accidental")
@js.native
class Accidental protected ()
  extends typingsJapgolly.vexflow.Vex.Flow.Accidental {
  def this(`type`: String) = this()
}

/* static members */
@JSImport("vexflow", "Flow.Accidental")
@js.native
object Accidental extends js.Object {
  val CATEGORY: String = js.native
  var DEBUG: Boolean = js.native
  def applyAccidentals(voices: js.Array[typingsJapgolly.vexflow.Vex.Flow.Voice]): Unit = js.native
  def applyAccidentals(voices: js.Array[typingsJapgolly.vexflow.Vex.Flow.Voice], keySignature: String): Unit = js.native
  def format(accidentals: js.Array[typingsJapgolly.vexflow.Vex.Flow.Accidental], state: AnonLeftshift): Unit = js.native
}

