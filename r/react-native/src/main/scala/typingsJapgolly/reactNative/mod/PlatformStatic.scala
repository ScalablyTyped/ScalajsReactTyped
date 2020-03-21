package typingsJapgolly.reactNative.mod

import typingsJapgolly.reactNative.AnonDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformStatic extends js.Object {
  var Version: Double | String = js.native
  var isTV: Boolean = js.native
  def select[T](
    specifics: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType ]:? T}
    */ typingsJapgolly.reactNative.reactNativeStrings.PlatformStatic with js.Any
  ): js.UndefOr[T] = js.native
  /**
    * @see https://facebook.github.io/react-native/docs/platform-specific-code.html#content
    */
  @JSName("select")
  def select_T_T[T](
    specifics: typingsJapgolly.reactNative.reactNativeStrings.PlatformStatic with js.Any with AnonDefault[T]
  ): T = js.native
}

