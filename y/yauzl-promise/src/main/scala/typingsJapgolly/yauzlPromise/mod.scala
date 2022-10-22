package typingsJapgolly.yauzlPromise

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.eventsMod.EventEmitterOptions
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.yauzl.mod.Options
import typingsJapgolly.yauzl.mod.ZipFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yauzl-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yauzl-promise", "Entry")
  @js.native
  open class Entry ()
    extends typingsJapgolly.yauzl.mod.Entry {
    
    def openReadStream(): js.Promise[Readable] = js.native
    def openReadStream(options: ZipFileOptions): js.Promise[Readable] = js.native
  }
  
  /* note: abstract class */ @JSImport("yauzl-promise", "RandomAccessReader")
  @js.native
  open class RandomAccessReader ()
    extends typingsJapgolly.yauzl.mod.RandomAccessReader {
    def this(options: EventEmitterOptions) = this()
  }
  
  @JSImport("yauzl-promise", "ZipFile")
  @js.native
  open class ZipFile protected () extends EventEmitter {
    def this(
      reader: typingsJapgolly.yauzl.mod.RandomAccessReader,
      centralDirectoryOffset: Double,
      fileSize: Double,
      entryCount: Double,
      comment: String,
      autoClose: Boolean,
      lazyEntries: Boolean,
      decodeStrings: Boolean,
      validateEntrySizes: Boolean
    ) = this()
    
    // This chunk taken directly from @types/yauzl
    var autoClose: Boolean = js.native
    
    // These funcitons are custom to yauzl-promise
    def close(): js.Promise[Unit] = js.native
    
    var comment: String = js.native
    
    var decodeStrings: Boolean = js.native
    
    var emittedError: Boolean = js.native
    
    var entriesRead: Double = js.native
    
    var entryCount: Double = js.native
    
    var fileSize: Double = js.native
    
    var isOpen: Boolean = js.native
    
    var lazyEntries: Boolean = js.native
    
    def openReadStream(entry: Entry): js.Promise[Readable] = js.native
    def openReadStream(entry: Entry, options: ZipFileOptions): js.Promise[Readable] = js.native
    
    def readEntries(): js.Promise[js.Array[Entry]] = js.native
    def readEntries(numEntries: Double): js.Promise[js.Array[Entry]] = js.native
    
    def readEntry(): js.Promise[Entry] = js.native
    
    var readEntryCursor: Boolean = js.native
    
    var validateEntrySizes: Boolean = js.native
    
    def walkEntries(callback: js.Function1[/* entry */ Entry, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
    def walkEntries(callback: js.Function1[/* entry */ Entry, js.Promise[Unit] | Unit], numEntries: Double): js.Promise[Unit] = js.native
  }
  
  inline def dosDateTimeToDate(date: Double, time: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("dosDateTimeToDate")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def fromBuffer(buffer: Buffer): js.Promise[ZipFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ZipFile]]
  inline def fromBuffer(buffer: Buffer, options: Options): js.Promise[ZipFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ZipFile]]
  
  inline def fromFd(fd: Double): js.Promise[ZipFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFd")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ZipFile]]
  inline def fromFd(fd: Double, options: Options): js.Promise[ZipFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFd")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ZipFile]]
  
  inline def fromRandomAccessReader(reader: typingsJapgolly.yauzl.mod.RandomAccessReader, totalSize: Double): js.Promise[ZipFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRandomAccessReader")(reader.asInstanceOf[js.Any], totalSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ZipFile]]
  inline def fromRandomAccessReader(reader: typingsJapgolly.yauzl.mod.RandomAccessReader, totalSize: Double, options: Options): js.Promise[ZipFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRandomAccessReader")(reader.asInstanceOf[js.Any], totalSize.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ZipFile]]
  
  inline def open(path: String): js.Promise[ZipFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ZipFile]]
  inline def open(path: String, options: Options): js.Promise[ZipFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ZipFile]]
  
  inline def validateFileName(fileName: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("validateFileName")(fileName.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
