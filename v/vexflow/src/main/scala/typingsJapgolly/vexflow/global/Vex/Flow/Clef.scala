package typingsJapgolly.vexflow.global.Vex.Flow

import typingsJapgolly.vexflow.anon.FillStyle_
import typingsJapgolly.vexflow.anon.GetContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Clef")
@js.native
open class Clef protected ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.Clef {
  def this(clef: String) = this()
  def this(clef: String, size: String) = this()
  def this(clef: String, size: String, annotation: String) = this()
  def this(clef: String, size: Unit, annotation: String) = this()
  
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
object Clef {
  
  @JSGlobal("Vex.Flow.Clef")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.Clef.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
}
