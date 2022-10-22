package typingsJapgolly.ipldCar

import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.std.AsyncGenerator
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibIndexerMod {
  
  @JSImport("@ipld/car/types/lib/indexer", "CarIndexer")
  @js.native
  open class CarIndexer protected ()
    extends StObject
       with typingsJapgolly.ipldCar.typesApiMod.RootsReader
       with AsyncIterable[BlockIndex] {
    /**
      * @param {number} version
      * @param {CID[]} roots
      * @param {AsyncGenerator<BlockIndex>} iterator
      */
    def this(version: Double, roots: js.Array[CID], iterator: AsyncGenerator[BlockIndex, Any, Any]) = this()
    
    var _iterator: AsyncGenerator[typingsJapgolly.ipldCar.typesApiMod.BlockIndex, Any, Any] = js.native
    
    var _roots: js.Array[typingsJapgolly.multiformats.mod.CID[Any, Double, Double, Version]] = js.native
    
    var _version: Double = js.native
    
    /* CompleteClass */
    override def getRoots(): js.Promise[js.Array[typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]]] = js.native
    
    /* CompleteClass */
    var version: Double = js.native
    @JSName("version")
    def version_MCarIndexer: Double = js.native
  }
  /* static members */
  object CarIndexer {
    
    @JSImport("@ipld/car/types/lib/indexer", "CarIndexer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate a {@link CarIndexer} from a `Uint8Array` blob. Only the header
      * is decoded initially, the remainder is processed and emitted via the
      * iterator as it is consumed.
      *
      * @async
      * @static
      * @memberof CarIndexer
      * @param {Uint8Array} bytes
      * @returns {Promise<CarIndexer>}
      */
    inline def fromBytes(bytes: js.typedarray.Uint8Array): js.Promise[CarIndexer] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CarIndexer]]
    
    /**
      * Instantiate a {@link CarIndexer} from a `AsyncIterable<Uint8Array>`,
      * such as a [modern Node.js stream](https://nodejs.org/api/stream.html#stream_streams_compatibility_with_async_generators_and_async_iterators).
      * is decoded initially, the remainder is processed and emitted via the
      * iterator as it is consumed.
      *
      * @async
      * @static
      * @memberof CarIndexer
      * @param {AsyncIterable<Uint8Array>} asyncIterable
      * @returns {Promise<CarIndexer>}
      */
    inline def fromIterable(asyncIterable: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[CarIndexer] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CarIndexer]]
  }
  
  type Block = typingsJapgolly.ipldCar.typesApiMod.Block
  
  type BlockIndex = typingsJapgolly.ipldCar.typesApiMod.BlockIndex
  
  type BytesReader = typingsJapgolly.ipldCar.typesLibCodingMod.BytesReader
  
  type CID = typingsJapgolly.multiformats.mod.CID[Any, Double, Double, Version]
  
  type RootsReader = typingsJapgolly.ipldCar.typesApiMod.RootsReader
}
