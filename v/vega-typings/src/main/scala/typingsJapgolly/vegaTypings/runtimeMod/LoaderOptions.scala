package typingsJapgolly.vegaTypings.runtimeMod

import org.scalajs.dom.experimental.RequestInit
import typingsJapgolly.vegaTypings.vegaTypingsStrings.file
import typingsJapgolly.vegaTypings.vegaTypingsStrings.http
import typingsJapgolly.vegaTypings.vegaTypingsStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderOptions extends js.Object {
  var baseURL: js.UndefOr[String] = js.undefined
  var defaultProtocol: js.UndefOr[http | https | String] = js.undefined
  var http: js.UndefOr[RequestInit] = js.undefined
  var mode: js.UndefOr[file | http] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object LoaderOptions {
  @scala.inline
  def apply(
    baseURL: String = null,
    defaultProtocol: http | https | String = null,
    http: RequestInit = null,
    mode: file | http = null,
    target: String = null
  ): LoaderOptions = {
    val __obj = js.Dynamic.literal()
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL.asInstanceOf[js.Any])
    if (defaultProtocol != null) __obj.updateDynamic("defaultProtocol")(defaultProtocol.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderOptions]
  }
}

