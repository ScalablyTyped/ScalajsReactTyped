package typingsJapgolly.awsSdkStreamCollectorNode

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Writable
import typingsJapgolly.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCollectorMod {
  
  @JSImport("@aws-sdk/stream-collector-node/build/collector", "Collector")
  @js.native
  open class Collector () extends Writable {
    def this(opts: WritableOptions) = this()
    
    def _write(chunk: Buffer, encoding: String, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    val bufferedBytes: js.Array[Buffer] = js.native
  }
}
