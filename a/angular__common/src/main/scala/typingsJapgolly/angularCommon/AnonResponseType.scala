package typingsJapgolly.angularCommon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCommon.angularCommonStrings.body
import typingsJapgolly.angularCommon.angularCommonStrings.text
import typingsJapgolly.angularCommon.httpHttpMod.HttpHeaders
import typingsJapgolly.angularCommon.httpHttpMod.HttpParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResponseType extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.undefined
  var observe: js.UndefOr[body] = js.undefined
  var params: js.UndefOr[HttpParams | (StringDictionary[String | js.Array[String]])] = js.undefined
  var reportProgress: js.UndefOr[Boolean] = js.undefined
  var responseType: text
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object AnonResponseType {
  @scala.inline
  def apply(
    responseType: text,
    body: js.Any = null,
    headers: HttpHeaders | (StringDictionary[String | js.Array[String]]) = null,
    observe: body = null,
    params: HttpParams | (StringDictionary[String | js.Array[String]]) = null,
    reportProgress: js.UndefOr[Boolean] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): AnonResponseType = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (observe != null) __obj.updateDynamic("observe")(observe.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(reportProgress)) __obj.updateDynamic("reportProgress")(reportProgress.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResponseType]
  }
}

