package typingsJapgolly.loopback

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCookies extends js.Object {
  var cookies: js.UndefOr[js.Array[_]] = js.undefined
  var currentUserLiteral: js.UndefOr[String] = js.undefined
  var enableDoublecheck: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Array[_]] = js.undefined
  var model: js.UndefOr[js.Function0[Unit | String]] = js.undefined
  var overwriteExistingToken: js.UndefOr[Boolean] = js.undefined
  var params: js.UndefOr[js.Array[_]] = js.undefined
  var searchDefaultTokenKeys: js.UndefOr[Boolean] = js.undefined
}

object AnonCookies {
  @scala.inline
  def apply(
    cookies: js.Array[_] = null,
    currentUserLiteral: String = null,
    enableDoublecheck: js.UndefOr[Boolean] = js.undefined,
    headers: js.Array[_] = null,
    model: js.UndefOr[CallbackTo[Unit | String]] = js.undefined,
    overwriteExistingToken: js.UndefOr[Boolean] = js.undefined,
    params: js.Array[_] = null,
    searchDefaultTokenKeys: js.UndefOr[Boolean] = js.undefined
  ): AnonCookies = {
    val __obj = js.Dynamic.literal()
    if (cookies != null) __obj.updateDynamic("cookies")(cookies.asInstanceOf[js.Any])
    if (currentUserLiteral != null) __obj.updateDynamic("currentUserLiteral")(currentUserLiteral.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDoublecheck)) __obj.updateDynamic("enableDoublecheck")(enableDoublecheck.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    model.foreach(p => __obj.updateDynamic("model")(p.toJsFn))
    if (!js.isUndefined(overwriteExistingToken)) __obj.updateDynamic("overwriteExistingToken")(overwriteExistingToken.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(searchDefaultTokenKeys)) __obj.updateDynamic("searchDefaultTokenKeys")(searchDefaultTokenKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCookies]
  }
}

