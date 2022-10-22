package typingsJapgolly.firebaseFirestore.distInternalMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Initializes and wires components that are needed to interface with the local
  * cache. Implementations override `initialize()` to provide all components.
  */
trait OfflineComponentProvider extends StObject {
  
  var gcScheduler: Scheduler | Null
  
  var indexBackfillerScheduler: Scheduler | Null
  
  def initialize(cfg: ComponentConfiguration): js.Promise[Unit]
  
  var localStore: LocalStore
  
  var persistence: Persistence
  
  var sharedClientState: SharedClientState
  
  var synchronizeTabs: Boolean
  
  def terminate(): js.Promise[Unit]
}
object OfflineComponentProvider {
  
  inline def apply(
    initialize: ComponentConfiguration => js.Promise[Unit],
    localStore: LocalStore,
    persistence: Persistence,
    sharedClientState: SharedClientState,
    synchronizeTabs: Boolean,
    terminate: CallbackTo[js.Promise[Unit]]
  ): OfflineComponentProvider = {
    val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1(initialize), localStore = localStore.asInstanceOf[js.Any], persistence = persistence.asInstanceOf[js.Any], sharedClientState = sharedClientState.asInstanceOf[js.Any], synchronizeTabs = synchronizeTabs.asInstanceOf[js.Any], terminate = terminate.toJsFn, gcScheduler = null, indexBackfillerScheduler = null)
    __obj.asInstanceOf[OfflineComponentProvider]
  }
  
  extension [Self <: OfflineComponentProvider](x: Self) {
    
    inline def setGcScheduler(value: Scheduler): Self = StObject.set(x, "gcScheduler", value.asInstanceOf[js.Any])
    
    inline def setGcSchedulerNull: Self = StObject.set(x, "gcScheduler", null)
    
    inline def setIndexBackfillerScheduler(value: Scheduler): Self = StObject.set(x, "indexBackfillerScheduler", value.asInstanceOf[js.Any])
    
    inline def setIndexBackfillerSchedulerNull: Self = StObject.set(x, "indexBackfillerScheduler", null)
    
    inline def setInitialize(value: ComponentConfiguration => js.Promise[Unit]): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    inline def setLocalStore(value: LocalStore): Self = StObject.set(x, "localStore", value.asInstanceOf[js.Any])
    
    inline def setPersistence(value: Persistence): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
    
    inline def setSharedClientState(value: SharedClientState): Self = StObject.set(x, "sharedClientState", value.asInstanceOf[js.Any])
    
    inline def setSynchronizeTabs(value: Boolean): Self = StObject.set(x, "synchronizeTabs", value.asInstanceOf[js.Any])
    
    inline def setTerminate(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "terminate", value.toJsFn)
  }
}
