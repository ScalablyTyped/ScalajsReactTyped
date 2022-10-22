package typingsJapgolly.datastoreCore

import typingsJapgolly.interfaceStore.mod.Store
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBaseMod {
  
  @JSImport("datastore-core/dist/src/base", "BaseDatastore")
  @js.native
  open class BaseDatastore ()
    extends StObject
       with Store[typingsJapgolly.interfaceDatastore.distSrcKeyMod.Key, js.typedarray.Uint8Array] {
    
    /**
      * Extending classes should override `query` or implement this method
      *
      * @param {Query} q
      * @param {Options} [options]
      * @returns {AsyncIterable<Pair>}
      */
    def _all(q: Query): AsyncIterable[Pair] = js.native
    def _all(q: Query, options: typingsJapgolly.interfaceStore.mod.Options): AsyncIterable[Pair] = js.native
    
    /**
      * Extending classes should override `queryKeys` or implement this method
      *
      * @param {KeyQuery} q
      * @param {Options} [options]
      * @returns {AsyncIterable<Key>}
      */
    def _allKeys(q: KeyQuery): AsyncIterable[Key] = js.native
    def _allKeys(q: KeyQuery, options: typingsJapgolly.interfaceStore.mod.Options): AsyncIterable[Key] = js.native
    
    /**
      * @param {Key} key
      * @param {Options} [options]
      * @returns {Promise<void>}
      */
    def delete(key: Key): js.Promise[Unit] = js.native
    def delete(key: Key, options: typingsJapgolly.interfaceStore.mod.Options): js.Promise[Unit] = js.native
    
    /**
      * @param {Key} key
      * @param {Options} [options]
      * @returns {Promise<Uint8Array>}
      */
    def get(key: Key): js.Promise[js.typedarray.Uint8Array] = js.native
    def get(key: Key, options: typingsJapgolly.interfaceStore.mod.Options): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /**
      * @param {Key} key
      * @param {Options} [options]
      * @returns {Promise<boolean>}
      */
    def has(key: Key): js.Promise[Boolean] = js.native
    def has(key: Key, options: typingsJapgolly.interfaceStore.mod.Options): js.Promise[Boolean] = js.native
    
    /**
      * @param {Key} key
      * @param {Uint8Array} val
      * @param {Options} [options]
      * @returns {Promise<void>}
      */
    def put(key: Key, `val`: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def put(key: Key, `val`: js.typedarray.Uint8Array, options: typingsJapgolly.interfaceStore.mod.Options): js.Promise[Unit] = js.native
  }
  
  type AwaitIterable[O] = typingsJapgolly.interfaceStore.mod.AwaitIterable[O]
  
  type Batch = typingsJapgolly.interfaceDatastore.mod.Batch
  
  type Datastore = typingsJapgolly.interfaceDatastore.mod.Datastore
  
  type Key = typingsJapgolly.interfaceDatastore.mod.Key
  
  type KeyQuery = typingsJapgolly.interfaceDatastore.mod.KeyQuery
  
  type Options = typingsJapgolly.interfaceStore.mod.Options
  
  type Pair = typingsJapgolly.interfaceDatastore.mod.Pair
  
  type Query = typingsJapgolly.interfaceDatastore.mod.Query
}
