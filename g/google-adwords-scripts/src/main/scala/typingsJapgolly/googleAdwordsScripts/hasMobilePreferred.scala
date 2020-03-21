package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasMobilePreferred extends js.Object {
  def isMobilePreferred(): Boolean
  def setMobilePreferred(isMobilePreferred: Boolean): Unit
}

object hasMobilePreferred {
  @scala.inline
  def apply(isMobilePreferred: CallbackTo[Boolean], setMobilePreferred: Boolean => Callback): hasMobilePreferred = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isMobilePreferred")(isMobilePreferred.toJsFn)
    __obj.updateDynamic("setMobilePreferred")(js.Any.fromFunction1((t0: scala.Boolean) => setMobilePreferred(t0).runNow()))
    __obj.asInstanceOf[hasMobilePreferred]
  }
}

