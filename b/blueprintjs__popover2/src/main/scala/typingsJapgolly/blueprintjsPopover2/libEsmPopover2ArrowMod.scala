package typingsJapgolly.blueprintjsPopover2

import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactPopper.mod.PopperArrowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPopover2ArrowMod {
  
  @JSImport("@blueprintjs/popover2/lib/esm/popover2Arrow", "POPOVER_ARROW_SVG_SIZE")
  @js.native
  val POPOVER_ARROW_SVG_SIZE: /* 30 */ Double = js.native
  
  @JSImport("@blueprintjs/popover2/lib/esm/popover2Arrow", "Popover2Arrow")
  @js.native
  val Popover2Arrow: FC[IPopoverArrowProps] = js.native
  
  @JSImport("@blueprintjs/popover2/lib/esm/popover2Arrow", "TOOLTIP_ARROW_SVG_SIZE")
  @js.native
  val TOOLTIP_ARROW_SVG_SIZE: /* 22 */ Double = js.native
  
  trait IPopoverArrowProps extends StObject {
    
    var arrowProps: PopperArrowProps
    
    var placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ Any
  }
  object IPopoverArrowProps {
    
    inline def apply(
      arrowProps: PopperArrowProps,
      placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ Any
    ): IPopoverArrowProps = {
      val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPopoverArrowProps]
    }
    
    extension [Self <: IPopoverArrowProps](x: Self) {
      
      inline def setArrowProps(value: PopperArrowProps): Self = StObject.set(x, "arrowProps", value.asInstanceOf[js.Any])
      
      inline def setPlacement(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ Any
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
}
