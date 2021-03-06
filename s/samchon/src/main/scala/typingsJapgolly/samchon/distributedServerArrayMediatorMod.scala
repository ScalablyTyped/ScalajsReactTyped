package typingsJapgolly.samchon

import typingsJapgolly.samchon.distributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typingsJapgolly.samchon.idistributedserverMod.IDistributedServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/distributed/derived/DistributedServerArrayMediator", JSImport.Namespace)
@js.native
object distributedServerArrayMediatorMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.tstl.isizeMod.ISize because Already inherited
  - typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
  - typingsJapgolly.tstl.ipushMod.IPush because Already inherited
  - typingsJapgolly.tstl.iemptyMod.IEmpty because Already inherited
  - typingsJapgolly.std.Iterable because Already inherited
  - typingsJapgolly.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
  - typingsJapgolly.tstl.icontainerMod.IContainer because Already inherited
  - typingsJapgolly.tstl.ipushbackMod.IPushBack because Already inherited
  - typingsJapgolly.tstl.containerContainerMod.Container because Already inherited
  - typingsJapgolly.tstl.ifrontMod.IFront because Already inherited
  - typingsJapgolly.tstl.arrayContainerMod.ArrayContainer because Already inherited
  - typingsJapgolly.ecol.ieventdispatcherMod.IEventDispatcher because Already inherited
  - typingsJapgolly.tstl.dequeMod.Deque because Already inherited
  - typingsJapgolly.ecol.dequeCollectionMod.DequeCollection because Already inherited
  - typingsJapgolly.samchon.iprotocolMod.IProtocol because Already inherited
  - typingsJapgolly.samchon.entityCollectionMod.EntityDequeCollection because Already inherited
  - typingsJapgolly.samchon.externalSystemArrayMod.ExternalSystemArray because Already inherited
  - typingsJapgolly.samchon.iexternalserverarrayMod.IExternalServerArray because var conflicts: _Compute_col_size, _Fetch_index, _Handle_system_erase, _Insert_to_end, _Insert_to_middle, _Notify_erase, _Notify_insert, _Reserve, _Swap, _Try_add_row_at_back, _Try_add_row_at_front, _Try_expand_capacity, capacity_, dispatcher_, iterator, iterator_IContainer_, matrix_, size_. Inlined connect */ @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerArrayMediator[System /* <: IDistributedServer */] () extends DistributedSystemArrayMediator[System] {
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

