package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformStatic extends js.Object {
  var Version: Double | String
  var isTV: Boolean
  /**
    * @see https://facebook.github.io/react-native/docs/platform-specific-code.html#content
    */
  @JSName("select")
  def select_default[T](
    specifics: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ typingsJapgolly.reactDashNative.reactDashNativeStrings.PlatformStatic with js.Any
  ): T
}

object PlatformStatic {
  @scala.inline
  def apply(
    Version: Double | String,
    isTV: Boolean,
    select: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ typingsJapgolly.reactDashNative.reactDashNativeStrings.PlatformStatic with js.Any => CallbackTo[js.Any]
  ): PlatformStatic = {
    val __obj = js.Dynamic.literal(Version = Version.asInstanceOf[js.Any], isTV = isTV.asInstanceOf[js.Any])
    __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ typingsJapgolly.reactDashNative.reactDashNativeStrings.PlatformStatic with js.Any) => select(t0).runNow()))
    __obj.asInstanceOf[PlatformStatic]
  }
}

