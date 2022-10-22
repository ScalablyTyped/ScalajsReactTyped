package typingsJapgolly.samchon

import typingsJapgolly.samchon.protocolCommunicatorIclientdriverMod.IClientDriver
import typingsJapgolly.samchon.protocolInvokeInvokeMod.Invoke
import typingsJapgolly.samchon.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typingsJapgolly.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import typingsJapgolly.samchon.templatesParallelInterfacesIparallelserverMod.IParallelServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesParallelMod {
  
  @JSImport("samchon/templates/parallel", "MediatorClient")
  @js.native
  open class MediatorClient protected ()
    extends typingsJapgolly.samchon.templatesParallelDerivedMediatorClientMod.MediatorClient {
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
      * @param ip IP address to connect.
      * @param port Port number to connect.
      */
    def this(systemArray: DistributedSystemArrayMediator[DistributedSystem], ip: String, port: Double) = this()
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
      * @param ip IP address to connect.
      * @param port Port number to connect.
      */
    def this(
      systemArray: typingsJapgolly.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typingsJapgolly.samchon.templatesParallelParallelSystemMod.ParallelSystem],
      ip: String,
      port: Double
    ) = this()
  }
  
  @JSImport("samchon/templates/parallel", "MediatorDedicatedWorkerServer")
  @js.native
  open class MediatorDedicatedWorkerServer protected ()
    extends typingsJapgolly.samchon.templatesParallelDerivedMediatorServerMod.MediatorDedicatedWorkerServer {
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
      * @param port Port number of server to open.
      */
    def this(systemArray: DistributedSystemArrayMediator[DistributedSystem], port: Double) = this()
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
      * @param port Port number of server to open.
      */
    def this(
      systemArray: typingsJapgolly.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typingsJapgolly.samchon.templatesParallelParallelSystemMod.ParallelSystem],
      port: Double
    ) = this()
  }
  
  @JSImport("samchon/templates/parallel", "MediatorServer")
  @js.native
  open class MediatorServer protected ()
    extends typingsJapgolly.samchon.templatesParallelDerivedMediatorServerMod.MediatorServer {
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
      * @param port Port number of server to open.
      */
    def this(systemArray: DistributedSystemArrayMediator[DistributedSystem], port: Double) = this()
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
      * @param port Port number of server to open.
      */
    def this(
      systemArray: typingsJapgolly.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typingsJapgolly.samchon.templatesParallelParallelSystemMod.ParallelSystem],
      port: Double
    ) = this()
  }
  
  @JSImport("samchon/templates/parallel", "MediatorSharedWorkerClient")
  @js.native
  open class MediatorSharedWorkerClient protected ()
    extends typingsJapgolly.samchon.templatesParallelDerivedMediatorClientMod.MediatorSharedWorkerClient {
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
      * @param ip IP address to connect.
      * @param port Port number to connect.
      */
    def this(systemArray: DistributedSystemArrayMediator[DistributedSystem], ip: String, port: Double) = this()
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
      * @param ip IP address to connect.
      * @param port Port number to connect.
      */
    def this(
      systemArray: typingsJapgolly.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typingsJapgolly.samchon.templatesParallelParallelSystemMod.ParallelSystem],
      ip: String,
      port: Double
    ) = this()
  }
  
  @JSImport("samchon/templates/parallel", "MediatorSharedWorkerServer")
  @js.native
  open class MediatorSharedWorkerServer protected ()
    extends typingsJapgolly.samchon.templatesParallelDerivedMediatorServerMod.MediatorSharedWorkerServer {
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
      * @param port Port number of server to open.
      */
    def this(systemArray: DistributedSystemArrayMediator[DistributedSystem], port: Double) = this()
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
      * @param port Port number of server to open.
      */
    def this(
      systemArray: typingsJapgolly.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typingsJapgolly.samchon.templatesParallelParallelSystemMod.ParallelSystem],
      port: Double
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon/templates/parallel", "MediatorSystem")
  @js.native
  open class MediatorSystem protected ()
    extends typingsJapgolly.samchon.templatesParallelMediatorSystemMod.MediatorSystem {
    /**
      * Construct from parent {@link DistributedSystemArrayMediator} object.
      *
      * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
      */
    def this(systemArray: DistributedSystemArrayMediator[DistributedSystem]) = this()
    /**
      * Construct from parent {@link ParallelSystemArrayMediator} object.
      *
      * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
      */
    def this(systemArray: typingsJapgolly.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typingsJapgolly.samchon.templatesParallelParallelSystemMod.ParallelSystem]) = this()
  }
  
  @JSImport("samchon/templates/parallel", "MediatorWebClient")
  @js.native
  open class MediatorWebClient protected ()
    extends typingsJapgolly.samchon.templatesParallelDerivedMediatorClientMod.MediatorWebClient {
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
      * @param ip IP address to connect.
      * @param port Port number to connect.
      */
    def this(systemArray: DistributedSystemArrayMediator[DistributedSystem], ip: String, port: Double) = this()
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
      * @param ip IP address to connect.
      * @param port Port number to connect.
      */
    def this(
      systemArray: typingsJapgolly.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typingsJapgolly.samchon.templatesParallelParallelSystemMod.ParallelSystem],
      ip: String,
      port: Double
    ) = this()
  }
  
  @JSImport("samchon/templates/parallel", "MediatorWebServer")
  @js.native
  open class MediatorWebServer protected ()
    extends typingsJapgolly.samchon.templatesParallelDerivedMediatorServerMod.MediatorWebServer {
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
      * @param port Port number of server to open.
      */
    def this(systemArray: DistributedSystemArrayMediator[DistributedSystem], port: Double) = this()
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
      * @param port Port number of server to open.
      */
    def this(
      systemArray: typingsJapgolly.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typingsJapgolly.samchon.templatesParallelParallelSystemMod.ParallelSystem],
      port: Double
    ) = this()
  }
  
  @JSImport("samchon/templates/parallel", "PRInvokeHistory")
  @js.native
  /**
    * Default Constructor.
    */
  open class PRInvokeHistory ()
    extends typingsJapgolly.samchon.templatesParallelPrinvokehistoryMod.PRInvokeHistory {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel process*.
      */
    def this(invoke: Invoke) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon/templates/parallel", "ParallelClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelClientArray[System /* <: typingsJapgolly.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typingsJapgolly.samchon.templatesParallelDerivedParallelClientArrayMod.ParallelClientArray[System]
  
  /* note: abstract class */ @JSImport("samchon/templates/parallel", "ParallelClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelClientArrayMediator[System /* <: typingsJapgolly.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typingsJapgolly.samchon.templatesParallelDerivedParallelClientArrayMediatorMod.ParallelClientArrayMediator[System]
  
  /* note: abstract class */ @JSImport("samchon/templates/parallel", "ParallelServer")
  @js.native
  open class ParallelServer protected ()
    extends typingsJapgolly.samchon.templatesParallelDerivedParallelServerMod.ParallelServer {
    /**
      * Construct from parent {@link ParallelSystemArray}.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      */
    def this(systemArray: typingsJapgolly.samchon.templatesParallelParallelSystemArrayMod.ParallelSystemArray[IParallelServer]) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon/templates/parallel", "ParallelServerArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelServerArray[System /* <: IParallelServer */] ()
    extends typingsJapgolly.samchon.templatesParallelDerivedParallelServerArrayMod.ParallelServerArray[System]
  
  /* note: abstract class */ @JSImport("samchon/templates/parallel", "ParallelServerArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelServerArrayMediator[System /* <: IParallelServer */] ()
    extends typingsJapgolly.samchon.templatesParallelDerivedParallelServerArrayMediatorMod.ParallelServerArrayMediator[System]
  
  /* note: abstract class */ @JSImport("samchon/templates/parallel", "ParallelServerClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelServerClientArray[System /* <: typingsJapgolly.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typingsJapgolly.samchon.templatesParallelDerivedParallelServerClientArrayMod.ParallelServerClientArray[System]
  
  /* note: abstract class */ @JSImport("samchon/templates/parallel", "ParallelServerClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelServerClientArrayMediator[System /* <: typingsJapgolly.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typingsJapgolly.samchon.templatesParallelDerivedParallelServerClientArrayMediatorMod.ParallelServerClientArrayMediator[System]
  
  /* note: abstract class */ @JSImport("samchon/templates/parallel", "ParallelSystem")
  @js.native
  open class ParallelSystem protected ()
    extends typingsJapgolly.samchon.templatesParallelParallelSystemMod.ParallelSystem {
    /**
      * Construct from parent {@link ParallelSystemArray}.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      */
    def this(systemArray: typingsJapgolly.samchon.templatesParallelParallelSystemArrayMod.ParallelSystemArray[typingsJapgolly.samchon.templatesParallelParallelSystemMod.ParallelSystem]) = this()
    /**
      * Construct from parent {@link ParallelSystemArray} and communicator.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      * @param communicator A communicator communicates with remote, the external system.
      */
    def this(
      systemArray: typingsJapgolly.samchon.templatesParallelParallelSystemArrayMod.ParallelSystemArray[typingsJapgolly.samchon.templatesParallelParallelSystemMod.ParallelSystem],
      communicator: IClientDriver
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon/templates/parallel", "ParallelSystemArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelSystemArray[System /* <: typingsJapgolly.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typingsJapgolly.samchon.templatesParallelParallelSystemArrayMod.ParallelSystemArray[System]
  
  /* note: abstract class */ @JSImport("samchon/templates/parallel", "ParallelSystemArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelSystemArrayMediator[System /* <: typingsJapgolly.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typingsJapgolly.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[System]
}
