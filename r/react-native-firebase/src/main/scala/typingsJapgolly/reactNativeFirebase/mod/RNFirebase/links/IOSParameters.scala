package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.links

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOSParameters extends js.Object {
  def setAppStoreId(appStoreId: String): DynamicLink
  def setBundleId(bundleId: String): DynamicLink
  def setCustomScheme(customScheme: String): DynamicLink
  def setFallbackUrl(fallbackUrl: String): DynamicLink
  def setIPadBundleId(iPadBundleId: String): DynamicLink
  def setIPadFallbackUrl(iPadFallbackUrl: String): DynamicLink
  def setMinimumVersion(minimumVersion: String): DynamicLink
}

object IOSParameters {
  @scala.inline
  def apply(
    setAppStoreId: String => CallbackTo[DynamicLink],
    setBundleId: String => CallbackTo[DynamicLink],
    setCustomScheme: String => CallbackTo[DynamicLink],
    setFallbackUrl: String => CallbackTo[DynamicLink],
    setIPadBundleId: String => CallbackTo[DynamicLink],
    setIPadFallbackUrl: String => CallbackTo[DynamicLink],
    setMinimumVersion: String => CallbackTo[DynamicLink]
  ): IOSParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setAppStoreId")(js.Any.fromFunction1((t0: java.lang.String) => setAppStoreId(t0).runNow()))
    __obj.updateDynamic("setBundleId")(js.Any.fromFunction1((t0: java.lang.String) => setBundleId(t0).runNow()))
    __obj.updateDynamic("setCustomScheme")(js.Any.fromFunction1((t0: java.lang.String) => setCustomScheme(t0).runNow()))
    __obj.updateDynamic("setFallbackUrl")(js.Any.fromFunction1((t0: java.lang.String) => setFallbackUrl(t0).runNow()))
    __obj.updateDynamic("setIPadBundleId")(js.Any.fromFunction1((t0: java.lang.String) => setIPadBundleId(t0).runNow()))
    __obj.updateDynamic("setIPadFallbackUrl")(js.Any.fromFunction1((t0: java.lang.String) => setIPadFallbackUrl(t0).runNow()))
    __obj.updateDynamic("setMinimumVersion")(js.Any.fromFunction1((t0: java.lang.String) => setMinimumVersion(t0).runNow()))
    __obj.asInstanceOf[IOSParameters]
  }
}

