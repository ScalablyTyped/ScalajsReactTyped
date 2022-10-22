package typingsJapgolly.luminoWidgets.mod

import typingsJapgolly.luminoWidgets.typesDockpanelMod.DockPanel.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "DockPanel")
@js.native
/**
  * Construct a new dock panel.
  *
  * @param options - The options for initializing the panel.
  */
open class DockPanel ()
  extends typingsJapgolly.luminoWidgets.typesDockpanelMod.DockPanel {
  def this(options: IOptions) = this()
}
object DockPanel {
  
  /**
    * A concrete implementation of `IOverlay`.
    *
    * This is the default overlay implementation for a dock panel.
    */
  @JSImport("@lumino/widgets", "DockPanel.Overlay")
  @js.native
  /**
    * Construct a new overlay.
    */
  open class Overlay ()
    extends typingsJapgolly.luminoWidgets.typesDockpanelMod.DockPanel.Overlay
  
  /**
    * The default implementation of `IRenderer`.
    */
  @JSImport("@lumino/widgets", "DockPanel.Renderer")
  @js.native
  open class Renderer ()
    extends typingsJapgolly.luminoWidgets.typesDockpanelMod.DockPanel.Renderer
  
  /**
    * The default `Renderer` instance.
    */
  @JSImport("@lumino/widgets", "DockPanel.defaultRenderer")
  @js.native
  val defaultRenderer: typingsJapgolly.luminoWidgets.typesDockpanelMod.DockPanel.Renderer = js.native
}
