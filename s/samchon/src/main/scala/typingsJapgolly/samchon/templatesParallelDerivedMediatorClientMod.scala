package typingsJapgolly.samchon

import typingsJapgolly.samchon.protocolCommunicatorIserverconnectorMod.IServerConnector
import typingsJapgolly.samchon.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typingsJapgolly.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import typingsJapgolly.samchon.templatesParallelMediatorSystemMod.MediatorSystem
import typingsJapgolly.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator
import typingsJapgolly.samchon.templatesParallelParallelSystemMod.ParallelSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesParallelDerivedMediatorClientMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.samchon.protocolInvokeIprotocolMod.IProtocol because Already inherited
  - typingsJapgolly.samchon.templatesSlaveSlaveSystemMod.SlaveSystem because Already inherited
  - typingsJapgolly.samchon.templatesSlaveSlaveClientMod.ISlaveClient because var conflicts: _Complete_process, communicator_. Inlined connect */ @JSImport("samchon/templates/parallel/derived/MediatorClient", "MediatorClient")
  @js.native
  open class MediatorClient protected () extends MediatorSystem {
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
    
    /**
      * @hidden
      */
    /* private */ var ip: Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var port: Any = js.native
  }
  
  @JSImport("samchon/templates/parallel/derived/MediatorClient", "MediatorSharedWorkerClient")
  @js.native
  open class MediatorSharedWorkerClient protected () extends MediatorClient {
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
  }
  
  @JSImport("samchon/templates/parallel/derived/MediatorClient", "MediatorWebClient")
  @js.native
  open class MediatorWebClient protected () extends MediatorClient {
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
  }
}
