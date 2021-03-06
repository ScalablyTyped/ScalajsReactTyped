package typingsJapgolly.samchon

import typingsJapgolly.samchon.distributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typingsJapgolly.samchon.distributedSystemMod.DistributedSystem
import typingsJapgolly.samchon.iclientdriverMod.IClientDriver
import typingsJapgolly.samchon.invokeMod.Invoke
import typingsJapgolly.samchon.iparallelserverMod.IParallelServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/parallel", JSImport.Namespace)
@js.native
object parallelMod extends js.Object {
  @js.native
  class MediatorClient protected ()
    extends typingsJapgolly.samchon.mediatorClientMod.MediatorClient {
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
      systemArray: typingsJapgolly.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typingsJapgolly.samchon.parallelSystemMod.ParallelSystem],
      ip: String,
      port: Double
    ) = this()
  }
  
  @js.native
  class MediatorDedicatedWorkerServer ()
    extends typingsJapgolly.samchon.mediatorServerMod.MediatorDedicatedWorkerServer
  
  @js.native
  class MediatorServer protected ()
    extends typingsJapgolly.samchon.mediatorServerMod.MediatorServer {
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
      systemArray: typingsJapgolly.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typingsJapgolly.samchon.parallelSystemMod.ParallelSystem],
      port: Double
    ) = this()
  }
  
  @js.native
  class MediatorSharedWorkerClient ()
    extends typingsJapgolly.samchon.mediatorClientMod.MediatorSharedWorkerClient
  
  @js.native
  class MediatorSharedWorkerServer ()
    extends typingsJapgolly.samchon.mediatorServerMod.MediatorSharedWorkerServer
  
  @js.native
  abstract class MediatorSystem protected ()
    extends typingsJapgolly.samchon.mediatorSystemMod.MediatorSystem {
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
    def this(systemArray: typingsJapgolly.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typingsJapgolly.samchon.parallelSystemMod.ParallelSystem]) = this()
  }
  
  @js.native
  class MediatorWebClient ()
    extends typingsJapgolly.samchon.mediatorClientMod.MediatorWebClient
  
  @js.native
  class MediatorWebServer ()
    extends typingsJapgolly.samchon.mediatorServerMod.MediatorWebServer
  
  @js.native
  /**
    * Default Constructor.
    */
  class PRInvokeHistory ()
    extends typingsJapgolly.samchon.prinvokehistoryMod.PRInvokeHistory {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel process*.
      */
    def this(invoke: Invoke) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelClientArray[System /* <: typingsJapgolly.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsJapgolly.samchon.parallelClientArrayMod.ParallelClientArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelClientArrayMediator[System /* <: typingsJapgolly.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsJapgolly.samchon.parallelClientArrayMediatorMod.ParallelClientArrayMediator[System]
  
  @js.native
  abstract class ParallelServer protected ()
    extends typingsJapgolly.samchon.parallelServerMod.ParallelServer {
    /**
      * Construct from parent {@link ParallelSystemArray}.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      */
    def this(systemArray: typingsJapgolly.samchon.parallelSystemArrayMod.ParallelSystemArray[IParallelServer]) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerArray[System /* <: IParallelServer */] ()
    extends typingsJapgolly.samchon.parallelServerArrayMod.ParallelServerArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerArrayMediator[System /* <: IParallelServer */] ()
    extends typingsJapgolly.samchon.parallelServerArrayMediatorMod.ParallelServerArrayMediator[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerClientArray[System /* <: typingsJapgolly.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsJapgolly.samchon.parallelServerClientArrayMod.ParallelServerClientArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerClientArrayMediator[System /* <: typingsJapgolly.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsJapgolly.samchon.parallelServerClientArrayMediatorMod.ParallelServerClientArrayMediator[System]
  
  @js.native
  abstract class ParallelSystem protected ()
    extends typingsJapgolly.samchon.parallelSystemMod.ParallelSystem {
    /**
      * Construct from parent {@link ParallelSystemArray}.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      */
    def this(systemArray: typingsJapgolly.samchon.parallelSystemArrayMod.ParallelSystemArray[typingsJapgolly.samchon.parallelSystemMod.ParallelSystem]) = this()
    /**
      * Construct from parent {@link ParallelSystemArray} and communicator.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      * @param communicator A communicator communicates with remote, the external system.
      */
    def this(
      systemArray: typingsJapgolly.samchon.parallelSystemArrayMod.ParallelSystemArray[typingsJapgolly.samchon.parallelSystemMod.ParallelSystem],
      communicator: IClientDriver
    ) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelSystemArray[System /* <: typingsJapgolly.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsJapgolly.samchon.parallelSystemArrayMod.ParallelSystemArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelSystemArrayMediator[System /* <: typingsJapgolly.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsJapgolly.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator[System]
  
}

