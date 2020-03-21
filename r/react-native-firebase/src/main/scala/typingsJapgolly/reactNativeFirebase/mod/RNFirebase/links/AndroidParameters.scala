package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.links

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidParameters extends js.Object {
  def setFallbackUrl(fallbackUrl: String): DynamicLink
  def setMinimumVersion(minimumVersion: Double): DynamicLink
  def setPackageName(packageName: String): DynamicLink
}

object AndroidParameters {
  @scala.inline
  def apply(
    setFallbackUrl: String => CallbackTo[DynamicLink],
    setMinimumVersion: Double => CallbackTo[DynamicLink],
    setPackageName: String => CallbackTo[DynamicLink]
  ): AndroidParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setFallbackUrl")(js.Any.fromFunction1((t0: java.lang.String) => setFallbackUrl(t0).runNow()))
    __obj.updateDynamic("setMinimumVersion")(js.Any.fromFunction1((t0: scala.Double) => setMinimumVersion(t0).runNow()))
    __obj.updateDynamic("setPackageName")(js.Any.fromFunction1((t0: java.lang.String) => setPackageName(t0).runNow()))
    __obj.asInstanceOf[AndroidParameters]
  }
}

