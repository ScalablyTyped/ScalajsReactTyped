package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distLinkSrcIconLinkMod.InnerIconLinkProps
import typingsJapgolly.orbitUiReactComponents.distLinkSrcLinkMod.InnerLinkProps
import typingsJapgolly.orbitUiReactComponents.distLinkSrcTextLinkMod.InnerTextLinkProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLinkMod {
  
  @JSImport("@orbit-ui/react-components/dist/link", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/link", "IconLink")
  @js.native
  val IconLink: OrbitComponent[HTMLElement, InnerIconLinkProps] = js.native
  
  inline def InnerIconLink(props: InnerIconLinkProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerIconLink")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerLink(props: InnerLinkProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerLink")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTextLink(props: InnerTextLinkProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTextLink")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/link", "Link")
  @js.native
  val Link: OrbitComponent[HTMLElement, InnerLinkProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/link", "TextLink")
  @js.native
  val TextLink: OrbitComponent[HTMLElement, InnerTextLinkProps] = js.native
}
