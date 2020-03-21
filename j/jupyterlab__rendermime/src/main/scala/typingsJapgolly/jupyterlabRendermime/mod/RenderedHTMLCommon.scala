package typingsJapgolly.jupyterlabRendermime.mod

import typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime", "RenderedHTMLCommon")
@js.native
abstract class RenderedHTMLCommon protected ()
  extends typingsJapgolly.jupyterlabRendermime.widgetsMod.RenderedHTMLCommon {
  /**
    * Construct a new rendered HTML common widget.
    *
    * @param options - The options for initializing the widget.
    */
  def this(options: IRendererOptions) = this()
}

