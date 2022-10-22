package typingsJapgolly.socketIoFile

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.socketIo.distTypedEventsMod.DefaultEventsMap
import typingsJapgolly.socketIo.mod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socket.io-file", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with SocketIOFile {
    def this(socket: Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any], options: Options) = this()
    
    /* CompleteClass */
    override def on(event: String, cb: js.Function1[/* fileInfo */ FileInfo, Unit]): Unit = js.native
  }
  
  trait FileInfo extends StObject {
    
    var data: js.Array[Any]
    
    var estimated: Double
    
    var mime: String
    
    var name: String
    
    var originalFileName: String
    
    var path: String
    
    var size: Double
    
    var uploadDir: String
    
    var uploadId: String
    
    var wrote: Double
  }
  object FileInfo {
    
    inline def apply(
      data: js.Array[Any],
      estimated: Double,
      mime: String,
      name: String,
      originalFileName: String,
      path: String,
      size: Double,
      uploadDir: String,
      uploadId: String,
      wrote: Double
    ): FileInfo = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], estimated = estimated.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], originalFileName = originalFileName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uploadDir = uploadDir.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], wrote = wrote.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInfo]
    }
    
    extension [Self <: FileInfo](x: Self) {
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setEstimated(value: Double): Self = StObject.set(x, "estimated", value.asInstanceOf[js.Any])
      
      inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOriginalFileName(value: String): Self = StObject.set(x, "originalFileName", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUploadDir(value: String): Self = StObject.set(x, "uploadDir", value.asInstanceOf[js.Any])
      
      inline def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
      
      inline def setWrote(value: Double): Self = StObject.set(x, "wrote", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var accepts: js.UndefOr[js.Array[String]] = js.undefined
    
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    var maxFileSize: js.UndefOr[Double] = js.undefined
    
    var overwrite: js.UndefOr[Boolean] = js.undefined
    
    var rename: js.UndefOr[js.Function2[/* fileName */ String, /* fileInfo */ FileInfo, String]] = js.undefined
    
    var resume: js.UndefOr[Boolean] = js.undefined
    
    var transmissionDelay: js.UndefOr[Double] = js.undefined
    
    var uploadDir: String | StringDictionary[String]
  }
  object Options {
    
    inline def apply(uploadDir: String | StringDictionary[String]): Options = {
      val __obj = js.Dynamic.literal(uploadDir = uploadDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAccepts(value: js.Array[String]): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
      
      inline def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
      
      inline def setAcceptsVarargs(value: String*): Self = StObject.set(x, "accepts", js.Array(value*))
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setRename(value: (/* fileName */ String, /* fileInfo */ FileInfo) => String): Self = StObject.set(x, "rename", js.Any.fromFunction2(value))
      
      inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      inline def setResume(value: Boolean): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
      
      inline def setResumeUndefined: Self = StObject.set(x, "resume", js.undefined)
      
      inline def setTransmissionDelay(value: Double): Self = StObject.set(x, "transmissionDelay", value.asInstanceOf[js.Any])
      
      inline def setTransmissionDelayUndefined: Self = StObject.set(x, "transmissionDelay", js.undefined)
      
      inline def setUploadDir(value: String | StringDictionary[String]): Self = StObject.set(x, "uploadDir", value.asInstanceOf[js.Any])
    }
  }
  
  trait SocketIOFile extends StObject {
    
    def on(event: String, cb: js.Function1[/* fileInfo */ FileInfo, Unit]): Unit
  }
  object SocketIOFile {
    
    inline def apply(on: (String, js.Function1[/* fileInfo */ FileInfo, Unit]) => Callback): SocketIOFile = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction2((t0: String, t1: js.Function1[/* fileInfo */ FileInfo, Unit]) => (on(t0, t1)).runNow()))
      __obj.asInstanceOf[SocketIOFile]
    }
    
    extension [Self <: SocketIOFile](x: Self) {
      
      inline def setOn(value: (String, js.Function1[/* fileInfo */ FileInfo, Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: String, t1: js.Function1[/* fileInfo */ FileInfo, Unit]) => (value(t0, t1)).runNow()))
    }
  }
}
