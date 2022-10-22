package typingsJapgolly.chrome.anon

import typingsJapgolly.chrome.Window
import typingsJapgolly.chrome.chrome.`extension`.FetchProperties
import typingsJapgolly.chrome.chrome.`extension`.LastError
import typingsJapgolly.chrome.chrome.`extension`.OnRequestEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofextension extends StObject {
  
  def getBackgroundPage(): Window | Null = js.native
  
  def getExtensionTabs(): js.Array[Window] = js.native
  def getExtensionTabs(windowId: Double): js.Array[Window] = js.native
  
  def getURL(path: String): String = js.native
  
  def getViews(): js.Array[Window] = js.native
  def getViews(fetchProperties: FetchProperties): js.Array[Window] = js.native
  
  var inIncognitoContext: Boolean = js.native
  
  def isAllowedFileSchemeAccess(): js.Promise[Boolean] = js.native
  def isAllowedFileSchemeAccess(callback: js.Function1[/* isAllowedAccess */ Boolean, Unit]): Unit = js.native
  
  def isAllowedIncognitoAccess(): js.Promise[Boolean] = js.native
  def isAllowedIncognitoAccess(callback: js.Function1[/* isAllowedAccess */ Boolean, Unit]): Unit = js.native
  
  var lastError: LastError = js.native
  
  var onRequest: OnRequestEvent = js.native
  
  var onRequestExternal: OnRequestEvent = js.native
  
  def sendRequest[Request, Response](extensionId: String, request: Request): Unit = js.native
  def sendRequest[Request, Response](
    extensionId: String,
    request: Request,
    responseCallback: js.Function1[/* response */ Response, Unit]
  ): Unit = js.native
  def sendRequest[Request, Response](request: Request): Unit = js.native
  def sendRequest[Request, Response](request: Request, responseCallback: js.Function1[/* response */ Response, Unit]): Unit = js.native
  
  def setUpdateUrlData(data: String): Unit = js.native
}
