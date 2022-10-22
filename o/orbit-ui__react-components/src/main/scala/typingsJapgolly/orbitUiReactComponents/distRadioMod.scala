package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distRadioSrcRadioGroupMod.InnerRadioGroupProps
import typingsJapgolly.orbitUiReactComponents.distRadioSrcRadioMod.InnerRadioProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRadioMod {
  
  @JSImport("@orbit-ui/react-components/dist/radio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerRadio(props: InnerRadioProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerRadio")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerRadioGroup(props: InnerRadioGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerRadioGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/radio", "Radio")
  @js.native
  val Radio: OrbitComponent[HTMLElement, InnerRadioProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/radio", "RadioGroup")
  @js.native
  val RadioGroup: OrbitComponent[HTMLElement, InnerRadioGroupProps] = js.native
}
