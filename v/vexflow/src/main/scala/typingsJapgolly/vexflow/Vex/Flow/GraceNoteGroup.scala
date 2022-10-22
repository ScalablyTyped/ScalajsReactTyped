package typingsJapgolly.vexflow.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraceNoteGroup
  extends StObject
     with Modifier {
  
  def beamNotes(): GraceNoteGroup = js.native
  
  def preFormat(): Unit = js.native
  
  def setNote(note: StaveNote): Modifier = js.native
  
  //inconsistent type: void -> GraceNoteGroup
  @JSName("setWidth")
  def setWidth_Unit(width: Double): Unit = js.native
}
