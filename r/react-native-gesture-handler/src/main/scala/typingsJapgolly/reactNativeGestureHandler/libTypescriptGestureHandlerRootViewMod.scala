package typingsJapgolly.reactNativeGestureHandler

import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptGestureHandlerRootViewMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/GestureHandlerRootView", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: GestureHandlerRootViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type GestureHandlerRootViewProps = PropsWithChildren[ViewProps]
}
