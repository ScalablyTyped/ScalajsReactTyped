package typingsJapgolly.vexflow.Vex.Flow

import typingsJapgolly.vexflow.Vex.Flow.TextNote.Justification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextNote
  extends StObject
     with Note {
  
  def draw(): Unit = js.native
  
  def setJustification(just: Justification): TextNote = js.native
  
  def setLine(line: Double): TextNote = js.native
}
object TextNote {
  
  @js.native
  sealed trait Justification extends StObject
  @JSGlobal("Vex.Flow.TextNote.Justification")
  @js.native
  object Justification extends StObject {
    
    @js.native
    sealed trait CENTER
      extends StObject
         with Justification
    
    @js.native
    sealed trait LEFT
      extends StObject
         with Justification
    
    @js.native
    sealed trait RIGHT
      extends StObject
         with Justification
  }
}
