package typingsJapgolly.vexflow.global.Vex.Flow

import typingsJapgolly.vexflow.Vex.IFont
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.Cache
import typingsJapgolly.vexflow.anon.Outline
import typingsJapgolly.vexflow.anon.Xmax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Glyph")
@js.native
open class Glyph protected ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.Glyph {
  def this(code: String, point: Double) = this()
  def this(code: String, point: Double, options: Cache) = this()
  
  /* CompleteClass */
  override def getContext(): IRenderContext = js.native
  
  /* CompleteClass */
  override def getMetrics(): Xmax = js.native
  
  /* CompleteClass */
  override def render(ctx: IRenderContext, x_pos: Double, y_pos: Double): Unit = js.native
  
  /* CompleteClass */
  override def renderToStave(x: Double): Unit = js.native
  
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /* CompleteClass */
  override def setContext(context: IRenderContext): typingsJapgolly.vexflow.Vex.Flow.Glyph = js.native
  
  /* CompleteClass */
  override def setOptions(options: Cache): Unit = js.native
  
  /* CompleteClass */
  override def setStave(stave: typingsJapgolly.vexflow.Vex.Flow.Stave): typingsJapgolly.vexflow.Vex.Flow.Glyph = js.native
  
  /* CompleteClass */
  override def setWidth(width: Double): typingsJapgolly.vexflow.Vex.Flow.Glyph = js.native
  
  /* CompleteClass */
  override def setXShift(x_shift: Double): typingsJapgolly.vexflow.Vex.Flow.Glyph = js.native
  
  /* CompleteClass */
  override def setYShift(y_shift: Double): typingsJapgolly.vexflow.Vex.Flow.Glyph = js.native
}
object Glyph {
  
  @JSGlobal("Vex.Flow.Glyph")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def loadMetrics(font: IFont, code: String, cache: Boolean): Outline = (^.asInstanceOf[js.Dynamic].applyDynamic("loadMetrics")(font.asInstanceOf[js.Any], code.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[Outline]
  
  /* static member */
  inline def renderOutline(ctx: IRenderContext, outline: js.Array[Double], scale: Double, x_pos: Double, y_pos: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderOutline")(ctx.asInstanceOf[js.Any], outline.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], x_pos.asInstanceOf[js.Any], y_pos.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
