package typingsJapgolly.vexflow.mod.Flow

import org.scalajs.dom.raw.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.CanvasContext")
@js.native
class CanvasContext protected ()
  extends typingsJapgolly.vexflow.Vex.Flow.CanvasContext {
  def this(context: CanvasRenderingContext2D) = this()
}

/* static members */
@JSImport("vexflow", "Flow.CanvasContext")
@js.native
object CanvasContext extends js.Object {
  var HEIGHT: Double = js.native
  var WIDTH: Double = js.native
}

