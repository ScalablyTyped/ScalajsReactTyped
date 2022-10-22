package typingsJapgolly.blockstoreDatastoreAdapter

import typingsJapgolly.interfaceStore.mod.Store
import typingsJapgolly.itPushable.mod.Pushable_
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.multiformats.mod.CID
import typingsJapgolly.std.AsyncGenerator
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseBlockstore * / any */ @JSImport("blockstore-datastore-adapter", "BlockstoreDatastoreAdapter")
  @js.native
  open class BlockstoreDatastoreAdapter protected ()
    extends StObject
       with Store[CID[Any, Double, Double, Version], js.typedarray.Uint8Array] {
    /**
      * @param {Datastore} datastore
      */
    def this(datastore: Datastore) = this()
    
    var child: typingsJapgolly.interfaceDatastore.mod.Datastore = js.native
    
    def deleteMany(cids: js.Iterable[typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]]): Pushable_[Any] = js.native
    def deleteMany(
      cids: js.Iterable[typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]],
      options: typingsJapgolly.interfaceBlockstore.mod.Options
    ): Pushable_[Any] = js.native
    /**
      * @param {AsyncIterable<CID> | Iterable<CID>} cids
      * @param {Options} [options]
      */
    def deleteMany(cids: AsyncIterable[typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]]): Pushable_[Any] = js.native
    def deleteMany(
      cids: AsyncIterable[typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]],
      options: typingsJapgolly.interfaceBlockstore.mod.Options
    ): Pushable_[Any] = js.native
    
    def getMany(cids: js.Iterable[typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]]): AsyncGenerator[js.typedarray.Uint8Array, Unit, Any] = js.native
    def getMany(
      cids: js.Iterable[typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]],
      options: typingsJapgolly.interfaceBlockstore.mod.Options
    ): AsyncGenerator[js.typedarray.Uint8Array, Unit, Any] = js.native
    /**
      * @param {AsyncIterable<CID> | Iterable<CID>} cids
      * @param {Options} [options]
      */
    def getMany(cids: AsyncIterable[typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]]): AsyncGenerator[js.typedarray.Uint8Array, Unit, Any] = js.native
    def getMany(
      cids: AsyncIterable[typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]],
      options: typingsJapgolly.interfaceBlockstore.mod.Options
    ): AsyncGenerator[js.typedarray.Uint8Array, Unit, Any] = js.native
    
    def putMany(blocks: js.Iterable[Pair]): AsyncGenerator[Any, Unit, Unit] = js.native
    def putMany(blocks: js.Iterable[Pair], options: typingsJapgolly.interfaceBlockstore.mod.Options): AsyncGenerator[Any, Unit, Unit] = js.native
    /**
      * @param {AsyncIterable<Pair> | Iterable<Pair>} blocks
      * @param {Options} [options]
      */
    def putMany(blocks: AsyncIterable[Pair]): AsyncGenerator[Any, Unit, Unit] = js.native
    def putMany(blocks: AsyncIterable[Pair], options: typingsJapgolly.interfaceBlockstore.mod.Options): AsyncGenerator[Any, Unit, Unit] = js.native
  }
  
  type Blockstore = typingsJapgolly.interfaceBlockstore.mod.Blockstore
  
  type Datastore = typingsJapgolly.interfaceDatastore.mod.Datastore
  
  type KeyQuery = typingsJapgolly.interfaceBlockstore.mod.KeyQuery
  
  type Options = typingsJapgolly.interfaceBlockstore.mod.Options
  
  type Pair = typingsJapgolly.interfaceBlockstore.mod.Pair
  
  type Query = typingsJapgolly.interfaceBlockstore.mod.Query
}
