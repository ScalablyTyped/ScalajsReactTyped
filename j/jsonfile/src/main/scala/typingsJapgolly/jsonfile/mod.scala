package typingsJapgolly.jsonfile

import typingsJapgolly.jsonfile.anon.EOL
import typingsJapgolly.jsonfile.anon.Encoding
import typingsJapgolly.jsonfile.anon.FnCall
import typingsJapgolly.jsonfile.anon.FnCallFileDataOptions
import typingsJapgolly.jsonfile.anon.TypeoffsReadFile
import typingsJapgolly.jsonfile.anon.TypeoffsWriteFile
import typingsJapgolly.node.NodeJS.ArrayBufferView
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.anon.EncodingFlag
import typingsJapgolly.node.anon.Flag
import typingsJapgolly.node.anon.ObjectEncodingOptionsflagEncoding
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.bufferMod.global.BufferEncoding
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.PathOrFileDescriptor
import typingsJapgolly.node.fsMod.WriteFileOptions
import typingsJapgolly.node.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonfile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readFile(file: Path): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def readFile(file: Path, callback: ReadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFile(file: Path, options: JFReadOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def readFile(file: Path, options: JFReadOptions, callback: ReadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readFileSync(file: Path): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(file.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def readFileSync(file: Path, options: JFReadOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def writeFile(file: Path, obj: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: Path, obj: Any, callback: WriteCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFile(file: Path, obj: Any, options: JFWriteOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: Path, obj: Any, options: JFWriteOptions, callback: WriteCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeFileSync(file: Path, obj: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFileSync(file: Path, obj: Any, options: JFWriteOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait FS extends StObject {
    
    var readFile: TypeoffsReadFile
    
    def readFileSync(path: PathOrFileDescriptor): String | Buffer
    def readFileSync(path: PathOrFileDescriptor, options: EncodingFlag): String
    def readFileSync(path: PathOrFileDescriptor, options: Flag): Buffer
    def readFileSync(path: PathOrFileDescriptor, options: ObjectEncodingOptionsflagEncoding): String | Buffer
    def readFileSync(path: PathOrFileDescriptor, options: BufferEncoding): String
    @JSName("readFileSync")
    def readFileSync_Buffer(path: PathOrFileDescriptor): Buffer
    @JSName("readFileSync")
    var readFileSync_Original: FnCall
    @JSName("readFileSync")
    def readFileSync_Union(path: PathOrFileDescriptor, options: BufferEncoding): String | Buffer
    
    var writeFile: TypeoffsWriteFile
    
    def writeFileSync(file: PathOrFileDescriptor, data: String): Unit
    def writeFileSync(file: PathOrFileDescriptor, data: String, options: WriteFileOptions): Unit
    def writeFileSync(file: PathOrFileDescriptor, data: ArrayBufferView): Unit
    def writeFileSync(file: PathOrFileDescriptor, data: ArrayBufferView, options: WriteFileOptions): Unit
    @JSName("writeFileSync")
    var writeFileSync_Original: FnCallFileDataOptions
  }
  object FS {
    
    inline def apply(
      readFile: TypeoffsReadFile,
      readFileSync: FnCall,
      writeFile: TypeoffsWriteFile,
      writeFileSync: FnCallFileDataOptions
    ): FS = {
      val __obj = js.Dynamic.literal(readFile = readFile.asInstanceOf[js.Any], readFileSync = readFileSync.asInstanceOf[js.Any], writeFile = writeFile.asInstanceOf[js.Any], writeFileSync = writeFileSync.asInstanceOf[js.Any])
      __obj.asInstanceOf[FS]
    }
    
    extension [Self <: FS](x: Self) {
      
      inline def setReadFile(value: TypeoffsReadFile): Self = StObject.set(x, "readFile", value.asInstanceOf[js.Any])
      
      inline def setReadFileSync(value: FnCall): Self = StObject.set(x, "readFileSync", value.asInstanceOf[js.Any])
      
      inline def setWriteFile(value: TypeoffsWriteFile): Self = StObject.set(x, "writeFile", value.asInstanceOf[js.Any])
      
      inline def setWriteFileSync(value: FnCallFileDataOptions): Self = StObject.set(x, "writeFileSync", value.asInstanceOf[js.Any])
    }
  }
  
  type JFReadOptions = js.UndefOr[Encoding | String | Null]
  
  type JFWriteOptions = EOL | String | Null
  
  type Path = PathLike | Url
  
  type ReadCallback = js.Function2[/* err */ ErrnoException | Null, /* data */ Any, Unit]
  
  type WriteCallback = js.Function1[/* err */ ErrnoException, Unit]
}
