package typingsJapgolly.vexflow.global.Vex.Flow

import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.Bracketed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Tuplet")
@js.native
open class Tuplet protected ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.Tuplet {
  def this(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.StaveNote]) = this()
  def this(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.StaveNote], options: Bracketed) = this()
  
  /* CompleteClass */
  override def attach(): Unit = js.native
  
  /* CompleteClass */
  override def detach(): Unit = js.native
  
  /* CompleteClass */
  override def draw(): Unit = js.native
  
  /* CompleteClass */
  override def getBeatsOccupied(): Double = js.native
  
  /* CompleteClass */
  override def getNoteCount(): Double = js.native
  
  /* CompleteClass */
  override def getNotes(): js.Array[typingsJapgolly.vexflow.Vex.Flow.StaveNote] = js.native
  
  /* CompleteClass */
  override def resolveGlyphs(): Unit = js.native
  
  /* CompleteClass */
  override def setBeatsOccupied(beats: Double): Unit = js.native
  
  /* CompleteClass */
  override def setBracketed(bracketed: Boolean): typingsJapgolly.vexflow.Vex.Flow.Tuplet = js.native
  
  /* CompleteClass */
  override def setContext(context: IRenderContext): typingsJapgolly.vexflow.Vex.Flow.Tuplet = js.native
  
  /* CompleteClass */
  override def setRatioed(ratioed: Boolean): typingsJapgolly.vexflow.Vex.Flow.Tuplet = js.native
  
  /* CompleteClass */
  override def setTupletLocation(location: Double): typingsJapgolly.vexflow.Vex.Flow.Tuplet = js.native
}
object Tuplet {
  
  @JSGlobal("Vex.Flow.Tuplet.LOCATION_BOTTOM")
  @js.native
  val LOCATION_BOTTOM: Double = js.native
  
  @JSGlobal("Vex.Flow.Tuplet.LOCATION_TOP")
  @js.native
  val LOCATION_TOP: Double = js.native
}
