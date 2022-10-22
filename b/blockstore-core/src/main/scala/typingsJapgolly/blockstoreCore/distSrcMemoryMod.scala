package typingsJapgolly.blockstoreCore

import typingsJapgolly.blockstoreCore.anon.Key
import typingsJapgolly.blockstoreCore.distSrcBaseMod.BaseBlockstore
import typingsJapgolly.multiformats.cidMod.CID
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.std.AsyncGenerator
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMemoryMod {
  
  @JSImport("blockstore-core/dist/src/memory", "MemoryBlockstore")
  @js.native
  open class MemoryBlockstore () extends BaseBlockstore {
    
    def _all(): AsyncGenerator[Key, Unit, Unit] = js.native
    
    def _allKeys(): AsyncGenerator[CID[Any, Double, Double, Version], Unit, Unit] = js.native
    
    /** @type {Record<string, Uint8Array>} */
    var data: Record[String, js.typedarray.Uint8Array] = js.native
    
    /**
      * @param {CID} key
      */
    def delete(key: CID[Any, Double, Double, Version]): js.Promise[Unit] = js.native
    
    /**
      * @param {CID} key
      */
    def get(key: CID[Any, Double, Double, Version]): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /**
      * @param {CID} key
      */
    def has(key: CID[Any, Double, Double, Version]): js.Promise[Boolean] = js.native
    
    /**
      * @param {CID} key
      * @param {Uint8Array} val
      */
    def put(key: CID[Any, Double, Double, Version], `val`: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
  }
  
  type Blockstore = typingsJapgolly.interfaceBlockstore.mod.Blockstore
  
  type Options = typingsJapgolly.interfaceStore.mod.Options
  
  type Pair = typingsJapgolly.interfaceBlockstore.mod.Pair
}
