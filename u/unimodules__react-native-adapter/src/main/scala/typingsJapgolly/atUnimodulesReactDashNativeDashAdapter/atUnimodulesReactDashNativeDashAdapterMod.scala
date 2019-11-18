package typingsJapgolly.atUnimodulesReactDashNativeDashAdapter

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atUnimodulesReactDashNativeDashAdapter.atUnimodulesReactDashNativeDashAdapterStrings.android
import typingsJapgolly.atUnimodulesReactDashNativeDashAdapter.atUnimodulesReactDashNativeDashAdapterStrings.ios
import typingsJapgolly.atUnimodulesReactDashNativeDashAdapter.atUnimodulesReactDashNativeDashAdapterStrings.macos
import typingsJapgolly.atUnimodulesReactDashNativeDashAdapter.atUnimodulesReactDashNativeDashAdapterStrings.web
import typingsJapgolly.atUnimodulesReactDashNativeDashAdapter.atUnimodulesReactDashNativeDashAdapterStrings.windows
import typingsJapgolly.atUnimodulesReactDashNativeDashAdapter.buildEventEmitterMod.NativeModule
import typingsJapgolly.atUnimodulesReactDashNativeDashAdapter.buildNativeModulesProxyMod.ProxyNativeModule
import typingsJapgolly.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@unimodules/react-native-adapter", JSImport.Namespace)
@js.native
object atUnimodulesReactDashNativeDashAdapterMod extends js.Object {
  @js.native
  class CodedError protected ()
    extends typingsJapgolly.atUnimodulesReactDashNativeDashAdapter.buildErrorsCodedErrorMod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  @js.native
  class EventEmitter protected ()
    extends typingsJapgolly.atUnimodulesReactDashNativeDashAdapter.buildEventEmitterMod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  @js.native
  class UnavailabilityError protected ()
    extends typingsJapgolly.atUnimodulesReactDashNativeDashAdapter.buildErrorsUnavailabilityErrorMod.UnavailabilityError {
    def this(moduleName: String, propertyName: String) = this()
  }
  
  val SyntheticPlatformEmitter: typingsJapgolly.atUnimodulesReactDashNativeDashAdapter.buildSyntheticPlatformEmitterMod.SyntheticPlatformEmitter = js.native
  def requireNativeViewManager[P](viewName: String): ComponentType[P] = js.native
  @js.native
  object NativeModulesProxy extends /* moduleName */ StringDictionary[ProxyNativeModule]
  
  @js.native
  object Platform extends js.Object {
    var OS: ios | android | windows | macos | web = js.native
  }
  
}

