package typingsJapgolly.samchonFramework.mod.templates

import typingsJapgolly.samchon.protocolInvokeInvokeMod.Invoke
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slave {
  
  @JSImport("samchon-framework", "templates.slave.InvokeHistory")
  @js.native
  /**
    * Default Constructor.
    */
  open class InvokeHistory ()
    extends typingsJapgolly.samchon.mod.templates.slave.InvokeHistory {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel or distributed process*.
      */
    def this(invoke: Invoke) = this()
  }
  
  @JSImport("samchon-framework", "templates.slave.PInvoke")
  @js.native
  open class PInvoke protected ()
    extends typingsJapgolly.samchon.mod.templates.slave.PInvoke {
    /**
      * Initializer Constructor.
      *
      * @param invoke Original {@link Invoke} message.
      * @param history {@link InvokeHistory} object archiving execution time.
      * @param slaveSystem Related {@link SlaveSystem} object who gets those processes from its master.
      */
    def this(
      invoke: Invoke,
      history: typingsJapgolly.samchon.templatesSlaveInvokeHistoryMod.InvokeHistory,
      slaveSystem: typingsJapgolly.samchon.templatesSlaveSlaveSystemMod.SlaveSystem
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.slave.SlaveClient")
  @js.native
  /**
    * Default Constructor.
    */
  open class SlaveClient ()
    extends typingsJapgolly.samchon.mod.templates.slave.SlaveClient
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.slave.SlaveServer")
  @js.native
  /**
    * Default Constructor.
    */
  open class SlaveServer ()
    extends typingsJapgolly.samchon.mod.templates.slave.SlaveServer
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.slave.SlaveSystem")
  @js.native
  /**
    * Default Constructor.
    */
  open class SlaveSystem ()
    extends typingsJapgolly.samchon.mod.templates.slave.SlaveSystem
}
