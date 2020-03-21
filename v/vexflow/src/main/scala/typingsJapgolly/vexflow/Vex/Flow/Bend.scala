package typingsJapgolly.vexflow.Vex.Flow

import typingsJapgolly.vexflow.AnonLeftshift
import typingsJapgolly.vexflow.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Bend")
@js.native
class Bend protected () extends Modifier {
  def this(text: String) = this()
  def this(text: String, release: Boolean) = this()
  def this(text: String, release: Boolean, phrase: js.Array[AnonText]) = this()
  def getText(): String = js.native
  def setFont(font: String): Bend = js.native
  def updateWidth(): Bend = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Bend")
@js.native
object Bend extends js.Object {
  val CATEGORY: String = js.native
  var DOWN: Double = js.native
  var UP: Double = js.native
  def format(bends: js.Array[Bend], state: AnonLeftshift): Boolean = js.native
}

