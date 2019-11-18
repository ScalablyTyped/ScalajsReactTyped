package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nManagerStatic extends js.Object {
  var isRTL: Boolean
  def allowRTL(allowRTL: Boolean): js.Object
  def forceRTL(forceRTL: Boolean): js.Object
}

object I18nManagerStatic {
  @scala.inline
  def apply(
    allowRTL: Boolean => CallbackTo[js.Object],
    forceRTL: Boolean => CallbackTo[js.Object],
    isRTL: Boolean
  ): I18nManagerStatic = {
    val __obj = js.Dynamic.literal(isRTL = isRTL.asInstanceOf[js.Any])
    __obj.updateDynamic("allowRTL")(js.Any.fromFunction1((t0: scala.Boolean) => allowRTL(t0).runNow()))
    __obj.updateDynamic("forceRTL")(js.Any.fromFunction1((t0: scala.Boolean) => forceRTL(t0).runNow()))
    __obj.asInstanceOf[I18nManagerStatic]
  }
}

