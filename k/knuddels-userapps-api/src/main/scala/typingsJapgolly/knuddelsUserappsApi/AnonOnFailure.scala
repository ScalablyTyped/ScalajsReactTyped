package typingsJapgolly.knuddelsUserappsApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.knuddelsUserappsApi.mod._Global_.ExternalServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnFailure extends js.Object {
  var onFailure: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.undefined
  var onSuccess: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.undefined
}

object AnonOnFailure {
  @scala.inline
  def apply(
    onFailure: (/* responseData */ String, /* externalServerResponse */ ExternalServerResponse) => Callback = null,
    onSuccess: (/* responseData */ String, /* externalServerResponse */ ExternalServerResponse) => Callback = null
  ): AnonOnFailure = {
    val __obj = js.Dynamic.literal()
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction2((t0: /* responseData */ java.lang.String, t1: /* externalServerResponse */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.ExternalServerResponse) => onFailure(t0, t1).runNow()))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction2((t0: /* responseData */ java.lang.String, t1: /* externalServerResponse */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.ExternalServerResponse) => onSuccess(t0, t1).runNow()))
    __obj.asInstanceOf[AnonOnFailure]
  }
}

