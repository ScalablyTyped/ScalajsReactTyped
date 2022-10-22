package typingsJapgolly.blueprintjsCore.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.blueprintjsCore.libEsmComponentsPopoverPopoverArrowMod.IPopoverArrowProps
import typingsJapgolly.popperJs.mod.Placement
import typingsJapgolly.reactPopper.mod.PopperArrowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopoverArrow {
  
  inline def apply(arrowProps: PopperArrowProps, placement: Placement): Default[js.Object] = {
    val __props = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[IPopoverArrowProps]))
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverArrow", "PopoverArrow")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IPopoverArrowProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
