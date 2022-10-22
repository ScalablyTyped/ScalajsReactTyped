package typingsJapgolly.sodiumjs

import typingsJapgolly.sodiumjs.distTypingsSodiumLambdaMod.Lambda2_
import typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.StreamWithSend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsSodiumCoalesceHandlerMod {
  
  @JSImport("sodiumjs/dist/typings/sodium/CoalesceHandler", "CoalesceHandler")
  @js.native
  open class CoalesceHandler[A] protected () extends StObject {
    def this(f: js.Function2[/* l */ A, /* r */ A, A], out: StreamWithSend[A]) = this()
    def this(f: Lambda2_[A, A, A], out: StreamWithSend[A]) = this()
    
    /* private */ var accum: Any = js.native
    
    /* private */ var accumValid: Any = js.native
    
    /* private */ var f: Any = js.native
    
    /* private */ var out: Any = js.native
    
    def send_(a: A): Unit = js.native
    
    /* private */ var verbose: Any = js.native
  }
}
