package typingsJapgolly.datastoreCore

import typingsJapgolly.datastoreCore.distSrcBaseMod.BaseDatastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTieredMod {
  
  @JSImport("datastore-core/dist/src/tiered", "TieredDatastore")
  @js.native
  open class TieredDatastore protected () extends BaseDatastore {
    /**
      * @param {Datastore[]} stores
      */
    def this(stores: js.Array[Datastore]) = this()
    
    var stores: js.Array[typingsJapgolly.interfaceDatastore.mod.Datastore] = js.native
  }
  
  type AwaitIterable[TEntry] = typingsJapgolly.interfaceStore.mod.AwaitIterable[TEntry]
  
  type Batch = typingsJapgolly.interfaceDatastore.mod.Batch
  
  type Datastore = typingsJapgolly.interfaceDatastore.mod.Datastore
  
  type Key = typingsJapgolly.interfaceDatastore.mod.Key
  
  type KeyQuery = typingsJapgolly.interfaceDatastore.mod.KeyQuery
  
  type Options = typingsJapgolly.interfaceDatastore.mod.Options
  
  type Pair = typingsJapgolly.interfaceDatastore.mod.Pair
  
  type Query = typingsJapgolly.interfaceDatastore.mod.Query
}
