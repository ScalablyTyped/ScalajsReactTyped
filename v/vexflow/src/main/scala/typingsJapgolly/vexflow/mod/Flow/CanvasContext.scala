package typingsJapgolly.vexflow.mod.Flow

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.CanvasContext")
@js.native
open class CanvasContext protected ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.CanvasContext {
  def this(context: CanvasRenderingContext2D) = this()
}
object CanvasContext {
  
  @JSImport("vexflow", "Flow.CanvasContext")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.CanvasContext.HEIGHT")
  @js.native
  def HEIGHT: Double = js.native
  inline def HEIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEIGHT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("vexflow", "Flow.CanvasContext.WIDTH")
  @js.native
  def WIDTH: Double = js.native
  inline def WIDTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WIDTH")(x.asInstanceOf[js.Any])
}
