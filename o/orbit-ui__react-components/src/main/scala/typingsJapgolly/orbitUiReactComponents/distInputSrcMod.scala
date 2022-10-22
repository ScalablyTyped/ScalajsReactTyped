package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.orbitUiReactComponents.anon.InputProps
import typingsJapgolly.orbitUiReactComponents.anon.`3`
import typingsJapgolly.orbitUiReactComponents.distInputSrcUseGroupInputMod.UseGroupInputProps
import typingsJapgolly.orbitUiReactComponents.distInputSrcUseGroupInputMod.UseGroupInputReturn
import typingsJapgolly.orbitUiReactComponents.distInputSrcUseInputContentMod.UseInputIconProps
import typingsJapgolly.orbitUiReactComponents.distInputSrcUseInputMod.UseInputProps
import typingsJapgolly.orbitUiReactComponents.distInputSrcWrappedInputPropsAdapterMod.AdaptedWrappedInputProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.className
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInputSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/input/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useGroupInput(
    hasRoleModuleRequiredValidationStateOrientationGapWrapSizeReverseDisabledIsInFieldGroupRef: UseGroupInputProps
  ): UseGroupInputReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("useGroupInput")(hasRoleModuleRequiredValidationStateOrientationGapWrapSizeReverseDisabledIsInFieldGroupRef.asInstanceOf[js.Any]).asInstanceOf[UseGroupInputReturn]
  
  inline def useInput(
    hasModuleIdValuePlaceholderRequiredValidationStateOnChangeTypeAutoFocusDisabledReadOnlyFluidLoadingActiveFocusHoverForwardedRef: UseInputProps
  ): InputProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useInput")(hasModuleIdValuePlaceholderRequiredValidationStateOnChangeTypeAutoFocusDisabledReadOnlyFluidLoadingActiveFocusHoverForwardedRef.asInstanceOf[js.Any]).asInstanceOf[InputProps]
  
  inline def useInputButton(button: Element, isActive: Boolean): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("useInputButton")(button.asInstanceOf[js.Any], isActive.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def useInputButton(button: Element, isActive: Boolean, props: Record[String, Any]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("useInputButton")(button.asInstanceOf[js.Any], isActive.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def useInputIcon(icon: Node): typingsJapgolly.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputIcon")(icon.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]
  inline def useInputIcon(icon: Node, props: UseInputIconProps): typingsJapgolly.react.mod.global.JSX.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("useInputIcon")(icon.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]
  
  inline def wrappedInputPropsAdapter[P /* <: `3` */](hasClassNameRest: P): (Omit[P, className]) & AdaptedWrappedInputProps = ^.asInstanceOf[js.Dynamic].applyDynamic("wrappedInputPropsAdapter")(hasClassNameRest.asInstanceOf[js.Any]).asInstanceOf[(Omit[P, className]) & AdaptedWrappedInputProps]
}
