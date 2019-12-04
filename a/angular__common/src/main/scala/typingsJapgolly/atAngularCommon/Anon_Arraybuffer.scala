package typingsJapgolly.atAngularCommon

import typingsJapgolly.atAngularCommon.atAngularCommonStrings.arraybuffer
import typingsJapgolly.atAngularCommon.atAngularCommonStrings.blob
import typingsJapgolly.atAngularCommon.atAngularCommonStrings.json
import typingsJapgolly.atAngularCommon.atAngularCommonStrings.text
import typingsJapgolly.atAngularCommon.httpHttpMod.HttpHeaders
import typingsJapgolly.atAngularCommon.httpHttpMod.HttpParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arraybuffer extends js.Object {
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  var params: js.UndefOr[HttpParams] = js.undefined
  var reportProgress: js.UndefOr[Boolean] = js.undefined
  var responseType: js.UndefOr[arraybuffer | blob | json | text] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object Anon_Arraybuffer {
  @scala.inline
  def apply(
    headers: HttpHeaders = null,
    params: HttpParams = null,
    reportProgress: js.UndefOr[Boolean] = js.undefined,
    responseType: arraybuffer | blob | json | text = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): Anon_Arraybuffer = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(reportProgress)) __obj.updateDynamic("reportProgress")(reportProgress.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Arraybuffer]
  }
}

