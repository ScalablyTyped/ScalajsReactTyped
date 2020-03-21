package typingsJapgolly.vexflow.Vex.Flow

import typingsJapgolly.vexflow.AnonCps
import typingsJapgolly.vexflow.AnonDirection
import typingsJapgolly.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Curve")
@js.native
class Curve_ protected () extends js.Object {
  def this(from: Note, to: Note) = this()
  def this(from: Note, to: Note, options: AnonCps) = this()
  def draw(): Boolean = js.native
  def isPartial(): Boolean = js.native
  def renderCurve(params: AnonDirection): Unit = js.native
  def setContext(context: IRenderContext): Curve = js.native
  def setNotes(from: Note, to: Note): Curve = js.native
}

