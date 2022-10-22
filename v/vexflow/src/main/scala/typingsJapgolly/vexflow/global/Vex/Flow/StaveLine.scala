package typingsJapgolly.vexflow.global.Vex.Flow

import typingsJapgolly.vexflow.anon.Arrowheadangle
import typingsJapgolly.vexflow.anon.Family
import typingsJapgolly.vexflow.anon.Firstindices
import typingsJapgolly.vexflow.anon.Lastnote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.StaveLine")
@js.native
open class StaveLine protected ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.StaveLine {
  def this(notes: Firstindices) = this()
  
  /* CompleteClass */
  override def applyFontStyle(): Unit = js.native
  
  /* CompleteClass */
  override def applyLineStyle(): Unit = js.native
  
  /* CompleteClass */
  override def draw(): typingsJapgolly.vexflow.Vex.Flow.StaveLine = js.native
  
  //inconsistent API: this should be set via an options object in the constructor
  /* CompleteClass */
  var render_options: Arrowheadangle = js.native
  
  /* CompleteClass */
  override def setContext(context: js.Object): typingsJapgolly.vexflow.Vex.Flow.StaveLine = js.native
  
  /* CompleteClass */
  override def setFont(font: Family): typingsJapgolly.vexflow.Vex.Flow.StaveLine = js.native
  
  /* CompleteClass */
  override def setNotes(notes: Lastnote): typingsJapgolly.vexflow.Vex.Flow.StaveLine = js.native
  
  /* CompleteClass */
  override def setText(text: String): typingsJapgolly.vexflow.Vex.Flow.StaveLine = js.native
}
object StaveLine {
  
  @JSGlobal("Vex.Flow.StaveLine.TextJustification")
  @js.native
  object TextJustification extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.vexflow.Vex.Flow.StaveLine.TextJustification & Double] = js.native
    
    /* 0 */ val CENTER: typingsJapgolly.vexflow.Vex.Flow.StaveLine.TextJustification.CENTER & Double = js.native
    
    /* 1 */ val LEFT: typingsJapgolly.vexflow.Vex.Flow.StaveLine.TextJustification.LEFT & Double = js.native
    
    /* 1 */ val RIGHT: typingsJapgolly.vexflow.Vex.Flow.StaveLine.TextJustification.RIGHT & Double = js.native
  }
  
  @JSGlobal("Vex.Flow.StaveLine.TextVerticalPosition")
  @js.native
  object TextVerticalPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.vexflow.Vex.Flow.StaveLine.TextVerticalPosition & Double] = js.native
    
    /* 0 */ val BOTTOM: typingsJapgolly.vexflow.Vex.Flow.StaveLine.TextVerticalPosition.BOTTOM & Double = js.native
    
    /* 1 */ val TOP: typingsJapgolly.vexflow.Vex.Flow.StaveLine.TextVerticalPosition.TOP & Double = js.native
  }
}
