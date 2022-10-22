package typingsJapgolly.reactScroll

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactScroll.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesMixinsScrollElementMod {
  
  @JSImport("react-scroll/modules/mixins/scroll-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P](component: ComponentType[P]): ComponentClassP[ScrollElementProps[P] & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[ScrollElementProps[P] & js.Object]]
  
  type ScrollElementProps[P] = P & Id
}
