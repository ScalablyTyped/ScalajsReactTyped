package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distDateInputSrcDateInputMod.InnerDateInputProps
import typingsJapgolly.orbitUiReactComponents.distDateInputSrcDateRangeInputMod.InnerDateRangeInputProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.input
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDateInputSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src", "DateInput")
  @js.native
  val DateInput: OrbitComponent[input, InnerDateInputProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src", "DateRangeInput")
  @js.native
  val DateRangeInput: OrbitComponent[HTMLElement, InnerDateRangeInputProps] = js.native
  
  inline def InnerDateInput(
    hasValuePropDefaultValuePlaceholderOnDateChangePresetsPresetsVariantFluidWrapperPropsDisabledReadOnlyClassNameStyleAsForwardedRefRest: InnerDateInputProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDateInput")(hasValuePropDefaultValuePlaceholderOnDateChangePresetsPresetsVariantFluidWrapperPropsDisabledReadOnlyClassNameStyleAsForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerDateRangeInput(props: InnerDateRangeInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDateRangeInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
