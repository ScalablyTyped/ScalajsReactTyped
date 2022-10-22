package typingsJapgolly.next

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.ReadableStream
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerBodyStreamsMod {
  
  @JSImport("next/dist/server/body-streams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bodyStreamToNodeStream(bodyStream: ReadableStream[js.typedarray.Uint8Array]): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("bodyStreamToNodeStream")(bodyStream.asInstanceOf[js.Any]).asInstanceOf[Readable]
  
  inline def getClonableBody[T /* <: IncomingMessage */](readable: T): ClonableBody = ^.asInstanceOf[js.Dynamic].applyDynamic("getClonableBody")(readable.asInstanceOf[js.Any]).asInstanceOf[ClonableBody]
  
  inline def requestToBodyStream(context: typingsJapgolly.next.anon.ReadableStream, stream: Readable): ReadableStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestToBodyStream")(context.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[ReadableStream[Any]]
  
  trait ClonableBody extends StObject {
    
    def cloneBodyStream(): Readable
  }
  object ClonableBody {
    
    inline def apply(cloneBodyStream: CallbackTo[Readable]): ClonableBody = {
      val __obj = js.Dynamic.literal(cloneBodyStream = cloneBodyStream.toJsFn)
      __obj.asInstanceOf[ClonableBody]
    }
    
    extension [Self <: ClonableBody](x: Self) {
      
      inline def setCloneBodyStream(value: CallbackTo[Readable]): Self = StObject.set(x, "cloneBodyStream", value.toJsFn)
    }
  }
}
