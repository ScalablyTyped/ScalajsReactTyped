package typingsJapgolly.samchon

import typingsJapgolly.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray
import typingsJapgolly.samchon.templatesDistributedInterfacesIdistributedserverMod.IDistributedServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesDistributedDerivedDistributedServerArrayMod {
  
  /* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.ecol.libBasicIeventdispatcherMod.IEventDispatcher because Already inherited
  - typingsJapgolly.ecol.libBasicIcollectionMod.ICollection because Already inherited
  - typingsJapgolly.ecol.libLinearDequeCollectionMod.DequeCollection because Already inherited
  - typingsJapgolly.ecol.mod.DequeCollection because Already inherited
  - typingsJapgolly.samchon.protocolInvokeIprotocolMod.IProtocol because Already inherited
  - typingsJapgolly.samchon.protocolEntityEntityCollectionMod.EntityDequeCollection because Already inherited
  - typingsJapgolly.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray because Already inherited
  - typingsJapgolly.samchon.templatesExternalInterfacesIexternalserverarrayMod.IExternalServerArray because var conflicts: _Handle_system_erase, _Notify_erase, _Notify_insert, dispatcher_. Inlined connect */ @JSImport("samchon/templates/distributed/derived/DistributedServerArray", "DistributedServerArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class DistributedServerArray[System /* <: IDistributedServer */] () extends DistributedSystemArray[System] {
    
    /**
      * @inheritdoc
      */
    /**
      * Connect to {@link IExternalServer external servers}.
      *
      * This method calls children elements' method {@link IExternalServer.connect} gradually.
      */
    def connect(): Unit = js.native
  }
}
