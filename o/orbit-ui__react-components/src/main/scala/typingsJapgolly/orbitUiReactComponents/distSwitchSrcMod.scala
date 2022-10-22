package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.distSwitchSrcSwitchMod.InnerSwitchProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSwitchSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/switch/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerSwitch(props: InnerSwitchProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerSwitch")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/switch/src", "Switch")
  @js.native
  val Switch: OrbitComponent[HTMLElement, InnerSwitchProps] = js.native
}
