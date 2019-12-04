package typingsJapgolly.atAngularCommon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atAngularCommon.atAngularCommonStrings.body
import typingsJapgolly.atAngularCommon.atAngularCommonStrings.json
import typingsJapgolly.atAngularCommon.httpHttpMod.HttpHeaders
import typingsJapgolly.atAngularCommon.httpHttpMod.HttpParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeaderHeadersJsonObserveParam extends js.Object {
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.undefined
  var observe: js.UndefOr[body] = js.undefined
  var params: js.UndefOr[HttpParams | (StringDictionary[String | js.Array[String]])] = js.undefined
  var reportProgress: js.UndefOr[Boolean] = js.undefined
  var responseType: js.UndefOr[json] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object Anon_BodyHeaderHeadersJsonObserveParam {
  @scala.inline
  def apply(
    headers: HttpHeaders | (StringDictionary[String | js.Array[String]]) = null,
    observe: body = null,
    params: HttpParams | (StringDictionary[String | js.Array[String]]) = null,
    reportProgress: js.UndefOr[Boolean] = js.undefined,
    responseType: json = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): Anon_BodyHeaderHeadersJsonObserveParam = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (observe != null) __obj.updateDynamic("observe")(observe.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(reportProgress)) __obj.updateDynamic("reportProgress")(reportProgress.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeaderHeadersJsonObserveParam]
  }
}

