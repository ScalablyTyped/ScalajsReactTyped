package typingsJapgolly.unimodulesReactNativeAdapter

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.unimodulesReactNativeAdapter.eventEmitterMod.NativeModule
import typingsJapgolly.unimodulesReactNativeAdapter.nativeModulesProxyMod.ProxyNativeModule
import typingsJapgolly.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.android
import typingsJapgolly.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.ios
import typingsJapgolly.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.macos
import typingsJapgolly.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.web
import typingsJapgolly.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.windows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@unimodules/react-native-adapter", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CodedError protected ()
    extends typingsJapgolly.unimodulesReactNativeAdapter.codedErrorMod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  @js.native
  class EventEmitter protected ()
    extends typingsJapgolly.unimodulesReactNativeAdapter.eventEmitterMod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  @js.native
  class UnavailabilityError protected ()
    extends typingsJapgolly.unimodulesReactNativeAdapter.unavailabilityErrorMod.UnavailabilityError {
    def this(moduleName: String, propertyName: String) = this()
  }
  
  val SyntheticPlatformEmitter: typingsJapgolly.unimodulesReactNativeAdapter.syntheticPlatformEmitterMod.SyntheticPlatformEmitter = js.native
  def requireNativeViewManager[P](viewName: String): ComponentType[P] = js.native
  @js.native
  object NativeModulesProxy extends /* moduleName */ StringDictionary[ProxyNativeModule]
  
  @js.native
  object Platform extends js.Object {
    var OS: ios | android | windows | macos | web = js.native
  }
  
}

