package typingsJapgolly.vexflow.Vex.Flow

import typingsJapgolly.vexflow.AnonLeftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Dot")
@js.native
class Dot () extends Modifier {
   //inconsistent type: void -> Dot
  def setDotShiftY(y: Double): Dot = js.native
  //TODO remove the following lines once TypeScript allows subclass overrides with type changes or type inconsistencies mentioned below are fixed
  @JSName("setNote")
  def setNote_Dot(note: Note): Dot = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Dot")
@js.native
object Dot extends js.Object {
  val CATEGORY: String = js.native
  def format(dots: Double, state: AnonLeftshift): Unit = js.native
}

