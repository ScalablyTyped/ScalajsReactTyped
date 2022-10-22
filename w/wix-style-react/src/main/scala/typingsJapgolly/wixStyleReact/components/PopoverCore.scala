package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverCoreUtilsUtilsMod.ElementProps
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverDottypesMod.PopoverProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopoverCore {
  
  object Content {
    
    inline def apply(children: Any): Default[js.Object] = {
      val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ElementProps]))
    }
    
    @JSImport("wix-style-react/dist/types/Popover/PopoverCore/PopoverCore", "PopoverCore.Content")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: ElementProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Element {
    
    inline def apply(children: Any): Default[js.Object] = {
      val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ElementProps]))
    }
    
    @JSImport("wix-style-react/dist/types/Popover/PopoverCore/PopoverCore", "PopoverCore.Element")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: ElementProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("wix-style-react/dist/types/Popover/PopoverCore/PopoverCore", "PopoverCore")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PopoverCore.type): SharedBuilder_PopoverProps_839399539[
    typingsJapgolly.wixStyleReact.distTypesPopoverPopoverCorePopoverCoreMod.PopoverCore
  ] = new SharedBuilder_PopoverProps_839399539[
    typingsJapgolly.wixStyleReact.distTypesPopoverPopoverCorePopoverCoreMod.PopoverCore
  ](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PopoverProps): SharedBuilder_PopoverProps_839399539[
    typingsJapgolly.wixStyleReact.distTypesPopoverPopoverCorePopoverCoreMod.PopoverCore
  ] = new SharedBuilder_PopoverProps_839399539[
    typingsJapgolly.wixStyleReact.distTypesPopoverPopoverCorePopoverCoreMod.PopoverCore
  ](js.Array(this.component, p.asInstanceOf[js.Any]))
}
