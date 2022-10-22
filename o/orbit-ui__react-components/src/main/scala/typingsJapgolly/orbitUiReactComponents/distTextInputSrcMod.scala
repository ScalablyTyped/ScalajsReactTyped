package typingsJapgolly.orbitUiReactComponents

import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.distTextInputSrcPasswordInputMod.InnerPasswordInputProps
import typingsJapgolly.orbitUiReactComponents.distTextInputSrcSearchInputMod.InnerSearchInputProps
import typingsJapgolly.orbitUiReactComponents.distTextInputSrcTextInputMod.InnerTextInputProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.input
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTextInputSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/text-input/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerPasswordInput(props: InnerPasswordInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerPasswordInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerSearchInput(props: InnerSearchInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerSearchInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTextInput(props: InnerTextInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTextInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/text-input/src", "PasswordInput")
  @js.native
  val PasswordInput: OrbitComponent[input, InnerPasswordInputProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/text-input/src", "SearchInput")
  @js.native
  val SearchInput: OrbitComponent[input, InnerSearchInputProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/text-input/src", "TextInput")
  @js.native
  val TextInput: OrbitComponent[input, InnerTextInputProps] = js.native
}
