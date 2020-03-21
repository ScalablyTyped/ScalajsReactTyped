package typingsJapgolly.unimodulesCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.unimodulesCore.unimodulesCoreStrings.android
import typingsJapgolly.unimodulesCore.unimodulesCoreStrings.ios
import typingsJapgolly.unimodulesCore.unimodulesCoreStrings.macos
import typingsJapgolly.unimodulesCore.unimodulesCoreStrings.web
import typingsJapgolly.unimodulesCore.unimodulesCoreStrings.windows
import typingsJapgolly.unimodulesReactNativeAdapter.eventEmitterMod.NativeModule
import typingsJapgolly.unimodulesReactNativeAdapter.nativeModulesProxyMod.ProxyNativeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@unimodules/core/build/AdapterProxy", JSImport.Namespace)
@js.native
object adapterProxyMod extends js.Object {
  @js.native
  class CodedError protected ()
    extends typingsJapgolly.unimodulesReactNativeAdapter.mod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  @js.native
  class EventEmitter protected ()
    extends typingsJapgolly.unimodulesReactNativeAdapter.mod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  @js.native
  class UnavailabilityError protected ()
    extends typingsJapgolly.unimodulesReactNativeAdapter.mod.UnavailabilityError {
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

