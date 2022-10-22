package typingsJapgolly.formidable

import typingsJapgolly.formidable.anon.PartialOptions
import typingsJapgolly.formidable.anon.RecordPARSERUNINITIALIZED
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.bufferMod.global.BufferEncoding
import typingsJapgolly.node.streamMod.PassThrough
import typingsJapgolly.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parsersMod {
  
  @JSImport("formidable/parsers", "DummyParser")
  @js.native
  open class DummyParser protected () extends Transform {
    def this(incomingForm: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IncomingForm */ Any) = this()
    def this(
      incomingForm: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IncomingForm */ Any,
      options: PartialOptions
    ) = this()
    
    def _flush(callback: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("formidable/parsers", "JSONParser")
  @js.native
  open class JSONParser () extends Transform {
    def this(options: PartialOptions) = this()
    
    def _flush(callback: js.Function0[Unit]): Unit = js.native
    
    def _transform(chunk: Any, encoding: BufferEncoding, callback: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("formidable/parsers", "MultipartParser")
  @js.native
  open class MultipartParser () extends Transform {
    def this(options: PartialOptions) = this()
    
    def _final(callback: js.Function0[Unit]): Unit = js.native
    
    def _handleCallback(name: String, buffer: Buffer): Unit = js.native
    def _handleCallback(name: String, buffer: Buffer, start: Double): Unit = js.native
    def _handleCallback(name: String, buffer: Buffer, start: Double, end: Double): Unit = js.native
    def _handleCallback(name: String, buffer: Buffer, start: Unit, end: Double): Unit = js.native
    
    def _transform(buffer: Buffer, _underscore: Any, callback: js.Function0[Unit]): Double = js.native
    
    def explain(): String = js.native
    
    def initWithBoundary(str: String): Unit = js.native
  }
  /* static members */
  object MultipartParser {
    
    @JSImport("formidable/parsers", "MultipartParser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("formidable/parsers", "MultipartParser.STATES")
    @js.native
    def STATES: RecordPARSERUNINITIALIZED = js.native
    inline def STATES_=(x: RecordPARSERUNINITIALIZED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATES")(x.asInstanceOf[js.Any])
    
    inline def stateToString(stateNumber: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stateToString")(stateNumber.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("formidable/parsers", "OctetStreamParser")
  @js.native
  open class OctetStreamParser () extends PassThrough {
    def this(options: PartialOptions) = this()
  }
  
  @JSImport("formidable/parsers", "QuerystringParser")
  @js.native
  open class QuerystringParser () extends Transform {
    def this(options: PartialOptions) = this()
    
    def _flush(callback: js.Function0[Unit]): Unit = js.native
    
    def _transform(buffer: Buffer, encoding: BufferEncoding, callback: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("formidable/parsers", "StreamingQuerystring")
  @js.native
  open class StreamingQuerystring () extends QuerystringParser {
    def this(options: PartialOptions) = this()
    
    def emitField(key: String): Unit = js.native
    def emitField(key: String, `val`: String): Unit = js.native
    
    def getSection(buffer: Buffer, i: Double): String = js.native
  }
}
