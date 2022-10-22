package typingsJapgolly.vexflow.mod.Flow

import typingsJapgolly.vexflow.Vex.Flow.Tickable
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.StaveNote")
@js.native
open class StaveNote protected ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.StaveNote {
  def this(note_struct: typingsJapgolly.vexflow.anon.Clef) = this()
  
  /* CompleteClass */
  override def addModifier(mod: typingsJapgolly.vexflow.Vex.Flow.Modifier): Tickable = js.native
  
  /* CompleteClass */
  override def addToModifierContext(mc: typingsJapgolly.vexflow.Vex.Flow.ModifierContext): Unit = js.native
  
  /* CompleteClass */
  override def applyTickMultiplier(numerator: Double, denominator: Double): Unit = js.native
  
  /* CompleteClass */
  override def getBoundingBox(): typingsJapgolly.vexflow.Vex.Flow.BoundingBox = js.native
  
  /* CompleteClass */
  override def getCenterXShift(): Double = js.native
  
  /* CompleteClass */
  override def getIntrinsicTicks(): typingsJapgolly.vexflow.Vex.Flow.Fraction = js.native
  
  /* CompleteClass */
  override def getTickMultiplier(): typingsJapgolly.vexflow.Vex.Flow.Fraction = js.native
  
  /* CompleteClass */
  override def getTicks(): typingsJapgolly.vexflow.Vex.Flow.Fraction = js.native
  
  /* CompleteClass */
  override def getTuplet(): typingsJapgolly.vexflow.Vex.Flow.Tuplet = js.native
  
  /* CompleteClass */
  override def getVoice(): typingsJapgolly.vexflow.Vex.Flow.Voice = js.native
  
  /* CompleteClass */
  override def getWidth(): Double = js.native
  
  /* CompleteClass */
  override def isCenterAligned(): Boolean = js.native
  
  /* CompleteClass */
  override def postFormat(): Tickable = js.native
  
  /* CompleteClass */
  override def preFormat(): Unit = js.native
  
  /* CompleteClass */
  override def setCenterAlignment(align_center: Boolean): Tickable = js.native
  
  /* CompleteClass */
  override def setContext(context: IRenderContext): Unit = js.native
  
  /* CompleteClass */
  override def setDuration(duration: typingsJapgolly.vexflow.Vex.Flow.Fraction): Unit = js.native
  
  /* CompleteClass */
  override def setIntrinsicTicks(intrinsicTicks: typingsJapgolly.vexflow.Vex.Flow.Fraction): Unit = js.native
  
  /* CompleteClass */
  override def setTickContext(tc: typingsJapgolly.vexflow.Vex.Flow.TickContext): Unit = js.native
  
  /* CompleteClass */
  override def setTuplet(tuplet: typingsJapgolly.vexflow.Vex.Flow.Tuplet): Tickable = js.native
  
  /* CompleteClass */
  override def setVoice(voice: typingsJapgolly.vexflow.Vex.Flow.Voice): Unit = js.native
  
  /* CompleteClass */
  override def setXShift(x: Double): Tickable = js.native
  
  /* CompleteClass */
  override def shouldIgnoreTicks(): Boolean = js.native
}
object StaveNote {
  
  @JSImport("vexflow", "Flow.StaveNote")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vexflow", "Flow.StaveNote.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.StaveNote.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("vexflow", "Flow.StaveNote.STEM_DOWN")
  @js.native
  val STEM_DOWN: Double = js.native
  
  @JSImport("vexflow", "Flow.StaveNote.STEM_UP")
  @js.native
  val STEM_UP: Double = js.native
  
  /* static member */
  inline def format(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.StaveNote], state: Leftshift): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(notes.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def formatByY(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.StaveNote], state: Leftshift): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("formatByY")(notes.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def postFormat(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.StaveNote]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("postFormat")(notes.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
