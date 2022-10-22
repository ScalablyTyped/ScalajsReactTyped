package typingsJapgolly.gherkin

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.TransformCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStreamSourceMessageStreamMod {
  
  @JSImport("gherkin/dist/src/stream/SourceMessageStream", JSImport.Default)
  @js.native
  open class default protected () extends SourceMessageStream {
    def this(uri: String) = this()
  }
  
  @js.native
  trait SourceMessageStream extends Transform {
    
    def _transform(chunk: Buffer, encoding: String, callback: TransformCallback): Unit = js.native
    
    /* private */ var buffer: Any = js.native
    
    /* private */ val uri: Any = js.native
  }
}
