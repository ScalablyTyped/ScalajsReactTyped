package typingsJapgolly.datastoreCore

import typingsJapgolly.datastoreCore.distSrcBaseMod.BaseDatastore
import typingsJapgolly.datastoreCore.distSrcKeytransformMod.KeyTransformDatastore
import typingsJapgolly.interfaceDatastore.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcShardingMod {
  
  @JSImport("datastore-core/dist/src/sharding", "ShardingDatastore")
  @js.native
  open class ShardingDatastore protected () extends BaseDatastore {
    /**
      * @param {Datastore} store
      * @param {Shard} shard
      */
    def this(store: Datastore, shard: Shard) = this()
    
    /**
      * @param {Key} key
      */
    def _convertKey(key: Key): Key = js.native
    
    /**
      * @param {Key} key
      */
    def _invertKey(key: Key): Key = js.native
    
    var child: KeyTransformDatastore = js.native
    
    var shard: typingsJapgolly.datastoreCore.distSrcTypesMod.Shard = js.native
  }
  /* static members */
  object ShardingDatastore {
    
    @JSImport("datastore-core/dist/src/sharding", "ShardingDatastore")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {Datastore} store
      * @param {Shard} shard
      */
    inline def create(store: Datastore, shard: Shard): js.Promise[typingsJapgolly.datastoreCore.distSrcTypesMod.Shard] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(store.asInstanceOf[js.Any], shard.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.datastoreCore.distSrcTypesMod.Shard]]
    
    /**
      * @deprecated
      * @param {Datastore} store
      * @param {Shard} shard
      */
    inline def createOrOpen(store: Datastore, shard: Shard): js.Promise[ShardingDatastore] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrOpen")(store.asInstanceOf[js.Any], shard.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ShardingDatastore]]
    
    /**
      * @deprecated
      * @param {Datastore} store
      */
    inline def open(store: Datastore): js.Promise[ShardingDatastore] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(store.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ShardingDatastore]]
  }
  
  type Await[TValue] = typingsJapgolly.interfaceStore.mod.Await[TValue]
  
  type AwaitIterable[TEntry] = typingsJapgolly.interfaceStore.mod.AwaitIterable[TEntry]
  
  type Batch = typingsJapgolly.interfaceDatastore.mod.Batch
  
  type Datastore = typingsJapgolly.interfaceDatastore.mod.Datastore
  
  type KeyQuery = typingsJapgolly.interfaceDatastore.mod.KeyQuery
  
  type KeyQueryFilter = typingsJapgolly.interfaceDatastore.mod.KeyQueryFilter
  
  type KeyQueryOrder = typingsJapgolly.interfaceDatastore.mod.KeyQueryOrder
  
  type Options = typingsJapgolly.interfaceDatastore.mod.Options
  
  type Pair = typingsJapgolly.interfaceDatastore.mod.Pair
  
  type Query = typingsJapgolly.interfaceDatastore.mod.Query
  
  type QueryFilter = typingsJapgolly.interfaceDatastore.mod.QueryFilter
  
  type QueryOrder = typingsJapgolly.interfaceDatastore.mod.QueryOrder
  
  type Shard = typingsJapgolly.datastoreCore.distSrcTypesMod.Shard
}
