package typingsJapgolly.orbitUiReactComponents.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.orbitUiReactComponents.distTabsSrcTabPanelsMod.TabPanelsProps
import typingsJapgolly.orbitUiReactComponents.distTabsSrcUseTabsItemsMod.PanelType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabPanels {
  
  inline def apply(panels: js.Array[PanelType]): Default[js.Object] = {
    val __props = js.Dynamic.literal(panels = panels.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[TabPanelsProps]))
  }
  
  @JSImport("@orbit-ui/react-components", "TabPanels")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TabPanelsProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
