package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.ChildrenReactNode
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverDottypesMod.PopoverProps
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverDottypesMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopoverDottypes {
  
  object Content {
    
    @JSImport("wix-style-react/dist/types/Popover/Popover.types", "default.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ChildrenReactNode): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Element {
    
    @JSImport("wix-style-react/dist/types/Popover/Popover.types", "default.Element")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Element.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ChildrenReactNode): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("wix-style-react/dist/types/Popover/Popover.types", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PopoverDottypes.type): SharedBuilder_PopoverProps_839399539[default] = new SharedBuilder_PopoverProps_839399539[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PopoverProps): SharedBuilder_PopoverProps_839399539[default] = new SharedBuilder_PopoverProps_839399539[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
