package typingsJapgolly.chrome

import typingsJapgolly.chrome.chrome.extension.FetchProperties
import typingsJapgolly.chrome.chrome.extension.LastError_
import typingsJapgolly.chrome.chrome.extension.OnRequestEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofextension extends js.Object {
  var inIncognitoContext: Boolean = js.native
  var lastError: LastError_ = js.native
  var onRequest: OnRequestEvent = js.native
  var onRequestExternal: OnRequestEvent = js.native
  def getBackgroundPage(): Window | Null = js.native
  def getExtensionTabs(): js.Array[Window] = js.native
  def getExtensionTabs(windowId: Double): js.Array[Window] = js.native
  def getURL(path: String): String = js.native
  def getViews(): js.Array[Window] = js.native
  def getViews(fetchProperties: FetchProperties): js.Array[Window] = js.native
  def isAllowedFileSchemeAccess(callback: js.Function1[/* isAllowedAccess */ Boolean, Unit]): Unit = js.native
  def isAllowedIncognitoAccess(callback: js.Function1[/* isAllowedAccess */ Boolean, Unit]): Unit = js.native
  def sendRequest(extensionId: String, request: js.Any): Unit = js.native
  def sendRequest(extensionId: String, request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def sendRequest(request: js.Any): Unit = js.native
  def sendRequest(request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def setUpdateUrlData(data: String): Unit = js.native
}

