package typingsJapgolly.vexflow.mod.Flow

import typingsJapgolly.vexflow.Vex.Flow.Modifier.Position
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.FillStyle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Modifier")
@js.native
open class Modifier ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.Modifier {
  
  /* CompleteClass */
  override def alignSubNotesWithNote(
    subNotes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note],
    note: typingsJapgolly.vexflow.Vex.Flow.Note
  ): Unit = js.native
  
  //inconsistent type: void -> Modifier
  /* CompleteClass */
  override def draw(): Unit = js.native
  
  /* CompleteClass */
  override def getCategory(): String = js.native
  
  /* CompleteClass */
  override def getContext(): IRenderContext = js.native
  
  /* CompleteClass */
  override def getIndex(): Double = js.native
  
  /* CompleteClass */
  override def getModifierContext(): typingsJapgolly.vexflow.Vex.Flow.ModifierContext = js.native
  
  /* CompleteClass */
  override def getNote(): typingsJapgolly.vexflow.Vex.Flow.Note = js.native
  
  /* CompleteClass */
  override def getPosition(): Position = js.native
  
  // (Modifier extends Element in vexflow, but not in these definitions, probably because of some typing problem)
  /* CompleteClass */
  override def getStyle(): FillStyle_ = js.native
  
  /* CompleteClass */
  override def getWidth(): Double = js.native
  
  /* CompleteClass */
  override def setContext(context: IRenderContext): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
  
  /* CompleteClass */
  override def setIndex(index: Double): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
  
  /* CompleteClass */
  override def setModifierContext(c: typingsJapgolly.vexflow.Vex.Flow.ModifierContext): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
  
  /* CompleteClass */
  override def setNote(note: typingsJapgolly.vexflow.Vex.Flow.Note): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
  
  /* CompleteClass */
  override def setPosition(position: Position): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
  
  /* CompleteClass */
  override def setStyle(style: FillStyle_): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
  
  /* CompleteClass */
  override def setTextLine(line: Double): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
  
  /* CompleteClass */
  override def setWidth(width: Double): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
  
  /* CompleteClass */
  override def setXShift(x: Double): Unit = js.native
  
  /* CompleteClass */
  override def setYShift(y: Double): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
}
object Modifier {
  
  @JSImport("vexflow", "Flow.Modifier")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vexflow", "Flow.Modifier.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.Modifier.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("vexflow", "Flow.Modifier.Position")
  @js.native
  object Position extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.vexflow.Vex.Flow.Modifier.Position & Double] = js.native
    
    /* 1 */ val ABOVE: typingsJapgolly.vexflow.Vex.Flow.Modifier.Position.ABOVE & Double = js.native
    
    /* 2 */ val BELOW: typingsJapgolly.vexflow.Vex.Flow.Modifier.Position.BELOW & Double = js.native
    
    /* 1 */ val LEFT: typingsJapgolly.vexflow.Vex.Flow.Modifier.Position.LEFT & Double = js.native
    
    /* 0 */ val RIGHT: typingsJapgolly.vexflow.Vex.Flow.Modifier.Position.RIGHT & Double = js.native
  }
}
