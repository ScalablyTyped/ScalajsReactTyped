package typingsJapgolly.uirouterCore.viewViewMod

import typingsJapgolly.uirouterCore.viewInterfaceMod.ActiveUIView
import typingsJapgolly.uirouterCore.viewInterfaceMod.ViewConfig
import typingsJapgolly.uirouterCore.viewInterfaceMod.ViewContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewServicePluginAPI extends js.Object {
  def _activeViewConfigs(): js.Array[ViewConfig] = js.native
  def _onSync(listener: ViewSyncListener): js.Function = js.native
  /** @param id router.$id + "." + uiView.id */
  def _registeredUIView(id: String): ActiveUIView = js.native
  def _registeredUIViews(): js.Array[ActiveUIView] = js.native
  def _rootViewContext(): ViewContext = js.native
  def _rootViewContext(context: ViewContext): ViewContext = js.native
  def _viewConfigFactory(viewType: String, factory: ViewConfigFactory): js.Any = js.native
}

