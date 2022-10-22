package typingsJapgolly.vexflow.global.Vex.Flow

import typingsJapgolly.vexflow.Vex.Flow.Modifier.Position
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.FillStyle_
import typingsJapgolly.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.GraceNoteGroup")
@js.native
open class GraceNoteGroup protected ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.GraceNoteGroup {
  def this(grace_notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.GraceNote]) = this()
  def this(grace_notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.GraceNote], show_slur: Boolean) = this()
  
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
object GraceNoteGroup {
  
  @JSGlobal("Vex.Flow.GraceNoteGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Vex.Flow.GraceNoteGroup.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  //inconsistent name: 'show_slur' is called 'config', suggesting object (is boolean)
  /* static member */
  @JSGlobal("Vex.Flow.GraceNoteGroup.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def format(gracenote_groups: js.Array[typingsJapgolly.vexflow.Vex.Flow.GraceNoteGroup], state: Leftshift): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(gracenote_groups.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
