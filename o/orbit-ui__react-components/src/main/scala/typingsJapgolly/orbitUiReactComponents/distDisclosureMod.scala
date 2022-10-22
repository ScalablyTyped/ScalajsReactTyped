package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distDisclosureSrcDisclosureArrowMod.InnerDisclosureArrowProps
import typingsJapgolly.orbitUiReactComponents.distDisclosureSrcDisclosureContextMod.DisclosureContextType
import typingsJapgolly.orbitUiReactComponents.distDisclosureSrcDisclosureMod.InnerDisclosureProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDisclosureMod {
  
  @JSImport("@orbit-ui/react-components/dist/disclosure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/disclosure", "Disclosure")
  @js.native
  val Disclosure: OrbitComponent[HTMLElement, InnerDisclosureProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/disclosure", "DisclosureArrow")
  @js.native
  val DisclosureArrow: OrbitComponent[HTMLElement, InnerDisclosureArrowProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/disclosure", "DisclosureContext")
  @js.native
  val DisclosureContext: Context[DisclosureContextType] = js.native
  
  inline def InnerDisclosure(hasIdOpenDefaultOpenOnOpenChangeAsChildrenForwardedRefRest: InnerDisclosureProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDisclosure")(hasIdOpenDefaultOpenOnOpenChangeAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerDisclosureArrow(hasOpenForwardedRefRest: InnerDisclosureArrowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDisclosureArrow")(hasOpenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useDisclosureContext(): DisclosureContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useDisclosureContext")().asInstanceOf[DisclosureContextType]
}
