package typingsJapgolly.knuddelsUserappsApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.knuddelsUserappsApi.mod._Global_.KnuddelTransferDisplayType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplayReasonText extends js.Object {
  var displayReasonText: js.UndefOr[String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  var onSuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
  var transferDisplayType: js.UndefOr[KnuddelTransferDisplayType] = js.undefined
}

object AnonDisplayReasonText {
  @scala.inline
  def apply(
    displayReasonText: String = null,
    onError: /* message */ String => Callback = null,
    onSuccess: js.UndefOr[Callback] = js.undefined,
    transferDisplayType: KnuddelTransferDisplayType = null
  ): AnonDisplayReasonText = {
    val __obj = js.Dynamic.literal()
    if (displayReasonText != null) __obj.updateDynamic("displayReasonText")(displayReasonText.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* message */ java.lang.String) => onError(t0).runNow()))
    onSuccess.foreach(p => __obj.updateDynamic("onSuccess")(p.toJsFn))
    if (transferDisplayType != null) __obj.updateDynamic("transferDisplayType")(transferDisplayType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayReasonText]
  }
}

