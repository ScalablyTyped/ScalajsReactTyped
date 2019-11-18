package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactDashNative.reactDashNativeStrings.macos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformMacOSStatic extends PlatformStatic {
  var OS: macos
}

object PlatformMacOSStatic {
  @scala.inline
  def apply(
    OS: macos,
    Version: Double | String,
    isTV: Boolean,
    select: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ typingsJapgolly.reactDashNative.reactDashNativeStrings.PlatformStatic with js.Any => CallbackTo[js.Any]
  ): PlatformMacOSStatic = {
    val __obj = js.Dynamic.literal(OS = OS.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], isTV = isTV.asInstanceOf[js.Any])
    __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ typingsJapgolly.reactDashNative.reactDashNativeStrings.PlatformStatic with js.Any) => select(t0).runNow()))
    __obj.asInstanceOf[PlatformMacOSStatic]
  }
}

