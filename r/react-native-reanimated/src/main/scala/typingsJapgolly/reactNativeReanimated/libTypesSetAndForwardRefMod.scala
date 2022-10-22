package typingsJapgolly.reactNativeReanimated

import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.reactNativeReanimated.anon.GetForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesSetAndForwardRefMod {
  
  @JSImport("react-native-reanimated/lib/types/setAndForwardRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](hasGetForwardedRefSetLocalRef: GetForwardedRef[T]): js.Function1[/* ref */ T, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasGetForwardedRefSetLocalRef.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ref */ T, Unit]]
  
  type ForwardedRef[T] = js.Function0[MutableRefObject[T] | (js.Function1[/* ref */ T, Unit])]
}
