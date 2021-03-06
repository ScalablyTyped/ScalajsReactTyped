package typingsJapgolly.agGrid.overlayWrapperComponentMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.agGrid.componentMod.Component
import typingsJapgolly.agGrid.componentRecipesMod.ComponentRecipes
import typingsJapgolly.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.agGrid.iComponentMod.IComponent because Already inherited
- typingsJapgolly.agGrid.overlayWrapperComponentMod.IOverlayWrapperComp because var conflicts: afterGuiAttached, destroy, init. Inlined showLoadingOverlay, showNoRowsOverlay, hideOverlay */ @JSImport("ag-grid/dist/lib/rendering/overlays/overlayWrapperComponent", "OverlayWrapperComponent")
@js.native
class OverlayWrapperComponent () extends Component {
  var componentRecipes: ComponentRecipes = js.native
  var gridOptionsWrapper: GridOptionsWrapper = js.native
  def hideOverlay(eOverlayWrapper: HTMLElement): Unit = js.native
  @JSName("init")
  def init_MOverlayWrapperComponent(): Unit = js.native
  def showLoadingOverlay(eOverlayWrapper: HTMLElement): Unit = js.native
  def showNoRowsOverlay(eOverlayWrapper: HTMLElement): Unit = js.native
  /* private */ def showOverlay(eOverlayWrapper: js.Any, overlay: js.Any): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rendering/overlays/overlayWrapperComponent", "OverlayWrapperComponent")
@js.native
object OverlayWrapperComponent extends js.Object {
  var LOADING_WRAPPER_OVERLAY_TEMPLATE: js.Any = js.native
  var NO_ROWS_WRAPPER_OVERLAY_TEMPLATE: js.Any = js.native
}

