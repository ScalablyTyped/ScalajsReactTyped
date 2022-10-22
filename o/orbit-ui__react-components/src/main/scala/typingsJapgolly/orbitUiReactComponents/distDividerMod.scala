package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distDividerSrcDividerMod.InnerDividerProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDividerMod {
  
  @JSImport("@orbit-ui/react-components/dist/divider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/divider", "Divider")
  @js.native
  val Divider: OrbitComponent[HTMLElement, InnerDividerProps] = js.native
  
  inline def InnerDivider(hasOrientationAsChildrenForwardedRefRest: InnerDividerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDivider")(hasOrientationAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
}
