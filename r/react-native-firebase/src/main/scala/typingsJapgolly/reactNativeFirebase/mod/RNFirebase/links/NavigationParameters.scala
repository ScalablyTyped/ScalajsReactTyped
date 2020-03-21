package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.links

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationParameters extends js.Object {
  def setForcedRedirectEnabled(forcedRedirectEnabled: Boolean): DynamicLink
}

object NavigationParameters {
  @scala.inline
  def apply(setForcedRedirectEnabled: Boolean => CallbackTo[DynamicLink]): NavigationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setForcedRedirectEnabled")(js.Any.fromFunction1((t0: scala.Boolean) => setForcedRedirectEnabled(t0).runNow()))
    __obj.asInstanceOf[NavigationParameters]
  }
}

