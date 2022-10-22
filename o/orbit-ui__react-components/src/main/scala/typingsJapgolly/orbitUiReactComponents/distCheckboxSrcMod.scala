package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distCheckboxSrcCheckboxGroupMod.InnerCheckboxGroupProps
import typingsJapgolly.orbitUiReactComponents.distCheckboxSrcCheckboxMod.InnerCheckboxProps
import typingsJapgolly.orbitUiReactComponents.distCheckboxSrcUseCheckboxMod.UseCheckboxProps
import typingsJapgolly.orbitUiReactComponents.distCheckboxSrcUseCheckboxMod.UseCheckboxReturn
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCheckboxSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/checkbox/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/checkbox/src", "Checkbox")
  @js.native
  val Checkbox: OrbitComponent[HTMLElement, InnerCheckboxProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/checkbox/src", "CheckboxGroup")
  @js.native
  val CheckboxGroup: OrbitComponent[HTMLElement, InnerCheckboxGroupProps] = js.native
  
  inline def InnerCheckbox(props: InnerCheckboxProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerCheckbox")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerCheckboxGroup(props: InnerCheckboxGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerCheckboxGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useCheckbox(
    hasModuleIsInFieldIdCheckedDefaultCheckedIndeterminateDefaultIndeterminateAutoFocusRequiredValidationStateOnChangeSizeReverseNameTabIndexActiveFocusHoverDisabledAriaLabelAriaLabelledByForwardedRef: UseCheckboxProps
  ): UseCheckboxReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("useCheckbox")(hasModuleIsInFieldIdCheckedDefaultCheckedIndeterminateDefaultIndeterminateAutoFocusRequiredValidationStateOnChangeSizeReverseNameTabIndexActiveFocusHoverDisabledAriaLabelAriaLabelledByForwardedRef.asInstanceOf[js.Any]).asInstanceOf[UseCheckboxReturn]
}
