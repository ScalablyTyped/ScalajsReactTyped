package typingsJapgolly.vexflow.global.Vex.Flow

import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.Family
import typingsJapgolly.vexflow.anon.Firstindices
import typingsJapgolly.vexflow.anon.Firstxpx
import typingsJapgolly.vexflow.anon.Lastindices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.TabTie")
@js.native
open class TabTie protected ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.TabTie {
  def this(notes: Firstindices) = this()
  def this(notes: Firstindices, text: String) = this()
  
  /* CompleteClass */
  override def createHammeron(notes: Firstindices): typingsJapgolly.vexflow.Vex.Flow.TabTie = js.native
  
  /* CompleteClass */
  override def createPulloff(notes: Firstindices): typingsJapgolly.vexflow.Vex.Flow.TabTie = js.native
  
  /* CompleteClass */
  override def draw(): Boolean = js.native
  
  /* CompleteClass */
  override def isPartial(): Boolean = js.native
  
  /* CompleteClass */
  override def renderText(first_x_px: Double, last_x_px: Double): Unit = js.native
  
  /* CompleteClass */
  override def renderTie(params: Firstxpx): Unit = js.native
  
  /* CompleteClass */
  override def setContext(context: IRenderContext): typingsJapgolly.vexflow.Vex.Flow.StaveTie = js.native
  
  /* CompleteClass */
  override def setFont(font: Family): typingsJapgolly.vexflow.Vex.Flow.StaveTie = js.native
  
  /* CompleteClass */
  override def setNotes(notes: Lastindices): typingsJapgolly.vexflow.Vex.Flow.StaveTie = js.native
}
