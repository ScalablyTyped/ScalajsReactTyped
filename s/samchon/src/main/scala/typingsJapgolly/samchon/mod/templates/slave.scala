package typingsJapgolly.samchon.mod.templates

import typingsJapgolly.samchon.invokeMod.Invoke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon", "templates.slave")
@js.native
object slave extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  class InvokeHistory ()
    extends typingsJapgolly.samchon.templatesMod.slave.InvokeHistory {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel or distributed process*.
      */
    def this(invoke: Invoke) = this()
  }
  
  @js.native
  class PInvoke protected ()
    extends typingsJapgolly.samchon.templatesMod.slave.PInvoke {
    /**
      * Initializer Constructor.
      *
      * @param invoke Original {@link Invoke} message.
      * @param history {@link InvokeHistory} object archiving execution time.
      * @param slaveSystem Related {@link SlaveSystem} object who gets those processes from its master.
      */
    def this(
      invoke: Invoke,
      history: typingsJapgolly.samchon.invokeHistoryMod.InvokeHistory,
      slaveSystem: typingsJapgolly.samchon.slaveSystemMod.SlaveSystem
    ) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveClient ()
    extends typingsJapgolly.samchon.templatesMod.slave.SlaveClient
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveServer ()
    extends typingsJapgolly.samchon.templatesMod.slave.SlaveServer
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveSystem ()
    extends typingsJapgolly.samchon.templatesMod.slave.SlaveSystem
  
}

