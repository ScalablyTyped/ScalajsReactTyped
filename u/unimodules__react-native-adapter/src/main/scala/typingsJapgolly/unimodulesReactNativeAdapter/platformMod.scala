package typingsJapgolly.unimodulesReactNativeAdapter

import typingsJapgolly.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.android
import typingsJapgolly.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.ios
import typingsJapgolly.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.macos
import typingsJapgolly.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.web
import typingsJapgolly.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.windows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@unimodules/react-native-adapter/build/Platform", JSImport.Namespace)
@js.native
object platformMod extends js.Object {
  @js.native
  object default extends js.Object {
    var OS: ios | android | windows | macos | web = js.native
  }
  
}

