package typingsJapgolly.sinonChrome.mod

import typingsJapgolly.sinonChrome.mod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sinon-chrome", "tabCapture")
@js.native
object tabCapture extends js.Object {
  var capture: SinonChromeStub = js.native
  var getCapturedTabs: SinonChromeStub = js.native
  var onStatusChanged: Event = js.native
}

