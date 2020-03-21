package typingsJapgolly.sinonChrome.mod

import typingsJapgolly.sinonChrome.mod.events.Event
import typingsJapgolly.sinonChrome.mod.types.StubbedChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sinon-chrome", "proxy")
@js.native
object proxy extends js.Object {
  var onProxyError: Event = js.native
  var settings: StubbedChromeSetting = js.native
}

