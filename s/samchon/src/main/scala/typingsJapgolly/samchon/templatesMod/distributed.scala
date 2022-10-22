package typingsJapgolly.samchon.templatesMod

import typingsJapgolly.samchon.protocolCommunicatorIclientdriverMod.IClientDriver
import typingsJapgolly.samchon.protocolInvokeInvokeMod.Invoke
import typingsJapgolly.samchon.templatesDistributedInterfacesIdistributedserverMod.IDistributedServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributed {
  
  @JSImport("samchon/templates", "distributed.DSInvokeHistory")
  @js.native
  open class DSInvokeHistory protected ()
    extends typingsJapgolly.samchon.templatesDistributedMod.DSInvokeHistory {
    /**
      * Construct from a DistributedSystem.
      *
      * @param system The {@link DistributedSystem} object who sent the {@link Invoke} message.
      */
    def this(system: typingsJapgolly.samchon.templatesDistributedDistributedSystemMod.DistributedSystem) = this()
    /**
      * Initilizer Constructor.
      *
      * @param system The {@link DistributedSystem} object who sent the {@link Invoke} message.
      * @param process The {@link DistributedProcess} object who sent the {@link Invoke} message.
      * @param invoke An {@link Invoke} message requesting the *distributed process*.
      * @param weight Weight of resource which indicates how heavy this {@link Invoke} message is.
      */
    def this(
      system: typingsJapgolly.samchon.templatesDistributedDistributedSystemMod.DistributedSystem,
      process: typingsJapgolly.samchon.templatesDistributedDistributedProcessMod.DistributedProcess,
      invoke: Invoke,
      weight: Double
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class DistributedClientArray[System /* <: typingsJapgolly.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typingsJapgolly.samchon.templatesDistributedMod.DistributedClientArray[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class DistributedClientArrayMediator[System /* <: typingsJapgolly.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typingsJapgolly.samchon.templatesDistributedMod.DistributedClientArrayMediator[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedProcess")
  @js.native
  open class DistributedProcess protected ()
    extends typingsJapgolly.samchon.templatesDistributedMod.DistributedProcess {
    /**
      * Constrct from parent {@link DistributedSystemArray} object.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: typingsJapgolly.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[
            typingsJapgolly.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
          ]) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedServer")
  @js.native
  open class DistributedServer protected ()
    extends typingsJapgolly.samchon.templatesDistributedMod.DistributedServer {
    /**
      * Construct from parent {@link DistributedSystemArray}.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: typingsJapgolly.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[
            typingsJapgolly.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
          ]) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedServerArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class DistributedServerArray[System /* <: IDistributedServer */] ()
    extends typingsJapgolly.samchon.templatesDistributedMod.DistributedServerArray[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedServerArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class DistributedServerArrayMediator[System /* <: IDistributedServer */] ()
    extends typingsJapgolly.samchon.templatesDistributedMod.DistributedServerArrayMediator[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedServerClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class DistributedServerClientArray[System /* <: typingsJapgolly.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typingsJapgolly.samchon.templatesDistributedMod.DistributedServerClientArray[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedServerClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class DistributedServerClientArrayMediator[System /* <: typingsJapgolly.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typingsJapgolly.samchon.templatesDistributedMod.DistributedServerClientArrayMediator[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedSystem")
  @js.native
  open class DistributedSystem protected ()
    extends typingsJapgolly.samchon.templatesDistributedMod.DistributedSystem {
    /**
      * Construct from parent {@link DistributedSystemArray}.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: typingsJapgolly.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[
            typingsJapgolly.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
          ]) = this()
    /**
      * Constrct from parent {@link DistributedSystemArray} and communicator.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      * @param communicator A communicator communicates with remote, the external system.
      */
    def this(
      systemArray: typingsJapgolly.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[
            typingsJapgolly.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
          ],
      communicator: IClientDriver
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedSystemArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class DistributedSystemArray[System /* <: typingsJapgolly.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typingsJapgolly.samchon.templatesDistributedMod.DistributedSystemArray[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedSystemArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class DistributedSystemArrayMediator[System /* <: typingsJapgolly.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typingsJapgolly.samchon.templatesDistributedMod.DistributedSystemArrayMediator[System]
}
