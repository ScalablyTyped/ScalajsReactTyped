package typingsJapgolly.androiduix.androidui.native.NativeApi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebViewApi extends js.Object {
  def createWebView(viewHash: Double): Unit
  def destroyWebView(viewHash: Double): Unit
  def webViewBoundChange(viewHash: Double, left: Double, top: Double, right: Double, bottom: Double): Unit
  def webViewGoBack(viewHash: Double): Unit
  def webViewLoadUrl(viewHash: Double, url: String): Unit
  def webViewReload(viewHash: Double): Unit
}

object WebViewApi {
  @scala.inline
  def apply(
    createWebView: Double => Callback,
    destroyWebView: Double => Callback,
    webViewBoundChange: (Double, Double, Double, Double, Double) => Callback,
    webViewGoBack: Double => Callback,
    webViewLoadUrl: (Double, String) => Callback,
    webViewReload: Double => Callback
  ): WebViewApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createWebView")(js.Any.fromFunction1((t0: scala.Double) => createWebView(t0).runNow()))
    __obj.updateDynamic("destroyWebView")(js.Any.fromFunction1((t0: scala.Double) => destroyWebView(t0).runNow()))
    __obj.updateDynamic("webViewBoundChange")(js.Any.fromFunction5((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double) => webViewBoundChange(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("webViewGoBack")(js.Any.fromFunction1((t0: scala.Double) => webViewGoBack(t0).runNow()))
    __obj.updateDynamic("webViewLoadUrl")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => webViewLoadUrl(t0, t1).runNow()))
    __obj.updateDynamic("webViewReload")(js.Any.fromFunction1((t0: scala.Double) => webViewReload(t0).runNow()))
    __obj.asInstanceOf[WebViewApi]
  }
}

