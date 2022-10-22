package typingsJapgolly.vexflow.mod.Flow

import typingsJapgolly.vexflow.anon.FillStyle_
import typingsJapgolly.vexflow.anon.GetContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Repetition")
@js.native
open class Repetition protected ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.Repetition {
  def this(`type`: typingsJapgolly.vexflow.Vex.Flow.Repetition.`type`, x: Double, y_shift: Double) = this()
  
  /* CompleteClass */
  override def addEndModifier(): Unit = js.native
  
  /* CompleteClass */
  override def addModifier(): Unit = js.native
  
  /* CompleteClass */
  override def addToStave(stave: typingsJapgolly.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typingsJapgolly.vexflow.Vex.Flow.StaveModifier = js.native
  
  /* CompleteClass */
  override def addToStaveEnd(stave: typingsJapgolly.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typingsJapgolly.vexflow.Vex.Flow.StaveModifier = js.native
  
  /* CompleteClass */
  override def draw(stave: typingsJapgolly.vexflow.Vex.Flow.Stave, x: Double): typingsJapgolly.vexflow.Vex.Flow.Repetition = js.native
  
  /* CompleteClass */
  override def drawCodaFixed(stave: typingsJapgolly.vexflow.Vex.Flow.Stave, x: Double): typingsJapgolly.vexflow.Vex.Flow.Repetition = js.native
  
  /* CompleteClass */
  override def drawSignoFixed(stave: typingsJapgolly.vexflow.Vex.Flow.Stave, x: Double): typingsJapgolly.vexflow.Vex.Flow.Repetition = js.native
  
  //inconsistent name: drawSignoFixed -> drawSegnoFixed
  /* CompleteClass */
  override def drawSymbolText(stave: typingsJapgolly.vexflow.Vex.Flow.Stave, x: Double, text: String, draw_coda: Boolean): typingsJapgolly.vexflow.Vex.Flow.Repetition = js.native
  
  /* CompleteClass */
  override def getCategory(): String = js.native
  
  /* CompleteClass */
  override def getPadding(index: Double): Double = js.native
  
  /* CompleteClass */
  override def getPosition(): Double = js.native
  
  /* CompleteClass */
  override def getStyle(): FillStyle_ = js.native
  
  /* CompleteClass */
  override def getWidth(): Double = js.native
  
  /* CompleteClass */
  override def makeSpacer(padding: Double): GetContext = js.native
  
  /* CompleteClass */
  override def placeGlyphOnLine(
    glyph: typingsJapgolly.vexflow.Vex.Flow.Glyph,
    stave: typingsJapgolly.vexflow.Vex.Flow.Stave,
    line: Double
  ): Unit = js.native
  
  /* CompleteClass */
  override def setPadding(padding: Double): Unit = js.native
  
  /* CompleteClass */
  override def setShiftX(x: Double): typingsJapgolly.vexflow.Vex.Flow.Repetition = js.native
  
  /* CompleteClass */
  override def setShiftY(y: Double): typingsJapgolly.vexflow.Vex.Flow.Repetition = js.native
  
  // (StaveModifier extends Element in vexflow, but not in these definitions, probably because of a typing problem)
  /* CompleteClass */
  override def setStyle(style: FillStyle_): typingsJapgolly.vexflow.Vex.Flow.StaveModifier = js.native
}
object Repetition {
  
  @JSImport("vexflow", "Flow.Repetition.type")
  @js.native
  object `type` extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.vexflow.Vex.Flow.Repetition.`type` & Double] = js.native
    
    /* 0 */ val CODA_LEFT: typingsJapgolly.vexflow.Vex.Flow.Repetition.`type`.CODA_LEFT & Double = js.native
    
    /* 1 */ val CODA_RIGHT: typingsJapgolly.vexflow.Vex.Flow.Repetition.`type`.CODA_RIGHT & Double = js.native
    
    /* 4 */ val DC: typingsJapgolly.vexflow.Vex.Flow.Repetition.`type`.DC & Double = js.native
    
    /* 5 */ val DC_AL_CODA: typingsJapgolly.vexflow.Vex.Flow.Repetition.`type`.DC_AL_CODA & Double = js.native
    
    /* 6 */ val DC_AL_FINE: typingsJapgolly.vexflow.Vex.Flow.Repetition.`type`.DC_AL_FINE & Double = js.native
    
    /* 7 */ val DS: typingsJapgolly.vexflow.Vex.Flow.Repetition.`type`.DS & Double = js.native
    
    /* 8 */ val DS_AL_CODA: typingsJapgolly.vexflow.Vex.Flow.Repetition.`type`.DS_AL_CODA & Double = js.native
    
    /* 9 */ val DS_AL_FINE: typingsJapgolly.vexflow.Vex.Flow.Repetition.`type`.DS_AL_FINE & Double = js.native
    
    /* 10 */ val FINE: typingsJapgolly.vexflow.Vex.Flow.Repetition.`type`.FINE & Double = js.native
    
    /* 1 */ val NONE: typingsJapgolly.vexflow.Vex.Flow.Repetition.`type`.NONE & Double = js.native
    
    /* 2 */ val SEGNO_LEFT: typingsJapgolly.vexflow.Vex.Flow.Repetition.`type`.SEGNO_LEFT & Double = js.native
    
    /* 3 */ val SEGNO_RIGHT: typingsJapgolly.vexflow.Vex.Flow.Repetition.`type`.SEGNO_RIGHT & Double = js.native
  }
}
