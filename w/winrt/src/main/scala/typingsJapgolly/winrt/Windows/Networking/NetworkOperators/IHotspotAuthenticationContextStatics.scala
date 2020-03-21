package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.AnonContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHotspotAuthenticationContextStatics extends js.Object {
  def tryGetAuthenticationContext(evenToken: String): AnonContext
}

object IHotspotAuthenticationContextStatics {
  @scala.inline
  def apply(tryGetAuthenticationContext: String => CallbackTo[AnonContext]): IHotspotAuthenticationContextStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tryGetAuthenticationContext")(js.Any.fromFunction1((t0: java.lang.String) => tryGetAuthenticationContext(t0).runNow()))
    __obj.asInstanceOf[IHotspotAuthenticationContextStatics]
  }
}

