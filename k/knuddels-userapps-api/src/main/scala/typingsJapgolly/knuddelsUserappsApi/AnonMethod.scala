package typingsJapgolly.knuddelsUserappsApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.knuddelsUserappsApi.knuddelsUserappsApiStrings.GET
import typingsJapgolly.knuddelsUserappsApi.knuddelsUserappsApiStrings.POST
import typingsJapgolly.knuddelsUserappsApi.mod._Global_.ExternalServerResponse
import typingsJapgolly.knuddelsUserappsApi.mod._Global_.Json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethod extends js.Object {
  var data: js.UndefOr[Json] = js.undefined
  var method: js.UndefOr[GET | POST] = js.undefined
  var onFailure: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.undefined
  var onSuccess: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.undefined
}

object AnonMethod {
  @scala.inline
  def apply(
    data: Json = null,
    method: GET | POST = null,
    onFailure: (/* responseData */ String, /* externalServerResponse */ ExternalServerResponse) => Callback = null,
    onSuccess: (/* responseData */ String, /* externalServerResponse */ ExternalServerResponse) => Callback = null
  ): AnonMethod = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction2((t0: /* responseData */ java.lang.String, t1: /* externalServerResponse */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.ExternalServerResponse) => onFailure(t0, t1).runNow()))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction2((t0: /* responseData */ java.lang.String, t1: /* externalServerResponse */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.ExternalServerResponse) => onSuccess(t0, t1).runNow()))
    __obj.asInstanceOf[AnonMethod]
  }
}

