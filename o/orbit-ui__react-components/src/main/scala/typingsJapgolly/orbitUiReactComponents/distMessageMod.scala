package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distMessageSrcMessageMod.InnerMessageProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMessageMod {
  
  @JSImport("@orbit-ui/react-components/dist/message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerMessage(hasShowVariantOnDismissRolePropAsChildrenForwardedRefRest: InnerMessageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerMessage")(hasShowVariantOnDismissRolePropAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/message", "Message")
  @js.native
  val Message: OrbitComponent[HTMLElement, InnerMessageProps] = js.native
}
