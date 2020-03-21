package typingsJapgolly.agGrid.loadingOverlayComponentMod

import typingsJapgolly.agGrid.componentMod.Component
import typingsJapgolly.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/overlays/loadingOverlayComponent", "LoadingOverlayComponent")
@js.native
class LoadingOverlayComponent () extends Component {
  var gridOptionsWrapper: GridOptionsWrapper = js.native
  @JSName("init")
  def init_MLoadingOverlayComponent(params: ILoadingOverlayParams): Unit = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rendering/overlays/loadingOverlayComponent", "LoadingOverlayComponent")
@js.native
object LoadingOverlayComponent extends js.Object {
  var DEFAULT_LOADING_OVERLAY_TEMPLATE: js.Any = js.native
}

