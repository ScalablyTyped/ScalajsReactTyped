package typingsJapgolly.phosphorWidgets.mod

import typingsJapgolly.phosphorWidgets.dockpanelMod.DockPanel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets", "DockPanel")
@js.native
/**
  * Construct a new dock panel.
  *
  * @param options - The options for initializing the panel.
  */
class DockPanel ()
  extends typingsJapgolly.phosphorWidgets.dockpanelMod.DockPanel {
  def this(options: IOptions) = this()
}

@JSImport("@phosphor/widgets", "DockPanel")
@js.native
object DockPanel extends js.Object {
  /**
    * A concrete implementation of `IOverlay`.
    *
    * This is the default overlay implementation for a dock panel.
    */
  @js.native
  /**
    * Construct a new overlay.
    */
  class Overlay ()
    extends typingsJapgolly.phosphorWidgets.dockpanelMod.DockPanel.Overlay
  
  /**
    * The default implementation of `IRenderer`.
    */
  @js.native
  class Renderer ()
    extends typingsJapgolly.phosphorWidgets.dockpanelMod.DockPanel.Renderer
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: typingsJapgolly.phosphorWidgets.dockpanelMod.DockPanel.Renderer = js.native
}

