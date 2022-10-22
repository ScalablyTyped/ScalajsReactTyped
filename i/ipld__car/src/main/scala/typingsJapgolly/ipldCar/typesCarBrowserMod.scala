package typingsJapgolly.ipldCar

import typingsJapgolly.ipldCar.typesLibIndexerMod.BlockIndex
import typingsJapgolly.ipldCar.typesLibIteratorMod.Block
import typingsJapgolly.ipldCar.typesLibIteratorMod.CID
import typingsJapgolly.ipldCar.typesLibReaderBrowserMod.CarHeader
import typingsJapgolly.ipldCar.typesLibReaderBrowserMod.CarV2Header
import typingsJapgolly.ipldCar.typesLibWriterBrowserMod.CarEncoder
import typingsJapgolly.ipldCar.typesLibWriterBrowserMod.WriterChannel
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.std.AsyncGenerator
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCarBrowserMod {
  
  @JSImport("@ipld/car/types/car-browser", "CarBlockIterator")
  @js.native
  open class CarBlockIterator protected ()
    extends typingsJapgolly.ipldCar.typesLibIteratorMod.CarBlockIterator {
    def this(version: Double, roots: js.Array[CID], iterable: Unit) = this()
    /**
      * @param {number} version
      * @param {CID[]} roots
      * @param {AsyncIterable<Block>|void} iterable
      */
    def this(version: Double, roots: js.Array[CID], iterable: AsyncIterable[Block]) = this()
  }
  /* static members */
  object CarBlockIterator {
    
    @JSImport("@ipld/car/types/car-browser", "CarBlockIterator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate a {@link CarBlockIterator} from a `Uint8Array` blob. Rather
      * than decoding the entire byte array prior to returning the iterator, as in
      * {@link CarReader.fromBytes}, only the header is decoded and the remainder
      * of the CAR is parsed as the `Block`s as yielded.
      *
      * @async
      * @static
      * @memberof CarBlockIterator
      * @param {Uint8Array} bytes
      * @returns {Promise<CarBlockIterator>}
      */
    inline def fromBytes(bytes: js.typedarray.Uint8Array): js.Promise[typingsJapgolly.ipldCar.typesLibIteratorMod.CarBlockIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.ipldCar.typesLibIteratorMod.CarBlockIterator]]
    
    /**
      * Instantiate a {@link CarBlockIterator} from a `AsyncIterable<Uint8Array>`,
      * such as a [modern Node.js stream](https://nodejs.org/api/stream.html#stream_streams_compatibility_with_async_generators_and_async_iterators).
      * Rather than decoding the entire byte array prior to returning the iterator,
      * as in {@link CarReader.fromIterable}, only the header is decoded and the
      * remainder of the CAR is parsed as the `Block`s as yielded.
      *
      * @async
      * @static
      * @param {AsyncIterable<Uint8Array>} asyncIterable
      * @returns {Promise<CarBlockIterator>}
      */
    inline def fromIterable(asyncIterable: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[typingsJapgolly.ipldCar.typesLibIteratorMod.CarBlockIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.ipldCar.typesLibIteratorMod.CarBlockIterator]]
  }
  
  @JSImport("@ipld/car/types/car-browser", "CarCIDIterator")
  @js.native
  open class CarCIDIterator protected ()
    extends typingsJapgolly.ipldCar.typesLibIteratorMod.CarCIDIterator {
    def this(version: Double, roots: js.Array[CID], iterable: Unit) = this()
    /**
      * @param {number} version
      * @param {CID[]} roots
      * @param {AsyncIterable<Block>|void} iterable
      */
    def this(version: Double, roots: js.Array[CID], iterable: AsyncIterable[Block]) = this()
  }
  /* static members */
  object CarCIDIterator {
    
    @JSImport("@ipld/car/types/car-browser", "CarCIDIterator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate a {@link CarCIDIterator} from a `Uint8Array` blob. Rather
      * than decoding the entire byte array prior to returning the iterator, as in
      * {@link CarReader.fromBytes}, only the header is decoded and the remainder
      * of the CAR is parsed as the `CID`s as yielded.
      *
      * @async
      * @static
      * @memberof CarCIDIterator
      * @param {Uint8Array} bytes
      * @returns {Promise<CarCIDIterator>}
      */
    inline def fromBytes(bytes: js.typedarray.Uint8Array): js.Promise[typingsJapgolly.ipldCar.typesLibIteratorMod.CarCIDIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.ipldCar.typesLibIteratorMod.CarCIDIterator]]
    
    /**
      * Instantiate a {@link CarCIDIterator} from a `AsyncIterable<Uint8Array>`,
      * such as a [modern Node.js stream](https://nodejs.org/api/stream.html#stream_streams_compatibility_with_async_generators_and_async_iterators).
      * Rather than decoding the entire byte array prior to returning the iterator,
      * as in {@link CarReader.fromIterable}, only the header is decoded and the
      * remainder of the CAR is parsed as the `CID`s as yielded.
      *
      * @async
      * @static
      * @memberof CarCIDIterator
      * @param {AsyncIterable<Uint8Array>} asyncIterable
      * @returns {Promise<CarCIDIterator>}
      */
    inline def fromIterable(asyncIterable: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[typingsJapgolly.ipldCar.typesLibIteratorMod.CarCIDIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.ipldCar.typesLibIteratorMod.CarCIDIterator]]
  }
  
  @JSImport("@ipld/car/types/car-browser", "CarIndexedReader")
  @js.native
  open class CarIndexedReader ()
    extends typingsJapgolly.ipldCar.typesLibIndexedReaderBrowserMod.CarIndexedReader
  /* static members */
  object CarIndexedReader {
    
    @JSImport("@ipld/car/types/car-browser", "CarIndexedReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromFile(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")().asInstanceOf[js.Promise[Unit]]
  }
  
  @JSImport("@ipld/car/types/car-browser", "CarIndexer")
  @js.native
  open class CarIndexer protected ()
    extends typingsJapgolly.ipldCar.typesLibIndexerMod.CarIndexer {
    /**
      * @param {number} version
      * @param {CID[]} roots
      * @param {AsyncGenerator<BlockIndex>} iterator
      */
    def this(
      version: Double,
      roots: js.Array[typingsJapgolly.ipldCar.typesLibIndexerMod.CID],
      iterator: AsyncGenerator[BlockIndex, Any, Any]
    ) = this()
  }
  /* static members */
  object CarIndexer {
    
    @JSImport("@ipld/car/types/car-browser", "CarIndexer")
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
    inline def fromBytes(bytes: js.typedarray.Uint8Array): js.Promise[typingsJapgolly.ipldCar.typesLibIndexerMod.CarIndexer] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.ipldCar.typesLibIndexerMod.CarIndexer]]
    
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
    inline def fromIterable(asyncIterable: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[typingsJapgolly.ipldCar.typesLibIndexerMod.CarIndexer] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.ipldCar.typesLibIndexerMod.CarIndexer]]
  }
  
  @JSImport("@ipld/car/types/car-browser", "CarReader")
  @js.native
  open class CarReader protected ()
    extends typingsJapgolly.ipldCar.typesLibReaderBrowserMod.CarReader {
    /**
      * @constructs CarReader
      * @param {CarHeader|CarV2Header} header
      * @param {Block[]} blocks
      */
    def this(header: CarHeader, blocks: js.Array[typingsJapgolly.ipldCar.typesLibReaderBrowserMod.Block]) = this()
    def this(header: CarV2Header, blocks: js.Array[typingsJapgolly.ipldCar.typesLibReaderBrowserMod.Block]) = this()
  }
  /* static members */
  object CarReader {
    
    @JSImport("@ipld/car/types/car-browser", "CarReader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate a {@link CarReader} from a `Uint8Array` blob. This performs a
      * decode fully in memory and maintains the decoded state in memory for full
      * access to the data via the `CarReader` API.
      *
      * @async
      * @static
      * @memberof CarReader
      * @param {Uint8Array} bytes
      * @returns {Promise<CarReader>} blip blop
      */
    inline def fromBytes(bytes: js.typedarray.Uint8Array): js.Promise[typingsJapgolly.ipldCar.typesLibReaderBrowserMod.CarReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.ipldCar.typesLibReaderBrowserMod.CarReader]]
    
    /**
      * Instantiate a {@link CarReader} from a `AsyncIterable<Uint8Array>`, such as
      * a [modern Node.js stream](https://nodejs.org/api/stream.html#stream_streams_compatibility_with_async_generators_and_async_iterators).
      * This performs a decode fully in memory and maintains the decoded state in
      * memory for full access to the data via the `CarReader` API.
      *
      * Care should be taken for large archives; this API may not be appropriate
      * where memory is a concern or the archive is potentially larger than the
      * amount of memory that the runtime can handle.
      *
      * @async
      * @static
      * @memberof CarReader
      * @param {AsyncIterable<Uint8Array>} asyncIterable
      * @returns {Promise<CarReader>}
      */
    inline def fromIterable(asyncIterable: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[typingsJapgolly.ipldCar.typesLibReaderBrowserMod.CarReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.ipldCar.typesLibReaderBrowserMod.CarReader]]
  }
  
  @JSImport("@ipld/car/types/car-browser", "CarWriter")
  @js.native
  open class CarWriter protected ()
    extends typingsJapgolly.ipldCar.typesLibWriterBrowserMod.CarWriter {
    /**
      * @param {CID[]} roots
      * @param {CarEncoder} encoder
      */
    def this(
      roots: js.Array[typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]],
      encoder: CarEncoder
    ) = this()
  }
  /* static members */
  object CarWriter {
    
    @JSImport("@ipld/car/types/car-browser", "CarWriter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new CAR writer "channel" which consists of a
      * `{ writer:CarWriter, out:AsyncIterable<Uint8Array> }` pair.
      *
      * @async
      * @static
      * @memberof CarWriter
      * @param {CID[] | CID | void} roots
      * @returns {WriterChannel} The channel takes the form of
      * `{ writer:CarWriter, out:AsyncIterable<Uint8Array> }`.
      */
    inline def create(roots: js.Array[typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]]): WriterChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(roots.asInstanceOf[js.Any]).asInstanceOf[WriterChannel]
    inline def create(roots: Unit): WriterChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(roots.asInstanceOf[js.Any]).asInstanceOf[WriterChannel]
    inline def create(roots: typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]): WriterChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(roots.asInstanceOf[js.Any]).asInstanceOf[WriterChannel]
    
    /**
      * Create a new CAR appender "channel" which consists of a
      * `{ writer:CarWriter, out:AsyncIterable<Uint8Array> }` pair.
      * This appender does not consider roots and does not produce a CAR header.
      * It is designed to append blocks to an _existing_ CAR archive. It is
      * expected that `out` will be concatenated onto the end of an existing
      * archive that already has a properly formatted header.
      *
      * @async
      * @static
      * @memberof CarWriter
      * @returns {WriterChannel} The channel takes the form of
      * `{ writer:CarWriter, out:AsyncIterable<Uint8Array> }`.
      */
    inline def createAppender(): WriterChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("createAppender")().asInstanceOf[WriterChannel]
    
    /**
      * Update the list of roots in the header of an existing CAR as represented
      * in a Uint8Array.
      *
      * This operation is an _overwrite_, the total length of the CAR will not be
      * modified. A rejection will occur if the new header will not be the same
      * length as the existing header, in which case the CAR will not be modified.
      * It is the responsibility of the user to ensure that the roots being
      * replaced encode as the same length as the new roots.
      *
      * The byte array passed in an argument will be modified and also returned
      * upon successful modification.
      *
      * @async
      * @static
      * @memberof CarWriter
      * @param {Uint8Array} bytes
      * @param {CID[]} roots A new list of roots to replace the existing list in
      * the CAR header. The new header must take up the same number of bytes as the
      * existing header, so the roots should collectively be the same byte length
      * as the existing roots.
      * @returns {Promise<Uint8Array>}
      */
    inline def updateRootsInBytes(
      bytes: js.typedarray.Uint8Array,
      roots: js.Array[typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]]
    ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRootsInBytes")(bytes.asInstanceOf[js.Any], roots.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  }
}
