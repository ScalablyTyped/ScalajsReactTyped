package typingsJapgolly.vexflow.global.Vex.Flow

import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.Beammiddleonly
import typingsJapgolly.vexflow.anon.End
import typingsJapgolly.vexflow.anon.FillStyle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Beam")
@js.native
open class Beam protected ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.Beam {
  def this(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.StemmableNote]) = this()
  def this(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.StemmableNote], auto_stem: Boolean) = this()
  
  /* CompleteClass */
  override def applyStemExtensions(): Unit = js.native
  
  /* CompleteClass */
  override def breakSecondaryAt(indices: js.Array[Double]): typingsJapgolly.vexflow.Vex.Flow.Beam = js.native
  
  /* CompleteClass */
  override def calculateSlope(): Unit = js.native
  
  /* CompleteClass */
  override def calculateStemDirection(notes: typingsJapgolly.vexflow.Vex.Flow.Note): Double = js.native
  
  /* CompleteClass */
  override def draw(): Boolean = js.native
  
  /* CompleteClass */
  override def drawBeamLines(): Unit = js.native
  
  /* CompleteClass */
  override def drawStems(): Unit = js.native
  
  /* CompleteClass */
  override def getBeamCount(): Double = js.native
  
  /* CompleteClass */
  override def getBeamLines(duration: String): js.Array[End] = js.native
  
  /* CompleteClass */
  override def getNotes(): js.Array[typingsJapgolly.vexflow.Vex.Flow.StemmableNote] = js.native
  
  /* CompleteClass */
  override def getSlopeY(): Double = js.native
  
  /* CompleteClass */
  override def postFormat(): typingsJapgolly.vexflow.Vex.Flow.Beam = js.native
  
  /* CompleteClass */
  override def preFormat(): typingsJapgolly.vexflow.Vex.Flow.Beam = js.native
  
  /* CompleteClass */
  override def setContext(context: IRenderContext): typingsJapgolly.vexflow.Vex.Flow.Beam = js.native
  
  /* CompleteClass */
  override def setStyle(style: FillStyle_): typingsJapgolly.vexflow.Vex.Flow.Beam = js.native
}
object Beam {
  
  @JSGlobal("Vex.Flow.Beam")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def applyAndGetBeams(
    voice: typingsJapgolly.vexflow.Vex.Flow.Voice,
    stem_direction: Double,
    groups: js.Array[typingsJapgolly.vexflow.Vex.Flow.Fraction]
  ): js.Array[typingsJapgolly.vexflow.Vex.Flow.Beam] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyAndGetBeams")(voice.asInstanceOf[js.Any], stem_direction.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.vexflow.Vex.Flow.Beam]]
  
  /* static member */
  inline def generateBeams(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.StemmableNote]): js.Array[typingsJapgolly.vexflow.Vex.Flow.Beam] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateBeams")(notes.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.vexflow.Vex.Flow.Beam]]
  inline def generateBeams(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.StemmableNote], config: Beammiddleonly): js.Array[typingsJapgolly.vexflow.Vex.Flow.Beam] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateBeams")(notes.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.vexflow.Vex.Flow.Beam]]
  
  /* static member */
  inline def getDefaultBeamGroups(time_sig: String): js.Array[typingsJapgolly.vexflow.Vex.Flow.Fraction] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultBeamGroups")(time_sig.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.vexflow.Vex.Flow.Fraction]]
}
