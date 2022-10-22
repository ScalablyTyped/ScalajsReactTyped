package typingsJapgolly.amp

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Writable
import typingsJapgolly.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("amp", "Stream")
  @js.native
  open class Stream protected () extends Writable {
    def this(opts: WritableOptions) = this()
    
    def _write(chunk: Any, encoding: String, fn: js.Function0[Unit]): Unit = js.native
  }
  
  inline def decode(buf: Buffer): js.Array[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Array[Buffer]]
  
  inline def encode(args: js.Array[Buffer]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(args.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
