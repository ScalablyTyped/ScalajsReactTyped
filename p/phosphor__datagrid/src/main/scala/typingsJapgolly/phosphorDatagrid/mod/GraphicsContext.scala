package typingsJapgolly.phosphorDatagrid.mod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid", "GraphicsContext")
@js.native
class GraphicsContext protected ()
  extends typingsJapgolly.phosphorDatagrid.graphicscontextMod.GraphicsContext {
  /**
    * Create a new graphics context object.
    *
    * @param context - The 2D canvas rendering context to wrap.
    */
  def this(context: CanvasRenderingContext2D) = this()
}

