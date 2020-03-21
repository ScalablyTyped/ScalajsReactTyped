package typingsJapgolly.vexflow.mod.Flow

import typingsJapgolly.vexflow.AnonCache
import typingsJapgolly.vexflow.AnonOutline
import typingsJapgolly.vexflow.Vex.IFont
import typingsJapgolly.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Glyph")
@js.native
class Glyph protected ()
  extends typingsJapgolly.vexflow.Vex.Flow.Glyph {
  def this(code: String, point: Double) = this()
  def this(code: String, point: Double, options: AnonCache) = this()
}

/* static members */
@JSImport("vexflow", "Flow.Glyph")
@js.native
object Glyph extends js.Object {
  def loadMetrics(font: IFont, code: String, cache: Boolean): AnonOutline = js.native
  def renderOutline(ctx: IRenderContext, outline: js.Array[Double], scale: Double, x_pos: Double, y_pos: Double): Unit = js.native
}

