package typingsJapgolly.jupyterlabInspector

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.jupyterlabInspector.handlerMod.InspectionHandler.IOptions
import typingsJapgolly.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/inspector", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class InspectionHandler protected ()
    extends typingsJapgolly.jupyterlabInspector.handlerMod.InspectionHandler {
    /**
      * Construct a new inspection handler for a widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  /**
    * Construct an inspector.
    */
  class InspectorPanel ()
    extends typingsJapgolly.jupyterlabInspector.inspectorMod.InspectorPanel {
    def this(options: typingsJapgolly.jupyterlabInspector.inspectorMod.InspectorPanel.IOptions) = this()
  }
  
  @js.native
  class KernelConnector protected ()
    extends typingsJapgolly.jupyterlabInspector.kernelconnectorMod.KernelConnector {
    /**
      * Create a new kernel connector for inspection requests.
      *
      * @param options - The instatiation options for the kernel connector.
      */
    def this(options: typingsJapgolly.jupyterlabInspector.kernelconnectorMod.KernelConnector.IOptions) = this()
  }
  
  @js.native
  object IInspector
    extends TopLevel[Token[typingsJapgolly.jupyterlabInspector.tokensMod.IInspector]]
  
  /* static members */
  @js.native
  object InspectorPanel extends js.Object {
    /**
      * Generate content widget from string
      */
    var _generateContentWidget: js.Any = js.native
  }
  
}

