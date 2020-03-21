package typingsJapgolly.twilioSync

import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/closeable", JSImport.Namespace)
@js.native
object closeableMod extends js.Object {
  @js.native
  abstract class Closeable () extends EventEmitter {
    var closed: js.Any = js.native
    val listenerUuid: String = js.native
    val uuid: js.Any = js.native
    /* protected */ def close(): Unit = js.native
    /* protected */ def ensureNotClosed(): Unit = js.native
  }
  
  @js.native
  abstract class default () extends Closeable
  
}

