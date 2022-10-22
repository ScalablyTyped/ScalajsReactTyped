package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressComponents.anon.PartialButtonProps
import typingsJapgolly.wordpressComponents.anon.PartialProps
import typingsJapgolly.wordpressComponents.anon.PartialPropsAbout
import typingsJapgolly.wordpressComponents.dropdownMenuMod.DropdownMenu.Control
import typingsJapgolly.wordpressComponents.dropdownMod.Dropdown.RenderProps
import typingsJapgolly.wordpressComponents.popoverMod.Popover.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownMenu {
  
  object PropsWithChildren {
    
    inline def apply(children: RenderProps => Element, label: String): Builder = {
      val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), label = label.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithChildren]))
    }
    
    @JSImport("@wordpress/components", "DropdownMenu")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def disableOpenOnArrowDown(value: Boolean): this.type = set("disableOpenOnArrowDown", value.asInstanceOf[js.Any])
      
      inline def icon(value: typingsJapgolly.wordpressComponents.dashiconMod.Dashicon.Icon | Element): this.type = set("icon", value.asInstanceOf[js.Any])
      
      inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def menuLabel(value: String): this.type = set("menuLabel", value.asInstanceOf[js.Any])
      
      inline def menuProps(value: PartialProps): this.type = set("menuProps", value.asInstanceOf[js.Any])
      
      inline def popoverProps(value: PartialPropsAbout): this.type = set("popoverProps", value.asInstanceOf[js.Any])
      
      inline def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
      
      inline def toggleProps(value: PartialButtonProps): this.type = set("toggleProps", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithChildren): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object PropsWithControls {
    
    inline def apply(controls: js.Array[Control], label: String): Builder = {
      val __props = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithControls]))
    }
    
    @JSImport("@wordpress/components", "DropdownMenu")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def disableOpenOnArrowDown(value: Boolean): this.type = set("disableOpenOnArrowDown", value.asInstanceOf[js.Any])
      
      inline def icon(value: typingsJapgolly.wordpressComponents.dashiconMod.Dashicon.Icon | Element): this.type = set("icon", value.asInstanceOf[js.Any])
      
      inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def menuLabel(value: String): this.type = set("menuLabel", value.asInstanceOf[js.Any])
      
      inline def menuProps(value: PartialProps): this.type = set("menuProps", value.asInstanceOf[js.Any])
      
      inline def popoverProps(value: PartialPropsAbout): this.type = set("popoverProps", value.asInstanceOf[js.Any])
      
      inline def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
      
      inline def toggleProps(value: PartialButtonProps): this.type = set("toggleProps", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithControls): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
