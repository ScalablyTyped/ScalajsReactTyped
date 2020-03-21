package typingsJapgolly.vexflow.mod.Flow

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.vexflow.AnonXshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.PedalMarking")
@js.native
class PedalMarking protected ()
  extends typingsJapgolly.vexflow.Vex.Flow.PedalMarking {
  def this(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note]) = this()
}

/* static members */
@JSImport("vexflow", "Flow.PedalMarking")
@js.native
object PedalMarking extends js.Object {
   //inconsistent name: 'notes' is called 'type', suggesting string (is Note[])
  var DEBUG: Boolean = js.native
  def createSostenuto(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note]): typingsJapgolly.vexflow.Vex.Flow.PedalMarking = js.native
  def createSustain(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note]): typingsJapgolly.vexflow.Vex.Flow.PedalMarking = js.native
  def createUnaCorda(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note]): typingsJapgolly.vexflow.Vex.Flow.PedalMarking = js.native
  @js.native
  object GLYPHS extends /* name */ StringDictionary[AnonXshift]
  
}

