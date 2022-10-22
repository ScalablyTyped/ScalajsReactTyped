package typingsJapgolly.redisClient

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.redisClient.distLibClientResp2ComposersInterfaceMod.Composer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibClientResp2ComposersBufferMod {
  
  @JSImport("@redis/client/dist/lib/client/RESP2/composers/buffer", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with BufferComposer {
    
    /* private */ /* CompleteClass */
    var chunks: Any = js.native
    
    /* CompleteClass */
    override def end(buffer: Buffer): Buffer = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def write(buffer: Buffer): Unit = js.native
  }
  
  trait BufferComposer
    extends StObject
       with Composer[Buffer] {
    
    /* private */ var chunks: Any
  }
  object BufferComposer {
    
    inline def apply(chunks: Any, end: Buffer => Buffer, reset: Callback, write: Buffer => Callback): BufferComposer = {
      val __obj = js.Dynamic.literal(chunks = chunks.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), reset = reset.toJsFn, write = js.Any.fromFunction1((t0: Buffer) => write(t0).runNow()))
      __obj.asInstanceOf[BufferComposer]
    }
    
    extension [Self <: BufferComposer](x: Self) {
      
      inline def setChunks(value: Any): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    }
  }
}
