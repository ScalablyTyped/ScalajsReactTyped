package typingsJapgolly.nodeDownloaderHelper.mod

import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import typingsJapgolly.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
   // Custom HTTP Header ex: Authorization, User-Agent
  var fileName: js.UndefOr[String] = js.undefined
   // Custom filename when saved
  var forceResume: js.UndefOr[Boolean] = js.undefined
   // Request Method Verb
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
   // if true it will override the file, otherwise will append '(number)' to the end of file
  var httpRequestOptions: js.UndefOr[RequestOptions] = js.undefined
   // Override the http request options
  var httpsRequestOptions: js.UndefOr[typingsJapgolly.node.httpsMod.RequestOptions] = js.undefined
  var method: js.UndefOr[String] = js.undefined
   // If the server does not return the "accept-ranges" header, can be force if it does support it
  var `override`: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fileName: String = null,
    forceResume: js.UndefOr[Boolean] = js.undefined,
    headers: OutgoingHttpHeaders = null,
    httpRequestOptions: RequestOptions = null,
    httpsRequestOptions: typingsJapgolly.node.httpsMod.RequestOptions = null,
    method: String = null,
    `override`: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(forceResume)) __obj.updateDynamic("forceResume")(forceResume.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (httpRequestOptions != null) __obj.updateDynamic("httpRequestOptions")(httpRequestOptions.asInstanceOf[js.Any])
    if (httpsRequestOptions != null) __obj.updateDynamic("httpsRequestOptions")(httpsRequestOptions.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

