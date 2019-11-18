package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactDashNative.reactDashNativeStrings.windows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformWindowsOSStatic extends PlatformStatic {
  var OS: windows
}

object PlatformWindowsOSStatic {
  @scala.inline
  def apply(
    OS: windows,
    Version: Double | String,
    isTV: Boolean,
    select: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ typingsJapgolly.reactDashNative.reactDashNativeStrings.PlatformStatic with js.Any => CallbackTo[js.Any]
  ): PlatformWindowsOSStatic = {
    val __obj = js.Dynamic.literal(OS = OS.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], isTV = isTV.asInstanceOf[js.Any])
    __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ typingsJapgolly.reactDashNative.reactDashNativeStrings.PlatformStatic with js.Any) => select(t0).runNow()))
    __obj.asInstanceOf[PlatformWindowsOSStatic]
  }
}

