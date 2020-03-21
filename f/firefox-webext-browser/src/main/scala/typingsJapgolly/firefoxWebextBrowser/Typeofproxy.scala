package typingsJapgolly.firefoxWebextBrowser

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firefoxWebextBrowser.browser.proxy.ProxyOnRequestEvent
import typingsJapgolly.firefoxWebextBrowser.browser.types.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofproxy extends js.Object {
  /** Notifies about errors caused by the invalid use of the proxy API. */
  val onError: WebExtEvent[js.Function1[/* error */ js.Error, Unit]]
  /**
    * Please use `proxy.onError`.
    * @deprecated proxy.onProxyError has been deprecated and will be removed in Firefox 71\. Use proxy.onError instead.
    */
  val onProxyError: WebExtEvent[js.Function1[/* error */ js.Error, Unit]]
  /* proxy events */
  /** Fired when proxy data is needed for a request. */
  val onRequest: ProxyOnRequestEvent[js.Function1[/* details */ AnonCookieStoreId, Unit]]
  /* proxy properties */
  /** Configures proxy settings. This setting's value is an object of type ProxyConfig. */
  val settings: Setting
  /* proxy functions */
  /**
    * Registers the proxy script for the extension.
    * @deprecated proxy.register has been deprecated and will be removed in Firefox 71.
    */
  def register(url: String): js.Promise[Unit]
  /**
    * Registers the proxy script for the extension. This is an alias for proxy.register.
    * @deprecated proxy.registerProxyScript has been deprecated and will be removed in Firefox 71.
    */
  def registerProxyScript(url: String): js.Promise[_]
  /**
    * Unregisters the proxy script for the extension.
    * @deprecated proxy.unregister has been deprecated and will be removed in Firefox 71.
    */
  def unregister(): js.Promise[Unit]
}

object Typeofproxy {
  @scala.inline
  def apply(
    onError: WebExtEvent[js.Function1[/* error */ js.Error, Unit]],
    onProxyError: WebExtEvent[js.Function1[/* error */ js.Error, Unit]],
    onRequest: ProxyOnRequestEvent[js.Function1[/* details */ AnonCookieStoreId, Unit]],
    register: String => CallbackTo[js.Promise[Unit]],
    registerProxyScript: String => CallbackTo[js.Promise[js.Any]],
    settings: Setting,
    unregister: CallbackTo[js.Promise[Unit]]
  ): Typeofproxy = {
    val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], onProxyError = onProxyError.asInstanceOf[js.Any], onRequest = onRequest.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: java.lang.String) => register(t0).runNow()))
    __obj.updateDynamic("registerProxyScript")(js.Any.fromFunction1((t0: java.lang.String) => registerProxyScript(t0).runNow()))
    __obj.updateDynamic("unregister")(unregister.toJsFn)
    __obj.asInstanceOf[Typeofproxy]
  }
}

