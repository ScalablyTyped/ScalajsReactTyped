package typingsJapgolly.vexflow.mod.Flow

import typingsJapgolly.vexflow.anon.FillStyle_
import typingsJapgolly.vexflow.anon.GetContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.StaveModifier")
@js.native
open class StaveModifier ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.StaveModifier {
  
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
object StaveModifier {
  
  // @see https://github.com/0xfe/vexflow/blob/master/src/stavemodifier.js#L9
  @JSImport("vexflow", "Flow.StaveModifier.Position")
  @js.native
  object Position extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.vexflow.Vex.Flow.StaveModifier.Position & Double] = js.native
    
    /* 3 */ val ABOVE: typingsJapgolly.vexflow.Vex.Flow.StaveModifier.Position.ABOVE & Double = js.native
    
    /* 5 */ val BEGIN: typingsJapgolly.vexflow.Vex.Flow.StaveModifier.Position.BEGIN & Double = js.native
    
    /* 4 */ val BELOW: typingsJapgolly.vexflow.Vex.Flow.StaveModifier.Position.BELOW & Double = js.native
    
    /* 6 */ val END: typingsJapgolly.vexflow.Vex.Flow.StaveModifier.Position.END & Double = js.native
    
    /* 1 */ val LEFT: typingsJapgolly.vexflow.Vex.Flow.StaveModifier.Position.LEFT & Double = js.native
    
    /* 2 */ val RIGHT: typingsJapgolly.vexflow.Vex.Flow.StaveModifier.Position.RIGHT & Double = js.native
  }
}
