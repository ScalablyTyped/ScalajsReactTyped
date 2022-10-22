package typingsJapgolly.vexflow.global.Vex.Flow

import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.Cps
import typingsJapgolly.vexflow.anon.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Curve")
@js.native
open class Curve protected ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.Curve {
  def this(from: typingsJapgolly.vexflow.Vex.Flow.Note, to: typingsJapgolly.vexflow.Vex.Flow.Note) = this()
  def this(
    from: typingsJapgolly.vexflow.Vex.Flow.Note,
    to: typingsJapgolly.vexflow.Vex.Flow.Note,
    options: Cps
  ) = this()
  
  /* CompleteClass */
  override def draw(): Boolean = js.native
  
  /* CompleteClass */
  override def isPartial(): Boolean = js.native
  
  /* CompleteClass */
  override def renderCurve(params: Direction): Unit = js.native
  
  /* CompleteClass */
  override def setContext(context: IRenderContext): typingsJapgolly.vexflow.Vex.Flow.Curve = js.native
  
  /* CompleteClass */
  override def setNotes(from: typingsJapgolly.vexflow.Vex.Flow.Note, to: typingsJapgolly.vexflow.Vex.Flow.Note): typingsJapgolly.vexflow.Vex.Flow.Curve = js.native
}
object Curve {
  
  @JSGlobal("Vex.Flow.Curve")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.Curve.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Vex.Flow.Curve.Position")
  @js.native
  object Position extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.vexflow.Vex.Flow.Curve.Position & Double] = js.native
    
    /* 1 */ val NEAR_HEAD: typingsJapgolly.vexflow.Vex.Flow.Curve.Position.NEAR_HEAD & Double = js.native
    
    /* 0 */ val NEAR_TOP: typingsJapgolly.vexflow.Vex.Flow.Curve.Position.NEAR_TOP & Double = js.native
  }
}
