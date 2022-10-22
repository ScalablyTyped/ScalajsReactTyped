package typingsJapgolly.zipJs

import org.scalajs.dom.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object zip {
    
    @JSGlobal("zip")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("zip.BlobReader")
    @js.native
    open class BlobReader protected ()
      extends StObject
         with typingsJapgolly.zipJs.zip.Reader {
      def this(blob: Blob) = this()
    }
    
    @JSGlobal("zip.BlobWriter")
    @js.native
    open class BlobWriter protected ()
      extends StObject
         with typingsJapgolly.zipJs.zip.Writer {
      def this(contentType: String) = this()
    }
    
    @JSGlobal("zip.Data64URIReader")
    @js.native
    open class Data64URIReader protected ()
      extends StObject
         with typingsJapgolly.zipJs.zip.Reader {
      def this(dataURI: String) = this()
    }
    
    @JSGlobal("zip.Data64URIWriter")
    @js.native
    open class Data64URIWriter ()
      extends StObject
         with typingsJapgolly.zipJs.zip.Writer {
      def this(mimeString: String) = this()
    }
    
    @JSGlobal("zip.FileWriter")
    @js.native
    open class FileWriter protected ()
      extends StObject
         with typingsJapgolly.zipJs.zip.Writer {
      def this(fileEntry: FileEntry) = this()
    }
    
    @JSGlobal("zip.HttpReader")
    @js.native
    open class HttpReader protected ()
      extends StObject
         with typingsJapgolly.zipJs.zip.Reader {
      def this(url: String) = this()
    }
    
    @JSGlobal("zip.Reader")
    @js.native
    open class Reader ()
      extends StObject
         with typingsJapgolly.zipJs.zip.Reader
    
    @JSGlobal("zip.TextReader")
    @js.native
    open class TextReader protected ()
      extends StObject
         with typingsJapgolly.zipJs.zip.Reader {
      def this(text: String) = this()
    }
    
    @JSGlobal("zip.TextWriter")
    @js.native
    open class TextWriter protected ()
      extends StObject
         with typingsJapgolly.zipJs.zip.Writer {
      def this(encoding: String) = this()
    }
    
    @JSGlobal("zip.Writer")
    @js.native
    open class Writer ()
      extends StObject
         with typingsJapgolly.zipJs.zip.Writer
    
    @JSGlobal("zip.ZipReader")
    @js.native
    open class ZipReader ()
      extends StObject
         with typingsJapgolly.zipJs.zip.ZipReader
    
    @JSGlobal("zip.ZipWriter")
    @js.native
    open class ZipWriter ()
      extends StObject
         with typingsJapgolly.zipJs.zip.ZipWriter
    
    inline def createReader(
      reader: typingsJapgolly.zipJs.zip.Reader,
      callback: js.Function1[/* zipReader */ typingsJapgolly.zipJs.zip.ZipReader, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createReader")(reader.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createReader(
      reader: typingsJapgolly.zipJs.zip.Reader,
      callback: js.Function1[/* zipReader */ typingsJapgolly.zipJs.zip.ZipReader, Unit],
      onerror: js.Function1[/* error */ Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createReader")(reader.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def createWriter(
      writer: typingsJapgolly.zipJs.zip.Writer,
      callback: js.Function1[/* zipWriter */ typingsJapgolly.zipJs.zip.ZipWriter, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriter")(writer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createWriter(
      writer: typingsJapgolly.zipJs.zip.Writer,
      callback: js.Function1[/* zipWriter */ typingsJapgolly.zipJs.zip.ZipWriter, Unit],
      onerror: js.Function1[/* error */ Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriter")(writer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createWriter(
      writer: typingsJapgolly.zipJs.zip.Writer,
      callback: js.Function1[/* zipWriter */ typingsJapgolly.zipJs.zip.ZipWriter, Unit],
      onerror: js.Function1[/* error */ Any, Unit],
      dontDeflate: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriter")(writer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontDeflate.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createWriter(
      writer: typingsJapgolly.zipJs.zip.Writer,
      callback: js.Function1[/* zipWriter */ typingsJapgolly.zipJs.zip.ZipWriter, Unit],
      onerror: Unit,
      dontDeflate: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriter")(writer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontDeflate.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("zip.useWebWorkers")
    @js.native
    def useWebWorkers: Boolean = js.native
    inline def useWebWorkers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useWebWorkers")(x.asInstanceOf[js.Any])
    
    object workerScripts {
      
      @JSGlobal("zip.workerScripts")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("zip.workerScripts.deflater")
      @js.native
      def deflater: js.UndefOr[js.Array[String]] = js.native
      inline def deflater_=(x: js.UndefOr[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deflater")(x.asInstanceOf[js.Any])
      
      @JSGlobal("zip.workerScripts.inflater")
      @js.native
      def inflater: js.UndefOr[js.Array[String]] = js.native
      inline def inflater_=(x: js.UndefOr[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inflater")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("zip.workerScriptsPath")
    @js.native
    def workerScriptsPath: String = js.native
    inline def workerScriptsPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workerScriptsPath")(x.asInstanceOf[js.Any])
  }
}
