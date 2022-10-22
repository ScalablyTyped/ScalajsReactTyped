package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distLozengeSrcLozengeMod.InnerLozengeProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLozengeSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/lozenge/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerLozenge(hasColorSizeAsChildrenForwardedRefRest: InnerLozengeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerLozenge")(hasColorSizeAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/lozenge/src", "Lozenge")
  @js.native
  val Lozenge: OrbitComponent[HTMLElement, InnerLozengeProps] = js.native
}
