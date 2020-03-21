package typingsJapgolly.vexflow.Vex.Flow

import typingsJapgolly.vexflow.Vex.Flow.Modifier.Position
import typingsJapgolly.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Modifier")
@js.native
class Modifier_ () extends js.Object {
  def alignSubNotesWithNote(subNotes: js.Array[Note], note: Note): Unit = js.native
   //inconsistent type: void -> Modifier
  def draw(): Unit = js.native
  def getCategory(): String = js.native
  def getContext(): IRenderContext = js.native
  def getIndex(): Double = js.native
  def getModifierContext(): ModifierContext = js.native
  def getNote(): Note = js.native
  def getPosition(): Position = js.native
  def getWidth(): Double = js.native
  def setContext(context: IRenderContext): Modifier = js.native
  def setIndex(index: Double): Modifier = js.native
  def setModifierContext(c: ModifierContext): Modifier = js.native
  def setNote(note: Note): Modifier = js.native
  def setPosition(position: Position): Modifier = js.native
  def setTextLine(line: Double): Modifier = js.native
  def setWidth(width: Double): Modifier = js.native
  def setXShift(x: Double): Unit = js.native
  def setYShift(y: Double): Modifier = js.native
}

