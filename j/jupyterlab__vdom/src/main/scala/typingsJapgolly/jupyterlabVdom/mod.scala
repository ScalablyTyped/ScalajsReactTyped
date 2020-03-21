package typingsJapgolly.jupyterlabVdom

import typingsJapgolly.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsJapgolly.jupyterlabDocregistry.mod.MimeDocument
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererOptions
import typingsJapgolly.nteractTransformVdom.eventToObjectMod.SerializedEvent
import typingsJapgolly.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/vdom", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RenderedVDOM protected () extends IRenderer {
    /**
      * Create a new widget for rendering DOM.
      */
    def this(options: IRendererOptions) = this()
    def this(options: IRendererOptions, context: IContext[IModel]) = this()
    var _comms: js.Any = js.native
    var _mimeType: js.Any = js.native
    var _session: js.UndefOr[js.Any] = js.native
    var _timer: js.Any = js.native
    /**
      * Handle events for VDOM element.
      */
    def handleVDOMEvent(targetName: String, event: SerializedEvent[_]): Unit = js.native
  }
  
  val IVDOMTracker: Token[typingsJapgolly.jupyterlabVdom.mod.IVDOMTracker] = js.native
  type IVDOMTracker = IWidgetTracker[MimeDocument]
}

