package typingsJapgolly.vexflow.mod.Flow

import typingsJapgolly.vexflow.Vex.Flow.Modifier.Position
import typingsJapgolly.vexflow.Vex.Flow.Stroke.Type
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.Allvoices
import typingsJapgolly.vexflow.anon.FillStyle_
import typingsJapgolly.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Stroke")
@js.native
open class Stroke protected ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.Stroke {
  def this(`type`: Type) = this()
  def this(`type`: Type, options: Allvoices) = this()
  
  /* CompleteClass */
  override def addEndNote(note: typingsJapgolly.vexflow.Vex.Flow.Note): typingsJapgolly.vexflow.Vex.Flow.Stroke = js.native
  
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
object Stroke {
  
  @JSImport("vexflow", "Flow.Stroke")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vexflow", "Flow.Stroke.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  @JSImport("vexflow", "Flow.Stroke.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.vexflow.Vex.Flow.Stroke.Type & Double] = js.native
    
    /* 5 */ val ARPEGGIO_DIRECTIONLESS: typingsJapgolly.vexflow.Vex.Flow.Stroke.Type.ARPEGGIO_DIRECTIONLESS & Double = js.native
    
    /* 1 */ val BRUSH_DOWN: typingsJapgolly.vexflow.Vex.Flow.Stroke.Type.BRUSH_DOWN & Double = js.native
    
    /* 0 */ val BRUSH_UP: typingsJapgolly.vexflow.Vex.Flow.Stroke.Type.BRUSH_UP & Double = js.native
    
    /* 3 */ val RASQUEDO_DOWN: typingsJapgolly.vexflow.Vex.Flow.Stroke.Type.RASQUEDO_DOWN & Double = js.native
    
    /* 4 */ val RASQUEDO_UP: typingsJapgolly.vexflow.Vex.Flow.Stroke.Type.RASQUEDO_UP & Double = js.native
    
    /* 1 */ val ROLL_DOWN: typingsJapgolly.vexflow.Vex.Flow.Stroke.Type.ROLL_DOWN & Double = js.native
    
    /* 2 */ val ROLL_UP: typingsJapgolly.vexflow.Vex.Flow.Stroke.Type.ROLL_UP & Double = js.native
  }
  
  /* static member */
  inline def format(strokes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Stroke], state: Leftshift): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(strokes.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
