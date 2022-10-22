package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distPopoverSrcPopoverMod.InnerPopoverProps
import typingsJapgolly.orbitUiReactComponents.distPopoverSrcPopoverTriggerContextMod.PopoverTriggerContextType
import typingsJapgolly.orbitUiReactComponents.distPopoverSrcPopoverTriggerMod.InnerPopoverTriggerProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPopoverMod {
  
  @JSImport("@orbit-ui/react-components/dist/popover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerPopover(hasIdFocusAriaLabelAriaLabelledByAsChildrenForwardedRefRest: InnerPopoverProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerPopover")(hasIdFocusAriaLabelAriaLabelledByAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerPopoverTrigger(
    hasIdOpenDefaultOpenPositionPropOnOpenChangeDismissableAllowFlipAllowPreventOverflowContainerElementZIndexAsChildrenForwardedRefRest: InnerPopoverTriggerProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerPopoverTrigger")(hasIdOpenDefaultOpenPositionPropOnOpenChangeDismissableAllowFlipAllowPreventOverflowContainerElementZIndexAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/popover", "Popover")
  @js.native
  val Popover: OrbitComponent[HTMLElement, InnerPopoverProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/popover", "PopoverTrigger")
  @js.native
  val PopoverTrigger: OrbitComponent[HTMLElement, InnerPopoverTriggerProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/popover", "PopoverTriggerContext")
  @js.native
  val PopoverTriggerContext: Context[PopoverTriggerContextType] = js.native
  
  inline def usePopoverTriggerContext(): PopoverTriggerContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("usePopoverTriggerContext")().asInstanceOf[PopoverTriggerContextType]
}
