package typingsJapgolly.titanium

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The protocol that the <Titanium.Network.HTTPClient.securityManager> must implement.
  */
trait SecurityManagerProtocol extends js.Object {
  /**
  	 * The <APSConnectionDelegate> for this connection.
  	 */
  def connectionDelegateForUrl(url: js.Any): APSConnectionDelegate
  /**
  	 * Returns an array of objects implementing the [X509KeyManager](https://developer.android.com/reference/javax/net/ssl/X509KeyManager.html) protocol for the SSL Context.
  	 */
  def getKeyManagers(proxy: js.Any): js.Array[_]
  /**
  	 * Returns an array of objects implementing the [X509TrustManager](https://developer.android.com/reference/javax/net/ssl/X509TrustManager.html) protocol for the SSL Context.
  	 */
  def getTrustManagers(proxy: js.Any): js.Array[_]
  /**
  	 * Returns if the security manager will participate in authentication of this end point.
  	 */
  def willHandleURL(url: js.Any): Boolean
}

object SecurityManagerProtocol {
  @scala.inline
  def apply(
    connectionDelegateForUrl: js.Any => CallbackTo[APSConnectionDelegate],
    getKeyManagers: js.Any => CallbackTo[js.Array[js.Any]],
    getTrustManagers: js.Any => CallbackTo[js.Array[js.Any]],
    willHandleURL: js.Any => CallbackTo[Boolean]
  ): SecurityManagerProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connectionDelegateForUrl")(js.Any.fromFunction1((t0: js.Any) => connectionDelegateForUrl(t0).runNow()))
    __obj.updateDynamic("getKeyManagers")(js.Any.fromFunction1((t0: js.Any) => getKeyManagers(t0).runNow()))
    __obj.updateDynamic("getTrustManagers")(js.Any.fromFunction1((t0: js.Any) => getTrustManagers(t0).runNow()))
    __obj.updateDynamic("willHandleURL")(js.Any.fromFunction1((t0: js.Any) => willHandleURL(t0).runNow()))
    __obj.asInstanceOf[SecurityManagerProtocol]
  }
}

