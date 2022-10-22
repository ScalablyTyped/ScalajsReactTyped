package typingsJapgolly.vexflow.mod.Flow

import typingsJapgolly.vexflow.anon.FillStyle_
import typingsJapgolly.vexflow.anon.GetContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Barline")
@js.native
open class Barline protected ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.Barline {
  def this(`type`: typingsJapgolly.vexflow.Vex.Flow.Barline.`type`, x: Double) = this()
  
  /* CompleteClass */
  override def addEndModifier(): Unit = js.native
  
  /* CompleteClass */
  override def addModifier(): Unit = js.native
  
  /* CompleteClass */
  override def addToStave(stave: typingsJapgolly.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typingsJapgolly.vexflow.Vex.Flow.StaveModifier = js.native
  
  /* CompleteClass */
  override def addToStaveEnd(stave: typingsJapgolly.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typingsJapgolly.vexflow.Vex.Flow.StaveModifier = js.native
  
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
  
  // (StaveModifier extends Element in vexflow, but not in these definitions, probably because of a typing problem)
  /* CompleteClass */
  override def setStyle(style: FillStyle_): typingsJapgolly.vexflow.Vex.Flow.StaveModifier = js.native
}
object Barline {
  
  @JSImport("vexflow", "Flow.Barline.type")
  @js.native
  object `type` extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.vexflow.Vex.Flow.Barline.`type` & Double] = js.native
    
    /* 0 */ val DOUBLE: typingsJapgolly.vexflow.Vex.Flow.Barline.`type`.DOUBLE & Double = js.native
    
    /* 1 */ val END: typingsJapgolly.vexflow.Vex.Flow.Barline.`type`.END & Double = js.native
    
    /* 5 */ val NONE: typingsJapgolly.vexflow.Vex.Flow.Barline.`type`.NONE & Double = js.native
    
    /* 2 */ val REPEAT_BEGIN: typingsJapgolly.vexflow.Vex.Flow.Barline.`type`.REPEAT_BEGIN & Double = js.native
    
    /* 4 */ val REPEAT_BOTH: typingsJapgolly.vexflow.Vex.Flow.Barline.`type`.REPEAT_BOTH & Double = js.native
    
    /* 3 */ val REPEAT_END: typingsJapgolly.vexflow.Vex.Flow.Barline.`type`.REPEAT_END & Double = js.native
    
    /* 1 */ val SINGLE: typingsJapgolly.vexflow.Vex.Flow.Barline.`type`.SINGLE & Double = js.native
  }
}
