package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.anon.Close
import typingsJapgolly.orbitUiReactComponents.distSelectSrcHiddenSelectMod.HiddenSelectProps
import typingsJapgolly.orbitUiReactComponents.distSelectSrcSelectMod.InnerSelectProps
import typingsJapgolly.orbitUiReactComponents.distSelectSrcUseSelectMod.UseSelectProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSelectSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/select/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object HiddenSelect {
    
    inline def apply(hasNameSelectedKeyRequiredValidationStateRest: HiddenSelectProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasNameSelectedKeyRequiredValidationStateRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@orbit-ui/react-components/dist/select/src", "HiddenSelect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@orbit-ui/react-components/dist/select/src", "HiddenSelect.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  inline def InnerSelect(props: InnerSelectProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerSelect")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/select/src", "Select")
  @js.native
  val Select: OrbitComponent[HTMLElement, InnerSelectProps] = js.native
  
  inline def useSelect(
    children: Node,
    hasIdOpenPropDefaultOpenSelectedKeyPropDefaultSelectedKeyValidationStateOnSelectionChangeOnOpenChangeDirectionAlignAutoFocusDisabledReadOnlyAllowFlipAllowPreventOverflowAllowResponsiveMenuWidthAriaLabelAriaLabelledByAriaDescribedByHasMenuIdHasMenuWidthMenuStyleMenuPropsRef: UseSelectProps
  ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("useSelect")(children.asInstanceOf[js.Any], hasIdOpenPropDefaultOpenSelectedKeyPropDefaultSelectedKeyValidationStateOnSelectionChangeOnOpenChangeDirectionAlignAutoFocusDisabledReadOnlyAllowFlipAllowPreventOverflowAllowResponsiveMenuWidthAriaLabelAriaLabelledByAriaDescribedByHasMenuIdHasMenuWidthMenuStyleMenuPropsRef.asInstanceOf[js.Any])).asInstanceOf[Close]
}
