package typingsJapgolly.angularCommon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCommon.angularCommonStrings.arraybuffer
import typingsJapgolly.angularCommon.angularCommonStrings.body
import typingsJapgolly.angularCommon.httpHttpMod.HttpHeaders
import typingsJapgolly.angularCommon.httpHttpMod.HttpParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsReportProgressResponseType extends js.Object {
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.undefined
  var observe: js.UndefOr[body] = js.undefined
  var params: js.UndefOr[HttpParams | (StringDictionary[String | js.Array[String]])] = js.undefined
  var reportProgress: js.UndefOr[Boolean] = js.undefined
  var responseType: arraybuffer
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object AnonParamsReportProgressResponseType {
  @scala.inline
  def apply(
    responseType: arraybuffer,
    headers: HttpHeaders | (StringDictionary[String | js.Array[String]]) = null,
    observe: body = null,
    params: HttpParams | (StringDictionary[String | js.Array[String]]) = null,
    reportProgress: js.UndefOr[Boolean] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): AnonParamsReportProgressResponseType = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (observe != null) __obj.updateDynamic("observe")(observe.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(reportProgress)) __obj.updateDynamic("reportProgress")(reportProgress.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParamsReportProgressResponseType]
  }
}

