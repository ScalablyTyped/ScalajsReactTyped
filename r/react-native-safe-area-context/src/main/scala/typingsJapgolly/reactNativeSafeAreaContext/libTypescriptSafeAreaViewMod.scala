package typingsJapgolly.reactNativeSafeAreaContext

import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactNative.mod.HostComponent
import typingsJapgolly.reactNativeSafeAreaContext.libTypescriptSafeAreaDottypesMod.NativeSafeAreaViewProps
import typingsJapgolly.reactNativeSafeAreaContext.libTypescriptSpecsNativeSafeAreaViewMod.NativeProps
import typingsJapgolly.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSafeAreaViewMod {
  
  @JSImport("react-native-safe-area-context/lib/typescript/SafeAreaView", "SafeAreaView")
  @js.native
  val SafeAreaView: ForwardRefExoticComponent[SafeAreaViewProps & RefAttributes[NativeSafeAreaViewInstance]] = js.native
  
  type NativeSafeAreaViewInstance = InstanceType[HostComponent[NativeProps]]
  
  type SafeAreaViewProps = NativeSafeAreaViewProps
}
