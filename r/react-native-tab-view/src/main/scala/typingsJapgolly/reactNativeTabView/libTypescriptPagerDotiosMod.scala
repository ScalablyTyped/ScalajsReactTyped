package typingsJapgolly.reactNativeTabView

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactNativeTabView.libTypescriptPagerViewAdapterMod.Props
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptPagerDotiosMod {
  
  @JSImport("react-native-tab-view/lib/typescript/Pager.ios", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Route */](
    hasKeyboardDismissModeSwipeEnabledNavigationStateOnIndexChangeOnSwipeStartOnSwipeEndChildrenStyleAnimationEnabledRest: Props[T]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasKeyboardDismissModeSwipeEnabledNavigationStateOnIndexChangeOnSwipeStartOnSwipeEndChildrenStyleAnimationEnabledRest.asInstanceOf[js.Any]).asInstanceOf[Element]
}
