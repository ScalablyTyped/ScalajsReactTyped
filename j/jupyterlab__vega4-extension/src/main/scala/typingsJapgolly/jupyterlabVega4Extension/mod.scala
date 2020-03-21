package typingsJapgolly.jupyterlabVega4Extension

import typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtension
import typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererFactory
import typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererOptions
import typingsJapgolly.jupyterlabVega4Extension.jupyterlabVega4ExtensionStrings.applicationSlashvndDotvegaDotv4Plussignjson
import typingsJapgolly.jupyterlabVega4Extension.jupyterlabVega4ExtensionStrings.applicationSlashvndDotvegaliteDotv2Plussignjson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/vega4-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RenderedVega protected () extends IRenderer {
    /**
      * Create a new widget for rendering Vega/Vega-Lite.
      */
    def this(options: IRendererOptions) = this()
    var _mimeType: js.Any = js.native
    var _resolver: js.Any = js.native
    var _result: js.Any = js.native
  }
  
  val VEGALITE_MIME_TYPE: applicationSlashvndDotvegaliteDotv2Plussignjson = js.native
  val VEGA_MIME_TYPE: applicationSlashvndDotvegaDotv4Plussignjson = js.native
  val default: IExtension = js.native
  val rendererFactory: IRendererFactory = js.native
}

