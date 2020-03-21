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

@JSImport("@unimodules/core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CodedError protected ()
    extends typingsJapgolly.unimodulesCore.adapterProxyMod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  @js.native
  class EventEmitter protected ()
    extends typingsJapgolly.unimodulesCore.adapterProxyMod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  @js.native
  class UnavailabilityError protected ()
    extends typingsJapgolly.unimodulesCore.adapterProxyMod.UnavailabilityError {
    def this(moduleName: String, propertyName: String) = this()
  }
  
  val SyntheticPlatformEmitter: typingsJapgolly.unimodulesReactNativeAdapter.syntheticPlatformEmitterMod.SyntheticPlatformEmitter = js.native
  def deprecate(library: String, deprecatedAPI: String): Unit = js.native
  def deprecate(library: String, deprecatedAPI: String, options: AnonCurrentVersion): Unit = js.native
  def requireNativeViewManager[P](viewName: String): ComponentType[P] = js.native
  @js.native
  object NativeModulesProxy extends /* moduleName */ StringDictionary[ProxyNativeModule]
  
  @js.native
  object Platform extends js.Object {
    var OS: ios | android | windows | macos | web = js.native
  }
  
}

