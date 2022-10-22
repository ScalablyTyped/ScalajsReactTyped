package typingsJapgolly.reactNativeScreens

import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeScreens.anon.GoingForward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptReanimatedMod {
  
  @JSImport("react-native-screens/lib/typescript/reanimated", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ReanimatedScreenProvider(props: PropsWithChildren[Any]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ReanimatedScreenProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useReanimatedTransitionProgress(): GoingForward = ^.asInstanceOf[js.Dynamic].applyDynamic("useReanimatedTransitionProgress")().asInstanceOf[GoingForward]
}
