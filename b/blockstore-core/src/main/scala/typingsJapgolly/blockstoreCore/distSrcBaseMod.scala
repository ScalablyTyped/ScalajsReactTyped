package typingsJapgolly.blockstoreCore

import typingsJapgolly.interfaceStore.mod.Store
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBaseMod {
  
  @JSImport("blockstore-core/dist/src/base", "BaseBlockstore")
  @js.native
  open class BaseBlockstore ()
    extends StObject
       with Store[
          typingsJapgolly.multiformats.mod.CID[Any, Double, Double, Version], 
          js.typedarray.Uint8Array
        ] {
    
    /**
      * Extending classes should override `query` or implement this method
      *
      * @param {Query} q
      * @param {Options} [options]
      * @returns {AsyncIterable<Pair>}
      */
    def _all(q: Query): AsyncIterable[Pair] = js.native
    def _all(q: Query, options: typingsJapgolly.interfaceBlockstore.mod.Options): AsyncIterable[Pair] = js.native
    
    /**
      * Extending classes should override `queryKeys` or implement this method
      *
      * @param {KeyQuery} q
      * @param {Options} [options]
      * @returns {AsyncIterable<CID>}
      */
    def _allKeys(q: KeyQuery): AsyncIterable[CID] = js.native
    def _allKeys(q: KeyQuery, options: typingsJapgolly.interfaceBlockstore.mod.Options): AsyncIterable[CID] = js.native
  }
  
  type AwaitIterable[O] = typingsJapgolly.interfaceStore.mod.AwaitIterable[O]
  
  type Batch = typingsJapgolly.interfaceBlockstore.mod.Batch
  
  type Blockstore = typingsJapgolly.interfaceBlockstore.mod.Blockstore
  
  type CID = typingsJapgolly.multiformats.mod.CID[Any, Double, Double, Version]
  
  type KeyQuery = typingsJapgolly.interfaceBlockstore.mod.KeyQuery
  
  type Options = typingsJapgolly.interfaceBlockstore.mod.Options
  
  type Pair = typingsJapgolly.interfaceBlockstore.mod.Pair
  
  type Query = typingsJapgolly.interfaceBlockstore.mod.Query
}
