package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nginstackEngine.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatabaseDbtrackerpoolMod {
  
  inline def apply(opt_options: Id): Unit = ^.asInstanceOf[js.Dynamic].apply(opt_options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/database/DBTrackerPool", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DBTrackerPool {
    def this(opt_options: Id) = this()
    
    /* CompleteClass */
    override def acquire(): Any = js.native
    
    /* private */ /* CompleteClass */
    var database_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var generateTrackers_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var getAvailableTrackers_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var getDBTracker_ : Any = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    override def release(tracker: typingsJapgolly.nginstackEngine.libDatabaseDbtrackerMod.^): Unit = js.native
    
    /* CompleteClass */
    override def tryAcquire(): typingsJapgolly.nginstackEngine.libDatabaseDbtrackerMod.^ = js.native
  }
  @JSImport("@nginstack/engine/lib/database/DBTrackerPool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DBTrackerPool extends StObject {
    
    def acquire(): Any
    
    /* private */ var database_ : Any
    
    /* private */ var generateTrackers_ : Any
    
    /* private */ var getAvailableTrackers_ : Any
    
    /* private */ var getDBTracker_ : Any
    
    var id: Double
    
    def release(tracker: typingsJapgolly.nginstackEngine.libDatabaseDbtrackerMod.^): Unit
    
    def tryAcquire(): typingsJapgolly.nginstackEngine.libDatabaseDbtrackerMod.^
  }
  object DBTrackerPool {
    
    inline def apply(
      acquire: CallbackTo[Any],
      database_ : Any,
      generateTrackers_ : Any,
      getAvailableTrackers_ : Any,
      getDBTracker_ : Any,
      id: Double,
      release: typingsJapgolly.nginstackEngine.libDatabaseDbtrackerMod.^ => Callback,
      tryAcquire: CallbackTo[typingsJapgolly.nginstackEngine.libDatabaseDbtrackerMod.^]
    ): DBTrackerPool = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, database_ = database_.asInstanceOf[js.Any], generateTrackers_ = generateTrackers_.asInstanceOf[js.Any], getAvailableTrackers_ = getAvailableTrackers_.asInstanceOf[js.Any], getDBTracker_ = getDBTracker_.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], release = js.Any.fromFunction1((t0: typingsJapgolly.nginstackEngine.libDatabaseDbtrackerMod.^) => release(t0).runNow()), tryAcquire = tryAcquire.toJsFn)
      __obj.asInstanceOf[DBTrackerPool]
    }
    
    extension [Self <: DBTrackerPool](x: Self) {
      
      inline def setAcquire(value: CallbackTo[Any]): Self = StObject.set(x, "acquire", value.toJsFn)
      
      inline def setDatabase_(value: Any): Self = StObject.set(x, "database_", value.asInstanceOf[js.Any])
      
      inline def setGenerateTrackers_(value: Any): Self = StObject.set(x, "generateTrackers_", value.asInstanceOf[js.Any])
      
      inline def setGetAvailableTrackers_(value: Any): Self = StObject.set(x, "getAvailableTrackers_", value.asInstanceOf[js.Any])
      
      inline def setGetDBTracker_(value: Any): Self = StObject.set(x, "getDBTracker_", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRelease(value: typingsJapgolly.nginstackEngine.libDatabaseDbtrackerMod.^ => Callback): Self = StObject.set(x, "release", js.Any.fromFunction1((t0: typingsJapgolly.nginstackEngine.libDatabaseDbtrackerMod.^) => value(t0).runNow()))
      
      inline def setTryAcquire(value: CallbackTo[typingsJapgolly.nginstackEngine.libDatabaseDbtrackerMod.^]): Self = StObject.set(x, "tryAcquire", value.toJsFn)
    }
  }
  
  type Database = typingsJapgolly.nginstackEngine.libDatabaseDatabaseMod.^
}
