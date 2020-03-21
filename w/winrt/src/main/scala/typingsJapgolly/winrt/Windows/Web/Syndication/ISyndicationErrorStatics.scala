package typingsJapgolly.winrt.Windows.Web.Syndication

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationErrorStatics extends js.Object {
  def getStatus(hresult: Double): SyndicationErrorStatus
}

object ISyndicationErrorStatics {
  @scala.inline
  def apply(getStatus: Double => CallbackTo[SyndicationErrorStatus]): ISyndicationErrorStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStatus")(js.Any.fromFunction1((t0: scala.Double) => getStatus(t0).runNow()))
    __obj.asInstanceOf[ISyndicationErrorStatics]
  }
}

