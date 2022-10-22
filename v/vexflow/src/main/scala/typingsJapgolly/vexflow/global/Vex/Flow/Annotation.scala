package typingsJapgolly.vexflow.global.Vex.Flow

import typingsJapgolly.vexflow.Vex.Flow.Annotation.Justify
import typingsJapgolly.vexflow.Vex.Flow.Annotation.VerticalJustify
import typingsJapgolly.vexflow.Vex.Flow.Modifier.Position
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.FillStyle_
import typingsJapgolly.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Annotation")
@js.native
open class Annotation protected ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.Annotation {
  def this(text: String) = this()
  
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
  override def getJustification(): Justify = js.native
  
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
  override def setFont(family: String, size: Double, weight: String): typingsJapgolly.vexflow.Vex.Flow.Annotation = js.native
  
  /* CompleteClass */
  override def setIndex(index: Double): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
  
  /* CompleteClass */
  override def setJustification(justification: Justify): typingsJapgolly.vexflow.Vex.Flow.Annotation = js.native
  
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
  override def setVerticalJustification(just: VerticalJustify): typingsJapgolly.vexflow.Vex.Flow.Annotation = js.native
  
  /* CompleteClass */
  override def setWidth(width: Double): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
  
  /* CompleteClass */
  override def setXShift(x: Double): Unit = js.native
  
  /* CompleteClass */
  override def setYShift(y: Double): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
}
object Annotation {
  
  @JSGlobal("Vex.Flow.Annotation")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Vex.Flow.Annotation.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.Annotation.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Vex.Flow.Annotation.Justify")
  @js.native
  object Justify extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.vexflow.Vex.Flow.Annotation.Justify & Double] = js.native
    
    /* 0 */ val CENTER: typingsJapgolly.vexflow.Vex.Flow.Annotation.Justify.CENTER & Double = js.native
    
    /* 2 */ val CENTER_STEM: typingsJapgolly.vexflow.Vex.Flow.Annotation.Justify.CENTER_STEM & Double = js.native
    
    /* 1 */ val LEFT: typingsJapgolly.vexflow.Vex.Flow.Annotation.Justify.LEFT & Double = js.native
    
    /* 1 */ val RIGHT: typingsJapgolly.vexflow.Vex.Flow.Annotation.Justify.RIGHT & Double = js.native
  }
  
  @JSGlobal("Vex.Flow.Annotation.VerticalJustify")
  @js.native
  object VerticalJustify extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.vexflow.Vex.Flow.Annotation.VerticalJustify & Double] = js.native
    
    /* 1 */ val BOTTOM: typingsJapgolly.vexflow.Vex.Flow.Annotation.VerticalJustify.BOTTOM & Double = js.native
    
    /* 0 */ val CENTER: typingsJapgolly.vexflow.Vex.Flow.Annotation.VerticalJustify.CENTER & Double = js.native
    
    /* 2 */ val CENTER_STEM: typingsJapgolly.vexflow.Vex.Flow.Annotation.VerticalJustify.CENTER_STEM & Double = js.native
    
    /* 1 */ val TOP: typingsJapgolly.vexflow.Vex.Flow.Annotation.VerticalJustify.TOP & Double = js.native
  }
  
  /* static member */
  inline def format(annotations: js.Array[typingsJapgolly.vexflow.Vex.Flow.Annotation], state: Leftshift): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(annotations.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
