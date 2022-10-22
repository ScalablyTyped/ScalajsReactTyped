package typingsJapgolly.htmlparser2

import typingsJapgolly.htmlparser2.anon.PartialHandlerOnattribute
import typingsJapgolly.htmlparser2.libEsmParserMod.ParserOptions
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmWritableStreamMod {
  
  @JSImport("htmlparser2/lib/esm/WritableStream", "WritableStream")
  @js.native
  open class WritableStream protected () extends Writable {
    def this(cbs: PartialHandlerOnattribute) = this()
    def this(cbs: PartialHandlerOnattribute, options: ParserOptions) = this()
    
    /* private */ val _decoder: Any = js.native
    
    def _final(cb: js.Function0[Unit]): Unit = js.native
    
    /* private */ val _parser: Any = js.native
    
    def _write(chunk: String, encoding: String, cb: js.Function0[Unit]): Unit = js.native
    def _write(chunk: Buffer, encoding: String, cb: js.Function0[Unit]): Unit = js.native
  }
}
