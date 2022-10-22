package typingsJapgolly.blueprintjsPopover2.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.blueprintjsPopover2.libEsmPopover2ArrowMod.IPopoverArrowProps
import typingsJapgolly.reactPopper.mod.PopperArrowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popover2Arrow {
  
  inline def apply(
    arrowProps: PopperArrowProps,
    placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ Any
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[IPopoverArrowProps]))
  }
  
  @JSImport("@blueprintjs/popover2/lib/esm/popover2Arrow", "Popover2Arrow")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IPopoverArrowProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
