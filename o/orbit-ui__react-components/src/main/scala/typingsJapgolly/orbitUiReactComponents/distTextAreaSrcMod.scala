package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.distTextAreaSrcTextAreaMod.InnerTextAreaProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTextAreaSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/text-area/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTextArea(props: InnerTextAreaProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTextArea")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/text-area/src", "TextArea")
  @js.native
  val TextArea: OrbitComponent[HTMLElement, InnerTextAreaProps] = js.native
}
