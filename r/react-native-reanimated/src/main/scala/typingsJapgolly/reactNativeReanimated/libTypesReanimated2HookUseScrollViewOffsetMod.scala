package typingsJapgolly.reactNativeReanimated

import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.SharedValue
import typingsJapgolly.reactNativeReanimated.mod.Animated.ScrollView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2HookUseScrollViewOffsetMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/hook/useScrollViewOffset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useScrollViewOffset(aref: RefHandle[ScrollView]): SharedValue[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollViewOffset")(aref.asInstanceOf[js.Any]).asInstanceOf[SharedValue[Double]]
}
