package typingsJapgolly.reactScroll

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactScroll.anon.Container
import typingsJapgolly.reactScroll.modulesComponentsLinkMod.ReactScrollLinkProps
import typingsJapgolly.reactScroll.modulesMixinsScrollerMod.Scroller
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesMixinsScrollLinkMod {
  
  @JSImport("react-scroll/modules/mixins/scroll-link", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P](component: ComponentType[P]): ComponentClassP[ScrollLinkProps[P] & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[ScrollLinkProps[P] & js.Object]]
  inline def default[P](component: ComponentType[P], customScroller: Scroller): ComponentClassP[ScrollLinkProps[P] & js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any], customScroller.asInstanceOf[js.Any])).asInstanceOf[ComponentClassP[ScrollLinkProps[P] & js.Object]]
  
  type ScrollLinkProps[P] = ReactScrollLinkProps & P & Container
}
