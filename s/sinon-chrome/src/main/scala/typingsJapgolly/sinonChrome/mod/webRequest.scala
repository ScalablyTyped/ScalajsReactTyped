package typingsJapgolly.sinonChrome.mod

import typingsJapgolly.sinonChrome.mod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sinon-chrome", "webRequest")
@js.native
object webRequest extends js.Object {
  var handlerBehaviorChanged: SinonChromeStub = js.native
  var onAuthRequired: Event = js.native
  var onBeforeRedirect: Event = js.native
  var onBeforeRequest: Event = js.native
  var onBeforeSendHeaders: Event = js.native
  var onCompleted: Event = js.native
  var onErrorOccurred: Event = js.native
  var onHeadersReceived: Event = js.native
  var onResponseStarted: Event = js.native
  var onSendHeaders: Event = js.native
}

