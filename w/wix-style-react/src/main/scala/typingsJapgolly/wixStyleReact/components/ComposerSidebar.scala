package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesComposerSidebarMod.ComposerSidebarItem
import typingsJapgolly.wixStyleReact.distTypesComposerSidebarMod.ComposerSidebarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ComposerSidebar {
  
  @JSImport("wix-style-react", "ComposerSidebar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.ComposerSidebar] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def items(value: js.Array[ComposerSidebarItem]): this.type = set("items", value.asInstanceOf[js.Any])
    
    inline def itemsVarargs(value: ComposerSidebarItem*): this.type = set("items", js.Array(value*))
    
    inline def labelPlacement(
      value: /* import warning: importer.ImportType#apply Failed type conversion: wix-style-react.wix-style-react/dist/types/ToggleButton.ToggleButtonProps['labelPlacement'] */ js.Any
    ): this.type = set("labelPlacement", value.asInstanceOf[js.Any])
    
    inline def labelTooltipProps(
      value: /* import warning: importer.ImportType#apply Failed type conversion: wix-style-react.wix-style-react/dist/types/ToggleButton.ToggleButtonProps['tooltipProps'] */ js.Any
    ): this.type = set("labelTooltipProps", value.asInstanceOf[js.Any])
    
    inline def onClick(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
    
    inline def selectedId(value: Double | String): this.type = set("selectedId", value.asInstanceOf[js.Any])
    
    inline def size(value: String): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ComposerSidebar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ComposerSidebarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
