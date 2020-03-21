package typingsJapgolly.firebaseDatabase

import typingsJapgolly.firebaseDatabase.eventEmitterMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/OnlineMonitor", JSImport.Namespace)
@js.native
object onlineMonitorMod extends js.Object {
  @js.native
  class OnlineMonitor () extends EventEmitter {
    var online_ : js.Any = js.native
    /**
      * @return {boolean}
      */
    def currentlyOnline(): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object OnlineMonitor extends js.Object {
    def getInstance(): OnlineMonitor = js.native
  }
  
}

