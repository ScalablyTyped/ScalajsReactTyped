package typingsJapgolly.samchon

import typingsJapgolly.samchon.protocolCommunicatorIserverconnectorMod.IServerConnector
import typingsJapgolly.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray
import typingsJapgolly.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesDistributedDerivedDistributedServerMod {
  
  /* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.ecol.libBasicIeventdispatcherMod.IEventDispatcher because Already inherited
  - typingsJapgolly.ecol.libBasicIcollectionMod.ICollection because Already inherited
  - typingsJapgolly.ecol.libLinearDequeCollectionMod.DequeCollection because Already inherited
  - typingsJapgolly.ecol.mod.DequeCollection because Already inherited
  - typingsJapgolly.samchon.protocolInvokeIprotocolMod.IProtocol because Already inherited
  - typingsJapgolly.samchon.protocolEntityEntityCollectionMod.EntityDequeCollection because Already inherited
  - typingsJapgolly.samchon.templatesExternalExternalSystemMod.ExternalSystem because Already inherited
  - typingsJapgolly.samchon.templatesExternalInterfacesIexternalserverMod.IExternalServer because var conflicts: _Handle_close, _Notify_erase, _Notify_insert, communicator, communicator_, dispatcher_, name, system_array_. Inlined connect */ @JSImport("samchon/templates/distributed/derived/DistributedServer", "DistributedServer")
  @js.native
  open class DistributedServer protected () extends DistributedSystem {
    /**
      * Construct from parent {@link DistributedSystemArray}.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: DistributedSystemArray[DistributedSystem]) = this()
    
    /**
      * @inheritdoc
      */
    /**
      * Connect to the external server.
      */
    def connect(): Unit = js.native
    
    /**
      * Factory method creating {@link IServerConnector} object.
      *
      * The {@link createServerConnector createServerConnector()} is an abstract method creating
      * {@link IServerConnector} object. Overrides and returns one of them, considering which protocol the slave server
      * follows:
      *
      * - {@link ServerConnector}
      * - {@link WebServerConnector}
      * - {@link DedicatedWorkerServerConnector}
      * - {@link SharedWorkerServerConnector}
      *
      * @return A newly created {@link IServerConnector} object.
      */
    /* protected */ def createServerConnector(): IServerConnector = js.native
    
    /**
      * IP address of target external system to connect.
      */
    /* protected */ var ip: String = js.native
    
    /**
      * Port number of target external system to connect.
      */
    /* protected */ var port: Double = js.native
  }
}
