package typingsJapgolly.datastoreCore

import typingsJapgolly.datastoreCore.anon.Key
import typingsJapgolly.datastoreCore.distSrcBaseMod.BaseDatastore
import typingsJapgolly.std.AsyncGenerator
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMemoryMod {
  
  @JSImport("datastore-core/dist/src/memory", "MemoryDatastore")
  @js.native
  open class MemoryDatastore () extends BaseDatastore {
    
    def _all(): AsyncGenerator[Key, Unit, Unit] = js.native
    
    def _allKeys(): AsyncGenerator[typingsJapgolly.interfaceDatastore.keyMod.Key, Unit, Unit] = js.native
    
    /** @type {Record<string, Uint8Array>} */
    var data: Record[String, js.typedarray.Uint8Array] = js.native
    
    /**
      * @param {Key} key
      */
    def delete(key: typingsJapgolly.interfaceDatastore.keyMod.Key): js.Promise[Unit] = js.native
    
    /**
      * @param {Key} key
      */
    def get(key: typingsJapgolly.interfaceDatastore.keyMod.Key): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /**
      * @param {Key} key
      */
    def has(key: typingsJapgolly.interfaceDatastore.keyMod.Key): js.Promise[Boolean] = js.native
    
    /**
      * @param {Key} key
      * @param {Uint8Array} val
      */
    def put(key: typingsJapgolly.interfaceDatastore.keyMod.Key, `val`: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
  }
  
  type Datastore = typingsJapgolly.interfaceDatastore.mod.Datastore
  
  type Options = typingsJapgolly.interfaceStore.mod.Options
  
  type Pair = typingsJapgolly.interfaceDatastore.mod.Pair
}
