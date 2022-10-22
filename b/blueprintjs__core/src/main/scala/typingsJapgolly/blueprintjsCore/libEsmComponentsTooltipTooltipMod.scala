package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.blueprintjsCore.anon.PartialTooltipProps
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`hover-target`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.hover
import typingsJapgolly.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.IIntentProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsPopoverPopoverSharedPropsMod.IPopoverSharedProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsTooltipTooltipMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/tooltip/tooltip", "Tooltip")
  @js.native
  open class Tooltip protected ()
    extends AbstractPureComponent2[TooltipProps, js.Object, js.Object] {
    def this(props: TooltipProps) = this()
    def this(props: TooltipProps, context: Any) = this()
    
    /* private */ var popover: Any = js.native
    
    def reposition(): Unit = js.native
  }
  /* static members */
  object Tooltip {
    
    @JSImport("@blueprintjs/core/lib/esm/components/tooltip/tooltip", "Tooltip")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/tooltip/tooltip", "Tooltip.defaultProps")
    @js.native
    def defaultProps: PartialTooltipProps = js.native
    inline def defaultProps_=(x: PartialTooltipProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/tooltip/tooltip", "Tooltip.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait ITooltipProps
    extends StObject
       with IPopoverSharedProps
       with IIntentProps {
    
    /**
      * The content that will be displayed inside of the tooltip.
      */
    var content: Element | String
    
    /**
      * The kind of hover interaction that triggers the display of the tooltip.
      * Tooltips do not support click interactions.
      *
      * @default PopoverInteractionKind.HOVER_TARGET_ONLY
      */
    var interactionKind: js.UndefOr[hover | `hover-target`] = js.undefined
  }
  object ITooltipProps {
    
    inline def apply(content: Element | String): ITooltipProps = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipProps]
    }
    
    extension [Self <: ITooltipProps](x: Self) {
      
      inline def setContent(value: Element | String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInteractionKind(value: hover | `hover-target`): Self = StObject.set(x, "interactionKind", value.asInstanceOf[js.Any])
      
      inline def setInteractionKindUndefined: Self = StObject.set(x, "interactionKind", js.undefined)
    }
  }
  
  type TooltipProps = ITooltipProps
}
