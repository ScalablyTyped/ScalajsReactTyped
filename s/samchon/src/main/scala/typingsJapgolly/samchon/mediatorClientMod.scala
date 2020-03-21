package typingsJapgolly.samchon

import typingsJapgolly.samchon.distributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typingsJapgolly.samchon.distributedSystemMod.DistributedSystem
import typingsJapgolly.samchon.iserverconnectorMod.IServerConnector
import typingsJapgolly.samchon.mediatorSystemMod.MediatorSystem
import typingsJapgolly.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator
import typingsJapgolly.samchon.parallelSystemMod.ParallelSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/parallel/derived/MediatorClient", JSImport.Namespace)
@js.native
object mediatorClientMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.samchon.iprotocolMod.IProtocol because Already inherited
  - typingsJapgolly.samchon.slaveSystemMod.SlaveSystem because Already inherited
  - typingsJapgolly.samchon.slaveClientMod.ISlaveClient because var conflicts: _Complete_process, communicator_. Inlined connect */ @js.native
  class MediatorClient protected () extends MediatorSystem {
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
    def this(systemArray: ParallelSystemArrayMediator[ParallelSystem], ip: String, port: Double) = this()
    /**
      * @hidden
      */
    var ip: js.Any = js.native
    /**
      * @hidden
      */
    var port: js.Any = js.native
    /**
      * @inheritdoc
      */
    def connect(): Unit = js.native
    def connect(ip: String, port: Double): Unit = js.native
    /**
      * Factory method creating {@link IServerConnector} object.
      *
      * The {@link createServerConnector createServerConnector()} is an abstract method creating
      * {@link IServerConnector} object. Overrides and returns one of them, considering which protocol the **master**
      * server follows:
      *
      * - {@link ServerConnector}
      * - {@link WebServerConnector}
      * - {@link SharedWorkerServerConnector}
      *
      * @return A newly created {@link IServerConnector} object.
      */
    /* protected */ def createServerConnector(): IServerConnector = js.native
  }
  
  @js.native
  class MediatorSharedWorkerClient () extends MediatorClient
  
  @js.native
  class MediatorWebClient () extends MediatorClient
  
}

