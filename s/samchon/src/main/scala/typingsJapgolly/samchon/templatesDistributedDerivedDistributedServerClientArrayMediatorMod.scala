package typingsJapgolly.samchon

import typingsJapgolly.samchon.templatesDistributedDerivedDistributedClientArrayMediatorMod.DistributedClientArrayMediator
import typingsJapgolly.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import typingsJapgolly.sxml.mod.XML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesDistributedDerivedDistributedServerClientArrayMediatorMod {
  
  /* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.ecol.libBasicIeventdispatcherMod.IEventDispatcher because Already inherited
  - typingsJapgolly.ecol.libBasicIcollectionMod.ICollection because Already inherited
  - typingsJapgolly.ecol.libLinearDequeCollectionMod.DequeCollection because Already inherited
  - typingsJapgolly.ecol.mod.DequeCollection because Already inherited
  - typingsJapgolly.samchon.protocolInvokeIprotocolMod.IProtocol because Already inherited
  - typingsJapgolly.samchon.protocolEntityEntityCollectionMod.EntityDequeCollection because Already inherited
  - typingsJapgolly.samchon.protocolServerIserverMod.IServer because Already inherited
  - typingsJapgolly.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray because Already inherited
  - typingsJapgolly.samchon.templatesExternalInterfacesIexternalclientarrayMod.IExternalClientArray because Already inherited
  - typingsJapgolly.samchon.templatesExternalInterfacesIexternalserverclientarrayMod.IExternalServerClientArray because var conflicts: _Handle_system_erase, _Notify_erase, _Notify_insert, dispatcher_. Inlined connect */ @JSImport("samchon/templates/distributed/derived/DistributedServerClientArrayMediator", "DistributedServerClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class DistributedServerClientArrayMediator[System /* <: DistributedSystem */] () extends DistributedClientArrayMediator[System] {
    
    /**
      * @inheritdoc
      */
    /**
      * Connect to {@link IExternalServer external servers}.
      *
      * This method calls children elements' method {@link IExternalServer.connect} gradually.
      */
    def connect(): Unit = js.native
    
    /**
      * Factory method creating an {@link IDistributedServer} object.
      *
      * @param xml An {@link XML} object represents child element, so that can identify the type of child to create.
      * @return A newly created {@link IDistributedServer} object.
      */
    /* protected */ def createExternalServer(xml: XML): System = js.native
  }
}
