package typingsJapgolly.ipldCar

import typingsJapgolly.ipldCar.ipldCarBooleans.`false`
import typingsJapgolly.ipldCar.typesApiMod.BlockIterator
import typingsJapgolly.ipldCar.typesApiMod.CIDIterator
import typingsJapgolly.multiformats.cidMod.CID
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibIndexedReaderMod {
  
  @JSImport("@ipld/car/types/lib/indexed-reader", "CarIndexedReader")
  @js.native
  open class CarIndexedReader protected ()
    extends StObject
       with typingsJapgolly.ipldCar.typesApiMod.CarReader {
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
      roots: js.Array[CID[Any, Double, Double, Version]],
      index: Map[String, RawLocation],
      order: js.Array[String]
    ) = this()
    
    var _fd: typingsJapgolly.node.fsPromisesMod.FileHandle | Null = js.native
    
    var _index: Map[String, RawLocation] = js.native
    
    var _order: js.Array[String] = js.native
    
    var _path: String = js.native
    
    var _roots: js.Array[CID[Any, Double, Double, Version]] = js.native
    
    var _version: Double = js.native
    
    /* CompleteClass */
    override def blocks(): BlockIterator = js.native
    
    /* CompleteClass */
    override def cids(): CIDIterator = js.native
    
    /**
      * Close the underlying file descriptor maintained by this `CarIndexedReader`.
      * This must be called for proper resource clean-up to occur.
      *
      * @method
      * @memberof CarIndexedReader
      * @instance
      * @async
      * @returns {Promise<void>}
      */
    def close(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def get(key: CID[Any, Double, Double, Version]): js.Promise[js.UndefOr[typingsJapgolly.ipldCar.typesApiMod.Block]] = js.native
    
    /* CompleteClass */
    override def getRoots(): js.Promise[js.Array[CID[Any, Double, Double, Version]]] = js.native
    
    /* CompleteClass */
    override def has(key: CID[Any, Double, Double, Version]): js.Promise[Boolean] = js.native
    
    /* CompleteClass */
    var version: Double = js.native
    @JSName("version")
    def version_MCarIndexedReader: Double = js.native
  }
  /* static members */
  object CarIndexedReader {
    
    @JSImport("@ipld/car/types/lib/indexed-reader", "CarIndexedReader")
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
    inline def fromFile(path: String): js.Promise[CarIndexedReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CarIndexedReader]]
  }
  
  @JSImport("@ipld/car/types/lib/indexed-reader", "__browser")
  @js.native
  val browser: `false` = js.native
  
  type Block = typingsJapgolly.ipldCar.typesApiMod.Block
  
  type BlockIndex = typingsJapgolly.ipldCar.typesApiMod.BlockIndex
  
  type CarReader = typingsJapgolly.ipldCar.typesLibReaderBrowserMod.CarReader
  
  type CarReaderIface = typingsJapgolly.ipldCar.typesApiMod.CarReader
  
  type FileHandle = typingsJapgolly.node.fsPromisesMod.FileHandle
  
  trait RawLocation extends StObject {
    
    var blockLength: Double
    
    var blockOffset: Double
  }
  object RawLocation {
    
    inline def apply(blockLength: Double, blockOffset: Double): RawLocation = {
      val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockOffset = blockOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawLocation]
    }
    
    extension [Self <: RawLocation](x: Self) {
      
      inline def setBlockLength(value: Double): Self = StObject.set(x, "blockLength", value.asInstanceOf[js.Any])
      
      inline def setBlockOffset(value: Double): Self = StObject.set(x, "blockOffset", value.asInstanceOf[js.Any])
    }
  }
}
