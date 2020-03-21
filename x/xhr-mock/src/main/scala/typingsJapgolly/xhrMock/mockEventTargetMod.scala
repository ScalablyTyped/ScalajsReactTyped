package typingsJapgolly.xhrMock

import typingsJapgolly.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/MockEventTarget", JSImport.Namespace)
@js.native
object mockEventTargetMod extends js.Object {
  @js.native
  trait MockEventTarget extends EventTarget {
    var listeners: js.UndefOr[js.Any] = js.native
  }
  
  @js.native
  class default () extends MockEventTarget
  
}

