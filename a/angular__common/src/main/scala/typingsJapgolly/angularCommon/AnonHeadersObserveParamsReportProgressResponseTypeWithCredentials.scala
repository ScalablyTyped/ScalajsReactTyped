package typingsJapgolly.angularCommon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCommon.angularCommonStrings.arraybuffer
import typingsJapgolly.angularCommon.angularCommonStrings.response
import typingsJapgolly.angularCommon.httpHttpMod.HttpHeaders
import typingsJapgolly.angularCommon.httpHttpMod.HttpParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeadersObserveParamsReportProgressResponseTypeWithCredentials extends js.Object {
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.undefined
  var observe: response
  var params: js.UndefOr[HttpParams | (StringDictionary[String | js.Array[String]])] = js.undefined
  var reportProgress: js.UndefOr[Boolean] = js.undefined
  var responseType: arraybuffer
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object AnonHeadersObserveParamsReportProgressResponseTypeWithCredentials {
  @scala.inline
  def apply(
    observe: response,
    responseType: arraybuffer,
    headers: HttpHeaders | (StringDictionary[String | js.Array[String]]) = null,
    params: HttpParams | (StringDictionary[String | js.Array[String]]) = null,
    reportProgress: js.UndefOr[Boolean] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): AnonHeadersObserveParamsReportProgressResponseTypeWithCredentials = {
    val __obj = js.Dynamic.literal(observe = observe.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(reportProgress)) __obj.updateDynamic("reportProgress")(reportProgress.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeadersObserveParamsReportProgressResponseTypeWithCredentials]
  }
}

