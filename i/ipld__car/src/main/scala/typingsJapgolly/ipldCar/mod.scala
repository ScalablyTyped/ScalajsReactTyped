package typingsJapgolly.ipldCar

import typingsJapgolly.ipldCar.anon.ByteLength
import typingsJapgolly.ipldCar.anon.Resize
import typingsJapgolly.ipldCar.anon.Roots
import typingsJapgolly.ipldCar.typesLibIndexedReaderMod.RawLocation
import typingsJapgolly.ipldCar.typesLibIndexerMod.BlockIndex
import typingsJapgolly.ipldCar.typesLibIteratorMod.Block
import typingsJapgolly.ipldCar.typesLibIteratorMod.CID
import typingsJapgolly.ipldCar.typesLibReaderBrowserMod.CarHeader
import typingsJapgolly.ipldCar.typesLibReaderBrowserMod.CarV2Header
import typingsJapgolly.ipldCar.typesLibWriterBrowserMod.CarEncoder
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.node.fsPromisesMod.FileHandle
import typingsJapgolly.std.AsyncGenerator
import typingsJapgolly.std.AsyncIterable
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ipld/car", "CarBlockIterator")
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
    
    @JSImport("@ipld/car", "CarBlockIterator")
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
  
  object CarBufferWriter {
    
    @JSImport("@ipld/car", "CarBufferWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addBlock(
      writer: typingsJapgolly.ipldCar.typesLibBufferWriterMod.CarBufferWriter,
      hasCidBytes: typingsJapgolly.ipldCar.typesLibBufferWriterMod.Block
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBlock")(writer.asInstanceOf[js.Any], hasCidBytes.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addRoot(
      writer: typingsJapgolly.ipldCar.typesLibBufferWriterMod.CarBufferWriter,
      root: typingsJapgolly.ipldCar.typesLibBufferWriterMod.CID
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRoot")(writer.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addRoot(
      writer: typingsJapgolly.ipldCar.typesLibBufferWriterMod.CarBufferWriter,
      root: typingsJapgolly.ipldCar.typesLibBufferWriterMod.CID,
      options: Resize
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRoot")(writer.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def blockLength(hasCidBytes: typingsJapgolly.ipldCar.typesLibBufferWriterMod.Block): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blockLength")(hasCidBytes.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def calculateHeaderLength(rootLengths: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateHeaderLength")(rootLengths.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def close(writer: typingsJapgolly.ipldCar.typesLibBufferWriterMod.CarBufferWriter): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(writer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def close(writer: typingsJapgolly.ipldCar.typesLibBufferWriterMod.CarBufferWriter, options: Resize): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("close")(writer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def createWriter(buffer: js.typedarray.ArrayBuffer): typingsJapgolly.ipldCar.typesLibBufferWriterMod.CarBufferWriter = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriter")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ipldCar.typesLibBufferWriterMod.CarBufferWriter]
    inline def createWriter(buffer: js.typedarray.ArrayBuffer, options: ByteLength): typingsJapgolly.ipldCar.typesLibBufferWriterMod.CarBufferWriter = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriter")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ipldCar.typesLibBufferWriterMod.CarBufferWriter]
    
    inline def estimateHeaderLength(rootCount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("estimateHeaderLength")(rootCount.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def estimateHeaderLength(rootCount: Double, rootByteLength: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("estimateHeaderLength")(rootCount.asInstanceOf[js.Any], rootByteLength.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def headerLength(hasRoots: Roots): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("headerLength")(hasRoots.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def resizeHeader(writer: typingsJapgolly.ipldCar.typesLibBufferWriterMod.CarBufferWriter, byteLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeHeader")(writer.asInstanceOf[js.Any], byteLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("@ipld/car", "CarCIDIterator")
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
    
    @JSImport("@ipld/car", "CarCIDIterator")
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
  
  @JSImport("@ipld/car", "CarIndexedReader")
  @js.native
  open class CarIndexedReader protected ()
    extends typingsJapgolly.ipldCar.typesLibIndexedReaderMod.CarIndexedReader {
    /**
      * @param {number} version
      * @param {string} path
      * @param {CID[]} roots
      * @param {Map<string, RawLocation>} index
      * @param {string[]} order
      */
    def this(
      version: Double,
      path: String,
      roots: js.Array[typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]],
      index: Map[String, RawLocation],
      order: js.Array[String]
    ) = this()
  }
  /* static members */
  object CarIndexedReader {
    
    @JSImport("@ipld/car", "CarIndexedReader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate an {@link CarIndexedReader} from a file with the provided
      * `path`. The CAR file is first indexed with a full path that collects `CID`s
      * and block locations. This index is maintained in memory. Subsequent reads
      * operate on a read-only file descriptor, fetching the block from its in-file
      * location.
      *
      * For large archives, the initial indexing may take some time. The returned
      * `Promise` will resolve only after this is complete.
      *
      * @async
      * @static
      * @memberof CarIndexedReader
      * @param {string} path
      * @returns {Promise<CarIndexedReader>}
      */
    inline def fromFile(path: String): js.Promise[typingsJapgolly.ipldCar.typesLibIndexedReaderMod.CarIndexedReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.ipldCar.typesLibIndexedReaderMod.CarIndexedReader]]
  }
  
  @JSImport("@ipld/car", "CarIndexer")
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
    
    @JSImport("@ipld/car", "CarIndexer")
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
  
  @JSImport("@ipld/car", "CarReader")
  @js.native
  open class CarReader protected ()
    extends typingsJapgolly.ipldCar.typesLibReaderMod.CarReader {
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
    
    @JSImport("@ipld/car", "CarReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def readRaw(fd: Double, blockIndex: typingsJapgolly.ipldCar.typesLibReaderMod.BlockIndex): js.Promise[typingsJapgolly.ipldCar.typesLibReaderMod.Block] = (^.asInstanceOf[js.Dynamic].applyDynamic("readRaw")(fd.asInstanceOf[js.Any], blockIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.ipldCar.typesLibReaderMod.Block]]
    /**
      * Reads a block directly from a file descriptor for an open CAR file. This
      * function is **only available in Node.js** and not a browser environment.
      *
      * This function can be used in connection with {@link CarIndexer} which emits
      * the `BlockIndex` objects that are required by this function.
      *
      * The user is responsible for opening and closing the file used in this call.
      *
      * @async
      * @static
      * @memberof CarReader
      * @param {fs.promises.FileHandle | number} fd A file descriptor from the
      * Node.js `fs` module. Either an integer, from `fs.open()` or a `FileHandle`
      * from `fs.promises.open()`.
      * @param {BlockIndex} blockIndex An index pointing to the location of the
      * Block required. This `BlockIndex` should take the form:
      * `{cid:CID, blockLength:number, blockOffset:number}`.
      * @returns {Promise<Block>} A `{ cid:CID, bytes:Uint8Array }` pair.
      */
    inline def readRaw(fd: FileHandle, blockIndex: typingsJapgolly.ipldCar.typesLibReaderMod.BlockIndex): js.Promise[typingsJapgolly.ipldCar.typesLibReaderMod.Block] = (^.asInstanceOf[js.Dynamic].applyDynamic("readRaw")(fd.asInstanceOf[js.Any], blockIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.ipldCar.typesLibReaderMod.Block]]
  }
  
  @JSImport("@ipld/car", "CarWriter")
  @js.native
  open class CarWriter protected ()
    extends typingsJapgolly.ipldCar.typesLibWriterMod.CarWriter {
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
    
    @JSImport("@ipld/car", "CarWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def updateRootsInFile(fd: Double, roots: js.Array[typingsJapgolly.ipldCar.typesLibWriterMod.CID]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRootsInFile")(fd.asInstanceOf[js.Any], roots.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    /**
      * Update the list of roots in the header of an existing CAR file. The first
      * argument must be a file descriptor for CAR file that is open in read and
      * write mode (not append), e.g. `fs.open` or `fs.promises.open` with `'r+'`
      * mode.
      *
      * This operation is an _overwrite_, the total length of the CAR will not be
      * modified. A rejection will occur if the new header will not be the same
      * length as the existing header, in which case the CAR will not be modified.
      * It is the responsibility of the user to ensure that the roots being
      * replaced encode as the same length as the new roots.
      *
      * This function is **only available in Node.js** and not a browser
      * environment.
      *
      * @async
      * @static
      * @memberof CarWriter
      * @param {fs.promises.FileHandle | number} fd A file descriptor from the
      * Node.js `fs` module. Either an integer, from `fs.open()` or a `FileHandle`
      * from `fs.promises.open()`.
      * @param {CID[]} roots A new list of roots to replace the existing list in
      * the CAR header. The new header must take up the same number of bytes as the
      * existing header, so the roots should collectively be the same byte length
      * as the existing roots.
      * @returns {Promise<void>}
      */
    inline def updateRootsInFile(fd: FileHandle, roots: js.Array[typingsJapgolly.ipldCar.typesLibWriterMod.CID]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRootsInFile")(fd.asInstanceOf[js.Any], roots.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
}
