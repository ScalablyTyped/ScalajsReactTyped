package typingsJapgolly.papaparse

import org.scalajs.dom.File
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.papaparse.anon.Download
import typingsJapgolly.papaparse.anon.Worker
import typingsJapgolly.papaparse.mod.LocalFile
import typingsJapgolly.papaparse.mod.ParseConfig
import typingsJapgolly.papaparse.mod.ParseLocalConfig
import typingsJapgolly.papaparse.mod.ParseRemoteConfig
import typingsJapgolly.papaparse.mod.ParseResult
import typingsJapgolly.papaparse.mod.ParseWorkerConfig
import typingsJapgolly.papaparse.mod.UnparseConfig
import typingsJapgolly.papaparse.mod.UnparseObject
import typingsJapgolly.papaparse.papaparseStrings.Informationseparatorone
import typingsJapgolly.papaparse.papaparseStrings.Informationseparatortwo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Papa {
    
    @JSGlobal("Papa")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Papa.BAD_DELIMITERS")
    @js.native
    val BAD_DELIMITERS: js.Array[String] = js.native
    
    @JSGlobal("Papa.DefaultDelimiter")
    @js.native
    def DefaultDelimiter: String = js.native
    inline def DefaultDelimiter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultDelimiter")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Papa.LocalChunkSize")
    @js.native
    def LocalChunkSize: Double = js.native
    inline def LocalChunkSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LocalChunkSize")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Papa.NODE_STREAM_INPUT")
    @js.native
    val NODE_STREAM_INPUT: js.Symbol = js.native
    
    @JSGlobal("Papa.Parser")
    @js.native
    open class Parser protected ()
      extends typingsJapgolly.papaparse.mod.Parser {
      def this(config: ParseConfig[Any, Unit]) = this()
    }
    
    @JSGlobal("Papa.RECORD_SEP")
    @js.native
    val RECORD_SEP: Informationseparatortwo = js.native
    
    @JSGlobal("Papa.RemoteChunkSize")
    @js.native
    def RemoteChunkSize: Double = js.native
    inline def RemoteChunkSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RemoteChunkSize")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Papa.UNIT_SEP")
    @js.native
    val UNIT_SEP: Informationseparatorone = js.native
    
    @JSGlobal("Papa.WORKERS_SUPPORTED")
    @js.native
    val WORKERS_SUPPORTED: Boolean = js.native
    
    inline def parse(stream: js.Symbol): Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(stream.asInstanceOf[js.Any]).asInstanceOf[Duplex]
    inline def parse(stream: js.Symbol, config: ParseConfig[Any, Unit]): Duplex = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(stream.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Duplex]
    inline def parse[T](csvString: String): ParseResult[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(csvString.asInstanceOf[js.Any]).asInstanceOf[ParseResult[T]]
    inline def parse[T](csvString: String, config: ParseWorkerConfig[T] & Download & (ParseLocalConfig[T, LocalFile])): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(csvString.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def parse[T](csvString: String, config: (ParseConfig[T, Unit]) & Worker): ParseResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(csvString.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ParseResult[T]]
    inline def parse[T](file: File, config: ParseLocalConfig[T, File]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(file.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def parse[T](file: ReadableStream, config: ParseLocalConfig[T, ReadableStream]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(file.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def parse[T](source: String, config: ParseRemoteConfig[T] & (ParseLocalConfig[T, LocalFile])): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def parse[T](source: LocalFile, config: (ParseConfig[T, Unit]) & Worker & (ParseLocalConfig[T, LocalFile])): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def parse[T](source: LocalFile, config: ParseRemoteConfig[T] & (ParseLocalConfig[T, LocalFile])): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def parse[T](source: LocalFile, config: ParseWorkerConfig[T] & Download & (ParseLocalConfig[T, LocalFile])): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def parse[T](url: String, config: ParseRemoteConfig[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(url.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def parse_T_Unit[T](source: String, config: (ParseConfig[T, Unit]) & Worker & (ParseLocalConfig[T, LocalFile])): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def unparse[T](data: js.Array[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def unparse[T](data: js.Array[T], config: UnparseConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def unparse[T](data: UnparseObject[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def unparse[T](data: UnparseObject[T], config: UnparseConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
