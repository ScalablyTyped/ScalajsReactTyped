package typingsJapgolly.atAngularCommon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atAngularCommon.atAngularCommonStrings.blob
import typingsJapgolly.atAngularCommon.atAngularCommonStrings.events
import typingsJapgolly.atAngularCommon.httpHttpMod.HttpHeaders
import typingsJapgolly.atAngularCommon.httpHttpMod.HttpParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlobEvents extends js.Object {
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.undefined
  var observe: events
  var params: js.UndefOr[HttpParams | (StringDictionary[String | js.Array[String]])] = js.undefined
  var reportProgress: js.UndefOr[Boolean] = js.undefined
  var responseType: blob
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object Anon_BlobEvents {
  @scala.inline
  def apply(
    observe: events,
    responseType: blob,
    headers: HttpHeaders | (StringDictionary[String | js.Array[String]]) = null,
    params: HttpParams | (StringDictionary[String | js.Array[String]]) = null,
    reportProgress: js.UndefOr[Boolean] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): Anon_BlobEvents = {
    val __obj = js.Dynamic.literal(observe = observe.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(reportProgress)) __obj.updateDynamic("reportProgress")(reportProgress.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BlobEvents]
  }
}

