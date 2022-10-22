package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distNumberInputSrcNumberInputMod.InnerNumberInputProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNumberInputMod {
  
  @JSImport("@orbit-ui/react-components/dist/number-input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerNumberInput(props: InnerNumberInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerNumberInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/number-input", "NumberInput")
  @js.native
  val NumberInput: OrbitComponent[HTMLElement, InnerNumberInputProps] = js.native
}
