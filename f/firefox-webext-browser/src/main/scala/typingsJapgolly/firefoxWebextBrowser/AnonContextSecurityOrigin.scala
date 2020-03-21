package typingsJapgolly.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextSecurityOrigin extends js.Object {
  /**
    * Evaluate the expression in the context of a content script of an extension that matches the specified
    * origin. If given, contextSecurityOrigin overrides the 'true' setting on userContentScriptContext.
    * @deprecated Unsupported on Firefox at this time.
    */
  var contextSecurityOrigin: js.UndefOr[String] = js.undefined
  /**
    * If specified, the expression is evaluated on the iframe whose URL matches the one specified. By default, the
    * expression is evaluated in the top frame of the inspected page.
    * @deprecated Unsupported on Firefox at this time.
    */
  var frameURL: js.UndefOr[String] = js.undefined
  /**
    * Evaluate the expression in the context of the content script of the calling extension, provided that the
    * content script is already injected into the inspected page. If not, the expression is not evaluated and the
    * callback is invoked with the exception parameter set to an object that has the `isError` field set to true
    * and the `code` field set to `E_NOTFOUND`.
    * @deprecated Unsupported on Firefox at this time.
    */
  var useContentScriptContext: js.UndefOr[Boolean] = js.undefined
}

object AnonContextSecurityOrigin {
  @scala.inline
  def apply(
    contextSecurityOrigin: String = null,
    frameURL: String = null,
    useContentScriptContext: js.UndefOr[Boolean] = js.undefined
  ): AnonContextSecurityOrigin = {
    val __obj = js.Dynamic.literal()
    if (contextSecurityOrigin != null) __obj.updateDynamic("contextSecurityOrigin")(contextSecurityOrigin.asInstanceOf[js.Any])
    if (frameURL != null) __obj.updateDynamic("frameURL")(frameURL.asInstanceOf[js.Any])
    if (!js.isUndefined(useContentScriptContext)) __obj.updateDynamic("useContentScriptContext")(useContentScriptContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContextSecurityOrigin]
  }
}

