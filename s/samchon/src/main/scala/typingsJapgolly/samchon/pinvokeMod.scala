package typingsJapgolly.samchon

import typingsJapgolly.samchon.invokeHistoryMod.InvokeHistory
import typingsJapgolly.samchon.invokeMod.Invoke
import typingsJapgolly.samchon.slaveSystemMod.SlaveSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/slave/PInvoke", JSImport.Namespace)
@js.native
object pinvokeMod extends js.Object {
  @js.native
  class PInvoke protected () extends Invoke {
    /**
      * Initializer Constructor.
      *
      * @param invoke Original {@link Invoke} message.
      * @param history {@link InvokeHistory} object archiving execution time.
      * @param slaveSystem Related {@link SlaveSystem} object who gets those processes from its master.
      */
    def this(invoke: Invoke, history: InvokeHistory, slaveSystem: SlaveSystem) = this()
    /**
      * @hidden
      */
    var history_ : js.Any = js.native
    /**
      * @hidden
      */
    var hold_ : js.Any = js.native
    /**
      * @hidden
      */
    var slave_system_ : js.Any = js.native
    /**
      * Report completion.
      */
    def complete(): Unit = js.native
    /**
      * Get history object.
      *
      * Get {@link InvokeHistory} object who is archiving execution time of this process.
      */
    def getHistory(): InvokeHistory = js.native
    /**
      * Hold reporting completion to master.
      */
    def hold(): Unit = js.native
    /**
      * Is the reporting hold?
      */
    def isHold(): Boolean = js.native
  }
  
}

