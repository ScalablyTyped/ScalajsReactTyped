package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distListboxSrcListboxContextMod.ListboxContextType
import typingsJapgolly.orbitUiReactComponents.distListboxSrcListboxMod.InnerListboxProps
import typingsJapgolly.orbitUiReactComponents.distListboxSrcListboxMod.ListboxElement
import typingsJapgolly.orbitUiReactComponents.distListboxSrcListboxOptionMod.InnerListboxOptionProps
import typingsJapgolly.orbitUiReactComponents.distListboxSrcListboxSectionMod.InnerListboxSectionProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListboxSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerListbox(
    hasIdSelectedKeysPropDefaultSelectedKeysValidationStateOnSelectionChangeOnFocusChangeSelectionModeNodesPropAutoFocusDefaultFocusTargetFocusOnHoverUseVirtualFocusTabbableFluidAriaLabelAriaLabelledByAsChildrenForwardedRefRest: InnerListboxProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerListbox")(hasIdSelectedKeysPropDefaultSelectedKeysValidationStateOnSelectionChangeOnFocusChangeSelectionModeNodesPropAutoFocusDefaultFocusTargetFocusOnHoverUseVirtualFocusTabbableFluidAriaLabelAriaLabelledByAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerListboxOption(hasHasKeyTooltipIdDisabledActiveFocusHoverAsChildrenForwardedRefRest: InnerListboxOptionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerListboxOption")(hasHasKeyTooltipIdDisabledActiveFocusHoverAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerListboxSection(hasIdTitleAsChildrenForwardedRefRest: InnerListboxSectionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerListboxSection")(hasIdTitleAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src", "Listbox")
  @js.native
  val Listbox: OrbitComponent[ListboxElement, InnerListboxProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src", "ListboxContext")
  @js.native
  val ListboxContext: Context[ListboxContextType] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src", "ListboxOption")
  @js.native
  val ListboxOption: OrbitComponent[HTMLElement, InnerListboxOptionProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src", "ListboxSection")
  @js.native
  val ListboxSection: OrbitComponent[HTMLElement, InnerListboxSectionProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src", "OptionKeyProp")
  @js.native
  val OptionKeyProp: /* "data-o-ui-key" */ String = js.native
  
  inline def useListboxContext(): ListboxContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useListboxContext")().asInstanceOf[ListboxContextType]
}
