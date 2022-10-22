package typingsJapgolly.vexflow.mod.Flow

import typingsJapgolly.vexflow.Vex.Flow.Tickable
import typingsJapgolly.vexflow.Vex.IRenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.TextNote")
@js.native
open class TextNote protected ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.TextNote {
  def this(text_struct: typingsJapgolly.vexflow.anon.Font) = this()
  
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
object TextNote {
  
  @JSImport("vexflow", "Flow.TextNote.Justification")
  @js.native
  object Justification extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.vexflow.Vex.Flow.TextNote.Justification & Double] = js.native
    
    /* 0 */ val CENTER: typingsJapgolly.vexflow.Vex.Flow.TextNote.Justification.CENTER & Double = js.native
    
    /* 1 */ val LEFT: typingsJapgolly.vexflow.Vex.Flow.TextNote.Justification.LEFT & Double = js.native
    
    /* 1 */ val RIGHT: typingsJapgolly.vexflow.Vex.Flow.TextNote.Justification.RIGHT & Double = js.native
  }
}
