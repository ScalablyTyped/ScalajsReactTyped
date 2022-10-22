package typingsJapgolly.itHandshake

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.itPushable.mod.Pushable_
import typingsJapgolly.itReader.mod.Reader_
import typingsJapgolly.itStreamTypes.mod.Duplex
import typingsJapgolly.itStreamTypes.mod.Source
import typingsJapgolly.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-handshake", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def handshake[TSink /* <: Uint8ArrayList | js.typedarray.Uint8Array */](stream: Duplex[Uint8ArrayList | js.typedarray.Uint8Array, TSink, js.Promise[Unit]]): Handshake_[TSink] = ^.asInstanceOf[js.Dynamic].applyDynamic("handshake")(stream.asInstanceOf[js.Any]).asInstanceOf[Handshake_[TSink]]
  
  trait Handshake_[TSink] extends StObject {
    
    def read(): js.Promise[js.UndefOr[Uint8ArrayList]]
    
    var reader: Reader_
    
    def rest(): Source[TSink]
    
    var stream: Duplex[Uint8ArrayList, TSink, js.Promise[Unit]]
    
    def write(data: TSink): Unit
    
    var writer: Pushable_[TSink]
  }
  object Handshake_ {
    
    inline def apply[TSink](
      read: CallbackTo[js.Promise[js.UndefOr[Uint8ArrayList]]],
      reader: Reader_,
      rest: CallbackTo[Source[TSink]],
      stream: Duplex[Uint8ArrayList, TSink, js.Promise[Unit]],
      write: TSink => Callback,
      writer: Pushable_[TSink]
    ): Handshake_[TSink] = {
      val __obj = js.Dynamic.literal(read = read.toJsFn, reader = reader.asInstanceOf[js.Any], rest = rest.toJsFn, stream = stream.asInstanceOf[js.Any], write = js.Any.fromFunction1((t0: TSink) => write(t0).runNow()), writer = writer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Handshake_[TSink]]
    }
    
    extension [Self <: Handshake_[?], TSink](x: Self & Handshake_[TSink]) {
      
      inline def setRead(value: CallbackTo[js.Promise[js.UndefOr[Uint8ArrayList]]]): Self = StObject.set(x, "read", value.toJsFn)
      
      inline def setReader(value: Reader_): Self = StObject.set(x, "reader", value.asInstanceOf[js.Any])
      
      inline def setRest(value: CallbackTo[Source[TSink]]): Self = StObject.set(x, "rest", value.toJsFn)
      
      inline def setStream(value: Duplex[Uint8ArrayList, TSink, js.Promise[Unit]]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: TSink => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: TSink) => value(t0).runNow()))
      
      inline def setWriter(value: Pushable_[TSink]): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
    }
  }
}
