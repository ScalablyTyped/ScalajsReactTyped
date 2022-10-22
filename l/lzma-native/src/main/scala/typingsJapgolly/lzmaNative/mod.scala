package typingsJapgolly.lzmaNative

import japgolly.scalajs.react.Callback
import typingsJapgolly.lzmaNative.anon.Compress
import typingsJapgolly.lzmaNative.lzmaNativeStrings.CONCATENATED
import typingsJapgolly.lzmaNative.lzmaNativeStrings.TELL_ANY_CHECK
import typingsJapgolly.lzmaNative.lzmaNativeStrings.TELL_NO_CHECK
import typingsJapgolly.lzmaNative.lzmaNativeStrings.TELL_UNSUPPORTED_CHECK
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lzma-native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Compressor(): JSLzmaStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Compressor")().asInstanceOf[JSLzmaStream]
  inline def Compressor(preset: Unit, options: LzmaOptions): JSLzmaStream = (^.asInstanceOf[js.Dynamic].applyDynamic("Compressor")(preset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JSLzmaStream]
  inline def Compressor(preset: Preset): JSLzmaStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Compressor")(preset.asInstanceOf[js.Any]).asInstanceOf[JSLzmaStream]
  inline def Compressor(preset: Preset, options: LzmaOptions): JSLzmaStream = (^.asInstanceOf[js.Dynamic].applyDynamic("Compressor")(preset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JSLzmaStream]
  
  inline def Decompressor(): JSLzmaStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Decompressor")().asInstanceOf[JSLzmaStream]
  inline def Decompressor(options: LzmaOptions): JSLzmaStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Decompressor")(options.asInstanceOf[js.Any]).asInstanceOf[JSLzmaStream]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stream.Transform * / any */ @JSImport("lzma-native", "JSLzmaStream")
  @js.native
  open class JSLzmaStream protected () extends StObject {
    def this(nativeStream: Stream, options: LzmaOptions) = this()
    
    def bufsize(): Double = js.native
    def bufsize(size: Double): Unit = js.native
    
    def cleanUp(): Unit = js.native
    
    def totalInt(): Double = js.native
    
    def totalOut(): Double = js.native
  }
  
  inline def LZMA(): Compress = ^.asInstanceOf[js.Dynamic].applyDynamic("LZMA")().asInstanceOf[Compress]
  
  inline def checkSize(check: Check): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSize")(check.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def compress(buf: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def compress(buf: String, options: Unit, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compress(buf: String, options: LzmaOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compress(buf: String, options: LzmaOptions, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compress(buf: String, options: Preset): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compress(buf: String, options: Preset, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compress(buf: Buffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def compress(buf: Buffer, options: Unit, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compress(buf: Buffer, options: LzmaOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compress(buf: Buffer, options: LzmaOptions, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compress(buf: Buffer, options: Preset): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compress(buf: Buffer, options: Preset, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def crc32(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def crc32(input: String, encoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def crc32(input: String, encoding: String, previous: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], previous.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def crc32(input: String, encoding: Unit, previous: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], previous.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createCompressor(): JSLzmaStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createCompressor")().asInstanceOf[JSLzmaStream]
  inline def createCompressor(options: LzmaOptions): JSLzmaStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createCompressor")(options.asInstanceOf[js.Any]).asInstanceOf[JSLzmaStream]
  
  inline def createDecompressor(): JSLzmaStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecompressor")().asInstanceOf[JSLzmaStream]
  inline def createDecompressor(options: LzmaOptions): JSLzmaStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecompressor")(options.asInstanceOf[js.Any]).asInstanceOf[JSLzmaStream]
  
  inline def createStream(coder: Coders): JSLzmaStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(coder.asInstanceOf[js.Any]).asInstanceOf[JSLzmaStream]
  inline def createStream(coder: Coders, options: LzmaOptions): JSLzmaStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(coder.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JSLzmaStream]
  
  inline def decompress(buf: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def decompress(buf: String, options: Unit, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decompress(buf: String, options: LzmaOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decompress(buf: String, options: LzmaOptions, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decompress(buf: String, options: Preset): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decompress(buf: String, options: Preset, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decompress(buf: Buffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def decompress(buf: Buffer, options: Unit, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decompress(buf: Buffer, options: LzmaOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decompress(buf: Buffer, options: LzmaOptions, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decompress(buf: Buffer, options: Preset): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decompress(buf: Buffer, options: Preset, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def easyDecoderMemusage(preset: Preset): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easyDecoderMemusage")(preset.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def easyEncoderMemusage(preset: Preset): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easyEncoderMemusage")(preset.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isXZ(buf: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isXZ")(buf.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isXZ(buf: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isXZ")(buf.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseFileIndex(options: FileOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFileIndex")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def parseFileIndex(
    options: FileOptions,
    callback: js.Function2[/* err */ Any, /* info */ js.UndefOr[StreamInfo], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFileIndex")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseFileIndexFD(fileDescriptor: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFileIndexFD")(fileDescriptor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def parseFileIndexFD(
    fileDescriptor: Double,
    callback: js.Function2[/* err */ Any, /* info */ js.UndefOr[StreamInfo], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFileIndexFD")(fileDescriptor.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rawDecoderMemusage(preset: Preset): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rawDecoderMemusage")(preset.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def rawEncoderMemusage(preset: Preset): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rawEncoderMemusage")(preset.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def versionNumber(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("versionNumber")().asInstanceOf[Double]
  
  inline def versionString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("versionString")().asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.lzmaNative.lzmaNativeStrings.CHECK_CRC32
    - typingsJapgolly.lzmaNative.lzmaNativeStrings.CHECK_CRC64
    - typingsJapgolly.lzmaNative.lzmaNativeStrings.CHECK_NONE
    - typingsJapgolly.lzmaNative.lzmaNativeStrings.CHECK_SHA256
  */
  trait Check extends StObject
  object Check {
    
    inline def CHECK_CRC32: typingsJapgolly.lzmaNative.lzmaNativeStrings.CHECK_CRC32 = "CHECK_CRC32".asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeStrings.CHECK_CRC32]
    
    inline def CHECK_CRC64: typingsJapgolly.lzmaNative.lzmaNativeStrings.CHECK_CRC64 = "CHECK_CRC64".asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeStrings.CHECK_CRC64]
    
    inline def CHECK_NONE: typingsJapgolly.lzmaNative.lzmaNativeStrings.CHECK_NONE = "CHECK_NONE".asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeStrings.CHECK_NONE]
    
    inline def CHECK_SHA256: typingsJapgolly.lzmaNative.lzmaNativeStrings.CHECK_SHA256 = "CHECK_SHA256".asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeStrings.CHECK_SHA256]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.lzmaNative.lzmaNativeStrings.easyEncoder
    - typingsJapgolly.lzmaNative.lzmaNativeStrings.aloneDecoder
    - typingsJapgolly.lzmaNative.lzmaNativeStrings.rawEncoder
    - typingsJapgolly.lzmaNative.lzmaNativeStrings.autoDecoder
    - typingsJapgolly.lzmaNative.lzmaNativeStrings.aloneEncoder
    - typingsJapgolly.lzmaNative.lzmaNativeStrings.streamEncoder
    - typingsJapgolly.lzmaNative.lzmaNativeStrings.streamDecoder
  */
  trait Coders extends StObject
  object Coders {
    
    inline def aloneDecoder: typingsJapgolly.lzmaNative.lzmaNativeStrings.aloneDecoder = "aloneDecoder".asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeStrings.aloneDecoder]
    
    inline def aloneEncoder: typingsJapgolly.lzmaNative.lzmaNativeStrings.aloneEncoder = "aloneEncoder".asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeStrings.aloneEncoder]
    
    inline def autoDecoder: typingsJapgolly.lzmaNative.lzmaNativeStrings.autoDecoder = "autoDecoder".asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeStrings.autoDecoder]
    
    inline def easyEncoder: typingsJapgolly.lzmaNative.lzmaNativeStrings.easyEncoder = "easyEncoder".asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeStrings.easyEncoder]
    
    inline def rawEncoder: typingsJapgolly.lzmaNative.lzmaNativeStrings.rawEncoder = "rawEncoder".asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeStrings.rawEncoder]
    
    inline def streamDecoder: typingsJapgolly.lzmaNative.lzmaNativeStrings.streamDecoder = "streamDecoder".asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeStrings.streamDecoder]
    
    inline def streamEncoder: typingsJapgolly.lzmaNative.lzmaNativeStrings.streamEncoder = "streamEncoder".asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeStrings.streamEncoder]
  }
  
  trait FileOptions extends StObject {
    
    var fileSize: Double
    
    var memlimit: js.UndefOr[Double] = js.undefined
    
    def read(count: Double, offset: Double, cb: js.Function2[/* err */ Any, /* buffer */ Buffer, Unit]): Unit
  }
  object FileOptions {
    
    inline def apply(
      fileSize: Double,
      read: (Double, Double, js.Function2[/* err */ Any, /* buffer */ Buffer, Unit]) => Callback
    ): FileOptions = {
      val __obj = js.Dynamic.literal(fileSize = fileSize.asInstanceOf[js.Any], read = js.Any.fromFunction3((t0: Double, t1: Double, t2: js.Function2[/* err */ Any, /* buffer */ Buffer, Unit]) => (read(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[FileOptions]
    }
    
    extension [Self <: FileOptions](x: Self) {
      
      inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      inline def setMemlimit(value: Double): Self = StObject.set(x, "memlimit", value.asInstanceOf[js.Any])
      
      inline def setMemlimitUndefined: Self = StObject.set(x, "memlimit", js.undefined)
      
      inline def setRead(value: (Double, Double, js.Function2[/* err */ Any, /* buffer */ Buffer, Unit]) => Callback): Self = StObject.set(x, "read", js.Any.fromFunction3((t0: Double, t1: Double, t2: js.Function2[/* err */ Any, /* buffer */ Buffer, Unit]) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait LzmaOptions extends StObject {
    
    var blockSize: js.UndefOr[Double] = js.undefined
    
    var bufsize: js.UndefOr[Double] = js.undefined
    
    var check: js.UndefOr[Check] = js.undefined
    
    var flags: js.UndefOr[TELL_NO_CHECK | TELL_UNSUPPORTED_CHECK | TELL_ANY_CHECK | CONCATENATED] = js.undefined
    
    var memlimit: js.UndefOr[Double] = js.undefined
    
    var preset: js.UndefOr[Preset] = js.undefined
    
    var synchronous: js.UndefOr[Boolean] = js.undefined
    
    var threads: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object LzmaOptions {
    
    inline def apply(): LzmaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LzmaOptions]
    }
    
    extension [Self <: LzmaOptions](x: Self) {
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      inline def setBufsize(value: Double): Self = StObject.set(x, "bufsize", value.asInstanceOf[js.Any])
      
      inline def setBufsizeUndefined: Self = StObject.set(x, "bufsize", js.undefined)
      
      inline def setCheck(value: Check): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setFlags(value: TELL_NO_CHECK | TELL_UNSUPPORTED_CHECK | TELL_ANY_CHECK | CONCATENATED): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setMemlimit(value: Double): Self = StObject.set(x, "memlimit", value.asInstanceOf[js.Any])
      
      inline def setMemlimitUndefined: Self = StObject.set(x, "memlimit", js.undefined)
      
      inline def setPreset(value: Preset): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      inline def setSynchronous(value: Boolean): Self = StObject.set(x, "synchronous", value.asInstanceOf[js.Any])
      
      inline def setSynchronousUndefined: Self = StObject.set(x, "synchronous", js.undefined)
      
      inline def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
      
      inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.lzmaNative.lzmaNativeInts.`0`
    - typingsJapgolly.lzmaNative.lzmaNativeInts.`1`
    - typingsJapgolly.lzmaNative.lzmaNativeInts.`2`
    - typingsJapgolly.lzmaNative.lzmaNativeInts.`3`
    - typingsJapgolly.lzmaNative.lzmaNativeInts.`4`
    - typingsJapgolly.lzmaNative.lzmaNativeInts.`5`
    - typingsJapgolly.lzmaNative.lzmaNativeInts.`6`
    - typingsJapgolly.lzmaNative.lzmaNativeInts.`7`
    - typingsJapgolly.lzmaNative.lzmaNativeInts.`8`
    - typingsJapgolly.lzmaNative.lzmaNativeInts.`9`
  */
  trait Preset extends StObject
  object Preset {
    
    inline def `0`: typingsJapgolly.lzmaNative.lzmaNativeInts.`0` = 0.asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeInts.`0`]
    
    inline def `1`: typingsJapgolly.lzmaNative.lzmaNativeInts.`1` = 1.asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeInts.`1`]
    
    inline def `2`: typingsJapgolly.lzmaNative.lzmaNativeInts.`2` = 2.asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeInts.`2`]
    
    inline def `3`: typingsJapgolly.lzmaNative.lzmaNativeInts.`3` = 3.asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeInts.`3`]
    
    inline def `4`: typingsJapgolly.lzmaNative.lzmaNativeInts.`4` = 4.asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeInts.`4`]
    
    inline def `5`: typingsJapgolly.lzmaNative.lzmaNativeInts.`5` = 5.asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeInts.`5`]
    
    inline def `6`: typingsJapgolly.lzmaNative.lzmaNativeInts.`6` = 6.asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeInts.`6`]
    
    inline def `7`: typingsJapgolly.lzmaNative.lzmaNativeInts.`7` = 7.asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeInts.`7`]
    
    inline def `8`: typingsJapgolly.lzmaNative.lzmaNativeInts.`8` = 8.asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeInts.`8`]
    
    inline def `9`: typingsJapgolly.lzmaNative.lzmaNativeInts.`9` = 9.asInstanceOf[typingsJapgolly.lzmaNative.lzmaNativeInts.`9`]
  }
  
  trait StreamInfo extends StObject {
    
    var blocks: Double
    
    var checks: Double
    
    var fileSize: Double
    
    var memlimit: Double
    
    var streamPadding: Double
    
    var streams: Double
    
    var uncompressedSize: Double
  }
  object StreamInfo {
    
    inline def apply(
      blocks: Double,
      checks: Double,
      fileSize: Double,
      memlimit: Double,
      streamPadding: Double,
      streams: Double,
      uncompressedSize: Double
    ): StreamInfo = {
      val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], memlimit = memlimit.asInstanceOf[js.Any], streamPadding = streamPadding.asInstanceOf[js.Any], streams = streams.asInstanceOf[js.Any], uncompressedSize = uncompressedSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamInfo]
    }
    
    extension [Self <: StreamInfo](x: Self) {
      
      inline def setBlocks(value: Double): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setChecks(value: Double): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
      
      inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      inline def setMemlimit(value: Double): Self = StObject.set(x, "memlimit", value.asInstanceOf[js.Any])
      
      inline def setStreamPadding(value: Double): Self = StObject.set(x, "streamPadding", value.asInstanceOf[js.Any])
      
      inline def setStreams(value: Double): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      inline def setUncompressedSize(value: Double): Self = StObject.set(x, "uncompressedSize", value.asInstanceOf[js.Any])
    }
  }
}
