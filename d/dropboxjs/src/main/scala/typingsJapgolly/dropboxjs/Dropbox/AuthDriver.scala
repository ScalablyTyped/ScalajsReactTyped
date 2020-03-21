package typingsJapgolly.dropboxjs.Dropbox

import org.scalajs.dom.raw.Storage
import typingsJapgolly.dropboxjs.AnonPort
import typingsJapgolly.dropboxjs.AnonReceiverPath
import typingsJapgolly.dropboxjs.AnonRedirectFile
import typingsJapgolly.dropboxjs.AnonRememberUser
import typingsJapgolly.dropboxjs.AnonScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.AuthDriver")
@js.native
class AuthDriver () extends js.Object {
  def authType(): String = js.native
  def doAuthorize(authUrl: String, stateParam: String, client: Client, callback: QueryParamsCallback): Unit = js.native
  def getStateParam(client: Client, callback: js.Function1[/* state */ String, Unit]): Unit = js.native
  def onAuthStepChange(client: Client, callback: js.Function0[Unit]): Unit = js.native
  def resumeAuthorize(stateParam: String, client: Client, callback: QueryParamsCallback): Unit = js.native
  def url(): String = js.native
}

@JSGlobal("Dropbox.AuthDriver")
@js.native
object AuthDriver extends js.Object {
  @js.native
  class BrowserBase protected () extends js.Object {
    def this(options: AnonRememberUser) = this()
    def authType(): String = js.native
    def locationStateParam(url: String): String = js.native
    def onAuthStepChange(client: Client, callback: js.Function0[Unit]): Unit = js.native
  }
  
  @js.native
  class ChromeApp () extends IAuthDriver {
    def this(options: AnonScope) = this()
  }
  
  @js.native
  class ChromeExtension () extends IAuthDriver {
    def this(options: AnonReceiverPath) = this()
  }
  
  @js.native
  class Cordova () extends IAuthDriver {
    def this(options: AnonReceiverPath) = this()
    def url(): String = js.native
  }
  
  /** Do not use class! TypeScript definition implementation detail : https://github.com/Microsoft/TypeScript/issues/371 */
  @js.native
  class IAuthDriver () extends js.Object {
    def doAuthorize(authUrl: String, stateParam: String, client: Client): Unit = js.native
    def doAuthorize(authUrl: String, stateParam: String, client: Client, callback: QueryParamsCallback): Unit = js.native
  }
  
  @js.native
  class NodeServer () extends IAuthDriver {
    def this(options: AnonPort) = this()
    def authType(): String = js.native
    def closeBrowser(response: js.Any): Unit = js.native
    def closeServer(): Unit = js.native
    def createApp(): Unit = js.native
    // TODO check request response types
    def doRequest(request: js.Any, response: js.Any): Unit = js.native
    def openBrowser(url: String): Unit = js.native
    def url(): String = js.native
  }
  
  @js.native
  class Popup () extends IAuthDriver {
    def this(options: RedirectOptions) = this()
    def url(): String = js.native
  }
  
  @js.native
  class Redirect () extends js.Object {
    def this(options: AnonRedirectFile) = this()
    def doAuthorize(authUrl: String, stateParam: String, client: Client): Unit = js.native
    def resumeAuthorize(stateParam: String, client: Client, callback: QueryParamsCallback): Unit = js.native
    def url(): String = js.native
  }
  
  /* static members */
  @js.native
  object BrowserBase extends js.Object {
    def cleanupLocation(): Unit = js.native
    def currentLocation(): String = js.native
    def localStorage(): Storage = js.native
  }
  
  /* static members */
  @js.native
  object ChromeExtension extends js.Object {
    def oauthReceiver(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Cordova extends js.Object {
    def oauthReceiver(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Popup extends js.Object {
    def locationOrigin(location: String): String = js.native
    def oauthReceiver(): Unit = js.native
  }
  
}

