package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasMobilePreferredBuilder[B] extends js.Object {
  def withMobilePreferred(): B
}

object hasMobilePreferredBuilder {
  @scala.inline
  def apply[B](withMobilePreferred: CallbackTo[B]): hasMobilePreferredBuilder[B] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("withMobilePreferred")(withMobilePreferred.toJsFn)
    __obj.asInstanceOf[hasMobilePreferredBuilder[B]]
  }
}

