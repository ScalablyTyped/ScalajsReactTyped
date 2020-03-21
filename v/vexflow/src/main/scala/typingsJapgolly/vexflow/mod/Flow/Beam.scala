package typingsJapgolly.vexflow.mod.Flow

import typingsJapgolly.vexflow.AnonBeammiddleonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Beam")
@js.native
class Beam protected ()
  extends typingsJapgolly.vexflow.Vex.Flow.Beam {
  def this(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.StemmableNote]) = this()
  def this(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.StemmableNote], auto_stem: Boolean) = this()
}

/* static members */
@JSImport("vexflow", "Flow.Beam")
@js.native
object Beam extends js.Object {
  def applyAndGetBeams(
    voice: typingsJapgolly.vexflow.Vex.Flow.Voice,
    stem_direction: Double,
    groups: js.Array[typingsJapgolly.vexflow.Vex.Flow.Fraction]
  ): js.Array[typingsJapgolly.vexflow.Vex.Flow.Beam] = js.native
  def generateBeams(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.StemmableNote]): js.Array[typingsJapgolly.vexflow.Vex.Flow.Beam] = js.native
  def generateBeams(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.StemmableNote], config: AnonBeammiddleonly): js.Array[typingsJapgolly.vexflow.Vex.Flow.Beam] = js.native
  def getDefaultBeamGroups(time_sig: String): js.Array[typingsJapgolly.vexflow.Vex.Flow.Fraction] = js.native
}

