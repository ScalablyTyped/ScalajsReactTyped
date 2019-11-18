package typingsJapgolly.atUnimodulesCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atUnimodulesCore.atUnimodulesCoreStrings.android
import typingsJapgolly.atUnimodulesCore.atUnimodulesCoreStrings.ios
import typingsJapgolly.atUnimodulesCore.atUnimodulesCoreStrings.macos
import typingsJapgolly.atUnimodulesCore.atUnimodulesCoreStrings.web
import typingsJapgolly.atUnimodulesCore.atUnimodulesCoreStrings.windows
import typingsJapgolly.atUnimodulesReactDashNativeDashAdapter.buildEventEmitterMod.NativeModule
import typingsJapgolly.atUnimodulesReactDashNativeDashAdapter.buildNativeModulesProxyMod.ProxyNativeModule
import typingsJapgolly.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@unimodules/core", JSImport.Namespace)
@js.native
object atUnimodulesCoreMod extends js.Object {
  @js.native
  class CodedError protected ()
    extends typingsJapgolly.atUnimodulesCore.buildAdapterProxyMod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  @js.native
  class EventEmitter protected ()
    extends typingsJapgolly.atUnimodulesCore.buildAdapterProxyMod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  @js.native
  class UnavailabilityError protected ()
    extends typingsJapgolly.atUnimodulesCore.buildAdapterProxyMod.UnavailabilityError {
    def this(moduleName: String, propertyName: String) = this()
  }
  
  val SyntheticPlatformEmitter: typingsJapgolly.atUnimodulesReactDashNativeDashAdapter.buildSyntheticPlatformEmitterMod.SyntheticPlatformEmitter = js.native
  def deprecate(library: String, deprecatedAPI: String): Unit = js.native
  def deprecate(library: String, deprecatedAPI: String, options: Anon_CurrentVersion): Unit = js.native
  def requireNativeViewManager[P](viewName: String): ComponentType[P] = js.native
  @js.native
  object NativeModulesProxy extends /* moduleName */ StringDictionary[ProxyNativeModule]
  
  @js.native
  object Platform extends js.Object {
    var OS: ios | android | windows | macos | web = js.native
  }
  
}

